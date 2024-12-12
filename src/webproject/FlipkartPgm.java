package webproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartPgm {
 ChromeDriver driver;
 
 @Before
 public void setUp() {
	 driver=new ChromeDriver();
	 driver.get("https://www.flipkart.com/");;
 }
 
 @Test
 public void searchBar() {
	 driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div/div/div/div/div[1]/div/div/div/div[1]/div[1]/header/div[1]/div[2]/form/div/div/input")).sendKeys("Dress");
	 driver.findElement(By.xpath("//*[@id='toast-ctn']")).click();
 }
}
