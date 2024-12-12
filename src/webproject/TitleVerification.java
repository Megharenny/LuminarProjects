package webproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerification {
	ChromeDriver driver;  //declaring chromedriver as public like 'int a'
	@Before
	public void setUp()   //creating method
	{
		driver=new ChromeDriver();    //initializing,so need to type chromedriver here
		driver.get("https://www.facebook.com");   //launching chrome browser
	}
	@Test
	public void titleVerifiction()
	{
		String actualtitle=driver.getTitle();      
		System.out.println(actualtitle);
		String expectedtitle="Facebook";
		if(actualtitle.equals(expectedtitle)) {
			System.out.println("Title matches");
		}else {
			System.out.println("Title not matching");
		}

	}
	@After
	public void tearDown()
	{
		driver.quit();
	}
}
