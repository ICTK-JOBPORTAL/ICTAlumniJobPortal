package com.qa.alumnijobportal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployerSignup {
	WebDriver driver;

	@FindBy(linkText="Log In As Employer")
	private WebElement LoginasEmp;

	@FindBy(id="name")
	private WebElement name;

	@FindBy(id="company name")
	private WebElement companyname;

	@FindBy(id="email")
	private WebElement email;

	@FindBy(id="phnno")
	private WebElement Phoneno;

	@FindBy(id="password")
	private WebElement password;

	@FindBy(id="designation")
	private WebElement designation;

	@FindBy(xpath="//button[text()='Submit']")
	private WebElement submit;
	
	public EmployerSignup(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}

	public void loginAsemp() {
		LoginasEmp.click();
	}
	public void setEname(String strName) {
		name.sendKeys(strName);
	}
	public void setECompname(String strCompName) {
		companyname.sendKeys(strCompName);
	}
	public void setEsEmail(String strEmail) {
		email.sendKeys(strEmail);
	}
	public void setPhoneno(String strPhone) {
		Phoneno.sendKeys(strPhone);
	}
	public void setEsPassword(String strPass) {
		password.sendKeys(strPass);
	}
	public void setEdesignation(String strDesigntn) {
		designation.sendKeys(strDesigntn);
	}
	public void submit() {
		submit.click();
	}
	public boolean Signupdisable() {
		return submit.isDisplayed();
	}	
}
