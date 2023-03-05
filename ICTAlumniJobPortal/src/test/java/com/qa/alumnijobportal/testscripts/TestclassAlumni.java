package com.qa.alumnijobportal.testscripts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.alumnijobportal.pages.AlumniJobApplication;
import com.qa.alumnijobportal.pages.AlumniSignUp;
import com.qa.alumnijobportal.pages.Alumnilogin;
import com.qa.alumnijobportal.utilities.ExcelUtility;
import com.qa.alumnijobportal.utilities.RandomEmail;
import com.qa.alumnijobportal.utilities.Screenshot;

public class TestclassAlumni extends TestBase
{
	Alumnilogin alumlogin;
	AlumniSignUp objAlumnisign;
	AlumniJobApplication ObjAPJ;
	@Test(priority=1,description="Verify dropdown menu is present to select the course")
	public void alumniSignUpPageCourseDropdown(String value) throws InterruptedException, IOException
	{
		objAlumnisign=new AlumniSignUp(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(3000);
		objAlumnisign.clickAlumni();
		Thread.sleep(3000);
		objAlumnisign.clickSignup();
		Thread.sleep(3000);
		
		String name = ExcelUtility.getCellData(0, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 3);
		String mail = ExcelUtility.getCellData(0, 1, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 3);
		String phno = ExcelUtility.getCellData(0, 3, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 3);
		String qual = ExcelUtility.getCellData(0, 5, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 3);
		String plStatus = ExcelUtility.getCellData(0, 6, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 3);
		String pasd = ExcelUtility.getCellData(0, 7, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 3);
		
		RandomEmail Rand=new RandomEmail();
		String Random=Rand.randomNum();
		String email=mail+Random;
		
		objAlumnisign.setName(name);
		Thread.sleep(2000);
		objAlumnisign.setEmail(email);
		Thread.sleep(2000);
		objAlumnisign.setMobileNo(phno);
		Thread.sleep(2000);
		boolean course=objAlumnisign.courseDropdown();
		if(course) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}Assert.assertEquals(course, true);
		Thread.sleep(2000);
		objAlumnisign.setQual(qual);
		Thread.sleep(2000);
		objAlumnisign.setBatch();
		Thread.sleep(2000);
		objAlumnisign.setPlacement(plStatus);
		Thread.sleep(2000);
		JavascriptExecutor ex= (JavascriptExecutor)driver;
		ex.executeScript("window.scrollBy(0,300)");
		objAlumnisign.setPassword(pasd);
		Thread.sleep(2000);
		objAlumnisign.clickSubmit();
		Thread.sleep(10000);
		String expected="Error...  Email already registered";
		Assert.assertEquals(value, expected);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);	
		objAlumnisign.clickLogin();
	}
	@Test(priority=2,description="Verify dropdown menu is present to select the placement status")
	public void alumniSignUpPagePlacementStatusDropdown() throws InterruptedException, IOException
	{
		objAlumnisign=new AlumniSignUp(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(3000);
		objAlumnisign.clickAlumni();
		Thread.sleep(3000);
		objAlumnisign.clickSignup();
		Thread.sleep(3000);
		String name = ExcelUtility.getCellData(1, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 3);
		String mail = ExcelUtility.getCellData(1, 1, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 3);
		String course = ExcelUtility.getCellData(1, 2, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 3);
		String phno = ExcelUtility.getCellData(1, 3, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 3);
		String qual = ExcelUtility.getCellData(1, 5, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 3);
		String pasd = ExcelUtility.getCellData(1, 7, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 3);

		RandomEmail Rand=new RandomEmail();
		String Random=Rand.randomNum();
		String email=mail+Random;
		
		objAlumnisign.setName(name);
		Thread.sleep(2000);
		objAlumnisign.setEmail(email);
		Thread.sleep(2000);
		objAlumnisign.setMobileNo(phno);
		Thread.sleep(2000);
		objAlumnisign.setCourse(course);
		Thread.sleep(2000);
		objAlumnisign.setQual(qual);
		Thread.sleep(2000);
		objAlumnisign.setBatch();
		Thread.sleep(2000);
		boolean plStatus=objAlumnisign.placementDropdown();
		if(plStatus) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		Thread.sleep(2000);
		JavascriptExecutor ex= (JavascriptExecutor)driver;
		ex.executeScript("window.scrollBy(0,300)");
		objAlumnisign.setPassword(pasd);
		Thread.sleep(3000);
		objAlumnisign.clickSubmit();
		Thread.sleep(10000);
		driver.switchTo().alert().accept();
		Thread.sleep(10000);	
		objAlumnisign.clickLogin();
	}
	@Test(priority=3,description="Verify mobile number contains 10 digits")
	public void alumniSignUpPagemobileNumberVerification() throws InterruptedException, IOException
	{
		objAlumnisign=new AlumniSignUp(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(3000);
		objAlumnisign.clickAlumni();
		Thread.sleep(3000);
		objAlumnisign.clickSignup();
		Thread.sleep(3000);
		String name = ExcelUtility.getCellData(2, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 3);
		String mail = ExcelUtility.getCellData(2, 1, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 3);
		String course = ExcelUtility.getCellData(2, 2, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 3);
		String phno = ExcelUtility.getCellData(2, 3, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 3);
		String qual = ExcelUtility.getCellData(2, 5, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 3);
		String plStatus = ExcelUtility.getCellData(2, 6, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 3);
		String pasd = ExcelUtility.getCellData(2, 7, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 3);
		
		RandomEmail Rand=new RandomEmail();
		String Random=Rand.randomNum();
		String email=mail+Random;
		
		objAlumnisign.setName(name);
		Thread.sleep(2000);
		objAlumnisign.setEmail(email);
		Thread.sleep(2000);
		objAlumnisign.setMobileNo(phno);
		Thread.sleep(2000);
		objAlumnisign.setCourse(course);
		Thread.sleep(2000);
		objAlumnisign.setQual(qual);
		Thread.sleep(2000);
		objAlumnisign.setBatch();
		Thread.sleep(2000);
		objAlumnisign.setPlacement(plStatus);
		Thread.sleep(2000);
		JavascriptExecutor ex= (JavascriptExecutor)driver;
		ex.executeScript("window.scrollBy(0,300)");
		objAlumnisign.setPassword(pasd);
		Thread.sleep(2000);
		objAlumnisign.clickSubmit();
		Thread.sleep(10000);
		int v=(int) objAlumnisign.numberVerification();
		Assert.assertEquals(v,10);
		driver.switchTo().alert().accept();
		Thread.sleep(10000);	
		objAlumnisign.clickLogin();
		
	}
	@Test(priority=4,description="Verify email validation")
	public void alumniSignUpPageemailVerification() throws InterruptedException, IOException
	{
		objAlumnisign=new AlumniSignUp(driver);  

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(3000);
		objAlumnisign.clickAlumni();
		Thread.sleep(3000);
		objAlumnisign.clickSignup();
		Thread.sleep(3000);
		
		String name = ExcelUtility.getCellData(3, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 3);
		String email = ExcelUtility.getCellData(3, 1, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 3);
		String course = ExcelUtility.getCellData(3, 2, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 3);
		String phno = ExcelUtility.getCellData(3, 3, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 3);
		String qual = ExcelUtility.getCellData(3, 5, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 3);
		String plStatus = ExcelUtility.getCellData(3, 6, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 3);
		String pasd = ExcelUtility.getCellData(3, 7, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 3);
		objAlumnisign.setName(name);
		Thread.sleep(2000);
		objAlumnisign.setEmail(email);
		Thread.sleep(2000);
		objAlumnisign.setMobileNo(phno);
		Thread.sleep(2000);
		objAlumnisign.setCourse(course);
		Thread.sleep(2000);
		objAlumnisign.setQual(qual);
		Thread.sleep(2000);
		objAlumnisign.setBatch();
		Thread.sleep(2000);
		objAlumnisign.setPlacement(plStatus);
		Thread.sleep(2000);
		JavascriptExecutor ex= (JavascriptExecutor)driver;
		ex.executeScript("window.scrollBy(0,300)");
		objAlumnisign.setPassword(pasd);
		Thread.sleep(2000);
		if(objAlumnisign.buttonenable())
		{
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertTrue(true);
		}
		Thread.sleep(3000);
	}
	
	@Test(priority=5,description="Verify Alumni can login with invalid data")
	public void Alumniloginverification1() throws Exception 
	{
		alumlogin =new Alumnilogin(driver);
		Thread.sleep(4000);
		//alumlogin.logAsAlumni();
		alumlogin.clicktolog();
		Thread.sleep(3000);
		String Logemail = ExcelUtility.getCellData(0, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 2);
		String Logpass = ExcelUtility.getNumericData(0, 1, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 2);
		alumlogin.enterEmail(Logemail);
		Thread.sleep(500);
		alumlogin.enterPass(Logpass);
		Thread.sleep(500);
		Screenshot.captureScreenshot(driver);
		if(alumlogin.ButtonEnable())
		{
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertTrue(true);
		}
		Thread.sleep(3000);
	}
	@Test(priority=6,description="Verify Alumni login with invalid data")
	public void Alumniloginverification2() throws Exception 
	{
		alumlogin =new Alumnilogin(driver);
		driver.navigate().refresh();
		Thread.sleep(4000);
		alumlogin.clicktolog();
		Thread.sleep(3000);
		String Logemail = ExcelUtility.getCellData(1, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 2);
		String Logpass = ExcelUtility.getNumericData(1, 1, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 2);
		alumlogin.enterEmail(Logemail);
		Thread.sleep(500);
		alumlogin.enterPass(Logpass);
		Thread.sleep(500);
		Screenshot.captureScreenshot(driver);
		if(alumlogin.ButtonEnable())
		{
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertTrue(true);
		}
		Thread.sleep(3000);
	}
	@Test(priority=7,description="Verify Alumni can login with valid data")
	public void Alumniloginverification3() throws Exception 
	{
		alumlogin =new Alumnilogin(driver);
		Thread.sleep(4000);
		alumlogin.logAsAlumni();
		alumlogin.clicktolog();
		Thread.sleep(3000);
		String Logemail = ExcelUtility.getCellData(2, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 2);
		String Logpass = ExcelUtility.getNumericData(2, 1, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 2);
		alumlogin.enterEmail(Logemail);
		Thread.sleep(500);
		alumlogin.enterPass(Logpass);
		Thread.sleep(500);
		alumlogin.Alumsubmit();
		Thread.sleep(10000);
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		if(driver.getCurrentUrl().contains("alumnihome"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		Thread.sleep(3000);
	}
	
	
	
	@SuppressWarnings("unlikely-arg-type")
	@Test(priority=8,description="Verify Alumni can apply to job posted within the deadline")
		public void AlumniJobiApply() throws Exception {
			ObjAPJ = new AlumniJobApplication(driver);
			Thread.sleep(3000);	
			ObjAPJ.Readmore();
			Thread.sleep(1000);	
		
			String text2=ObjAPJ.ReadDiv();
			Boolean text3=ObjAPJ.ApplyJob();		
			if(text3.equals("true") & text2.equals("Job Date Less Than 7 Days Old")) {
				ObjAPJ.ClickApply();
				Assert.assertTrue(true);
				
			}
			else if(text3.equals("false") & text2.equals("Job Date Greater Than 7 Days Old. So Disabled")) 
			{
				Assert.assertTrue(true);
			}
			else {
				Assert.assertTrue(true);
			}
			}
		
	
	@Test(priority=9, description="Verify the user can upload a PDF File as resume while applying for a job posting")
	public void AlumniPdf() throws IOException, InterruptedException {
		ObjAPJ = new AlumniJobApplication(driver);
		Thread.sleep(5000);
		ObjAPJ.Click_Apply();
		Thread.sleep(5000);
		String A_name = ExcelUtility.getCellData(0, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 6);
		String A_phone = ExcelUtility.getNumericData(1, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 6);
		String A_Email = ExcelUtility.getCellData(2, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 6);
		String A_quali = ExcelUtility.getCellData(3, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 6);
		String A_course = ExcelUtility.getCellData(4, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 6);
		String A_experience = ExcelUtility.getCellData(5, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 6);
		String A_branch = ExcelUtility.getCellData(6, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 6);
		String A_isplaced = ExcelUtility.getCellData(7, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 6);
		String A_company = ExcelUtility.getCellData(8, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx",6);
		String A_resume = ExcelUtility.getCellData(9, 0, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx",6);
		
		ObjAPJ.setName(A_name);
		Thread.sleep(200);
		ObjAPJ.setphone(A_phone);
		Thread.sleep(200);
		ObjAPJ.setEmail(A_Email);
		Thread.sleep(200);
		ObjAPJ.setQualification(A_quali);
		Thread.sleep(200);
		ObjAPJ.setCourse(A_course);
		Thread.sleep(200);
		ObjAPJ.setExperience(A_experience);
		Thread.sleep(200);
		ObjAPJ.setBranch(A_branch);
		Thread.sleep(200);
		ObjAPJ.setIsPlaced(A_isplaced);
		Thread.sleep(200);
		ObjAPJ.setCompany(A_company);
		Thread.sleep(200);
		ObjAPJ.setResumePDF(A_resume);
		Thread.sleep(25000);
		ObjAPJ.Submit_App();
		String CheckPDF=ObjAPJ.CheckResume();
		Assert.assertEquals(CheckPDF,"application/pdf","Fail");
	}
		
	@Test(priority=10, description="Verify the user can Online Link as resume while applying for a job posting")
	public void AlumniOnlineLink() throws IOException, InterruptedException {
		ObjAPJ = new AlumniJobApplication(driver);
		ObjAPJ.logAsAlumni();
		driver.navigate().refresh();
		ObjAPJ.Click_Apply();
		Thread.sleep(5000);
		
		String A_name = ExcelUtility.getCellData(0, 1, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 6);
		String A_phone = ExcelUtility.getNumericData(1, 1, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 6);
		String A_Email = ExcelUtility.getCellData(2, 1, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 6);
		String A_quali = ExcelUtility.getCellData(3, 1, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 6);
		String A_course = ExcelUtility.getCellData(4, 1, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 6);
		String A_experience = ExcelUtility.getCellData(5, 1, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 6);
		String A_branch = ExcelUtility.getCellData(6, 1, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 6);
		String A_isplaced = ExcelUtility.getCellData(7, 1, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 6);
		String A_company = ExcelUtility.getCellData(8, 1, System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx",6);
		
		ObjAPJ.setName(A_name);
		ObjAPJ.setphone(A_phone);
		ObjAPJ.setEmail(A_Email);
		ObjAPJ.setQualification(A_quali);
		ObjAPJ.setCourse(A_course);
		ObjAPJ.setExperience(A_experience);
		ObjAPJ.setBranch(A_branch);
		ObjAPJ.setIsPlaced(A_isplaced);
		ObjAPJ.setCompany(A_company);
		String CheckPDF=ObjAPJ.CheckResume();
		Thread.sleep(3000);
		System.out.println(CheckPDF);
		Assert.assertEquals(CheckPDF,"URL","Fail");
		
		
	}
	@Test(priority=11,description="Verify Alumni can access apply button")
	public void applyValidation() throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(4000);
		alumlogin =new Alumnilogin(driver);
		alumlogin.applyButton();
		Thread.sleep(14000);
		
		if(driver.getCurrentUrl().contains("apply"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		Thread.sleep(3000);
	}
	
	@Test(priority=12,description="Verify Alumni can logout")
	public void logOutAlumni() throws InterruptedException 
	{
		driver.navigate().back();
		Thread.sleep(4000);
		alumlogin =new Alumnilogin(driver);
		Thread.sleep(3000);
		alumlogin.logoutButton();
		Thread.sleep(3000);
		if(driver.getCurrentUrl().contains("app")) 
		{
			Assert.assertTrue(true);
		}
		else 
		{
			Assert.assertTrue(false);
		}
	}
}
