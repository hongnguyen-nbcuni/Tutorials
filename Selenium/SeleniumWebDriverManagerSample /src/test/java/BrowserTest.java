import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
	public static void main(String[] args) {
		
		System.setProperties("webdriver.gecko.driver", "/Users/hnguyen/qa-development/Tutorials/Selenium/SeleniumWebDriverManagerSample /drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://seleniumhq.org/");
		
		
	}
}
