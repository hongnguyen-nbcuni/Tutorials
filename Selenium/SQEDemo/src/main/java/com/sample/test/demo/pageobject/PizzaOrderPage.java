package com.sample.test.demo.pageobject;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.maven.surefire.shade.booter.org.apache.commons.lang3.math.NumberUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.sample.test.demo.utils.ElementUtil;

//import org.apache.logging.log4j.LogManager;

//public class PizzaOrderPage extends TestBase {
public class PizzaOrderPage {

	By choosePizzaBy = By.id("pizza1Pizza");
	By toppings1LabelBy = By.xpath("//div[@id='pizza1']/label[2]");
	By chooseToppings1By = By.xpath("//div[@id='pizza1']//select[@class='toppings1']");
	By toppings2LabelBy = By.xpath("//div[@id='pizza1']/label[3]");
	By chooseToppings2By = By.xpath("//div[@id='pizza1']//select[@class='toppings2']");
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

	public WebDriver driver;     // define separate web driver for each page object

	private static Logger log = LogManager.getLogger(PizzaOrderPage.class);

	public PizzaOrderPage(WebDriver driver) {
		this.driver = driver;
	}


	public void validateQuantityValue(String value) {

		log.info("Validating quantity input value: " + value);
		
		WebElement quantityField = driver.findElement(pizzaQuantityBy);
		WebElement placeOrderButton = driver.findElement(placeOrderButtonBy);

		String valueEntered;

		log.trace("Enter quantity value to Quantity text field");
		ElementUtil.enterValue(quantityField, value);

		valueEntered = ElementUtil.getValue(quantityField);
		log.trace("Get value of Quantity field: " + valueEntered);

		// expecting the input value is the same value as in the text box
		log.trace("Verify quantity value in text box is expected");
		Assert.assertTrue(Integer.parseInt(valueEntered) == Integer.parseInt(value), "Expect actual value in text box equals expected value");	

		// is it a numeric or < 1
		log.trace("Check quantity input is invalid or less than 1");
		if (!NumberUtils.isParsable(value) || Integer.parseInt(valueEntered) < 1) {	

			log.info("Verify Place Order button is disabled when quantity invalid or less thatn 1: " + value);
			
			Assert.assertTrue(ElementUtil.checkButtonIsDisabled(placeOrderButton), "Quantity input " + value + ", expect Place Order button disabled for invalid Quantity value.");
		} 
	
	}

	public int getQuantitydMaxValue() {	
		/*
		 * get maximum value of quantify field based on the max length of the field
		 */
		
		WebElement quantityField = driver.findElement(pizzaQuantityBy);

		log.trace("Getting max value of quantity field");
		// get max length of quantity input field
		int maxlength = Integer.parseInt(quantityField.getAttribute("maxlength"));

		// construct max value of Quantity field: 99999 if it's 5 digits
		String maxString = new String(new char[maxlength]).replace("\0", "9");
		int maxQuantity = Integer.parseInt(maxString);

		return maxQuantity;

	}


	public void validateMaximumQuantityTotalCost() {

		log.info("Validating the maximum total cost in Cost field");
		
		//SoftAssert softAssert = new SoftAssert();
		
		// get the max value of Quantity field that user can enter
		int maxQuantity = getQuantitydMaxValue();

		if (maxQuantity < 1) {
			log.trace("Verify the maximum quantity value can be entered should be > 0: " + maxQuantity);
			Assert.assertTrue(false, "Quantity value should be positive");
			//return;
		}

		log.trace("Verify the full total cost should be visible in Cost field");
		validateTotalCostField(String.valueOf(maxQuantity));;
		//softAssert.assertAll();	
	}


