package com.retestfreecrm.test;

import org.testng.annotations.Test;

import com.retestfreecrm.pages.HomePage;
import com.retestfreecrm.pages.LoginPage1;



public class LoginTest1 extends BaseTest1{

	
  
 public LoginPage1 loginPage;
public HomePage homePage;
	
	@Test(priority=1)
	public void login()
	{
		 loginPage = new LoginPage1(driver);
		 homePage = loginPage.verifyLogin("austindarren@gmail.com", "Ashish@07");
	}
	
	
}
