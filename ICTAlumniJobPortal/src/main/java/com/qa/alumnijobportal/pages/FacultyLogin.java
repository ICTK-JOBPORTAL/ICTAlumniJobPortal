package com.qa.alumnijobportal.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class FacultyLogin {
	

	WebDriver driver;

		@FindBy(xpath="//a[text()='Log In As Faculty']")
		private WebElement Facultylog;
	
		@FindBy(xpath="//input[@id='exampleInputEmail1']")
		private WebElement Email;
		
		
		@FindBy(xpath="//input[@ id='exampleInputPassword1']")
		private WebElement Password;
		
		@FindBy(xpath="//button[@class='btn rounded btn-warning']")
		private WebElement Login;
		
		@FindBy(xpath="//a[text()='Logout Faculty']")
		private WebElement LogOut;
		
	
		
		
		
		public FacultyLogin(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}

		public void logAsFaculty() {
			Facultylog.click();
		}
		public void setEmail(String email)
		
		{
		Email.sendKeys(email);
		}
		
		public void setPassword(String password)
		{
		Password.sendKeys(password);	
		}
		public void ClickLogin()
		{
		Login.click();	
		}
		
		public void LogOutFaculty()
		{
		LogOut.click();
		System.out.println("working");
		}
		public boolean ButtonEnable()
		{
			return Login.isEnabled();
		}
	

}
