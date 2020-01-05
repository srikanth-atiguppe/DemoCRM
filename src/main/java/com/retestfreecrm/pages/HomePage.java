package com.retestfreecrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage1{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	private By homeLink = By.xpath("//span[text()='Home']");
	
	private By headerText = By.xpath("//div[text()='Deals Summary']");
	
	private By companiesLink = By.xpath("//span[text()='Companies']");

	private By contactsLink = By.xpath("//span[text()='Contacts']");
	/**
	 * @return the homeLink
	 */
	public WebElement getHomeLink() {
		
		return getWebElement(homeLink);
	}


	public WebElement getContactsLink() {
		
		return getWebElement(contactsLink);
	}

	/**
	 * @return the headerText
	 */
	public WebElement getHeaderText() {
		return getWebElement(headerText);
	}


	/**
	 * @return the companiesLink
	 */
	public WebElement getCompaniesLink() {
		return getWebElement(companiesLink);
	}

	
	public String verifyPageHeader() {
		return pageTitle();
	}
	
	
			

}
