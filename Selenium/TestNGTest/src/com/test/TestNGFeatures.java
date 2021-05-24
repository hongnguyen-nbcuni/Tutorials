package com.test;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	@Test
	public void loginTest() {
		System.out.println("login test");
	}
	

	 // if loginTest test fails, then this test will be ignored
	@Test(dependsOnMethods="loginTest")     
	public void homePageTest() {
		System.out.println("home page test");
	}
	
	 // if loginTest test fails, then this test will be ignored
	@Test(dependsOnMethods="loginTest")  
	public void searchPageTest() {
		System.out.println("search page test");
	}
	
	 // if loginTest test fails, then this test will be ignored
	@Test(dependsOnMethods="loginTest")  
	public void regPageTest() {
		System.out.println("Reg test");
	}
	
}
