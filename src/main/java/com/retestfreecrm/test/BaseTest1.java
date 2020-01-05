package com.retestfreecrm.test;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.retestfreecrm.pages.BasePage1;
import com.retestfreecrm.pages.Page1;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest1 {
	
	 WebDriver driver ;
	public Page1 page;
	public static Properties prop;

	public BaseTest1()
	{
		try
		{
		
			prop = new Properties();
			FileInputStream fis = new FileInputStream("/Users/Srikanth/eclipse-workspace/RetestFreeCRM/src/main/java/com/retestfreecrm/properties/config.properties");
			prop.load(fis);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@BeforeMethod
	@Parameters(value= {"browser"})
	public void setUp(String browser) {
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(prop.getProperty("url"));
			try {
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		page = new BasePage1(driver);
		
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		
		driver.quit();
	}

}