	public void validateNumberOfToppingsDisplayed() {

		log.info("Validating the correct number of toppings displayed");
		
		SoftAssert softAssert = new SoftAssert();

		WebElement pizza1 = driver.findElement(choosePizzaBy);  
		WebElement chooseToppings1 = driver.findElement(chooseToppings1By);
		WebElement chooseToppings2 = driver.findElement( chooseToppings2By);

		// looping through each pizza type from drop down
		for (int index=0; index < ElementUtil.getExpectedListPizzaTypes().size(); index++) {
			String pizzaType = ElementUtil.getPizzaTypeFromDropdown(pizza1, index);

			boolean isTopping1Enabled = ElementUtil.isElementEnabled(chooseToppings1);
			boolean isTopping2Enabled = ElementUtil.isElementEnabled(chooseToppings2);

			if (pizzaType.equals("Choose Pizza"))
				continue;

			if (pizzaType.contains("no toppings")) {
				log.info("Verify no toppings for pizza type: " + pizzaType);
				softAssert.assertTrue(!isTopping1Enabled, pizzaType + " : expect Choose a Toppings 1 disabled.");
				softAssert.assertTrue(!isTopping2Enabled, pizzaType + " : expect Choose a Toppings 2 disabled.");	

			}
			else if (pizzaType.contains("1 topping")) {	
				log.info("Verify 1 topping for pizza type: " + pizzaType);
				softAssert.assertTrue(isTopping1Enabled, pizzaType + " : expect Choose a Toppings 1 enabled.");
				softAssert.assertTrue(!isTopping2Enabled, pizzaType + " : expect Choose a Toppings 2 disabled.");
			}

			else if (pizzaType.contains("2 toppings")) {
				log.info("Verify 2 toppings for pizza type: " + pizzaType);
				softAssert.assertTrue(isTopping1Enabled, pizzaType + " : expect Choose a Toppings 1 enabled.");
				softAssert.assertTrue(isTopping2Enabled, pizzaType + " : expect Choose a Toppings 2 enabled.");
			}
		}

		softAssert.assertAll();	

	}

	private void validateInputValue(WebElement elem, String inputStr) {	
		/*
		 * validate the string passed in is the same as the name appeared in the field
		 */
		
		if (inputStr.isEmpty()) {
			log.info("Verify popup has " + MISSING_NAME);
			validRequiredFieldPopUp(driver.findElement(nameBy), MISSING_NAME);
		}
		
		SoftAssert softAssert = new SoftAssert();

		String typeAttributeValue = elem.getAttribute("type");

		// check to see if Cost field can only accept TEXT, not number field
		softAssert.assertTrue(typeAttributeValue.equals("text"),
				"Expecting type text in Name field.");

		// enter Name value to Name field
		ElementUtil.enterValue(elem, inputStr);
		// getting back a name value
		String value = ElementUtil.getValue(elem);

		// compare
		softAssert.assertEquals(value,inputStr);

		softAssert.assertAll();	
	}

	public void validateNameField(String name) {

		log.info("Validating Name input value: " + name);
		
		WebElement nameField = driver.findElement(nameBy);	
		validateInputValue(nameField, name);

	}

	public void validateEmailField(String email) {

		log.info("Validating Email input value: " + email);
		
		WebElement emailField = driver.findElement(emailBy);;	
		validateInputValue(emailField, MISSING_PHONE_NUMBER);

	}

	public void validatePhoneField(String phone) {

		log.info("Validating Phone input value: " + phone);
		
		WebElement phoneField = driver.findElement(phoneBy);	
		validateInputValue(phoneField, phone);
	}

	public void validatePaymentRadioButtons() {

		log.info("Validating Payment radio buttons: Credit Card & Cash on Pickup");
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
		log.info("Click on Credit Card option");
		creditCardPayment.click();

		log.info("Verify Credit Card is selected");
		softAssert.assertTrue(creditCardPayment.isSelected(), "Credit Card should be selected");

		log.info("Click on Cash on Pickup option");
		cashPayment.click();

		log.info("Verify Cash on Pickup is selected");
		softAssert.assertTrue(cashPayment.isSelected(), "Cash on Pickup should be selected");
		
		log.info("Verify Credit Card is not selected");
		softAssert.assertFalse(creditCardPayment.isSelected(), "Credit Card option should be unselected while Cash option was selected");

		if (creditCardPayment.isSelected() && cashPayment.isSelected()) {
			log.info("Verify Both Credit Card & Cash on Pickup should not be selected at the same time");
			softAssert.assertTrue(false, "Both Credit Card & Cash on Pickup should not be checked at the same time");
		}
		else {
			// reselect credit card radio button
			creditCardPayment.click();
			// expecting Cash on Pickup option to be unselected
			softAssert.assertFalse(cashPayment.isSelected(), "Cash on Pickup should not be selected");

		}

		softAssert.assertAll();

	}


