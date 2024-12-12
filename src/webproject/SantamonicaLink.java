package webproject;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SantamonicaLink {
	ChromeDriver driver;
	int brokencount=0;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://santamonicaedu.in/");
	}
	//program to find total number of broken lnks in this site and print them
	@Test
	public void Count()
	{
		List<WebElement> linkDetails=driver.findElements(By.tagName("a"));
		System.out.println(linkDetails.size());
		for(WebElement element:linkDetails)
		{
			String link =element.getAttribute("href");
			responseCode(link);
		}
			System.out.println("no.of brokenlinks"+brokencount);
		
	}
	public void responseCode(String link)
	{
		try {
			URL u =new URL(link);
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			int code=con.getResponseCode();
			
			if(code>=400 || code<=499)
			{
				brokencount++;	
				System.out.println(link);
		    }
			
		}
		catch(Exception e)
		{
			System.out.println("Error");
	    }
		
	}

	}	