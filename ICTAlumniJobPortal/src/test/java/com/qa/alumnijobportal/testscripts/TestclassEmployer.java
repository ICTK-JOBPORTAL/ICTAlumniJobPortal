package com.qa.alumnijobportal.testscripts;



import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.alumnijobportal.pages.EmployerPostJob;
import com.qa.alumnijobportal.pages.EmployerSignup;
import com.qa.alumnijobportal.pages.Employerlogin;
import com.qa.alumnijobportal.utilities.ExcelUtility;
import com.qa.alumnijobportal.utilities.RandomEmail;
import com.qa.alumnijobportal.utilities.Screenshot;



public class TestclassEmployer extends TestBase 
{
	EmployerSignup empsignup;
	Employerlogin emplogin;
	EmployerPostJob ObjEmpPJ;
	
	
	@Test(priority=1,description="Verify New Employer signup with invalid data")
	
	public void EmpSignupverification1() throws Exception
	{
		Thread.sleep(9000);
		empsignup=new EmployerSignup(driver);
		empsignup.loginAsemp();
		Thread.sleep(5000);
		String name = ExcelUtility.getCellData(0, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 0);
		String companyname = ExcelUtility.getCellData(0, 1, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 0);
		String mail = ExcelUtility.getCellData(0, 2, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 0);
		String Phoneno = ExcelUtility.getNumericData(0, 3, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 0);
		String password = ExcelUtility.getNumericData(0, 4, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 0);
		String designation = ExcelUtility.getCellData(0, 5, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 0);
		
		RandomEmail Rand=new RandomEmail();
		String Random=Rand.randomNum();
		String email=mail+Random;
		
		empsignup.setEname(name);
		Thread.sleep(300);
		empsignup.setECompname(companyname);
		Thread.sleep(300);
		empsignup.setEsEmail(email);
		Thread.sleep(300);
		empsignup.setPhoneno(Phoneno);
		Thread.sleep(300);
		empsignup.setEsPassword(password);
		Thread.sleep(300);
		empsignup.setEdesignation(designation);
		Thread.sleep(300);
		Screenshot.captureScreenshot(driver);
		if(empsignup.Signupdisable()) {
			
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		}
		
@Test(priority=2,description="Verify New Employer signup with invalid data")
	
	public void EmpSignupverification2() throws Exception
	{
		Thread.sleep(9000);
		empsignup=new EmployerSignup(driver);
		empsignup.loginAsemp();
		Thread.sleep(5000);
		String name = ExcelUtility.getCellData(1, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 0);
		String companyname = ExcelUtility.getCellData(1, 1, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 0);
		String email = ExcelUtility.getCellData(1, 2, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 0);
		String Phoneno = ExcelUtility.getNumericData(1, 3, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 0);
		String password = ExcelUtility.getNumericData(1, 4, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 0);
		String designation = ExcelUtility.getCellData(1, 5, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 0);
		
		empsignup.setEname(name);
		Thread.sleep(300);
		empsignup.setECompname(companyname);
		Thread.sleep(300);
		empsignup.setEsEmail(email);
		Thread.sleep(300);
		empsignup.setPhoneno(Phoneno);
		Thread.sleep(300);
		empsignup.setEsPassword(password);
		Thread.sleep(300);
		empsignup.setEdesignation(designation);
		Thread.sleep(300);
		Screenshot.captureScreenshot(driver);
		if(empsignup.Signupdisable()) {
			
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		}
	
	@Test(priority=3,description="Verify New Employer signup with invalid data")
	public void EmpSignupverification3() throws Exception
	{
		empsignup=new EmployerSignup(driver);
		driver.navigate().refresh();
		Thread.sleep(2000);
		String name = ExcelUtility.getCellData(2, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 0);
		String companyname = ExcelUtility.getCellData(1, 1, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 0);
		String mail = ExcelUtility.getCellData(2, 2, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 0);
		String Phoneno = ExcelUtility.getNumericData(2, 3, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 0);
		String password = ExcelUtility.getNumericData(2, 4, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 0);
		String designation = ExcelUtility.getCellData(2, 5, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 0);
		
		RandomEmail Rand=new RandomEmail();
		String Random=Rand.randomNum();
		String email=mail+Random;
		empsignup.setEname(name);
		Thread.sleep(300);
		empsignup.setECompname(companyname);
		Thread.sleep(300);
		empsignup.setEsEmail(email);
		Thread.sleep(300);
		empsignup.setPhoneno(Phoneno);
		Thread.sleep(300);
		empsignup.setEsPassword(password);
		Thread.sleep(300);
		empsignup.setEdesignation(designation);
		Thread.sleep(300);
		
		Screenshot.captureScreenshot(driver);
		if(empsignup.Signupdisable()) {
			
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		}
	@Test(priority=4,description="Verify New Employer can signup with valid data")
	public void EmpSignupverification4() throws Exception
	{
		empsignup=new EmployerSignup(driver);
		driver.navigate().refresh();
		Thread.sleep(2000);
		String name = ExcelUtility.getCellData(3, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 0);
		String companyname = ExcelUtility.getCellData(3, 1, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 0);
		String mail = ExcelUtility.getCellData(3, 2, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 0);
		String Phoneno = ExcelUtility.getNumericData(3, 3, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 0);
		String password = ExcelUtility.getNumericData(3, 4, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 0);
		String designation = ExcelUtility.getCellData(3, 5, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 0);

		RandomEmail Rand=new RandomEmail();
		String Random=Rand.randomNum();
		String email=mail+Random;
		empsignup.setEname(name);
		Thread.sleep(300);
		empsignup.setECompname(companyname);
		Thread.sleep(300);
		empsignup.setEsEmail(email);
		Thread.sleep(300);
		empsignup.setPhoneno(Phoneno);
		Thread.sleep(300);
		empsignup.setEsPassword(password);
		Thread.sleep(300);
		empsignup.setEdesignation(designation);
		Thread.sleep(300);
		empsignup.submit();
		Thread.sleep(10000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		SoftAssert softAssert = new SoftAssert();
		
		if(driver.getCurrentUrl().contains("login")) {	
			softAssert.assertTrue(true);
		}
		else {
			softAssert.assertTrue(false);
		}
		}
	
  @Test(priority=5,description="Verify Employer login with invalid data") public
	  void EmpLoginverification1() throws Exception { 
	 emplogin = new Employerlogin(driver);
	  Thread.sleep(8000); 
	  String Logemail =	  ExcelUtility.getCellData(0, 0,System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 1);
	  String Logpass = ExcelUtility.getNumericData(0, 1,  System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 1);
	  
	  emplogin.setELemail(Logemail); 
	  Thread.sleep(300);
	  emplogin.setELpass(Logpass); 
	  Thread.sleep(300);
	  emplogin.ELsubmit();
	  Thread.sleep(10000);
	  driver.switchTo().alert().accept(); 
	  Thread.sleep(5000);
	  Screenshot.captureScreenshot(driver);
	  if(driver.getCurrentUrl().contains("dashboard")) 
	  { 
		  Assert.assertTrue(false); 
		  }
	  else 
	  {
		  Assert.assertTrue(true);
	  }
		  }  
	  @Test(priority=6,description="Verify Employer login with invalid data") public
	  void EmpLoginverification2() throws Exception { 
	  emplogin = new Employerlogin(driver);
	  driver.navigate().refresh();
	  Thread.sleep(8000);
	  String Logemail =	  ExcelUtility.getCellData(1, 0,System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 1);
	  String Logpass = ExcelUtility.getNumericData(1, 1,  System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 1);
	  emplogin.setELemail(Logemail); 
	  Thread.sleep(300);
	  emplogin.setELpass(Logpass); 
	  Thread.sleep(300);
	  emplogin.ELsubmit();
	  Thread.sleep(10000);
	  driver.switchTo().alert().accept(); 
	  Thread.sleep(10000);
	  Screenshot.captureScreenshot(driver);
	  if(driver.getCurrentUrl().contains("dashboard")) 
	  { 
		  Assert.assertTrue(false); 
		  }
	  else 
	  {
		  Assert.assertTrue(true);
	  }
		  }
	  
	  @Test(priority=7,description="Verify Employer login with valid data") public
	  void EmpLoginverification3() throws Exception { 
	  emplogin = new Employerlogin(driver);
	  driver.navigate().refresh();
	  Thread.sleep(8000);
	  String Logemail =	  ExcelUtility.getCellData(2, 0,System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 1);
	  String Logpass = ExcelUtility.getNumericData(2, 1,  System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 1);
	  emplogin.setELemail(Logemail); 
	  Thread.sleep(300);
	  emplogin.setELpass(Logpass); 
	  Thread.sleep(300);
	  emplogin.ELsubmit();
	  Thread.sleep(10000);
	  driver.switchTo().alert().accept(); 
	  Thread.sleep(10000);
	  if(driver.getCurrentUrl().contains("dashboard")) 
	  { 
		  Assert.assertTrue(true); 
		  }
	  else 
	  {
		  Assert.assertTrue(false);
		  }
  }
	  
@Test(priority=8,description="Verify Employer can create a job posting with invalid data")
public void EmpPostJobVerificationTC_EMPJ01() throws Exception {
	ObjEmpPJ = new EmployerPostJob(driver);
	ObjEmpPJ.CreateJobPost();
	Thread.sleep(2000);
	String Jobname = ExcelUtility.getCellData(0, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 8);
	String place = ExcelUtility.getCellData(0, 2, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 8);
	String salary = ExcelUtility.getCellData(0, 3, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 8);
	String jobtype = ExcelUtility.getCellData(0, 4, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 8);
	String qualification = ExcelUtility.getCellData(0, 5, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 8);
	String jobdes = ExcelUtility.getCellData(0, 6, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 8);
	String experience = ExcelUtility.getCellData(0, 7, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 8);
	String benefits = ExcelUtility.getCellData(0, 8, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 8);
	String schedule = ExcelUtility.getCellData(0, 9, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 8);
	String language = ExcelUtility.getCellData(0, 10, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 8);
	String contact = ExcelUtility.getCellData(0, 11, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 8);
	ObjEmpPJ.setJob(Jobname);
	Thread.sleep(300);
	ObjEmpPJ.setPlace(place);
	Thread.sleep(300);
	ObjEmpPJ.setSalary(salary);
	Thread.sleep(300);
	ObjEmpPJ.setJobType(jobtype);
	Thread.sleep(300);
	ObjEmpPJ.setQualification(qualification);
	Thread.sleep(300);
	ObjEmpPJ.setJobDes(jobdes);
	Thread.sleep(300);
	ObjEmpPJ.setExp(experience);
	Thread.sleep(300);
	ObjEmpPJ.setBenefit(benefits);
	Thread.sleep(300);
	ObjEmpPJ.setSchedule(schedule);
	Thread.sleep(300);
	ObjEmpPJ.setLanguage(language);
	Thread.sleep(300);
	ObjEmpPJ.setContact(contact);
	Thread.sleep(300);
	Screenshot.captureScreenshot(driver);
	Thread.sleep(10000);
	
	if(ObjEmpPJ.buttonEnable())
	{
		Assert.assertTrue(false);
		
	}
	else {
		Assert.assertTrue(true);
		
	}}

@Test(priority=9,description="Verify Employer can create a job posting with invalid data")
public void EmpPostJobVerificationTC_EMPJ02() throws Exception {
	ObjEmpPJ = new EmployerPostJob(driver);
	driver.navigate().refresh();
	Thread.sleep(3000);
	String Jobname = ExcelUtility.getCellData(1, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 8);
	String companyname = ExcelUtility.getCellData(1, 1, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 8);
	String place = ExcelUtility.getCellData(1, 2, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 8);
	String jobtype = ExcelUtility.getCellData(1, 4, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 8);
	String qualification = ExcelUtility.getCellData(1, 5, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 8);
	String jobdes = ExcelUtility.getCellData(1, 6, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 8);
	String experience = ExcelUtility.getCellData(1, 7, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 8);
	String benefits = ExcelUtility.getCellData(1, 8, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 8);
	String schedule = ExcelUtility.getCellData(1, 9, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 8);
	String language = ExcelUtility.getCellData(1, 10, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 8);
	String contact = ExcelUtility.getCellData(1, 11, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 8);
	ObjEmpPJ.setJob(Jobname);
	Thread.sleep(300);
	ObjEmpPJ.setCompany(companyname);
	Thread.sleep(300);
	ObjEmpPJ.setPlace(place);
	Thread.sleep(300);
	ObjEmpPJ.setJobType(jobtype);
	Thread.sleep(300);
	ObjEmpPJ.setQualification(qualification);
	Thread.sleep(300);
	ObjEmpPJ.setJobDes(jobdes);
	Thread.sleep(300);
	ObjEmpPJ.setExp(experience);
	Thread.sleep(300);
	ObjEmpPJ.setBenefit(benefits);
	Thread.sleep(300);
	ObjEmpPJ.setSchedule(schedule);
	Thread.sleep(300);
	ObjEmpPJ.setLanguage(language);
	Thread.sleep(300);
	ObjEmpPJ.setContact(contact);
	Thread.sleep(300);
	Screenshot.captureScreenshot(driver);
	if(ObjEmpPJ.buttonEnable())
	{
		Assert.assertTrue(false);
		
	}
	else {
		Assert.assertTrue(true);
	}}
@Test(priority=10,description="Verify Employer can create a job posting with valid data")
public void EmpPostJobVerificationTC_EMPJ03() throws Exception {
	ObjEmpPJ = new EmployerPostJob(driver);
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(3000);
	String Jobname = ExcelUtility.getCellData(2, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 8);
	String companyname = ExcelUtility.getCellData(2, 1, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 8);
	String place = ExcelUtility.getCellData(2, 2, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 8);
	String salary = ExcelUtility.getCellData(2, 3, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 8);
	String jobtype = ExcelUtility.getCellData(2, 4, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 8);
	String qualification = ExcelUtility.getCellData(2, 5, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 8);
	String jobdes = ExcelUtility.getCellData(2, 6, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 8);
	String experience = ExcelUtility.getCellData(2, 7, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 8);
	String benefits = ExcelUtility.getCellData(2, 8, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 8);
	String schedule = ExcelUtility.getCellData(2, 9, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 8);
	String language = ExcelUtility.getCellData(2, 10, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 8);
	String contact = ExcelUtility.getCellData(2, 11, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 8);
	ObjEmpPJ.setJob(Jobname);
	Thread.sleep(300);
	ObjEmpPJ.setCompany(companyname);
	Thread.sleep(300);
	ObjEmpPJ.setPlace(place);
	Thread.sleep(300);
	ObjEmpPJ.setSalary(salary);
	Thread.sleep(300);
	ObjEmpPJ.setJobType(jobtype);
	Thread.sleep(300);
	ObjEmpPJ.setQualification(qualification);
	Thread.sleep(300);
	ObjEmpPJ.setJobDes(jobdes);
	Thread.sleep(300);
	ObjEmpPJ.setExp(experience);
	Thread.sleep(300);
	ObjEmpPJ.setBenefit(benefits);
	Thread.sleep(300);
	ObjEmpPJ.setSchedule(schedule);
	Thread.sleep(300);
	ObjEmpPJ.setLanguage(language);
	Thread.sleep(300);
	ObjEmpPJ.setContact(contact);
	Thread.sleep(300);
	ObjEmpPJ.PostJOB();
	Thread.sleep(8000);
	String alert=driver.switchTo().alert().getText();
	driver.switchTo().alert().accept();
	Thread.sleep(10000);
	
	if(alert.equals("Job Posted")) {
		Assert.assertTrue(true);
		
	}
	else {
		Assert.assertTrue(false);
		
	}}
@Test(priority=11, description="Logout")
public void EmpLogout() throws InterruptedException
{
	Thread.sleep(5000);
	ObjEmpPJ = new EmployerPostJob(driver);
	ObjEmpPJ.Logout();
	Thread.sleep(5000);
	ObjEmpPJ.homeCl();
	Thread.sleep(5000);
}
	

	
}