	public void validateTotalCostField(String quantityStr) {
		
		log.info("Validating the total cost of quantity pizza input: " + quantityStr);

		WebElement pizza1 = driver.findElement(choosePizzaBy); 
		WebElement quantityField = driver.findElement(pizzaQuantityBy); 
		WebElement costField = driver.findElement(pizzaCostBy); 
		WebElement placeOrderButton = driver.findElement(placeOrderButtonBy);

		SoftAssert softAssert = new SoftAssert();
		
		// is quantify valid? - (no need to automate the length, no need to valid the value entered vs the value appeared in field)
		if (!NumberUtils.isParsable(quantityStr) || Integer.parseInt(quantityStr) < 1) {
			ElementUtil.enterValue(quantityField, quantityStr);
			ElementUtil.getValue(costField);	
			
			// expect Cost value = 0
			log.info("Verify the total cost of invalid quantity value");
			softAssert.assertEquals(String.valueOf(0), ElementUtil.getValue(costField), "\tExpect cost value 0.");
			
			// is Place Order button disabled?
			log.trace("Verify the Place Order button is disabled when quantity value is 0");
			softAssert.assertTrue(ElementUtil.checkButtonIsDisabled(placeOrderButton), 
					"Total cost field has value " + ElementUtil.getValue(costField) + " , expect Place Order button disabled.");

		}

		log.info("Verify the total cost of each pizza type of quantity: " + quantityStr);
		// loop through the pizza type selection and calculate the total cost of quantity input
		for (int index=0; index < ElementUtil.getExpectedListPizzaTypes().size(); index++) {
			String selected = ElementUtil.getPizzaTypeFromDropdown(pizza1, index);

			if (selected.equals("Choose Pizza"))
				continue;

			// enter quantity value
			ElementUtil.enterValue(quantityField, quantityStr);

			// get total cost value from Cost field
			double actualTotalCost = Double.parseDouble(ElementUtil.getValue(costField));
			
			// calculate the expected total cost
			double expectedCost = ElementUtil.calculateExpectedTotalCost(selected, quantityStr);

			if (expectedCost == 0 || actualTotalCost == 0) {
				log.trace("Total cost is 0 of pizza type: " + selected);
				softAssert.assertTrue(false, "Price per pizza is missing");
			}

			log.trace("Verify a total cost of pizza type: " + selected);
			log.trace("Expected total cost: " + expectedCost + ". Actual total Cost: " + actualTotalCost);
			softAssert.assertEquals(expectedCost, actualTotalCost);
		}	

		softAssert.assertAll();	

	}

	/**
	 * 
	 * @param pizza
	 * @param totalcost
	 */
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


	public void validatePlaceOrderTotalCostModal(PersonInfo person) {

		log.info("Validating Order Dialog popup" );
		// fill in person order in the form, place order, and validate the order

		SoftAssert softAssert = new SoftAssert();

		ElementUtil.enterValue(driver.findElement(nameBy), person.getName());
		ElementUtil.enterValue(driver.findElement(emailBy), person.getEmail());
		ElementUtil.enterValue(driver.findElement(phoneBy), person.getPhone());
		ElementUtil.enterValue(driver.findElement(pizzaQuantityBy), String.valueOf(person.getQuantity()));

		String pizza = ElementUtil.getPizzaType(person.getPizza());

		Assert.assertTrue(pizza != null, "Pizza type entered: " + person.getPizza() + " , expect valid pizza type.");

		//Assert.assertTrue(person.getQuantity() > 0, "\tEntered quantity " + person.getQuantity() + " , expect quantity > 0.");

		validateQuantityValue(String.valueOf(person.getQuantity()));


		if (person.getPayment().equals(CREDIT_CARD))
			driver.findElement(creditCardRadioBy).click();
		else if (person.getPayment().equals(CASH_ON_PICKUP)) 
			driver.findElement(cashOnPickupRadioBy).click();
		else 
			softAssert.assertTrue(false, "Payment method should be selected");

		double totalcost = calculateTotalCost(person);

		clickPlaceOrder();

		validatePopupMsg(pizza, totalcost);

		softAssert.assertAll();

	}

