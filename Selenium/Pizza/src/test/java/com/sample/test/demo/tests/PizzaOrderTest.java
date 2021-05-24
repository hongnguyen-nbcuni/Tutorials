package com.sample.test.demo.tests;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.sample.test.demo.TestBase;

public class PizzaOrderTest extends TestBase {
	/*
	 * Validate the expected text labels and radios on the page, and check for visibility
	 */

	//private static Logger log = LogManager.getLogger(PizzaOrderFormTest.class.getName()); // get the entire path of Demo.class

	@BeforeTest
	public void initialize() throws Throwable {
		System.out.println("initialize");

	}

	@Test
	public void validatePizzaQuantityFieldInputTest() {	
		// validate the list of text in "Toppings2" drop down
		pages.pizzaOrderPage().validatePizzaQuantityField("1");

	}

	@Test
	public void validatePizzaCostFieldTest() {	
		// validate the Cost field: this field can only be number 
		// and visibility of the entered value
		pages.pizzaOrderPage().validatePizzaCostField();

	}


	@Test
	public void validateResetButtonTest() {	
		pages.pizzaOrderPage().validateResetButton();	
	}


	@AfterMethod(alwaysRun = true)
	public void resetOrderForm() {
		pages.pizzaOrderPage().resetOrderForm();
	}


}
