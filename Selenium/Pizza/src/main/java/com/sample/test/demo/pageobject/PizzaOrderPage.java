package com.sample.test.demo.pageobject;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import com.sample.test.demo.utils.ElementUtil;


public class PizzaOrderPage {


	By choosePizzaBy = By.id("pizza1Pizza");

	By pizzaQuantityBy = By.id("pizza1Qty");

	By pizzaCostBy = By.xpath("//input[@id='pizza1Cost']");

	By nameBy = By.id("name");

	By emailBy = By.id("email");

	By phoneBy = By.id("phone");

	By creditCardRadioBy = By.id("ccpayment");

	By cashOnPickupRadioBy = By.id("cashpayment");

	By placeOrderButtonBy = By.id("placeOrder");
	By resetButtonBy = By.id("reset");

	By dialogBy = By.id("dialog");

	By dialogTextBy = By.xpath("//div[@id='dialog']/p");

	static final String MISSING_NAME = "Missing name";
	static final String MISSING_PHONE_NUMBER = "Missing phone number";
	static final String CREDIT_CARD = "Credit Card";
	static final String CASH_ON_PICKUP = "Cash on Pickup";
	static final String THANK_YOU_MSG = "Thank you for your order! TOTAL:";

	public WebDriver driver;  

	public PizzaOrderPage(WebDriver driver) {
		this.driver = driver;
	}


	public void validatePizzaQuantityFieldInputValues(String value) {
		validatePizzaQuantityField(value);


	}

	public void validatePizzaQuantityField(String num) {

		SoftAssert softAssert = new SoftAssert();

		WebElement quantityField = driver.findElement(pizzaQuantityBy);

		String valueEntered;

		quantityField.clear();
		quantityField.sendKeys(num);
		quantityField.sendKeys(Keys.ENTER);

		valueEntered = quantityField.getAttribute("value");

		softAssert.assertTrue(Integer.parseInt(valueEntered) == Integer.parseInt(num));	

		softAssert.assertAll();

	}


	public void validatePizzaQuantityFieldMininumValue() {

		SoftAssert softAssert = new SoftAssert();

		WebElement quantityField = driver.findElement(pizzaQuantityBy);

		// test quantity value of 0
		quantityField.clear();
		quantityField.sendKeys("0");
		quantityField.sendKeys(Keys.ENTER);

		int posValue = Integer.parseInt(quantityField.getAttribute("value"));
		try {
			softAssert.assertEquals(posValue < 1, "quantity should be greater than 0");
		} finally {
			// test minimum quantity value of 1
			quantityField.sendKeys("1");
			posValue = Integer.parseInt(quantityField.getAttribute("value"));
			softAssert.assertEquals(posValue,  0, "Min quantity value should be 0");
		}


		softAssert.assertAll();

	}


	public void validatePizzaCostField() {

		SoftAssert softAssert = new SoftAssert();

		WebElement costElem = driver.findElement(pizzaCostBy);
		WebElement quantityElem = driver.findElement(pizzaQuantityBy);

		String typeAttributeValue = costElem.getAttribute("type");

		softAssert.assertTrue(typeAttributeValue.equals("text"),
				"Expecting type text in Cost field.");

		WebElement pizza1 = driver.findElement(choosePizzaBy); 
		Select pizzaTypes = new Select(pizza1);
		pizzaTypes.selectByIndex(2);

		quantityElem.clear();
		quantityElem.sendKeys("1");
		quantityElem.sendKeys(Keys.ENTER);	
		
		softAssert.assertAll();	

	}


	public void validateNameField(String name) {

		SoftAssert softAssert = new SoftAssert();
		WebElement nameField = driver.findElement(nameBy);

		String typeAttributeValue = nameField.getAttribute("type");

		// check to see if Cost field can only accept TEXT
		softAssert.assertTrue(typeAttributeValue.equals("text"),
				"Expecting type text in Name field.");

		// check Name field size
		// to see if the Name field size length is not less than the max length
		int size = Integer.parseInt(nameField.getAttribute("size"));
		int maxlength = Integer.parseInt(nameField.getAttribute("maxlength"));

		softAssert.assertTrue(size == maxlength, 
				"Expecting the size equals max length");

		// validate the display of Name value
		ElementUtil.enterValue(nameField, name);
		// getting a name value
		String nameValue = ElementUtil.getValue(nameField);

		// compare the size of input string with the size of text appeared in the input field
		softAssert.assertTrue(nameValue.length() == name.length());

		softAssert.assertTrue(nameValue.equals(name));

		// System.out.println("Name value entered: " + nameValue);

		softAssert.assertAll();	

	}



