package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {

	@Parameters({"URL2"})
	@Test
	public void WebLoginHomeLoan(String urlname) {
		// selenium 
		System.out.println("WebLoginHomeLoan");
		System.out.println(urlname);
	}

	@Test(groups = {"Smoke"})
	public void MobileLoginHomeLoan() {
		// Appium
		System.out.println("MobileLoginHomeLoan");
	}
	
	@Test
	public void LoginAPIHomeLoan() {
		// Rest API automation
	}
	
	
}
