package com.salesforceexercise.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	WebDriver driver;
	WebDriverWait w;
	@FindBy (xpath = "//*[@id=\'318:80;a\']/div") WebElement appIcon;
	@FindBy (id = "input-76") WebElement appSearchBox;
	@FindBy (xpath = "//div[@title='new']") WebElement buttonNew;
	
	
	public HomePage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,  this);
		w = new WebDriverWait(driver,5);
	}

	public void clickNewAccount () {
		appIcon.click();
		appSearchBox.sendKeys("Accounts");
		buttonNew.click();

	}

}