	public void validateEmailField(String email) {

		SoftAssert softAssert = new SoftAssert();
		WebElement nameField = driver.findElement(emailBy);

		String typeAttributeValue = nameField.getAttribute("type");

		// check to see if type is TEXT
		softAssert.assertTrue(typeAttributeValue.equals("text"),
				"Expecting type text in email field.");

		// check Name field size
		// to see if the Name field size length is not less than the max length
		int size = Integer.parseInt(nameField.getAttribute("size"));
		int maxlength = Integer.parseInt(nameField.getAttribute("maxlength"));

		softAssert.assertTrue(size == maxlength, 
				"Expecting the size equals max length");

		// validate the display of Name value
		ElementUtil.enterValue(nameField, email);
		// getting a name value
		String emailValue = ElementUtil.getValue(nameField);

		// compare the size of input string with the size of text appeared in the input field
		softAssert.assertTrue(emailValue.length() == email.length());

		softAssert.assertTrue(emailValue.equals(email));

		// System.out.println("Name value entered: " + emailValue);

		softAssert.assertAll();	

	}


	public void validateMaximumCharacters(WebElement elem) {

		SoftAssert softAssert = new SoftAssert();
		//WebElement emailField = driver.findElement(emailBy);

		// get max length
		int maxlength = Integer.parseInt(elem.getAttribute("maxlength"));

		char[] array = new char[maxlength];  
		//assign the specified data value to each element   
		Arrays.fill(array, 'a');  
		String inputStr = new String(array); 

		// validate the display of Name value
		ElementUtil.enterValue(elem, inputStr);
		// get a name value string
		String emailValue = ElementUtil.getValue(elem);

		// compare the size of input string with the size of text appeared in the input field
		softAssert.assertTrue(emailValue.length() == inputStr.length());

		softAssert.assertTrue(emailValue.equals(inputStr));

		// System.out.println("Name value entered: " + nameValue);

		softAssert.assertAll();	

	}




	public void validatePhoneField(String phone) {

		SoftAssert softAssert = new SoftAssert();
		WebElement phoneField = driver.findElement(phoneBy);

		String typeAttributeValue = phoneField.getAttribute("type");

		// check to see if type is TEXT
		softAssert.assertTrue(typeAttributeValue.equals("text"),
				"Expecting type text in phone field.");

		// check Name field size
		// to see if the Name field size length is not less than the max length
		int size = Integer.parseInt(phoneField.getAttribute("size"));
		int maxlength = Integer.parseInt(phoneField.getAttribute("maxlength"));

		softAssert.assertTrue(size == maxlength, 
				"Expecting the size equals max length");

		// validate the display of Name value
		ElementUtil.enterValue(phoneField, phone);
		// getting a name value
		String phoneValue = ElementUtil.getValue(phoneField);

		// compare the size of input string with the size of text appeared in the input field
		softAssert.assertTrue(phoneValue.length() == phone.length());

		softAssert.assertTrue(phoneValue.equals(phone));

		// System.out.println("Name value entered: " + phoneValue);

		softAssert.assertAll();	


	}



