package com.qa.alumnijobportal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Alumnilogin {

WebDriver driver;

	@FindBy(xpath="//a[text()=' Click Here to Login ']")
	private WebElement Alumnilog;
	
	@FindBy(xpath="//input[@placeholder='Enter your Email']")
	private WebElement Entermail;
	
	@FindBy(xpath="//input[@formcontrolname='password']")
	private WebElement Enterpass;
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement Alumnisubmit;
	
	@FindBy(xpath="(//button[text()='Apply '])[3]")
	private WebElement apply;
	
	@FindBy(xpath="//a[text()='Logout Alumni']")
	private WebElement logout;
	
	public Alumnilogin(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void clicktolog() 
	{
		Alumnilog.click();
	}
	public void logAsAlumni() 
	{
		Alumnilog.click();
	}
	public void enterEmail(String strEmail)
	{
		Entermail.sendKeys(strEmail);
	}
	public void enterPass(String strPass)
	{
		Enterpass.sendKeys(strPass);
	}
	public void Alumsubmit() 
	{
	Alumnisubmit.click();
	}
	
	public void applyButton() 
	{
		apply.click();
	}
	
	public void logoutButton() 
	{
		driver.navigate().back();
		logout.click();
	}
	public boolean ButtonEnable() 
	{
		return apply.isEnabled();
	}
}
