package com.qa.alumnijobportal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployerPostJob {
WebDriver driver;
	@FindBy(xpath="//a[text()='Log In As Employer']")
	private WebElement EmpLogin;
	
	@FindBy(xpath="//button[text()='Login']")
	private WebElement Login;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement Logemail;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement Logpass;
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement Logsubmit;
	
	@FindBy(xpath="//a[text()='Post Job Details']")
	private WebElement PostJobDetail;

	@FindBy(xpath="//input[@id='Jobname']")
	private WebElement Jobname;
	
	@FindBy(xpath="//input[@id='CompanyName']")
	private WebElement CompanyName;
	
	@FindBy(xpath="//input[@id='Place']")
	private WebElement Place;
	
	@FindBy(xpath="//input[@id='Salary']")
	private WebElement Salary;
	
	@FindBy(xpath="//input[@id='JobType']")
	private WebElement JobType;
	
	@FindBy(xpath="//input[@id='Qualifications']")
	private WebElement Qualifications;
	
	@FindBy(xpath="//input[@id='JobDescription']")
	private WebElement JobDescription;
	
	@FindBy(xpath="//input[@id='Experience']")
	private WebElement Experience;
	
	@FindBy(xpath="//input[@id='Benefits']")
	private WebElement Benefits;
	
	@FindBy(xpath="//input[@id='Schedule']")
	private WebElement Schedule;
	
	@FindBy(xpath="//input[@id='Language']")
	private WebElement Language;
	
	@FindBy(xpath="//input[@id='Contact']")
	private WebElement Contact;
	
	@FindBy(xpath="//button[text()='Post Job']")
	private WebElement JobSubmit;
	
	@FindBy(xpath="//a[text()='Log Out']")
	private WebElement LogOut;
	
	@FindBy(xpath="//a[@title='Click To Go Home']")
	private WebElement Home;
	
	
	
	public EmployerPostJob(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginEmp() 
	{
		EmpLogin.click();
	}
	
	public void loginEmployer() 
	{
		Login.click();
	}
	
	public void setEmpemail(String strEmail) 
	{
		Logemail.sendKeys(strEmail);
	}
	
	public void setEmppass(String strPass) 
	{
		Logpass.sendKeys(strPass);
	}
	
	public void Empsubmit() 
	{
		Logsubmit.click();
	}
	
	public void CreateJobPost() 
	{
		PostJobDetail.click();
	}
	
	public void setJob(String jobname) 
	{
		Jobname.sendKeys(jobname);
	}
	
	public void setCompany(String company) 
	{
		CompanyName.sendKeys(company);
	}
	public void setPlace(String place) 
	{
		Place.sendKeys(place);
	}
	
	public void setSalary(String salary) 
	{
		Salary.sendKeys(salary);
	}
	
	public void setJobType(String jobtype) 
	{
		JobType.sendKeys(jobtype);
	}

	public void setQualification(String qualifi) 
	{
		Qualifications.sendKeys(qualifi);
	}
	
	public void setJobDes(String jobdes) 
	{
		JobDescription.sendKeys(jobdes);
	}
	
	
	public void setExp(String experience) 
	{
		Experience.sendKeys(experience);
	}
	
	public void setBenefit(String benefit) 
	{
		Benefits.sendKeys(benefit);
	}
	
	public void setSchedule(String schedule) 
	{
		Schedule.sendKeys(schedule);
	}
		
	public void setLanguage(String language) 
	{
		Language.sendKeys(language);
	}
	
	public void setContact(String contact) 
	{
		Contact.sendKeys(contact);
	}
	public void PostJOB() 
	{
		JobSubmit.click();
	}
	
	public void Logout() {
		LogOut.click();
	}
	public boolean buttonEnable() {
		return JobSubmit.isEnabled();
	}
	public void homeCl() {
		Home.click();
	}
}