	public void validRequiredField(WebElement field, String missingMsg) {

		SoftAssert softAssert = new SoftAssert();

		// enter empty string
		ElementUtil.enterValue(field, "");
		// getting a name value
		String value = ElementUtil.getValue(field);

		// compare the size of input string with size of text appeared in the input field
		softAssert.assertTrue(value.length() == 0);

		//System.out.println("Name value entered: " + value);

		// click on Place Order button
		clickPlaceOrder();	

		// check dialog is displayed and "Missing Name" msg
		//if (driver.findElement
		//		(By.xpath("//div[contains(@class, 'ui-dialog ui-corner-all')]")) != null) {
		if (driver.findElement(dialogBy) != null) {
			//Check for element's presence
			//List<WebElement> elems = driver.findElements(By.xpath("//div[@id='dialog']/p[contains(text(),'Missing name')]"));	
			WebElement dialogTextElem  = driver.findElement(dialogTextBy); 

			//String xpath = "//div[@id='dialog']/p[contains(text(),'" + missingMsg  + "')]";		

			String actualMsg = ElementUtil.getTextMessage(dialogTextElem);

			//System.out.println("Actual Msg: " + actualMsg);
			//System.out.println("Missing Msg: " + missingMsg);

			//System.out.println("does it contain: " + actualMsg.contains(missingMsg));

			softAssert.assertTrue(actualMsg.contains(missingMsg), missingMsg + " is expected");

			/*
			List<WebElement> elems = driver.findElements(By.xpath(xpath));	

			if(elems.size() != 0)
				softAssert.assertTrue(true);
			else
				softAssert.assertTrue(false,  missingMsg + " message is expecting");

			 */
			// close the dialog
			closeDialog();
		}

		softAssert.assertAll();	

	}


	public void validatePaymentRadioButtons() {

		// Test Credit Card & Cash on Pickup payment method

		SoftAssert softAssert = new SoftAssert();

		WebElement creditCardPayment = driver.findElement(creditCardRadioBy);
		// check to see if Credit Card is radio button
		softAssert.assertTrue(creditCardPayment.getAttribute("type").equals("radio"),
				"Expecting type radio in Credit Card field.");
		softAssert.assertEquals(creditCardPayment.getAttribute("value"), "Credit Card on Pickup");	

		WebElement cashPayment = driver.findElement(cashOnPickupRadioBy);	
		// check to see if Cash on Pickup is radio button
		softAssert.assertTrue(creditCardPayment.getAttribute("type").equals("radio"));
		softAssert.assertEquals(cashPayment.getAttribute("value"), "Cash on Pickup");

		// click on credit card radio button
		creditCardPayment.click();
		// System.out.println("Credit Card radio is checked:" + creditCardPayment.isSelected());

		softAssert.assertTrue(creditCardPayment.isSelected(), "Credit Card should be selected");

		cashPayment.click();
		// System.out.println("Cash radio is checked:" + cashPayment.isSelected());

		softAssert.assertTrue(cashPayment.isSelected(), "Cash on Pickup should be selected");
		softAssert.assertFalse(creditCardPayment.isSelected(), "Credit Card option should be unselected while Cash option was selected");

		if (creditCardPayment.isSelected() && cashPayment.isSelected())
			softAssert.assertTrue(false, "Both Credit Card & Cash on Pickup should not be checked at the same time");
		else {
			// reselect credit card radio button
			creditCardPayment.click();
			// expecting Cash on Pickup option to be unselected
			softAssert.assertFalse(cashPayment.isSelected(), "Cash on Pickup should not be selected");

		}

		softAssert.assertAll();

	}



	public void validatePopupMsg(String pizza, double totalcost) {
		// validate dialog pop up with total cost message

		SoftAssert softAssert = new SoftAssert();
		WebElement dialogTextElem  = driver.findElement(dialogTextBy); 

		if (driver.findElement(dialogBy) != null)  {
			String actualMsg = ElementUtil.getTextMessage(dialogTextElem);	
			//softAssert.assertTrue(actualMsg.contains("\\$"), "Expecting $ with total cost in dialog");

			// strip trailing zeros in total cost whole number using BigDecimal
			BigDecimal num = new BigDecimal(String.valueOf(totalcost));
			BigDecimal totalNum = num.stripTrailingZeros();

			//String expectedDialogMsg = THANK_YOU_MSG + " " + totalcost + " " + pizza;
			String expectedDialogMsg = THANK_YOU_MSG + " " + totalNum + " " + pizza;
			//System.out.println(expectedDialogMsg);
			softAssert.assertEquals(actualMsg, expectedDialogMsg, "Incorrect total cost ");
		}

		// close the dialog
		closeDialog();	

		softAssert.assertAll();

	}



