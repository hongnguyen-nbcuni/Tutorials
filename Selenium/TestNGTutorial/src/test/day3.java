package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	/*
	
	@BeforeClass
	public void BeforeClassMethod() {
		System.out.println(" Before class method of class day 3");
	}

	@AfterClass
	public void AfterClassMethod() {
		System.out.println(" After class method of class day 3");
	}
	*/
	
	/*
	@Parameters({"URL2","APIKey/usrname"})
	@Test
	public void WebLoginCarLoan(String urlname, String key) {
		// selenium 
		System.out.println("WebLoginCarLoan");
		System.out.println(urlname);
		System.out.println(key);
	}
	*/
	
	@Test
	public void WebLoginCarLoan() {
		// selenium 
		System.out.println("WebLoginCarLoan");

	}
	
	
	/*
	@BeforeMethod
	public void BeforeMethodEvery() {
		System.out.println(" BeforeMethod: after every @Test annotation");
		
	}

	@AfterMethod
	public void AfterMethodEvery() {
		System.out.println(" AfterMethod: after every @Test annotation");
	}

	*/
	
	@Test
	public void MobileLoginCarLoan() {
		// Appium
		System.out.println("MobileLoginCarLoan");
	}
	
	/*
	@BeforeSuite
	public void Bfsuite() {
		System.out.println(" BeforeSuite: I am no 1");
	}
	*/
	
	//@Test(groups = {"Smoke"})
	//@Test
	//@Test(enabled=false)          			// this test case will be skipped 
	@Test
	public void MobileSignInCarLoan() {
		// Appium
		System.out.println("MobileSignInCarLoan");
	}
	
	//@Test (timeOut=4000)                    // wait until 40 secs before failing if something is wrong
	@Test(dataProvider="getData")			  // this will run three times 
   	public void MobileSignOutCarLoan(String username, String password) {
		// Appium
		System.out.println("MobilebSignOutCarLoan with dataProvder");
		System.out.println(" " + username);
		System.out.println(" " + password);
	}
	
	
	@Test
	public void LoginAPICarLoan() {
		// Rest API automation
		System.out.println("LoginAPICarLoan ");
	}
	
	@DataProvider
	public Object[][] getData() {
		// 1st combination - username password - good credit history -> a row
		// 2nd username password - no credit history
		// 3rd = fraudelent credit history
		// we have 3 combinations above, put [3]
		// each combination we are passing 2 so [2]
		Object[][] data = new Object[3][2];
		// 1st set 
		data[0][0] = "firstsetusername";
		data[0][1] = "password";
		// 2nd set
		data[1][0] = "secondsetusername";
		data[1][1] = "secondpassword";
		
		// 3rd set
		data[2][0] = "thirdsetusername";
		data[2][1] = "thirdpassword";
		
		return data;
		
		
	}
	
	/*
	@Test(dependsOnMethods={"WebLoginCarLoan","MobileSignOutCarLoan"})    // this will execute WebLoginCarLoan() first, then execute APIcarLoan()
	//@Test
	public void APIcarLoan() {
		System.out.println("APICarLoan");
	}
	
	@Test(dependsOnMethods={"WebLoginCarLoan"})    // this will execute WebLoginCarLoan() first, then execute APIcarLoan()
	//@Test
	public void APIcarLoan() {
		System.out.println("APICarLoan");
	}
	
	*/

	@Test
	public void APIcarLoan() {
		System.out.println("APICarLoan");
	}
	
	/*
	
	@BeforeTest
	public void prerequisite() {
		System.out.println(" BeforeTest: I will execute first in Car Loan <test> module");
	}
	*/
	
}
