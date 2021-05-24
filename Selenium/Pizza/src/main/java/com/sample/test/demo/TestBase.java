package com.sample.test.demo;

import static org.testng.Assert.fail;

import java.io.File;
import java.io.IOException;

import org.apache.maven.shared.utils.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.sample.test.demo.pageobject.Pages;

public class TestBase {

    private Configuration config;
    protected WebDriver driver;
    protected Pages pages;
    protected String url;

    @BeforeClass(alwaysRun = true)
    public void init() throws Throwable {
        config = new Configuration();
        url = config.getUrl();
        //this.pages = new Pages(driver);
        initializelDriver();
        navigateToSite();
        this.pages = new Pages(driver);
    }

    protected void navigateToSite() {
        driver.get(url);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        try {
            driver.quit();

        } catch (Exception e) {
        }
    }

    private void initializelDriver() {
        if (config.getBrowser().equalsIgnoreCase("chrome")) {
            if (config.getPlatform().equalsIgnoreCase("mac")) {
                System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/mac/chromedriver");
            } else {
                System.setProperty("webdriver.chrome.driver",
                        "src/test/resources/chromedriver/windows/chromedriver.exe");
            }
            driver = new ChromeDriver();
        }
        else {
            fail("Unsupported bfrowser " + config.getBrowser());
        }
       
    }
    
    public void getScreenShotPath(String testMethodName, WebDriver driver) throws IOException {
    	
    	TakesScreenshot ts = (TakesScreenshot) driver;
    	
    	File source = ts.getScreenshotAs(OutputType.FILE);
    	
    	// path to store the screenshot, pass the filename of the fail test
    	String destFile = System.getProperty("user.dir") + "/reports/" + testMethodName + ".png";
    	
    	// need to import maven repository - Apache Commons IO
    	FileUtils.copyFile(source, new File(destFile)); 	
    	
    	
    }


}
