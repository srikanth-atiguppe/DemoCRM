package com.retestfreecrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactsPage extends BasePage1{

	public ContactsPage(WebDriver driver) {
		super(driver);
	}

	
	private By contactsTitle = By.xpath("//div[@class='ui header item mb5 light-black']");
	
	private By newContact = By.xpath("//a/button[@class='ui linkedin button']");

	/**
	 * @return the contactsTitle
	 */
	public String getContactsTitle() {
		String  subTitle = getWebElement(contactsTitle).getText();
		return subTitle;
		
	}

	/**
	 * @param contactsTitle the contactsTitle to set
	 */
	public WebElement getNewContact() {
		
		return getWebElement(newContact);
		
	}

	
	
	
}
