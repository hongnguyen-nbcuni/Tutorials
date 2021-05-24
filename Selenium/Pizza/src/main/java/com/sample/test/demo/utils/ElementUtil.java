package com.sample.test.demo.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.sample.test.demo.constants.PizzaToppings;
import com.sample.test.demo.constants.PizzaTypes;

public class ElementUtil {


	public static List<String> getActualListfromWebElement(List<WebElement> elements) {

		List<String> list =  new ArrayList<String>();

		// get list of pizza options
		for (WebElement elem : elements)  
		{  
			// ignore "Choose Pizza" line
			if (!elem.getText().contains("Choose")) {

				list.add(elem.getText());
				//System.out.println("acutal:" + elem.getText());
			}

			//pizzaTypes.selectByVisibleText(we.getText());

			//if (pizza1.isSelected()) {
			//     System.out.println("selected pizza: " + pizza1.getText());
			//}
		} 

		return list;

	}

	public static List<String> getExpectedListPizzaTypes() {

		List<String> expectedList =  new ArrayList<String>();	

		// get the pizza list from enum PizzaTypes
		// reconstruct "pizza type + cost" into another list
		for (PizzaTypes p : PizzaTypes.values()) {

			//System.out.println("Pizza Types: " + p);

			String displayName = p.getDisplayName();
			double cost = p.getCost();

			// construct to string i.e "Small 6 Slices - no toppings $6.75"
			String ptype = displayName + " $" + String.format("%.2f", cost);

			expectedList.add(ptype);

			//System.out.println (ptype);

			//pizzaTypes.selectByVisibleText(ptype);

		}

		return expectedList;
	}


	public static double getPizzaCost(String order) {	

		// get the pizza list from enum PizzaTypes
		// reconstruct "pizza type + cost" into another list
		for (PizzaTypes p : PizzaTypes.values()) {

			//System.out.println("Pizza Types: " + p);

			if (p.getDisplayName().equals(order)) {
				return p.getCost();
			}

		}

		return 0;
	}

	public static String getPizza(String order) {	

		// get the pizza list from enum PizzaTypes
		// reconstruct "pizza type + cost" into another list
		for (PizzaTypes p : PizzaTypes.values()) {

			//System.out.println("Pizza Types: " + p);

			if (p.getDisplayName().equals(order)) {
				return p.getDisplayName();
			}

		}

		return null;
	}



	public static List<String> getExpectedListToppings() {

		List<String> expectedList =  new ArrayList<String>();	

		// get the pizza list from enum PizzaTypes
		// reconstruct "pizza type + cost" into another list
		for (PizzaToppings p : PizzaToppings.values()) {
			//System.out.println("Pizza Topping: " + p);

			//String displayName = p.getDisplayName();
			expectedList.add(p.getDisplayName());
			//System.out.println (ptype);

			//pizzaTypes.selectByVisibleText(ptype);

		}

		return expectedList;

	}


	public static String getTextMessage(WebElement elem) {

		// check dialog is displayed and "Missing Name" msg
		
		
		Boolean isdisplayed = elem.isDisplayed();
		
		// System.out.println("Dialog is displayed: " + isdisplayed);
		
		
		String text = elem.getText();
		
		// System.out.println("Text: " + text);

		
		return text;
		/*
		if (driver.findElement
				(By.xpath("//div[contains(@class, 'ui-dialog ui-corner-all')]")) != null) {
			//Check for element's presence
			//List<WebElement> elems = driver.findElements(By.xpath("//div[@id='dialog']/p[contains(text(),'Missing name')]"));	
			String xpath = "//div[@id='dialog']/p[contains(text(),'" + missingMsg  + "')]";		

			List<WebElement> elems = driver.findElements(By.xpath(xpath));	

			if(elems.size() != 0)
				softAssert.assertTrue(true);
			else
				softAssert.assertTrue(false,  missingMsg + " message is expecting");
			// close the dialog
			driver.findElement(By.cssSelector("span.ui-button-icon.ui-icon.ui-icon-closethick")).click();
		}

		*/
		
		//return null;

	}

	/*
	public static void enterValue(WebDriver driver, By locator, int value)  {

		WebElement elem = driver.findElement(locator); 

		elem.clear();
		elem.sendKeys(Integer.toString(value));	
		elem.sendKeys(Keys.ENTER);	

	}
	 */

	public static void enterValue(WebDriver driver, By locator, String value)  {

		WebElement elem = driver.findElement(locator); 

		elem.clear();
		elem.sendKeys(value);	
		elem.sendKeys(Keys.ENTER);	

	}

	public static void enterValue(WebElement elem, String value) {

		elem.clear();
		elem.sendKeys(value);	
		elem.sendKeys(Keys.ENTER);	

	}


	public static String getValue(WebDriver driver, By locator) {

		WebElement elem = driver.findElement(locator); 

		return(elem.getAttribute("value"));


	}

	public static String getValue(WebElement elem) {

		return (elem.getAttribute("value"));
	}


	public static Boolean isFieldLengthEqualsMaxlength(WebElement elem) {
		// check size field of Cost field 
		// to see if the Cost field size length is not less than the max length
		int size = Integer.parseInt(elem.getAttribute("size"));
		int maxlength = Integer.parseInt(elem.getAttribute("maxlength"));
		
		if (size == maxlength) {
			return true;
		} else
			return false;	

	}




}
