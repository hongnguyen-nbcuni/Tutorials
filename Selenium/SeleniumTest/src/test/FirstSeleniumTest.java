package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import config.PropertiesFile;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumTest {

	//static String browser;	// its lifetime is the entire run of the program
	public static String browser; 		// now all other classes can see this variable
	static WebDriver driver;
	

	public static void main(String[] args) {
		
		//setBrowser();
		
		PropertiesFile.readPropertiesFile();
		setBrowserConfig();
		runTest();
		PropertiesFile.writePropertiesFile();
		
	}

	/**
	 * Description
	 * @author hnguyen 
	 * @date 
	 */
	public static void setBrowser() {
		browser = "Chrome";

	}

	public static void setBrowserConfig() {
		//WebDriver driver = new FirefoxDriver();
		//String projectLocation = System.getProperty("user.dir");

		// this condition block sets config for chrome browser
		if (browser.contains("Chrome")) {
			//System.setProperty("webdriver.chrome.driver",projectLocation+"/chromedriver");
			// it seems like we don't need this statement for chrome
			//System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");

			driver = new ChromeDriver();

		} else {
			driver = new FirefoxDriver();
		}
	}

	public static void runTest() {
		
		driver.get("https://www.selenium.dev/");
		

		//WebElement searchBox = driver.findElement(By.name("q"));

		//searchBox.sendKeys("ChromeDriver");
		//searchBox.submit();   
		
		
		driver.quit();	

	}
}
