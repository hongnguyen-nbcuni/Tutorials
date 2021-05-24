import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {
	public static void main(String[] args) {
		/*

		WebDriver driver = new FirefoxDriver();

		//System.setProperty("webdriver.gecko,driver", "/Users/hnguyen/qa-development/Tutorials/Selenium/SeleniumWebDriverManagerSample/drivers/geckodriver/geckodriver");

		String projectPath = System.getProperty("user.dir");

		System.out.println("projectPath: "+projectPath);

		System.setProperty("webdriver.gecko,driver", projectPath+"/drivers/geckodriver/geckodriver");

		 */	
		
		/*
		WebDriver driver = new InternetExplorerDriver();

		String projectPath = System.getProperty("user.dir");

		System.setProperty("webdriver.ie,driver", projectPath+"/drivers/iedriver/IEDriverServer"); 
		*/
		
		String projectPath = System.getProperty("user.dir");

		WebDriver driver = new ChromeDriver();

		System.out.println("projectPath: "+projectPath);

		System.setProperty("webdriver.chrome,driver", projectPath+"/drivers/geckodriver/geckodriver");
		
		driver.get("http://seleniumhq.org/");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();

		//driver.quit();


	}
}
