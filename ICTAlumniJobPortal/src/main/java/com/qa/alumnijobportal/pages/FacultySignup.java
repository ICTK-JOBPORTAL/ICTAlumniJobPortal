package com.qa.alumnijobportal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacultySignup {
	
	public WebDriver driver;
	
	public FacultySignup(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@routerlink='faculty'])[1]")
	private WebElement FacultyLogin;
	
	@FindBy(xpath="//button[@routerlink='/facsignup']")
	private WebElement FacultySignup;
	
	@FindBy(xpath="//input[@id='exampleInputEmail1']")
	private WebElement name;
	
	@FindBy(xpath="//input[@id='exampleInputEmail2']")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='exampleInputPassword1']")
	private WebElement password;
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement submit;
	
	
	public void clickFacultyLogin()
	{
		FacultyLogin.click();
	}
	
	public void clickFacultySignup()
	{
		FacultySignup.click();
	}
	
	public void setName(String StrName)
	{
		name.sendKeys(StrName);
	}
	
	public void setEmail(String StrEmail)
	{
		email.sendKeys(StrEmail);
	}
	
	public void setPassword(String StrPassword)
	{
		password.sendKeys(StrPassword);
	}
	
	public void clickSubmit()
	{
		submit.click();
	}
	public boolean ButtonEnable()
	{
		return submit.isEnabled();
	}
}
