package com.sample.test.demo;

import java.lang.reflect.Field;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TestListener extends TestBase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestSuccess(ITestResult result) {

		Reporter.log("Listener: onTestSuccess");

		//System.out.println("Success of test cases and its details are : "+result.getName());  

		//logTestResult(Status.SUCCESS, tr, false);

	}

	/*
	@Override
	public void onTestFailure(ITestResult result) {

		Reporter.log("Listener: onTestSuccess");

		System.out.println("Failure of test cases and its details are : "+result.getName()); 

		// this a snippet from TL automation
		if (result.getThrowable() != null && result.getThrowable().getClass() != null
                && result.getThrowable().getClass() != AssertionError.class) {
            AssertionError error = new AssertionError(result.getThrowable().getMessage(), result.getThrowable());
            error.setStackTrace(result.getThrowable().getStackTrace());
            result.setThrowable(error);
		}

		// Capture Screenshot

		// we should capture the driver of the test, get a "driver" field of that class
		WebDriver driver = null;
		try {
			driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (Exception e) {		
			e.printStackTrace();
		}

		Screenshot screenshot = new Screenshot(driver);

		// capture the name of the method name that got failed
		String testMethodName = result.getMethod().getMethodName();
		//getScreenShotPath(testMethodName, driver);		// inherit the base class to see this method
		screenshot.takeScreenshot(driver, testMethodName);  


	}

	 */

	@Override
	public void onTestFailure(ITestResult result) { 

		Reporter.log("Listener: onTestFailure");
		//System.out.println("Failure of test cases and its details are : "+ result.getName()); 	

		try {
			Screenshot screenshot = new Screenshot(driver(result));
			//screenshot.capture(result.getName());
		} 
		catch (IllegalAccessException e) {
			e.printStackTrace();
		}  

	}


	@SuppressWarnings("unchecked")
	private WebDriver driver(ITestResult testResult) 
			throws IllegalAccessException 
	{

		try {

			/*
	       we use reflection and generics to find the driver object:

	       1. testResult.getInstance() 
	          returns the running test class object

	       2. testResult.getInstance().getClass() 
	          returns the class of testResult (TestClass)

	       3. testClass.getSuperclass() 
	          returns the parent of the test class (BaseTestClass)

	       4. Field driverField = 
	                baseTestClass.getDeclaredField(“driver”)
	          returns the driver field of the BaseTestClass

	       5. driver = 
	           (WebDriver)driverField.get(testResult.getInstance());
	          gets the value of the driver field from the BaseTestClass
			 */
			Class<?extends ITestResult> testClass = 
					(Class<? extends ITestResult>) 
					testResult.getInstance().getClass();
			Class<?extends ITestResult> baseTestClass = 
					(Class<? extends ITestResult>) 
					testClass.getSuperclass();
			Field driverField = baseTestClass.getDeclaredField("driver");
			WebDriver driver =   
					(WebDriver)driverField.get(testResult.getInstance()); 

			return driver;
		}  
		catch (SecurityException | 
				NoSuchFieldException | 
				IllegalArgumentException e) { 
			throw new RuntimeException("could not get the driver");
		}

	}



	@Override
	public void onTestSkipped(ITestResult result) {
		//System.out.println("Skip of test cases and its details are : "+result.getName());  

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		//System.out.println("Failure of test cases and its details are : "+result.getName());  

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}


}
