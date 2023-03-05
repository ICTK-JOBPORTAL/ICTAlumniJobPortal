package com.qa.alumnijobportal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlumniJobApplication {
	WebDriver driver;
	String con;
	@FindBy(xpath="//a[text()='Log In As Alumni']")
	private WebElement Alumnilog;
	
	@FindBy(xpath="//input[@formcontrolname='email']")
	private WebElement Entermail;
	
	@FindBy(xpath="//input[@formcontrolname='password']")
	private WebElement Enterpass;
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement Alumnisubmit;
	
	@FindBy(xpath="/html/body/app-root/app-alumni-home/app-first-content/div[3]/div[1]/div/div/div/button")
	private WebElement ReadMore;
	
	@FindBy(xpath="/html/body/app-root/app-nav/app-read-more/div/div/div/div")
	private WebElement ReadMSG;
	
	@FindBy(xpath="//button[@class='btn btn-primary m-2 align-items-center']")
	private WebElement ApplyButton;
	
	@FindBy(xpath="//html/body/app-root/app-alumni-home/app-first-content/div[3]/div[1]/div/div/div/div/button")
	private WebElement HomeApply_Button;
	
	
	@FindBy(xpath="//input[@formcontrolname='Alumni_name']")
	private WebElement Alumni_name;
	
	@FindBy(xpath="//input[@formcontrolname='Alumni_phone']")
	private WebElement Alumni_Phone;
	
	@FindBy(xpath="//input[@formcontrolname='Alumni_email']")
	private WebElement Alumni_Email;
	
	@FindBy(xpath="//input[@formcontrolname='Alumni_qualification']")
	private WebElement Alumni_Qualification;
	
	@FindBy(xpath="//input[@formcontrolname='Alumni_Experience']")
	private WebElement Alumni_Experience;
	
	@FindBy(xpath="//input[@formcontrolname='Alumni_course']")
	private WebElement Alumni_Course;
	
	@FindBy(xpath="//input[@formcontrolname='Alumni_branch']")
	private WebElement Alumni_Branch;
	
	@FindBy(xpath="//input[@formcontrolname='Alumni_Placement']")
	private WebElement Alumni_is_placed;
	
	@FindBy(xpath="//input[@formcontrolname='Placed_company']")
	private WebElement Alumni_Company;
	
	@FindBy(xpath="//input[@formcontrolname='Resume']")
	private WebElement Alumni_Resume;
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement SubmitAPP;
	
	
	public AlumniJobApplication(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void logAsAlumni() 
	{
		Alumnilog.click();
	}
	public void setAlumniEmail(String strEmail) 
	{
		Entermail.sendKeys(strEmail);
	}
	public void setAlumniPass(String strPass) 
	{
		Enterpass.sendKeys(strPass);
	}
	public void AlumniSubmit()
	{
		
	Alumnisubmit.click();
	}
	
	public boolean ApplyJob()
	{
	boolean check=ApplyButton.isEnabled();
	return check;   
	}
	public void Readmore() 
	{
		 ReadMore.click();    
	}
	public String ReadDiv() 
	{
		String div=ReadMSG.getText();
		return div;
	}
	public void ClickApply()
	{
		ApplyButton.click();
	}
	public void Click_Apply()
	{
		HomeApply_Button.click();
	}
	public void setName(String name) 
	{
		Alumni_name.sendKeys(name);
	}
	
	public void setphone(String phone) 
	{
		Alumni_Phone.sendKeys(phone);
	}
	public void setEmail(String email) 
	{
		Alumni_Email.sendKeys(email);
	}
	public void setQualification(String Quali)
	{
		Alumni_Qualification.sendKeys(Quali);
	}
	public void setExperience(String experience) 
	{
		Alumni_Experience.sendKeys(experience);
	}
	public void setCourse(String course) 
	{
		Alumni_Course.sendKeys(course);
	}
	public void setBranch(String branch) 
	{
		Alumni_Branch.sendKeys(branch);
	}
	public void setIsPlaced(String isplaced) 
	{
		Alumni_is_placed.sendKeys(isplaced);
	}
	public void setCompany(String company) 
	{
		Alumni_Company.sendKeys(company);
	}
	public void setResumePDF(String resumepdf) 
	{
		Alumni_Resume.sendKeys(resumepdf);
	}
	
	public String CheckResume()
	{
		String check=Alumni_Resume.getAttribute("accept");
	
		return check;
	}
	public void setResumeLink(String resumelink) 
	{
		Alumni_Resume.sendKeys(resumelink);
	}
	public void Submit_App()
	{
		SubmitAPP.click();
	}
}
