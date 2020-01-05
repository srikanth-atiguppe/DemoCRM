package com.retestfreecrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage1 extends BasePage1{

	public LoginPage1(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

private By email = By.name("email");
	
	private By password = By.name("password");
	
	private By submitButton = By.xpath("//div[@class='ui fluid large blue submit button']");

	/**
	 * @return the email
	 */
	public WebElement getEmail() {
		return getWebElement(email);
	}


	/**
	 * @return the password
	 */
	public WebElement getPassword() {
		return getWebElement(password);
	}


	/**
	 * @return the submitButton
	 */
	public WebElement getSubmitButton() {
		return getWebElement(submitButton);
	}
	
	public HomePage  verifyLogin(String username, String pwd) {
		getEmail().sendKeys(username);
		getPassword().sendKeys(pwd);
		getSubmitButton().click();
		
		return new HomePage(driver); 
}
}
