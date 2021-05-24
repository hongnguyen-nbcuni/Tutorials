package JsonProject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class DDTestUsingJSON {

	WebDriver driver;
	
	@BeforeClass
	void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MICROSECONDS);
		
	}
	
	@AfterClass 
	void tearDown() {
		driver.close();
		
	}
	
	@Test(dataProvider="dp")
	void login(String data) {
		
		System.out.println("start of login...");
		String user[] = data.split(",");
		
		driver.get("https://demo.nopcommerce.com/login");
		
		driver.findElement(By.id("Email")).sendKeys(user[0]);
		driver.findElement(By.id("Password")).sendKeys(user[1]);
		
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		String act_title = driver.getTitle();
		System.out.println(act_title);
		String exp_title = "nopCommerce demo store.";
		System.out.println(exp_title);
		Assert.assertEquals(act_title, exp_title);
		
		
		System.out.println("end of login");
		
	}
	
	@DataProvider(name = "dp")
	public String[] readJson() throws IOException, ParseException {
		
		System.out.println("start of readJson");
		
		// create object of JSONParser class
		JSONParser jsonParser = new JSONParser();
		// load this file use FileReader class
		FileReader reader = new FileReader("./jsonfiles/testdata.json");
		// read and put data to java object
		Object obj = jsonParser.parse(reader);
		// convert java obj to json object
		JSONObject userloginsJsonobj = (JSONObject) obj;
		// extract json array from json object
		
		JSONArray userloginsArray = (JSONArray) userloginsJsonobj.get("userlogins");
		
		String arr[] = new String[userloginsArray.size()];
		
		for (int i=0; i<userloginsArray.size(); i++) {
			
			JSONObject user=(JSONObject) userloginsArray.get(i);
			// now extract username and password
			String username = (String) user.get("username");
			String pwd = (String) user.get("password");
	
			arr[i] = username + "," + pwd;
			System.out.println(arr[i]);
		}
		
		System.out.println("end of readJson");
		return arr;
		
		
		
		
	}
}
