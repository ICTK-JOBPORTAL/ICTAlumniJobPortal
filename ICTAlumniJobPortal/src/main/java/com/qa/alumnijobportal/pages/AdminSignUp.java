package com.qa.alumnijobportal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminSignUp {

	WebDriver driver;
	@FindBy(linkText="Log In As Admin")
	WebElement admin;
	
	@FindBy(xpath="//button[text()='Sign up..?']")
	WebElement signUp;
	
	@FindBy(xpath="//input[@placeholder='Enter your Name']")
	WebElement name;
	@FindBy(xpath="//input[@placeholder='Enter your Email']")
	WebElement email;
	@FindBy(xpath="//input[@placeholder='Enter your Password']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;

	public AdminSignUp(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void clickAdmin()
	{
		admin.click();
	}
	
	public void clickSignup()
	{
		signUp.click();
	}
	
	public void setName(String setName)
	{
		name.sendKeys(setName);
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
	{
		submit.click();
		driver.switchTo().alert().accept();
	}
}
