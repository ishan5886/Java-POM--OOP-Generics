package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{
	
	//page locators
	
	private By emailId = By.id("Email");
	private By password = By.id("Password");
	private By loginButton = By.xpath("//input[@class='button-1 login-button']");


	public LoginPage(WebDriver driver) {
		super(driver);
		
	}


	public WebElement getEmailId() {
		return getElement(emailId);
	}


	public WebElement getPassword() {
		return getElement(password);
	}


	
	public WebElement getLoginButton() {
		return getElement(loginButton);
	}
	
	public String getLoginPageTitle() {
		return getPageTitle();
	}
	
	
	public HomePage doLogin(String username, String password) {
		
		getEmailId().clear();
		getEmailId().sendKeys(username);
		getPassword().clear();
		getPassword().sendKeys(password);
		getLoginButton().click();
		
		
		return getInstance(HomePage.class);
		
	}
	
	
	//Method Overloading - Same method but different arguments
	public void doLogin() {
		
		getEmailId().clear();
		getEmailId().sendKeys("");
		getPassword().clear();
		getPassword().sendKeys("");
		getLoginButton().click();
		
	}
}
