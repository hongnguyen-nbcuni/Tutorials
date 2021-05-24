package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	
	@BeforeClass
	public void BeforeClassMethod() {
		System.out.println("Before class method of class day 2");
	}
	
	@AfterClass
	public void AfterClassMethod() {
		System.out.println("After class method of class day 2");
	}
	
	
	@Test(groups = {"Smoke"}) 
	public void ploan() {
		System.out.println("good");
	}
	
	
	@BeforeTest
	public void prerequisite() {
		System.out.println("I will execute first 2 in Personal Loan <test> module");
	}
	
	
	
}
