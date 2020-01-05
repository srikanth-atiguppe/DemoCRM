package com.retestfreecrm.test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.retestfreecrm.pages.ContactsPage;
import com.retestfreecrm.pages.CreateNewContact;
import com.retestfreecrm.pages.HomePage;
import com.retestfreecrm.pages.LoginPage1;
import com.retestfreecrm.util.TUtil;

public class ContactTest extends BaseTest1{
	
	public ContactsPage contactsPage;
	
	public LoginPage1 loginPage;
	
	public  HomePage homePage;
	
	public CreateNewContact createNewContact;
	
	TUtil util;
	
	String sheetName = "Contacts";
	
	
	@Test(priority=1, dataProvider="getCRMTestData")
	public void validateContactsPage(String firstName, String lastName ) throws InterruptedException {
		 
		 loginPage = new LoginPage1(driver);
		 homePage = loginPage.verifyLogin("austindarren@gmail.com", "Ashish@07");
		homePage = new HomePage(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//homePage.getContactsLink().isDisplayed();
		homePage.getContactsLink().click();
		contactsPage = new ContactsPage(driver);
		contactsPage.getNewContact().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		createNewContact = new CreateNewContact(driver);
		createNewContact.getFirstName().sendKeys(firstName);
		createNewContact.getLastName().sendKeys(lastName);
		createNewContact.getSaveButton().click();
		
		
		
	}
	
	@DataProvider
	public Object[][] getCRMTestData() {
	Object data[][] = 	TUtil.getTestData(sheetName);
		return data;
	}


}
