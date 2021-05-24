package com.nbcuni.test.tl.practice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.nbcuni.test.tl.practice.core.BaseTest;

import pageobjects.LandingPage;

public class WorkOrderPageTest extends BaseTest {

	// need to write the path of this class, 
		private static Logger log = LogManager.getLogger(TranslatorLandingPageTest.class.getName()); // get the entire path of Demo.class

		private LandingPage lp;
		
		@BeforeTest
		public void initialize() throws Throwable
		{
			webDriver = initializeDriver();
			// load TL landing page
			webDriver.get(prop.getProperty("url"));
			
			// creating object to that class and invoke methods of it
			lp =new LandingPage(webDriver);
			
			log.info("initailize");
		}

		@Test
		public void validateLandingPage()  {

			// creating object to that class and invoke methods of it
			// lp =new LandingPage(driver);

			Assert.assertTrue(lp.headerLogo().isDisplayed());
			log.info("Translator logo is displayed");
		
			Assert.assertTrue(lp.directionText().isDisplayed());
			log.info("Translator direction text is displayed");

			// are buttons clickable?
			Assert.assertTrue(lp.supplyButton().isEnabled());
			log.info("Supply button is displayed");

			Assert.assertTrue(lp.mamButton().isEnabled());
			log.info("MAM button is displayed");

			Assert.assertTrue(lp.tactButton().isEnabled());
			log.info("TACT button is displayed");

			Assert.assertTrue(lp.vodButton().isEnabled());
			log.info("VOD button is displayed");
			
		}
		


		@AfterTest
		public void teardown()
		{
			webDriver.close();

		}
		
}