	public void validateTextBoxVisibility() {

		SoftAssert softAssert = new SoftAssert();

		WebElement quantityField = driver.findElement(pizzaQuantityBy);

		// check size field of Cost field 
		// to see if the Cost field size length is not less than the max length
		//int size = Integer.parseInt(costElem.getAttribute("size"));
		//int maxlength = Integer.parseInt(costElem.getAttribute("maxlength"));
		// visibility testing
		//softAssert.assertTrue(size == maxlength, 
		//		"Expecting the size of Cost field equals max length");

		//softAssert.assertTrue(ElementUtil.isFieldLengthEqualsMaxlength(costElem), "Field size is ");



		// test max length 
		int maxlength = Integer.parseInt(quantityField.getAttribute("maxlength"));
		softAssert.assertTrue(maxlength>0, "Maxlength should be > 0");

		// validate the length of value in field should be greater than max length
		// Construct max value with 1 char more than max length allowed: 
		// "99999..."
		String value = new String(new char[maxlength+1]).replace("\0", "9");
		ElementUtil.enterValue(quantityField, value);				// enter max value to Quantity field
		String valueEntered = ElementUtil.getValue(quantityField);	// retrieve the value entered in the Quantity field
		softAssert.assertTrue(valueEntered.length() == maxlength, "Expecting max digit numbers in Quantity field");	

		// test positive max value in Quantity field: 99999....
		String maxString = new String(new char[maxlength]).replace("\0", "9");
		int maxValue = Integer.parseInt(maxString);
		softAssert.assertTrue(Integer.parseInt(valueEntered) == maxValue, "Expecting max quantity value is allowed");

		// validate the visibility length
		int size = Integer.parseInt(quantityField.getAttribute("size"));

		softAssert.assertFalse(size < maxlength, 
				"Expecting size of Quality field to be " + maxlength);


		softAssert.assertAll();

	}



	public void validateMaximumCharacters() {

		SoftAssert softAssert = new SoftAssert();
		WebElement nameField = driver.findElement(nameBy);

		// get max length
		int maxlength = Integer.parseInt(nameField.getAttribute("maxlength"));

		char[] array = new char[maxlength];  
		//assign the specified data value to each element   
		Arrays.fill(array, 'a');  
		String inputStr = new String(array); 

		// validate the display of Name value
		ElementUtil.enterValue(nameField, inputStr);
		// get a name value string
		String nameValue = ElementUtil.getValue(nameField);

		// compare the size of input string with the size of text appeared in the input field
		softAssert.assertTrue(nameValue.length() == inputStr.length());

		softAssert.assertTrue(nameValue.equals(inputStr));

		// System.out.println("Name value entered: " + nameValue);

		softAssert.assertAll();	

	}


	public void validateRequiredPhoneField() {
		WebElement phoneField = driver.findElement(phoneBy);
		validRequiredField(phoneField, MISSING_PHONE_NUMBER);
	}

	public void validateRequiredNameField() {
		WebElement nameField = driver.findElement(nameBy);	
		validRequiredField(nameField, MISSING_NAME);
	}


	public void validateNameFieldMaximumCharacters() {
		WebElement nameField = driver.findElement(nameBy);
		validateMaximumCharacters(nameField);
	}

	public void validateEmailFieldMaximumCharacters() {
		WebElement emailField = driver.findElement(emailBy);	
		validateMaximumCharacters(emailField);
	}

	public void validatePhoneFieldMaximumCharacters() {
		WebElement phoneField = driver.findElement(phoneBy);	
		validateMaximumCharacters(phoneField);
	}

	public void clickPlaceOrder() {
		driver.findElement(placeOrderButtonBy).click();
	}


	public void resetOrderForm() {
		driver.findElement(resetButtonBy).click();
	}


	public void closeDialog() {
		// close the dialog
		driver.findElement(By.cssSelector("span.ui-button-icon.ui-icon.ui-icon-closethick")).click();
	}


	public void validateResetButton() {


	}



}








