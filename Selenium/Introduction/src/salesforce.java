import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {

	public static void main(String[] args) {
		
		// these two lines will invoke the chrome driver
		System.setProperty("webdriver.chrome.driver", "//usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.id("username")).sendKeys("hello");
		driver.findElement(By.name("pw")).sendKeys("123456");
		//driver.findElement(By.className("button r4 wide primary")).click(); // error
		
		// //*[@id="Login"]
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		// #error, from right click Copy Selector
		//String text = driver.findElement(By.cssSelector("#error")).getText();
		//System.out.println(text);
		// or
		// from the bottom of the page of Inspect
		String text2 = driver.findElement(By.cssSelector("div#error.loginError")).getText();
		System.out.println(text2);
		
		
	}

}
