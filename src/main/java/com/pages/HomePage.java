package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{
	
	
	private By userNameLabel = By.xpath("//li[@class='account-info']//ancestor::ul[@class='nav navbar-nav']");
	private By customerMenuItem = By.xpath("//span[@class='menu-item-title'][contains(text(),'Customers')]");
	private By  customerMenu = By.xpath("//a[@href='#']//span[contains(text(),'Customers')]");
	
	
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	

	
	public String getHomePageTitle() {
		return getPageTitle();
	}
	
	
	public WebElement getUserNameLabel() {
		return getElement(userNameLabel);
	}



	public WebElement getCustomerMenuItem() {
		return getElement(customerMenuItem);
	}


	public WebElement getCustomerMenu() {
		return getElement(customerMenu);
	}
	
	
	public void  customerMenuClick() throws InterruptedException {
		
		Thread.sleep(5000);
		getCustomerMenu().click();
	}
	
	public void  customerMenuItemClick() throws InterruptedException {
		
		Thread.sleep(5000);
		getCustomerMenuItem().click();
	}
	

}
