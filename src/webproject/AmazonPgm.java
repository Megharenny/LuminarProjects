package webproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//take amazn , click search,type mobile

public class AmazonPgm {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	
	@Test
	public void locatorsPgm() {
	
		driver.findElement(By.xpath("//*[@id='nav-search-bar-form']/div[2]/div[1]/div[1]/input")).sendKeys("mobile");
	}

}
