package com.nbcuni.test.tl.practice;

import org.apache.logging.log4j.*;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.nbcuni.test.tl.practice.core.BaseTest;

import pageobjects.LandingPage;


public class TranslatorLandingPageTest extends BaseTest {

	/*
	 * Testing landing page
	 */

	// need to write the path of this class, 
	private static Logger log = LogManager.getLogger(TranslatorLandingPageTest.class.getName()); // get the entire path of Demo.class

	private LandingPage lp;

	@BeforeTest
	public void initialize() throws Throwable
	{
		webDriver = initializeDriver();
		// load TL landing page
		webDriver.get(baseurl);

		// creating object to that class and invoke methods of it
		lp =new LandingPage(webDriver);

		log.info("initailize");
	}

	/*
	 * Translator landing page contains Supply, MAM, TACT and VOD buttons 
	 */

	@Test
	public void translator_landingPageTest()  {

		// validate buttons are enabled and text on the page are displayed or not
		
		log.info("Supply button is displayed and enabled");
		Assert.assertTrue(lp.supplyButton().isDisplayed());
		Assert.assertTrue(lp.supplyButton().isEnabled());
		
		SoftAssert softAssert = new SoftAssert();
		
		log.info("Translator logo is displayed");
		softAssert.assertTrue(lp.headerLogo().isDisplayed());

		log.info("Translator direction text is displayed");
		softAssert.assertTrue(lp.directionText().isDisplayed());

		log.info("MAM button is displayed and enabled");
		softAssert.assertTrue(lp.mamButton().isDisplayed());
		softAssert.assertTrue(lp.mamButton().isEnabled());

		log.info("TACT button is displayed and enabled");
		softAssert.assertTrue(lp.tactButton().isDisplayed());
		softAssert.assertTrue(lp.tactButton().isEnabled());

		log.info("VOD button is displayed and enabled");
		softAssert.assertTrue(lp.vodButton().isDisplayed());
		softAssert.assertTrue(lp.vodButton().isEnabled());

		softAssert.assertAll();

	}



	@AfterTest
	public void teardown()
	{
		webDriver.close();

	}

}
