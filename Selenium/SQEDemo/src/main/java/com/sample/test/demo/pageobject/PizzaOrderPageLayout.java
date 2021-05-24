package com.sample.test.demo.pageobject;

import java.util.Collections;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import com.sample.test.demo.constants.PizzaOrderFormLabels;
import com.sample.test.demo.utils.ElementUtil;

public class PizzaOrderPageLayout {
	
	By pizzaOrderFormLabelBy = By.xpath("//h1/center");
	By pizza1LabelBy = By.xpath("//div[@id='pizza1']/label[1]");
	By pizza1DropdownBy = By.id("pizza1Pizza");
	By toppings1LabelBy = By.xpath("//div[@id='pizza1']/label[2]");
	By chooseToppings1By = By.xpath("//div[@id='pizza1']//select[@class='toppings1']");
	By toppings2LabelBy = By.xpath("//div[@id='pizza1']/label[3]");
	By chooseToppings2By = By.xpath("//div[@id='pizza1']//select[@class='toppings2']");
	By quantityLabelBy =By.xpath("//div[@id='pizza1']/label[4]");
	By pizza1QuantityBy = By.id("pizza1Qty");
	By costLabelBy = By.xpath("//div[@id='pizza1']/label[5]");
	By pizza1CostBy = By.id("pizza1Cost");
	By pickupInfoLabelBy = By.xpath("//div[@id='pickupInfo']/h3");
	By nameLabelBy = By.xpath("//div[@id='pickupInfo']/label[1]");
	By nameBy = By.id("name");
	By emailLabelBy = By.xpath("//div[@id='pickupInfo']/label[2][text()='Email']");
	By emailBy = By.id("email");
	By phoneLabelBy = By.xpath("//div[@id='pickupInfo']/label[3]");
	By phoneBy = By.id("phone");
	By paymentInfoLabelBy = By.xpath("//h3[contains(text(),'PAYMENT INFORMATION')]");
	By creditCardRadioBy = By.id("ccpayment");
	By cashOnPickupRadioBy = By.id("cashpayment");
	By placeOrderButtonBy = By.id("placeOrder");
	By resetButtonBy = By.id("reset");
	By dialogBy = By.id("dialog");
	By dialogTextBy = By.xpath("//div[@id='dialog']/p");

	public WebDriver driver;
	public static final String CREDIT_CARD_VALUE = "Credit Card on Pickup";
	public static final String CASH_ON_PICKUP_VALUE = "Cash on Pickup";

	private static Logger log = LogManager.getLogger(PizzaOrderPageLayout.class);
	
    public PizzaOrderPageLayout(WebDriver driver) {
    	this.driver = driver;
    }
    	 
	public void validatePizzaOrderPageLayout() {
		
		log.info("Validating the following labels, dropdowns, and buttons on the page");
		
		SoftAssert softAssert = new SoftAssert();
		
		validateOrderInfoSectionLabels(softAssert);
		validatePizzaTypesDropdownList(softAssert);	
		validatePizzaToppings1DropdownList(softAssert);
		validatePizzaToppings2DropdownList(softAssert);
		validatePickupInfoSectionLabels(softAssert);
		validatePaymentInfoSectionLabels(softAssert);
		validatePlaceOrderButton(softAssert);
		validateResetButton(softAssert);
		
		softAssert.assertAll();
	}

	private void validateOrderInfoSectionLabels(SoftAssert softAssert) {
		log.info("Verify labels of top pizza order section");
		
		String title = driver.findElement(pizzaOrderFormLabelBy).getText();
		String pizza1 = driver.findElement(pizza1LabelBy).getText();
		String toppings1 = driver.findElement(toppings1LabelBy).getText();
		String toppings2= driver.findElement(toppings2LabelBy).getText();
		String quantity = driver.findElement(quantityLabelBy).getText();
		String cost = driver.findElement(costLabelBy).getText();
		
		String expectedTitle = PizzaOrderFormLabels.PIZZA_ORDER_FORM.getDisplayName();
		String expectedPizza1 = PizzaOrderFormLabels.PIZZA_1.getDisplayName();
		String expectedToppings1 = PizzaOrderFormLabels.TOPPINGS_1.getDisplayName();
		String expectedToppings2 = PizzaOrderFormLabels.TOPPINGS_2.getDisplayName();
		String expectedQuantity = PizzaOrderFormLabels.QUANTITY.getDisplayName();
		String expectedCost = PizzaOrderFormLabels.COST.getDisplayName();
		
		softAssert.assertEquals(title, expectedTitle);
		softAssert.assertEquals(pizza1, expectedPizza1);
		softAssert.assertEquals(toppings1, expectedToppings1);
		softAssert.assertEquals(toppings2, expectedToppings2);
		softAssert.assertEquals(quantity, expectedQuantity);
		softAssert.assertEquals(cost, expectedCost);
		

	}
	
	public void validatePizzaTypesDropdownList(SoftAssert softAssert) {
		log.info("Verify list of pizza types in Pizza 1 dropdown");

		WebElement pizza1 = driver.findElement(pizza1DropdownBy); 

		Select pizzaTypes = new Select(pizza1);
		List<WebElement> options = pizzaTypes.getOptions();  

		List<String> dropdownList = ElementUtil.getActualListfromWebElement(options);
		List<String> expectedList = ElementUtil.getExpectedListPizzaTypes();

		Collections.sort(expectedList);
		Collections.sort(dropdownList);

		//SoftAssert softAssert = new SoftAssert();
		if (dropdownList.size() == expectedList.size()) {
			for (int i=0; i<expectedList.size(); i++) {	
				softAssert.assertEquals(dropdownList.get(i), expectedList.get(i));
			}
		} 
		softAssert.assertEquals(dropdownList.size(), expectedList.size());
	}
	
