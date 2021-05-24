package com.test;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class ExceptionTimeOutTest {


	@Test(timeOut = 500)       // returns FAILED since the test is not done within 1/2 secs
	public void timeTestOne() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("Time test method one");
	}

	@Test(timeOut = 500)
	public void timeTestTwo() throws InterruptedException {
		Thread.sleep(400);
		System.out.println("Time test method two");
	}
	
	// org.testng.internal.thread.ThreadTimeoutException:
	// Method com.test.InvocationCountTest.invocationTimeOutTest() didn't finish within the time-out 3000
	@Test(invocationCount=4, invocationTimeOut=3000,expectedExceptions=ThreadTimeoutException.class)
	public void invocationTimeOutTest() throws InterruptedException {			
		Thread.sleep(1000);		
		System.out.println("Test");	
		
	}
	
	// normally we don't expect these kind of exceptions
	// in Selenium we want it to return FAIL
	@Test(expectedExceptions=NumberFormatException.class)    
	public void test1() {
		String x = "100A";
		Integer.parseInt(x);
		System.out.println(Integer.parseInt(x));
	}
	

}
