package com.salesforceexercise.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageLogin {
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy (id = "username") WebElement userName;
	@FindBy (id = "Login") WebElement loginButton;

	
	public PageLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 5);
	}
	public void fillLoginFields(String username) throws InterruptedException {
		userName.sendKeys(username);
		Thread.sleep(10000);
		loginButton.click();
	}

}
