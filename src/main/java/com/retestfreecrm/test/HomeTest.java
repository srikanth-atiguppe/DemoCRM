package com.retestfreecrm.test; 

import org.testng.Assert;
import org.testng.annotations.Test;

import com.retestfreecrm.pages.HomePage;
import com.retestfreecrm.pages.LoginPage1;

public class HomeTest extends BaseTest1 {
	
	public HomePage homePage;
	 public LoginPage1 loginPage;
	 
	 @Test(priority=1)
	 
	public void verifyElements() {
		 loginPage = new LoginPage1(driver);
		 homePage = loginPage.verifyLogin("austindarren@gmail.com", "Ashish@07");
		homePage = new HomePage(driver);
		String txt = "Cogmento CRM";
		String header = homePage.verifyPageHeader();
		Assert.assertEquals(header, txt);
		System.out.println(header);
		
	}

}
