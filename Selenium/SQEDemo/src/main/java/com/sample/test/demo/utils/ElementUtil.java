package com.sample.test.demo.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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


	public static String getPizzaType(String order) {	

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


	public static String getPizzaTypeFromDropdown(WebElement dropdown, int index) {

		Select pizzaTypes = new Select(dropdown);  

		List<WebElement> ptypes = pizzaTypes.getOptions();  

		pizzaTypes.selectByIndex(index);

		String selected = ptypes.get(index).getText();

		return selected;

	}

	/*
	public static int getNumberToppingsOfPizzaType(int index) {	
		return 0;

	}
	 */

	public static List<String> getExpectedListToppings() {
		List<String> expectedList =  new ArrayList<String>();	

		// get the pizza list from enum PizzaTypes
		// reconstruct "pizza type + cost" into another list
		for (PizzaToppings p : PizzaToppings.values()) {
			//System.out.println("Pizza Topping: " + p);
			expectedList.add(p.getDisplayName());
			//System.out.println (ptype);

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
	}

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

	public static boolean checkButtonIsDisabled(WebElement button) {

		if (!button.isEnabled()) 
			return true;
		else
			return false;

	}

	public static double calculateExpectedTotalCost(String selected, String quantityStr) {

		double totalCost = 0;
		// calculate the expected total cost
		if (selected.contains("$")) {
			String[] arrOfStr = selected.split("\\$", 2); 
			//
			//double costPerPizza = Double.parseDouble(arrOfStr[1]);
			double costPerPizza = ElementUtil.getPizzaCost(arrOfStr[0].trim());

			// calculate expected total cost
			totalCost = costPerPizza * Integer.parseInt(quantityStr);

			//System.out.println(expectedCost + ", " + totalcost);
		} 

		return totalCost;
	}

	public static boolean isElementEnabled(WebElement elem) {

		if (elem.isDisplayed() && elem.isEnabled()) {
			return true;
		} else
			return false;	

	}


}
