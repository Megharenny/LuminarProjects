package webproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {
ChromeDriver driver;
	
	@Before
	public void setUp() {
		driver=new ChromeDriver();    
		driver.get("https://www.rediff.com/");   
	}
	//check avaliability button text get
	@Test
	public void rediffPgm()
	{   
		WebElement buttontext=driver.findElement(By.xpath("//*[@id='signin_info']/a[2]"));
		String buttonName=buttontext.getAttribute("value");
		
		if (buttonName.equals("Check Avalability"))
		{
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
	}
	

}
