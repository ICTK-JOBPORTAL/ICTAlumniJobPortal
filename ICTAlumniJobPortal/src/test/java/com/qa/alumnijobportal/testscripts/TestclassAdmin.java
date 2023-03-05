package com.qa.alumnijobportal.testscripts;

import java.io.IOException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.alumnijobportal.pages.AdminLogin;
import com.qa.alumnijobportal.pages.AdminSignUp;

import com.qa.alumnijobportal.utilities.ExcelUtility;


public class TestclassAdmin extends TestBase {
AdminLogin objAdmin;
AdminSignUp objAdminsign;


@Test(priority=1,description="Verify AdminSignUp with valid data")
public void adminSignUpPageVerification() throws InterruptedException, IOException
{
	objAdminsign=new AdminSignUp(driver);
	Thread.sleep(3000);
	objAdminsign.clickAdmin();
	Thread.sleep(3000);
	objAdminsign.clickSignup();
	Thread.sleep(3000);
	String email=ExcelUtility.getCellData(0, 0,System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 7);
	String password= ExcelUtility.getCellData(0,1,System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 7);
	String name=ExcelUtility.getCellData(0,2,System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 7);
	objAdminsign.setName(name);
	Thread.sleep(2000);
	objAdminsign.setEmail(email);
	Thread.sleep(2000);
	objAdminsign.setPassword(password);
	Thread.sleep(2000);
	objAdminsign.clickSubmit();
	Thread.sleep(15000);
	driver.switchTo().alert().accept();
	
	try {
		objAdminsign.clickSubmit();
		Thread.sleep(15000);
		}
		catch(UnhandledAlertException f)
		{
			try {
				driver.switchTo().alert().accept();
				Thread.sleep(2000);
			}catch (NoAlertPresentException e) {
		        e.printStackTrace();
		    }
		}
	
	if(driver.getCurrentUrl().contains("login")) {
		Assert.assertTrue(true);
	}
	else {
		Assert.assertTrue(false);
	}}

@Test(priority=2,description="Verify Admin login with valid data")
public void LoginPageverification() throws IOException, InterruptedException, NoAlertPresentException
{
	objAdmin=new AdminLogin(driver);
	Thread.sleep(3000);
	String username=ExcelUtility.getCellData(0, 0,System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 7);
	String password= ExcelUtility.getCellData(0,1,System.getProperty("user.dir")+"\\src\\main\\resources\\Excel.xlsx", 7);
	objAdmin.clickAdmin();
	Thread.sleep(3000);
	objAdmin.setEmail(username);
	objAdmin.setPassword(password);
	try {
	objAdmin.clickSubmit();
	Thread.sleep(10000);
	driver.switchTo().alert().accept();
	
	}
	catch(UnhandledAlertException f)
	{
		try {
			driver.switchTo().alert().accept();
			Thread.sleep(2000);
		}catch (NoAlertPresentException e) {
	        e.printStackTrace();
	    }
		
	}
	if(driver.getCurrentUrl().contains("dashboard")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}

}
}