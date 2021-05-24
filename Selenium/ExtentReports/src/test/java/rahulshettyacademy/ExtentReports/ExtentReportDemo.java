package rahulshettyacademy.ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo {
	
	ExtentReports extent;
	
	@BeforeTest
	public void config() {
	
		System.out.println(System.getProperty("user.dir"));
		
		// ExtentReports, ExtentSparkReporter
		String path = System.getProperty("user.dir") + "/reports/index.html"; // where your path file should be stored
		
		System.out.println(path);
		
		// this is a helper class which is helping to create some configuration and 
		// that will finally report to its main class
		ExtentSparkReporter reporter = new ExtentSparkReporter(path); // to make configuration for the report
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		// this is a main class is responsible to create and consolidate all your test execution
		//ExtentReports extent = new ExtentReports();
		extent = new ExtentReports();
		// now attach a report
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Hong Nguyen");	
		
	}
	
	
	@Test
	public void InitialDemo() {
		
		// need to add this line in every single test
		ExtentTest test = extent.createTest("Initial Demo");
		
		System.setProperty("webdriver.chrome.driver", "//usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());	
		
		driver.close();
		
		// test.fail("Result do not match");   // we can fail it
		
		// we can capture the screenshot here
		// test.addScreenCaptureFromBase64String(s)
		
		extent.flush(); // will notify the test is done, this will generate the report Pass/Fail
		
	}
	
}
