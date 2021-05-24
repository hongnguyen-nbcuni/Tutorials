import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrokenLinkTest2 {

	public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "//usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);

		driver.get("https://www.freecrm.com");
		
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.switchTo().frame("mainpanel");

		//links -- //a href <http://www.google123.com>
		//images -- //img href <>http://www.test.com>

		// 1. get the list of all the links and images
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		linksList.addAll(driver.findElements(By.tagName("img")));

		List<WebElement> activeLinks = new ArrayList<WebElement>();

		// 2. iterate linksList: exclude all the links/images -- doesn't have any href attributes
		for (int i = 0; i< linksList.size(); i++) {
			System.out.println(linksList.get(i).getAttribute("href"));
			// exclude javascript href
			if (linksList.get(i).getAttribute("href") != null && (!linksList.get(i).getAttribute("href").contains("javascript"))) {
				activeLinks.add(linksList.get(i));
			}
		}

		// get the size of all links list:
		System.out.println("sizes of active links and images --->" + activeLinks.size());

		// 3. check the href url, with httpconnection api:
		// 200 - Ok
		// 404 - not found
		// 500 - internal
		// 400 - bad request
		
		// check to see if that link is a correct link or not
		for(int j=0; j<activeLinks.size(); j++) {
			
			// get all the images and links have href property
			// get the connection to check that url is correct or not
			HttpURLConnection connection = (HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();
			
			connection.connect(); // http protocol connect to that url
			String response = connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activeLinks.get(j).getAttribute("href") + "----->" + response);
	
		}

	}

}