	public void validatePizzaToppings1DropdownList(SoftAssert softAssert) {
		log.info("Verify list of toppings in Toppings 1 dropdown");
		
		validateToppings(chooseToppings1By,softAssert);	
	}


	public void validatePizzaToppings2DropdownList(SoftAssert softAssert) {
		log.info("Verify list of toppings in Toppings 2 dropdown");
		
		validateToppings(chooseToppings2By,softAssert);	
	}

	
	public void validateToppings(By element, SoftAssert softAssert) {

		WebElement toppings = driver.findElement(element); 

		Select pizzaToppings = new Select(toppings);  
		List<WebElement> options = pizzaToppings.getOptions();  

		List<String> dropdownList = ElementUtil.getActualListfromWebElement(options);
		List<String> expectedList = ElementUtil.getExpectedListToppings();

		Collections.sort(expectedList);
		Collections.sort(dropdownList);

		if (dropdownList.size() == expectedList.size()) {
			for (int i=0; i<expectedList.size(); i++) {	
				softAssert.assertEquals(dropdownList.get(i), expectedList.get(i));
			}
		} 

		softAssert.assertEquals(dropdownList.size(), expectedList.size());

	}
	
	public void validatePickupInfoSectionLabels(SoftAssert softAssert) {
		log.info("Verify labels & textbox length in Pickup Information section: Name*, Email, Phone*");
			
		String pickupInfo = driver.findElement(pickupInfoLabelBy).getText();
		String name = driver.findElement(nameLabelBy).getText();
		String email = driver.findElement(emailLabelBy).getText();
		String phone = driver.findElement(phoneLabelBy).getText();
		
		String expectedPickupLabel = PizzaOrderFormLabels.PICKUP_INFORMATION.getDisplayName();
		String expectedNameLabel = PizzaOrderFormLabels.NAME.getDisplayName();
		String expectedEmailLabel = PizzaOrderFormLabels.EMAIL.getDisplayName();
		String expectedPhoneLabel = PizzaOrderFormLabels.PHONE.getDisplayName();
		
		softAssert.assertEquals(pickupInfo, expectedPickupLabel);
		softAssert.assertEquals(name, expectedNameLabel);
		softAssert.assertEquals(email, expectedEmailLabel);
		softAssert.assertEquals(phone, expectedPhoneLabel);
		
		// check Name field size
		WebElement nameField = driver.findElement(nameBy);
		int size = Integer.parseInt(nameField.getAttribute("size"));
		int maxlength = Integer.parseInt(nameField.getAttribute("maxlength"));

		// to see if the Name field size length is not less than the max length
		softAssert.assertTrue(size == maxlength, 
				"Expecting the size equals max length");

		// check email field size
		WebElement emailField = driver.findElement(emailBy);
		size = Integer.parseInt(emailField.getAttribute("size"));
		maxlength = Integer.parseInt(emailField.getAttribute("maxlength"));
		
		// check to see if the email field size length is not less than the max length
		softAssert.assertTrue(size == maxlength, 
				"Expecting the size equals max length");
		
		// check Phone field size
		// to see if the Phone field size length is not less than the max length
		WebElement phoneField = driver.findElement(phoneBy);
		size = Integer.parseInt(phoneField.getAttribute("size"));
		maxlength = Integer.parseInt(phoneField.getAttribute("maxlength"));

		softAssert.assertTrue(size == maxlength, 
				"Expecting the size equals max length");

	}	
	
	public void validatePaymentInfoSectionLabels(SoftAssert softAssert) {
		log.info("Verify radio payments buttons: Credit Card , Cash on Pickup");
		
		// "PAYMENT INFORMATION" label
		softAssert.assertEquals(driver.findElement(paymentInfoLabelBy).getText(), PizzaOrderFormLabels.PAYMENT_INFORMATION.getDisplayName());	
	
		// "Credit Card", "Cash on Pickup" radio buttons
		softAssert.assertTrue(driver.findElement(creditCardRadioBy).isDisplayed()); 
		softAssert.assertTrue(driver.findElement(cashOnPickupRadioBy).isDisplayed()); 	
		softAssert.assertEquals(driver.findElement(creditCardRadioBy).getAttribute("value"), CREDIT_CARD_VALUE);
		softAssert.assertEquals(driver.findElement(cashOnPickupRadioBy).getAttribute("value"), CASH_ON_PICKUP_VALUE);				
	}
	
	public void validatePlaceOrderButton(SoftAssert softAssert) {

		log.info("Verify Place Order button");
		
		WebElement elm = driver.findElement(placeOrderButtonBy);
		
		String expectedPlaceOrderText  = PizzaOrderFormLabels.PLACEORDER.getDisplayName();
		
		softAssert.assertTrue(elm.isDisplayed());
		softAssert.assertTrue(elm.isEnabled());
		softAssert.assertEquals(elm.getText(), expectedPlaceOrderText);	
	}
	
	public void validateResetButton(SoftAssert softAssert) {
		
		log.info("Verify Reset button");
		
		WebElement elm = driver.findElement(resetButtonBy);
		String expectedResetText  = PizzaOrderFormLabels.RESET.getDisplayName();
		
		softAssert.assertTrue(elm.isDisplayed());
		softAssert.assertTrue(elm.isEnabled());
		softAssert.assertEquals(elm.getText(),expectedResetText); 
	}
	
}
