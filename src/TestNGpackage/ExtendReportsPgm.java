package TestNGpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import junit.framework.Assert;

public class ExtendReportsPgm {
	WebDriver driver;
	//declare 3 classes under extendreports
	ExtentHtmlReporter reporter;   //class to set theme,title etc like "webdriver driver"
	ExtentTest test;               //class Representing individual test cases 
	ExtentReports extend;          //class to manage all ExtentReports data
	String baseUrl="https://www.facebook.com";
	
	@BeforeTest //here we set the theme and all required for test
	public void extendReport() {
		//driver=new ChromeDriver()  same format below
		reporter=new ExtentHtmlReporter("./extendreportview/myreport1.html");//make a folder 'reports' in testngpackage and myreport1 is where we want to save this report
		reporter.config().setDocumentTitle("Automation Report");//for making title of report
		reporter.config().setReportName("Functional test");   //name of report
		reporter.config().setTheme(Theme.DARK);
		
		extend=new ExtentReports() ;
	    extend.attachReporter (reporter);//attaches previous html report to extendreport
	    extend.setSystemInfo("host name","local host");   //all infos setting
	    extend.setSystemInfo("os","Windows 10");
	    extend.setSystemInfo("tester name","abc");
	    extend.setSystemInfo("browser name","chrome");
	    driver=new ChromeDriver();    //bcs we are doing in chrome
			
		}
	@BeforeMethod
	public void beforeMethod() {
		driver.get(baseUrl);
	}
	@Test
	public void titleVerification() {
	test=extend.createTest("Fb title Verification");
	String actualtitle=driver.getTitle()  ; 
	String expectedtitle="Facebook - log in or sign up";
	Assert.assertEquals(expectedtitle,actualtitle);
}
	@Test
	public void logoVerification() {
		test=extend.createTest("Fb logo Verification");//checking if logo is present or not
		boolean b=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img")).isDisplayed(); //boolean bcs true/false is output
		Assert.assertTrue(b);
	}
	
	@AfterMethod
	public void browserClose(ITestResult result)  //(String s)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, "test case failed is"+result.getName());//getname for getting name of failed test
			test.log(Status.FAIL, "test case failed is"+result.getThrowable());  // for handling exceptions getthrowable
		}
		else if(result.getStatus()==ITestResult.SKIP) {
			test.log(Status.SKIP, "test case skipped is"+result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS){
			test.log(Status.PASS, "test case passed is"+result.getName());
		}
	}
	@AfterTest
	public void tearDown()
	{
		extend.flush();// for generating final report
	}

}
  

