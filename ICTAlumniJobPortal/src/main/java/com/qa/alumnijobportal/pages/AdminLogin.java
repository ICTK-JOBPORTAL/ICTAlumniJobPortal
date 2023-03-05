package com.qa.alumnijobportal.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminLogin {
	WebDriver driver;
	@FindBy(linkText="Log In As Admin")
	WebElement admin;
	
	@FindBy(xpath="//input[@id='exampleInputEmail1']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='exampleInputPassword1']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	public AdminLogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void clickAdmin()
	{
		admin.click();
	}
	public void setEmail(String setEmail)
	{
		email.sendKeys(setEmail);
	
	}
	public void setPassword(String psd)
	{
		password.sendKeys(psd);
	}
	public void clickSubmit()
	{if(submit.isEnabled())
		submit.click();
	else
		System.out.println("Invalid credential");
	driver.switchTo().alert().accept();
	}
	public void getAlert() throws InterruptedException
	{
		Alert a = driver.switchTo().alert();
		a.accept();
		Thread.sleep(2000);
	}


}
