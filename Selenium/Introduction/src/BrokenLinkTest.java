import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinkTest {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "//usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");


		// any status code -> 400
		// broken URL
		// Step 1 - IS to get the all urls tied up to the links using Selenium
		//
		// Java methods will call URL's and gets you the status code
		// if status code > 400 then that url is not working -> link which tied to url is boken
		
		// a[href*="soapui"] or  a[href*='soapui']
		
		// all li tags with class='gf-li' -> li[class='gf-li'] a
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		
		// from TestNG
		// we should use soft assertion to avoid hard assertion
		// 
		SoftAssert a = new SoftAssert();
		
		for (WebElement link : links) {
			
			
			String url = link.getAttribute("href");
			
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			System.out.println(link.getText());
			System.out.println(respCode);
			
			/*
			if (respCode > 400) {
				System.out.println("The link with Text" + link.getText() + " is broken with code" + respCode);
				// this is hard assertion, this will stop the test
				Assert.assertTrue(false);
				// we should use soft assertion to avoid hard assertion
				// 
			}
			
			*/
			
			// Assert.assertTrue(respCode<400, "The link with Text" + link.getText() + " is broken with code" + respCode);
			// if respCode < 400 it won't report fail
			a.assertTrue(respCode<400, "The link with Text" + link.getText() + " is broken with code" + respCode);
			

			
		}
		
		// report the fail tests
		a.assertAll();

	}

}
