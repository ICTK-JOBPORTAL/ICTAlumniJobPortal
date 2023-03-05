package com.qa.alumnijobportal.testscripts;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.qa.alumnijobportal.utilities.Screenshot;

public class TestBase {
WebDriver driver=null;

	
	public static Properties prop = null;
	
	@BeforeTest
	@Parameters("browser")
	public void onSetup(String browserName) throws Exception {
		
		prop = new Properties();
		FileInputStream pFile = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
		prop.load(pFile);
		
		if(browserName.equalsIgnoreCase("Chrome")) {
			driver =new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}
		
		
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	
	
	@AfterMethod
	public void tearDownMethod(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) 
		{
			Screenshot.captureScreenshot(driver);
			
		}}
		public void closepage1() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.quit();
	}



	private void closepage() {
		// TODO Auto-generated method stub
		
	}
}
