import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class translator {


	WebDriver driver = new ChromeDriver(); // launch chrome
	String testUser = "206496616";

	@BeforeTest
	public void setUp() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/usr/local/bin//chromedriver");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		// global timeout for the entire automation script
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://translator-ui-qa.tlmam.inbcu.com/");
		//Thread.sleep(2000);	


	}

	@Test (priority = 1)
	public void login() throws Exception {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='assets/tl-gmo-logo.svg']")));
		
		driver.findElement(By.xpath("//div[contains(@onclick,\"supply\")]")).click();

		WebElement username = driver.findElement(By.id("username"));

		if(username != null) {
			username.sendKeys("206496618");
			driver.findElement(By.id("password")).sendKeys("xxxxxxx");	
			driver.findElement(By.id("submitBtn")).click();
		}	

	}

	@Test (priority = 2)
	public void homePage() throws Exception {
		
		driver.findElement(By.xpath("//img[@src='assets/svg/logo-translator-no-g.svg']")).isDisplayed();
		
		driver.findElement(By.xpath("//input[@type='search']")).isDisplayed();

		// Search...
		WebElement search = driver.findElement(By.xpath("//input[@type='search']"));
		
		// WORK ORDERS - 
		driver.findElement(By.xpath("//div[text()='Work Orders']")).isDisplayed();
		// MAPPING
		driver.findElement(By.xpath("//div[text()='Mapping']")).isDisplayed();
		// ASSETS
		driver.findElement(By.xpath("//div[@class='ng-scope' and text()='Assets']")).isDisplayed();
		// ADMIN
		// driver.findElement(By.xpath("/div[text()='Admin']")).isDisplayed();
		

		Object aa = ((JavascriptExecutor) driver)
				.executeScript(
						"var items = {}; for (index = 0; index < arguments[0].attributes.length; ++index) { items[arguments[0].attributes[index].name] = arguments[0].attributes[index].value }; return items;",
						search);
		System.out.println(aa.toString());


		//1. Get the total count of links on the page 
		//2. Get the text of each link on the page 
		// all the links are represented by <a> html tag 

		List <WebElement> linkList = driver.findElements(By.tagName("a"));      // a is html tag 

		System.out.println(linkList.size()); 

		for(int i=0; i<linkList.size(); i++) {
			String linkText = linkList.get(i).getText();

			System.out.println(linkText);

			aa = ((JavascriptExecutor) driver)
					.executeScript(
							"var items = {}; for (index = 0; index < arguments[0].attributes.length; ++index) { items[arguments[0].attributes[index].name] = arguments[0].attributes[index].value }; return items;",
							linkList.get(i));
			System.out.println(aa.toString());
		}

	}



}
