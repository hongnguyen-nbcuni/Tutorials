package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {

	/*
	 * 	
	 * 	BeforeSuite -- setup system properties for chrome
		BeforeTest -- launch chrome Browser
		BeforeClass -- login to app
		
		BeforeMethod -- enter URL
			Test -- google logo test
		AfterMethod -- Logout from app
		
		BeforeMethod -- enter URL
			Test -- Google Title Test
		AfterMethod -- Logout from app
		
		BeforeMethod -- enter URL
			Test -- search test
		AfterMethod -- Logout from app
		
		AfterClass -- Close Browser
		AfterTest -- delete all cookies
PASSED: googleLogoTest
PASSED: googleTitleTest
PASSED: searchTest

		AfterSuite -- Generate Test Report
	 * 
	 */
	
	
	//  pre-condition annotations - starting with @Before
	
	@BeforeSuite
	public void setUp() {								// 1
		System.out.println("BeforeSuite -- setup system properties for chrome");
	}
	@BeforeTest
	public void launchBrowser() {						// 2
		System.out.println("BeforeTest -- launch chrome Browser");
	}
	@BeforeClass
	public void login() {
		System.out.println("BeforeClass -- login to app");				// 3
		
	}
	
	/*
	 * @BeforeMethod
	 * @Test - 1 		google logo test
	 * @AfterMethod
	 * 
	 * @BeforeMethod
	 * @Test - 2		Google Title Test
	 * @AfterMethod
	 * 
	 * @BeforeMethod
	 * @Test - 3		search test
	 * @AfterMethod
	 */
	
	@BeforeMethod
	public void enterURL() {							// 4
		System.out.println("BeforeMethod -- enter URL");
	}
	
	// test cases -- starting with @Test
	
	@Test
	public void googleTitleTest() {
		System.out.println("Test -- Google Title Test");		// 5
	}
	
	@Test
	public void searchTest() {
		System.out.println("Test -- search test");		// enter URL, search test, Logout from app
	}
	
	@Test
	public void googleLogoTest() {
		System.out.println("Test -- google logo test");
	}
	
	// post conditions -- starting with @After
	
	@AfterMethod
	public void logOut() {
		System.out.println("AfterMethod -- Logout from app");			// 6
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("AfterClass -- Close Browser");			// 7
	}
	
	@AfterTest
	public void deleteAllCookies() {					// 8
		System.out.println("AfterTest -- delete all cookies");
	}
	
	@AfterSuite
	public void generateTestReport() {					// 9
		System.out.println("AfterSuite -- Generate Test Report");
	}
}
