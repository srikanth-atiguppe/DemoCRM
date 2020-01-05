package com.retestfreecrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateNewContact extends BasePage1{

	public CreateNewContact(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	private By pageTitle = By.cssSelector("div[class='ui header item mb5 light-black']");
	
	private By firstName = By.xpath("//input[@name='first_name']");
	
	private By lastName = By.xpath("//input[@name='last_name']");
	
	private By emailId = By.cssSelector("input[name='value'][placeholder='Email address']");
	
	private By saveButton = By.xpath("//button[@class='ui linkedin button']");

	
	public WebElement getPageTitle() {
		return getWebElement(pageTitle);
		  
		  
	}
	
	/**
	 * @return the firstName
	 */
	public WebElement getFirstName() {
		return getWebElement(firstName);
	}


	/**
	 * @return the lastName
	 */
	public WebElement getLastName() {
		return getWebElement(lastName);
	}



	/**
	 * @return the emailId
	 */
	public WebElement getEmailId() {
		return getWebElement(emailId);
	}



	/**
	 * @return the saveButton
	 */
	public WebElement getSaveButton() {
		return getWebElement(saveButton);
	}


	
	
	
	
}
