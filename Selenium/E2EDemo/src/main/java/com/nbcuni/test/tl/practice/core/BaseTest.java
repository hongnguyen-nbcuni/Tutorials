package com.nbcuni.test.tl.practice.core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import pageobjects.LandingPage;
import pageobjects.LoginPage;

public class BaseTest {

	protected WebDriver webDriver;
	public Properties prop;
	public String baseurl;

	// need to write the path of this class,
	// get the entire path of Demo.class
	private static Logger log = LogManager.getLogger(BaseTest.class.getName());


	@BeforeClass
	public WebDriver initializeDriver() throws Throwable  {

		log.debug("Initialise the properties");

		initialiseProperties();
		initialiseBrowser();
		
		webDriver.manage().timeouts().implicitlyWait(Integer.parseInt(prop.getProperty("Timeout")), TimeUnit.SECONDS);

		baseurl = prop.getProperty("base.url");
		
		log.debug("base url: " +  baseurl);
		
		navigateToSiteAndLogin();

		return webDriver;

	}

	protected void initialiseProperties() throws IOException {
		
		log.info("Initialise the properties");
		
		// get browser from properties file
		prop = new Properties();
		
		// get project directory path
		System.getProperty("user.dir");

		// data properties file path
		String path = System.getProperty("user.dir") + "/src/test/resources/config.properties"; 

		log.debug("Properties file path : " + path);
		
		FileInputStream ip = new FileInputStream(path);

		// load entries from properties file
		prop.load(ip);


	}


	protected void initialiseBrowser() {
		
		log.info("Initialise the browser");
		
		// get the browser
		String browserName = prop.getProperty("browser");

		log.debug("browser : " + browserName);
		
		if (browserName.equals("chrome"))  {
			webDriver = new ChromeDriver();

		} else {
			webDriver= new FirefoxDriver();
		} 
	}

	protected void navigateToSiteAndLogin() throws Throwable {

		// creating object to that class and invoke methods of it
		webDriver.get(prop.getProperty("base.url"));
		// click on Supply button to redirect to TL Supply home page
		new LandingPage(webDriver).clickSupply();
		log.info("clicked Supply button");

		String username = prop.getProperty("QA1.Username");
		String password = prop.getProperty("QA1.Password");
		LoginPage loginPage = new LoginPage(webDriver);

		loginPage.ssoID().sendKeys(username);
		loginPage.password().sendKeys(password);

		loginPage.signIn();	
		log.info("Logged in");

	}

	public String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException {

		return null;
	}

	/*
	 * Helpful:
	 * Print out the attributes on an element are when writing tests at run time
	 */
	
	public void printAttributesByElem(WebElement elem) {	

		Object aa;

		if (elem != null ) {
			aa = ((JavascriptExecutor) webDriver)
					.executeScript(
							"var items = {}; for (index = 0; index < arguments[0].attributes.length; ++index) { items[arguments[0].attributes[index].name] = arguments[0].attributes[index].value }; return items;",
							elem);
			System.out.println(aa.toString());
		}

	}

	/* print out attributes on links */
	public void printAttributesLinktag(WebDriver webDriver) {

		/*
		 * 1. Get the total count of links on the page 
		 * 2. Get the text of each link on the page 
		 * all the links are represented by <a> html tag 
		 */

		Object aa;

		List <WebElement> linkList = webDriver.findElements(By.tagName("a"));    
		System.out.println(linkList.size()); 

		for(int i=0; i<linkList.size(); i++) {
			String linkText = linkList.get(i).getText();
			System.out.println("Link text[" + i + "] : " + linkText);
			aa = ((JavascriptExecutor) webDriver)
					.executeScript(
							"var items = {}; for (index = 0; index < arguments[0].attributes.length; ++index) { items[arguments[0].attributes[index].name] = arguments[0].attributes[index].value }; return items;",
							linkList.get(i));
			System.out.println(aa.toString());

		}
	}

	// print out broken links

	public void printBrokenLinks(WebDriver webDriver) throws IOException {


		List<WebElement> linksList = webDriver.findElements(By.tagName("a"));
		linksList.addAll(webDriver.findElements(By.tagName("img")));

		List<WebElement> activeLinks = new ArrayList<WebElement>();

		// 2. iterate linksList: exclude all the links/images -- doesn't have any href attributes
		for (int i = 0; i< linksList.size(); i++) {

			System.out.println(linksList.get(i).getAttribute("href"));
			// exclude javascript href
			if (linksList.get(i).getAttribute("href") != null && (!linksList.get(i).getAttribute("href").contains("javascript"))) {
				activeLinks.add(linksList.get(i));
			}
		}

		// get the size of all links list:
		System.out.println("sizes of active links and images --->" + activeLinks.size());

		// 3. check the href url, with httpconnection api:
		// 200 - Ok
		// 404 - not found
		// 500 - internal
		// 400 - bad request

		// check to see if that link is a correct link or not
		for(int j=0; j<activeLinks.size(); j++) {

			// get all the images and links have href property
			// get the connection to check that url is correct or not
			HttpURLConnection connection = (HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();

			connection.connect(); // http protocol connect to that url
			String response = connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activeLinks.get(j).getAttribute("href") + "----->" + response);

		}
	}

}
