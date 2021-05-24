package com.sample.test.demo.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.sample.test.demo.TestBase;
import com.sample.test.demo.TestListener;
import com.sample.test.demo.dataproviders.DataProviderOrderForm;
import com.sample.test.demo.pageobject.PersonInfo;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;

@Epic("Regression Tests")
@Feature("Functional Tests")
public class PizzaOrderTest extends TestBase {
	/*
	 * Validate the Pizza Order Form functionality
	 */

	private static Logger log = LogManager.getLogger(PizzaOrderTest.class); // get the entire path of Demo.class
	
	@BeforeTest
	public void initialize() throws Throwable {
		log.info("Testing Pizza Order Form functionality");
	}
	
	@Description("Verify total cost value")
	@Test(dataProvider="getInputsData", dataProviderClass = DataProviderOrderForm.class)
	public void quantityInputValueTest(String value) {	

		pages.pizzaOrderPage().validateQuantityValue(value);
	}
	
	@Description("Verify the calculation of total cost")
	@Test(dataProvider="getInputsData", dataProviderClass = DataProviderOrderForm.class )
	public void totalCostTestField(String quantity) {	
		// validate the calculation total cost of Pizza order
		pages.pizzaOrderPage().validateTotalCostField(quantity);
	}

	@Description("Verify total cost of maximum number of pizza")
	@Test()
	public void maximumTotalCostTest() {	
		// validate the maximum cost appear correctly in the Cost field
		pages.pizzaOrderPage().validateMaximumQuantityTotalCost();
	}
	
	@Description("Verify number of toppings when selecting pizza type option in the dropdown")
	@Test()
	public void numberToppingsDisplayedTest() {
		pages.pizzaOrderPage().validateNumberOfToppingsDisplayed();
	}
	
	@Description("Verify Name field is text field and its input value")
	@Test(dataProvider="getInputsData", dataProviderClass = DataProviderOrderForm.class)
	public void nameTest(String name) {		
		pages.pizzaOrderPage().validateNameField(name);		
	}

	@Description("Verify Email field is text field and its input value")
	@Test(dataProvider="getInputsData", dataProviderClass = DataProviderOrderForm.class )
	public void emailTest(String email) {		
		pages.pizzaOrderPage().validateEmailField(email);		
	}
	
	@Description("Verify Phone field is text field and its input value")
	@Test(dataProvider="getInputsData", dataProviderClass = DataProviderOrderForm.class )
	public void phoneTest(String phone) {		
		pages.pizzaOrderPage().validatePhoneField(phone);		
	}
	
	@Description("Verify Credit Card & Cash on Pickup radio buttons are clickable "
			+ "and both buttons should not be selected at the same time")
	@Test()
	public void paymentRadioButtonsTest() {	
		pages.pizzaOrderPage().validatePaymentRadioButtons();	
	}

	@Test(dataProvider="getPlaceOrderInputsData", dataProviderClass = DataProviderOrderForm.class )
	@Description("Verify Total Cost dialog is correct")
	public void placeOrderTotalCostModalTest(PersonInfo person) throws Throwable {	
		pages.pizzaOrderPage().validatePlaceOrderTotalCostModal(person);	
	}

	@Description("Verify required fields should prompt when blank")
	@Test
	public void validateRequiredFieldsTest() {
		pages.pizzaOrderPage().validateRequiredFields();
		
	}
	
	@Description("Verify the reset button")
	@Test
	public void resetButtonTest() {	
		pages.pizzaOrderPage().validateResetButton();	
	}

	@Description("Verify name field can enter maximum length characters")
	@Test
	public void nameFieldMaximumCharacters() {		
		pages.pizzaOrderPage().validateNameFieldMaximumCharacters();		
	}
	
	@Description("Verify email field can enter maximum length characters")
	@Test
	public void emailFieldMaximumCharacters() {		
		pages.pizzaOrderPage().validateEmailFieldMaximumCharacters();		
	}
	
	@Description("Verify phone field can enter maximum length characters")
	@Test
	public void phoneFieldMaximumCharacters() {		
		pages.pizzaOrderPage().validatePhoneFieldMaximumCharacters();		
	}
	
	@AfterMethod(alwaysRun = true)
	public void resetForm() {
		pages.pizzaOrderPage().resetForm();
	}
	



}
