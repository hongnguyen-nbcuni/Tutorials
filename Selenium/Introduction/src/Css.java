import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// xpath = //tagname[@attribute='value']
		// //*[@class='identity first']
		// css == tagname[attribute='value']
		// [class='identity first']
		
		// these two lines will invoke the chrome driver
		System.setProperty("webdriver.chrome.driver", "//usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		
		//CSS:  tagName[attribute*='value']: input[name*='username'] 
		//CSS: tagName#id: input#username, tagname.classname: #email 
			
		//driver.findElement(By.cssSelector("input[id*='username']")).sendKeys("fewrew");

		//driver.findElement(By.cssSelector("input[id*='password']")).sendKeys("my password");
		
		//driver.findElement(By.cssSelector("input[id='username']")).sendKeys("fewrew");
		
		//driver.findElement(By.cssSelector("input[id='password']")).sendKeys("my password");
		
		driver.findElement(By.cssSelector("#username")).sendKeys("fewrew");

		driver.findElement(By.cssSelector("#password")).sendKeys("my password");

		
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
				
	}

}
