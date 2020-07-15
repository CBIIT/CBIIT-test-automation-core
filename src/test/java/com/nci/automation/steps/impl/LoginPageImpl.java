package com.nci.automation.steps.impl;

import org.openqa.selenium.WebDriver;

import com.nci.automation.local.utils.PageCache;
import com.nci.automation.pages.LoginPage;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.xceptions.TestingException;

public class LoginPageImpl{

	public static WebDriver driver=null;
	private static PageCache cache=PageCache.getInstance();
	
	
	LoginPage login=new LoginPage();
	
	public void enterUserNameAndPassword() throws TestingException {
//		driver = WebDriverUtils.getWebDriver();//invoke web-driver
//		driver.get(EnvUtils.getApplicationUrl());
//		login.userName.sendKeys(EnvUtils.getUserName("regular"));//returns username
//		login.password.sendKeys(EnvUtils.getPassword("regular"));//returns decrypted pass
		login.userName.sendKeys("Brain Cancer");
		
	}
	
	public void clickLoginBtn() {
		login.loginBtn.click();
		CucumberLogUtils.logLink("https://xyz.com", "Click here");
		CucumberLogUtils.logScreenShot();
		CucumberLogUtils.logInfo("use to log a message");
	}
}
