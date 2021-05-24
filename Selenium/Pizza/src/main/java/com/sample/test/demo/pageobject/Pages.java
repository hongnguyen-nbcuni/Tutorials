package com.sample.test.demo.pageobject;

import org.openqa.selenium.WebDriver;

//import com.sample.test.demo.pageobject.PizzaOrderPage;


public class Pages {

	private WebDriver webdriver;
	private PizzaOrderPage pizzaOrderPage = null;
	
	public Pages(WebDriver wd) {
		this.webdriver = wd;
	}
	
	public PizzaOrderPage pizzaOrderPage() {
		if (pizzaOrderPage == null) {
			pizzaOrderPage = new PizzaOrderPage(webdriver);

		}
		return pizzaOrderPage;
	}
	
	
	
}
