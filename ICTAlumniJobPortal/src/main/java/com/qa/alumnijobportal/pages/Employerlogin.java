package com.qa.alumnijobportal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Employerlogin {
	
WebDriver driver;
	
	@FindBy(xpath="//button[text()='Login']")
	private WebElement Login;
	
	@FindBy(id="email")
	private WebElement Logemail;
	
	@FindBy(id="password")
	private WebElement Logpass;
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement Logsubmit;
	
	@FindBy(xpath="//button[text()='Login']")
	private WebElement LoginPage;
	
	public Employerlogin(WebDriver driver) 
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	public void loginE() {
		Login.click();
	}
	public void setELemail(String strEmail) {
		Logemail.sendKeys(strEmail);
	}
	public void setELpass(String strPass) {
		Logpass.sendKeys(strPass);
	}
	
	public void ELsubmit() {
		Logsubmit.click();
	}
	
	public void LoginPag() {
		LoginPage.click();
	}
	public boolean Logindisable() {
		return LoginPage.isDisplayed();
	}

}
