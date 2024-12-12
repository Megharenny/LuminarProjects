package TestNGpackage;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class HardAssertion {
	ChromeDriver driver;  
	@BeforeTest
	public void setUp()   
	{
		driver=new ChromeDriver();    
		driver.get("https://www.google.com/");   
	}
	@Test
	public void titleVerifiction()
	{
		String actualtitle=driver.getTitle();      
		String expectedtitle="google";
		Assert.assertEquals(expectedtitle,actualtitle);
		System.out.println("hello");

	

}}
