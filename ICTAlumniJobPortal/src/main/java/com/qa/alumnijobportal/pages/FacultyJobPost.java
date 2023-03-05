package com.qa.alumnijobportal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacultyJobPost {
	
public WebDriver driver;
	
	public FacultyJobPost(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@routerlink='faculty'])[1]")
	private WebElement FacultyLogin;
	
	@FindBy(xpath="//input[@placeholder='Enter your Email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@placeholder='Enter your Password']")
	private WebElement password;
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement submit;
	
	@FindBy(xpath="//a[text()='Create New Post']")
	private WebElement CreateNewPost;
	
	@FindBy(xpath="//a[text()='Logout Faculty']")
	private WebElement LogOut;
	
	public void clickFacultyLogin()
	{
		FacultyLogin.click();
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
	
	public void clickCreateNewPost()
	{
		CreateNewPost.click();
	}
	
	public void FaclogOut()
	{
		LogOut.click();
	}
	
}
