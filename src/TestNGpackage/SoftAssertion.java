package TestNGpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SoftAssertion {
	
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
			if(actualtitle.equals(expectedtitle)) {
				System.out.println("Title matches");
			}else {
				System.out.println("Title not matching");
			}

		
			System.out.println("hello");


}}
