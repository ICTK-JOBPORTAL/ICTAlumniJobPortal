package com.qa.alumnijobportal.testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.alumnijobportal.pages.FacultyJobPost;
import com.qa.alumnijobportal.pages.FacultyLogin;
import com.qa.alumnijobportal.pages.FacultySignup;
import com.qa.alumnijobportal.utilities.ExcelUtility;
import com.qa.alumnijobportal.utilities.RandomEmail;
import com.qa.alumnijobportal.utilities.Screenshot;

public class TestclassFaculty extends TestBase {
	
	FacultySignup objFacSu;
	FacultyLogin objFacLog;
	FacultyJobPost objFacJP;
	
	
	@Test(priority=1, description = "Fculty Signup with invalid data")
	public void FacultySignupverification1() throws IOException, InterruptedException 
	{	Thread.sleep(15000);
		objFacSu=new FacultySignup(driver);
		String name=ExcelUtility.getCellData(0, 0,System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 4);
		String mail=ExcelUtility.getCellData(0, 1,System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 4);
		String password=ExcelUtility.getNumericData(0, 2,System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 4);
		RandomEmail Rand=new RandomEmail();
		String Random=Rand.randomNum();
		String email=mail+Random;
		Thread.sleep(15000);
		objFacSu.clickFacultyLogin();
		Thread.sleep(3000);
		objFacSu.clickFacultySignup();
		Thread.sleep(2000); 
		objFacSu.setName(name);
		Thread.sleep(2000);
		objFacSu.setEmail(email);
		Thread.sleep(2000);
		objFacSu.setPassword(password);
		Thread.sleep(2000);
		Screenshot.captureScreenshot(driver);
		if(objFacSu.ButtonEnable()) 
		  { 
			  Assert.assertTrue(false); 
			  }
		  else 
		  {
			  Assert.assertTrue(true);
			  }
		
	}
	@Test(priority=2, description = "Fculty Signup with invalid data")
	public void FacultySignupverification2() throws IOException, InterruptedException 
	{	driver.navigate().refresh();
		Thread.sleep(5000);
		objFacSu=new FacultySignup(driver);
		String name=ExcelUtility.getCellData(1, 0,System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 4);
		String mail=ExcelUtility.getCellData(1, 1,System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 4);
		String password=ExcelUtility.getNumericData(1, 2,System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 4);
		RandomEmail Rand=new RandomEmail();
		String Random=Rand.randomNum();
		String email=mail+Random;
		Thread.sleep(5000);
		objFacSu.setName(name);
		Thread.sleep(2000);
		objFacSu.setEmail(email);
		Thread.sleep(2000);
		objFacSu.setPassword(password);
		Thread.sleep(2000);;
		Screenshot.captureScreenshot(driver);
		if(objFacSu.ButtonEnable()) 
		  { 
			  Assert.assertTrue(false); 
			  }
		  else 
		  {
			  Assert.assertTrue(true);
			  }
	}
	@Test(priority=3, description = "Fculty Signup with valid data")
	public void FacultySignupverification3() throws IOException, InterruptedException 
	{	driver.navigate().refresh();
		Thread.sleep(5000);
		objFacSu=new FacultySignup(driver);
		String name=ExcelUtility.getCellData(2, 0,System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 4);
		String mail=ExcelUtility.getCellData(2, 1,System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 4);
		String password=ExcelUtility.getNumericData(2, 2,System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 4);
		RandomEmail Rand=new RandomEmail();
		String Random=Rand.randomNum();
		String email=mail+Random;
		objFacSu.setName(name);
		Thread.sleep(300);
		objFacSu.setEmail(email);
		Thread.sleep(300);
		objFacSu.setPassword(password);
		Thread.sleep(300);
		objFacSu.clickSubmit();
		Thread.sleep(3000);
		if(driver.getCurrentUrl().contains("faculty")) 
		  { 
			  Assert.assertTrue(true); 
			  }
		  else 
		  {
			  Assert.assertTrue(false);
			  }
	}

	@Test(priority=4, description = "Fculty Login with invalid data")
	public void FacultyLogin1() throws Exception
	{
		objFacLog=new FacultyLogin(driver);
		objFacLog.logAsFaculty();
		String email=ExcelUtility.getCellData(0, 0,System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 5);
		String password=ExcelUtility.getNumericData(0, 1,System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 5);
		objFacLog.setEmail(email);
		Thread.sleep(2000);
		objFacLog.setPassword(password);
		Thread.sleep(2000);
		Screenshot.captureScreenshot(driver);
		if(objFacLog.ButtonEnable()) 
		  { 
			  Assert.assertTrue(false); 
			  }
		  else 
		  {
			  Assert.assertTrue(true);
			  }
	}
	@Test(priority=5, description = "Fculty Login with invalid data")
	public void FacultyLogin2() throws Exception
	{
		objFacLog=new FacultyLogin(driver);
		driver.navigate().refresh();
		objFacLog.logAsFaculty();
		String email=ExcelUtility.getCellData(1, 0,System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 5);
		String password=ExcelUtility.getNumericData(1, 1,System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 5);
		objFacLog.setEmail(email);
		Thread.sleep(2000);
		objFacLog.setPassword(password);
		Thread.sleep(2000);
		Screenshot.captureScreenshot(driver);
		if(objFacLog.ButtonEnable()) 
		  { 
			  Assert.assertTrue(false); 
			  }
		  else 
		  {
			  Assert.assertTrue(true);
			  }
	}
	@Test(priority=6, description = "Fculty Login with valid data")
	public void FacultyLogin3() throws Exception
	{
		objFacLog=new FacultyLogin(driver);
		driver.navigate().refresh();
		objFacLog.logAsFaculty();
		String email=ExcelUtility.getCellData(2, 0,System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 5);
		String password=ExcelUtility.getNumericData(2, 1,System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 5);
		objFacLog.setEmail(email);
		Thread.sleep(2000);
		objFacLog.setPassword(password);
		Thread.sleep(2000);
		objFacLog.ClickLogin();
		Thread.sleep(5000);
		if(driver.getCurrentUrl().contains("facview")) 
		  { 
			  Assert.assertTrue(true); 
			  }
		  else 
		  {
			  Assert.assertTrue(false);
			  }
		
	}
	@Test(priority=7)
	public void FacultyLogout() 
	{
		objFacJP=new FacultyJobPost(driver);
		objFacJP.FaclogOut();
	}
	

}
