package com.nbcuni.test.tl.practice;

import java.io.IOException;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.nbcuni.test.tl.practice.core.BaseTest;
import com.nbcuni.test.tl.practice.dataproviders.DataProviderHome;

import pageobjects.HomePage;


public class TLSupplyHomePageTest extends BaseTest {

	/**
	 * 
	 * Testing Translator Supply home page
	 * 
	 */

	private static Logger log = LogManager.getLogger(TLSupplyHomePageTest.class.getName()); // get the entire path of Demo.class

	private HomePage homePage;
	//private SoftAssert softAssert = new SoftAssert();
	
	
	@BeforeTest
	
	public void initialize() throws Throwable {

		// calling base test 
		
		//webDriver = initializeDriver();
		
		log.info("initialize");

	}
	
	@Override
	protected void navigateToSiteAndLogin() throws Throwable { 
		super.navigateToSiteAndLogin();
		
		log.info("hello world");		
	}

	/*
	 * Validate the elements on the top bar of the page
	 */
	@Test (priority=1)
	public void validateSupplyHomePage() throws IOException {

		homePage = new HomePage(webDriver);

		String expectedUrl = baseurl + homePage.url;
		log.debug("expected url: " + expectedUrl);
		
		String currentUrl = webDriver.getCurrentUrl();
		log.debug("current url: " + currentUrl);

		Assert.assertEquals(currentUrl, expectedUrl);

		Assert.assertTrue(homePage.searchField().isDisplayed());	

		Assert.assertTrue(homePage.workOrderLink().isDisplayed() && homePage.workOrderLink().isEnabled());

		//Assert.assertTrue(hp.mappingLink().isDisplayed() && hp.mappingLink().isEnabled());

		Assert.assertTrue(homePage.mappingLink().isEnabled());
		log.debug("Mapping is enabled");
		//Assert.assertTrue(hp.mappingText().isDisplayed());

		Assert.assertTrue(homePage.assetsLink().isDisplayed() && homePage.assetsLink().isEnabled());
		log.debug("Assets is displayed");

		//Assert.assertTrue(hp.adminLink().isDisplayed() && hp.adminLink().isEnabled());

		// 
		printAttributesByElem(homePage.searchField());

		// print all the text of links By.tagName("a")
		// printAttributesLinktag(webDriver);

		//printBrokenLinks(webDriver);

	}

	@Test(priority=2)
	void validateRecentHeaders() {
		
		SoftAssert softAssert = new SoftAssert();
			
		log.info("validateRecentHeaders...");
		
		softAssert.assertTrue(homePage.recentTVHeader().isDisplayed());	
		softAssert.assertTrue(homePage.recentFeatureHeader().isDisplayed());
		softAssert.assertTrue(homePage.recentMostPopHeader().isDisplayed());

		softAssert.assertAll();
	}
	

	@Test(priority=3,dataProvider="getRecentTitlesData", dataProviderClass = DataProviderHome.class )
	void validateRecentTVTitles(String data) {

		SoftAssert softAssert = new SoftAssert();
		
		log.info("validateRecentTVTitles...");

		List<WebElement> titles = homePage.recentTitles();
		
		log.debug("validating title: " + data);
		softAssert.assertTrue(titles.stream().anyMatch(e->e.getText().trim().equalsIgnoreCase(data))); 

		for ( WebElement item: titles) { 
			//if (!item.getText().isEmpty() && (item.getText().equalsIgnoreCase(data))) {
			if (!item.getText().isEmpty())
				log.debug("title in loop ::: " + item.getText());			
		}

		softAssert.assertAll();
	}

	@Test(priority=3,dataProvider="getRecentTitlesData", dataProviderClass = DataProviderHome.class )
	void validateRecentFeatureTitles(String data) {

		SoftAssert softAssert = new SoftAssert();
		
		log.info("RecentFeatureTitles...");
		log.debug("Testing softAssert on recent titles");

		List<WebElement> titles = homePage.recentTitles();

		log.debug("validating title: " + data);

		softAssert.assertTrue(titles.stream().anyMatch(e->e.getText().trim().equalsIgnoreCase(data))); 

		softAssert.assertAll();
	}

	@Test(priority=3,dataProvider="getRecentTitlesData", dataProviderClass = DataProviderHome.class )
	void validateMostPopularTitles(String data) {
		
		SoftAssert softAssert = new SoftAssert();

		log.debug("Testing softAssert on recent titles");

		List<WebElement> titles = homePage.recentTitles();

		log.debug("validating title: " + data);

		softAssert.assertTrue(titles.stream().anyMatch(e->e.getText().trim().equalsIgnoreCase(data))); 

		softAssert.assertAll();
	}

	@Test(priority=4)
	void validateTitlesPageClick() throws InterruptedException {	
		//System.out.println(data);

		log.debug("Testing softAssert on recent titles");
		
		SoftAssert softAssert = new SoftAssert();

		List<WebElement> links = 
				webDriver.findElements(By.xpath("(//div[@class='carousel-item'])"));

		String expectedTitle, actual, locator;

		for (int i=1; i <= links.size(); i++) {
			try {

				locator = "(//div[@class='carousel-item'])" + "[" + i + "]" + "/div[2]";
				expectedTitle = webDriver.findElement(By.xpath(locator)).getText();
				log.info("expected title : " + expectedTitle);

				if (!expectedTitle.isEmpty()) {

					locator = "(//div[@class='carousel-item'])" + "[" + i + "]";

					webDriver.findElement(By.xpath(locator)).click();

					WebDriverWait wait = new WebDriverWait(webDriver, 20);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1")));

					actual = webDriver.findElement(By.xpath("//h1")).getText();
					log.info("actual title: " + actual);

					
					//softAssert.assertTrue(actual.contains(title), title);

					String currentURL = webDriver.getCurrentUrl();
					currentURL = webDriver.getCurrentUrl();
					log.info(currentURL);
					
					Boolean found = actual.contains(expectedTitle);
					
					softAssert.assertTrue(found, "expect: " + expectedTitle + ", actual: " + actual);

					// series (h1); https://translator.inbcu.com/supply/translator/app/asset/series/0000001438GMB
					// episode: (h2): https://translator.inbcu.com/supply/translator/app/asset/episode/0000256549GME/GMO_00000000105447_02


					webDriver.navigate().back();

				} else { 
					// click right arrow for more titles
					// i[text()='chevron_right'][1]
				}

			}
			catch(Exception e){
				System.out.println(e.getMessage());
				webDriver.navigate().back();
			}

		}

		softAssert.assertAll();

	}
	


	@AfterTest
	public void teardown() {

		webDriver.close();
	}


}
