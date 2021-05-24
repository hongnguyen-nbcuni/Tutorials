package com.sample.test.demo.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.sample.test.demo.TestBase;
import com.sample.test.demo.TestListener;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;

@Epic("Smoke Tests")
@Feature("Label Tests")
public class PizzaOrderPageLayoutTest extends TestBase {

	/*
	 * Test the expected text labels, drop down list, and radios buttons on the page
	 */
	
	private static Logger log = LogManager.getLogger(PizzaOrderPageLayoutTest.class); // get the entire path of class

	@BeforeTest
	public void initialize() throws Throwable {
		
		log.info("Testing Pizza Order Form layout");
	}
	
	@Description("Verify all the labels, dropdowns,d and buttons of Pizza order page")
	@Test()
	public void validatePizzaOrderPageLayoutTest() {
		pages.pizzaOrderPageLayout().validatePizzaOrderPageLayout();
		
	}

	
	
	
	

}