	public double calculateTotalCost(PersonInfo person) {

		log.info("Calculate the total cost of the pizza order");
		
		String pizza = ElementUtil.getPizzaType(person.getPizza());

		if (pizza == null)
			return 0;

		double cost = ElementUtil.getPizzaCost(person.getPizza());

		// construct pizza + cost string to Choose Pizza order item from the drop down
		DecimalFormat df = new DecimalFormat("#.00");

		String p = pizza + " $" + df.format(cost);

		WebElement pizza1 = driver.findElement(choosePizzaBy); 
		Select pizzaTypes = new Select(pizza1); 

		pizzaTypes.selectByVisibleText(p);

		double totalcost = cost * person.getQuantity();

		return totalcost;

	}

	private void validRequiredFieldPopUp(WebElement field, String missingMsg) {

		log.info("Validating the required field message in the modal when the value is empty");
		
		SoftAssert softAssert = new SoftAssert();

		// getting a string value
		String value = ElementUtil.getValue(field);

		// compare the size of input string with size of text appeared in the input field
		softAssert.assertTrue(value.length() == 0);

		//System.out.println("Name value entered: " + value);

		// click on Place Order button
		clickPlaceOrder();	

		// check dialog is displayed and Missing ... message
		if (driver.findElement(dialogBy) != null) {
			//Check for element's present
			WebElement dialogTextElem  = driver.findElement(dialogTextBy); 	

			String actualMsg = ElementUtil.getTextMessage(dialogTextElem);

			log.trace("Verify the missing value msg in the modal");
			softAssert.assertTrue(actualMsg.contains(missingMsg), missingMsg + " is expected");

			closeDialog();
		}

		softAssert.assertAll();	

	}

	public void validateRequiredFields() {
		
		log.info("Validating required Name* field");
		// enter empty string to Name* field
		ElementUtil.enterValue(driver.findElement(nameBy), "");
		// getting a name value
		validRequiredFieldPopUp(driver.findElement(nameBy), MISSING_NAME);
		
		log.info("Validating required Phone* field");
		// enter empty string
		ElementUtil.enterValue(driver.findElement(phoneBy), "");
		validRequiredFieldPopUp(driver.findElement(phoneBy), MISSING_PHONE_NUMBER);
	}
		
	// no need to validate the maximum number of characters
	
	public void validateMaximumCharacters(WebElement elem) {

		log.info("Validating if we can enter maximum characters in text field");
		
		SoftAssert softAssert = new SoftAssert();

		// get max length
		int maxlength = Integer.parseInt(elem.getAttribute("maxlength"));

		char[] array = new char[maxlength];  
		//assign the specified data value to each element   
		Arrays.fill(array, 'a');  
		String inputStr = new String(array); 

		// Enter input string into text box
		ElementUtil.enterValue(elem, inputStr);
		// Retrieve a string value appeared in text box
		String emailValue = ElementUtil.getValue(elem);

		softAssert.assertTrue(emailValue.equals(inputStr));
		softAssert.assertAll();		

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


	public void resetForm() {
		driver.findElement(resetButtonBy).click();
	}


	public void closeDialog() {
		// close the dialog
		driver.findElement(By.cssSelector("span.ui-button-icon.ui-icon.ui-icon-closethick")).click();
	}


	public void validateResetButton() {
		
		log.info("Validating Reset button");
		
		SoftAssert softAssert = new SoftAssert();
		WebElement resetButton = driver.findElement(resetButtonBy); 

		boolean isEnabled = ElementUtil.isElementEnabled(resetButton);

		softAssert.assertTrue(isEnabled, "Reset button is clickable");	

	}

}






