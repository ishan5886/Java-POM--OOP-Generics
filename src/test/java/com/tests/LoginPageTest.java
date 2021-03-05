package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.HomePage;
import com.pages.LoginPage;

public class LoginPageTest extends BaseTest{
	
	
	@Test
	public void verifyLoginPageTitleTest() {
		
		String title = page.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println("title");
		Assert.assertEquals(title, "xyz");
	}

	@Test
	public void verifyLoginTest() {
		
		HomePage homepage = page.getInstance(LoginPage.class).doLogin("admin@yourstore.com", "admin");
		
		
	}
}
