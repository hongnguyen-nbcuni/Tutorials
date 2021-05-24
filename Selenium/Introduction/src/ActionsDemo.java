import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "//usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();

		//driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.get("https://www.amazon.com");
		
		Actions a = new Actions(driver);
		
		// [id='icp-nav-flyout']
		// a[id='icp-nav-flyout']
		// a[id='nav-link-accountList']
		// build() is to ready to execute
		//a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform(); // will execute
		
		// driver.findElement(By.id("twotabsearchtextbox")).sendKeys("HELLO");
		// or
		
		WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		
		// mouse over
		// a.moveToElement(move).build().perform();
		// right click
		a.moveToElement(move).contextClick().build().perform();
		
		// Drag and drop
		// a.moveToElement(target).???
		
		//a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();;
	
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();;
		
		
	}

}
