package com.test;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class InvocationCountTest {
	
	@Test(invocationCount=20)    // run this test 1o times
	public void sum() {
		int a = 10;
		int b = 20;
		int c = a+b;
		
		System.out.println("Sum is =" + c);
	}
	
	

	// org.testng.internal.thread.ThreadTimeoutException:
	// Method com.test.InvocationCountTest.invocationTimeOutTest() didn't finish within the time-out 3000
	@Test(invocationCount=4, invocationTimeOut=3000,expectedExceptions=ThreadTimeoutException.class)
	public void invocationTimeOutTest() throws InterruptedException {			
		Thread.sleep(1000);		
		System.out.println("Test");	
		
	}	
	
}
