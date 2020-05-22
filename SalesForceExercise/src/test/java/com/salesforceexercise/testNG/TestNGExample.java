package com.salesforceexercise.testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGExample {
	WebDriver driver;
	By searchboxLocator = By.id("username");
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pablo\\Desktop\\selenium\\SalesForceExercise\\src\\test\\resources\\ChromeDrivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
	}
	
	@Test(priority=0)
	
	public void loginPage() throws InterruptedException {

		PageLogin pl = new PageLogin(driver);
    		PageFactory.initElements(driver, pl);
    		pl.fillLoginFields("pablofraquia@gmail.com");
    		
    		
    	HomePage hp = new HomePage(driver);
    		PageFactory.initElements(driver, pl);
    		hp.clickNewAccount();
	}
	
	@AfterClass
	public void afterClass() {
	}
	
}
