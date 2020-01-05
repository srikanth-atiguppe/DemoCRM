package com.retestfreecrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page1 {

WebDriver driver;
	
	WebDriverWait wait;
	
	public Page1(WebDriver driver)
	{
		
		this.driver  = driver;
		this.wait = new WebDriverWait(this.driver, 10); 
				
	}

	
	public abstract String pageTitle();
	
	public abstract WebElement isElementPresent(By ele);
	
	public abstract WebElement getWebElement(By ele);

}
