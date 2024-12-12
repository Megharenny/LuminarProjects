package webproject;

import java.util.List;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {
	ChromeDriver driver;
	
	@Before
	public void setUp() {
		driver=new ChromeDriver();    
		driver.get("https://www.facebook.com");   
	}
	
	@Test
	public void linkCount() {
		List<WebElement> linkDetails=driver.findElements(By.tagName("a"));//locate any link in fb site
		System.out.println("total number of links="+linkDetails.size());  //size to get total number of 'a' tag ot total links
		
		//getattribute,gettext using 'for each' loop
		 for(WebElement element:linkDetails) {               //similar to for (String s:e)
			String link=element.getText();               //first we fetch the first linktext ,then we fetch the link of the first link txt
			String linkText=element.getAttribute("href");
			System.out.println("Link="+link);
			System.out.println("Link Text="+linkText);
		}
	}

}
