package webproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//search amazon,locate bestsellers

public class Xpath {
ChromeDriver driver;
	
	@Before
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
			}
	@Test
	public void xpathPgm() {
		driver.findElement(By.xpath("//* [@id='nav-xshop']/a[3]")).click();
		
	}


}
