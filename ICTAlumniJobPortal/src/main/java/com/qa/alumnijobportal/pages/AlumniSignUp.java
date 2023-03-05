package com.qa.alumnijobportal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AlumniSignUp {
	WebDriver driver;
	@FindBy(linkText="Log In As Alumni")
	WebElement alumni;
	@FindBy(xpath="//a[text()='Signup? ']")
	WebElement signUp;
	@FindBy(xpath="//input[@formcontrolname='name']")
	WebElement name;
	@FindBy(xpath="//input[@formcontrolname='email']")
	WebElement email;
	@FindBy(xpath="//input[@formcontrolname='mobile']")
	WebElement mobile;
	@FindBy(xpath="//input[@formcontrolname='course']")
	WebElement course;
	@FindBy(xpath="//input[@formcontrolname='qualification']")
	WebElement qualification;
	@FindBy(xpath="//select[@formcontrolname='batch']")
	WebElement batch;
	@FindBy(xpath="//input[@formcontrolname='placement']")
	WebElement palcementStatus;
	@FindBy(xpath="//input[@formcontrolname='password']")
	WebElement password;
	@FindBy(xpath="//button[text()='Submit']")
	WebElement submit;
	@FindBy(xpath="//a[text()=' Click Here to Login ']")
	WebElement login;
	public AlumniSignUp(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void clickAlumni()
	{
		alumni.click();
	}
	
	public void clickSignup()
	{
		signUp.click();
	}
	public void setName(String strName)
	{
		name.sendKeys(strName);
	
	}
	public void setEmail(String strEmail)
	{
		email.sendKeys(strEmail);
	
	}
	public void setMobileNo(String mobNum)
	{
		mobile.sendKeys(mobNum);
	
	}
	public void setCourse(String strCourse)
	{
		course.sendKeys(strCourse);
	
	}
	public void setQual(String strQual)
	{
		qualification.sendKeys(strQual);
	
	}
	public void setBatch()
	{
		Select select= new Select(batch);
		select.selectByVisibleText("NORKA");
	}
	public void setPlacement(String strPlacement)
	{
		palcementStatus.sendKeys(strPlacement);
	
	}
	public void setPassword(String psd)
	{
		password.sendKeys(psd);
	}
	public void clickSubmit() throws InterruptedException{
		
		submit.click();
	}
	public void clickLogin()
	{
		login.click();
	}
	public String getText() {
		String s=driver.switchTo().alert().getText();
		return s;
	}
	public boolean courseDropdown()
	{
		 if(course.isEnabled() && course.isDisplayed()) 
		   { 
		      return true; 
		   } 
		  else { 
		      
		return false; 
	}
}
	public boolean placementDropdown()
	{
		 if(course.isEnabled() && course.isDisplayed()) 
		   { 
		      return true; 
		   } 
		  else { 
		      
		return false; 
	}
}
	public int numberVerification()
	{
		String typedValue = mobile.getAttribute("value");
		int size = typedValue.length();
 
		
		return size;
		 
}
	public boolean buttonenable() {
		return submit.isEnabled();
	}
}
