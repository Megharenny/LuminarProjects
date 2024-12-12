package webproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSource {
	ChromeDriver driver;
	
	@Before
	public void setUp() {
		driver=new ChromeDriver();   
		driver.get("https://www.google.com/"); 
	}
	@Test
	public void pageSource() {
			String s = driver.getPageSource();  
			System.out.println(s);
			if (s.contains("Gmail")) {
				System.out.println("Gmail is present");
			} else {
				System.out.println("Gmail is not present");
			}
		}
	}
	


