package com.retestfreecrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage1 extends Page1 {

	public BasePage1(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String pageTitle() {
		return	driver.getTitle();
		
		 
	}

	@Override
	public WebElement isElementPresent(By ele) {
	
		return wait.until(ExpectedConditions.presenceOfElementLocated( ele));
		
		
	}

	@Override
	public WebElement getWebElement(By ele) {
		return driver.findElement(ele);
	}

}
