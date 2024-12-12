package webproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlPgm {
		ChromeDriver driver;
		
		@Before
		public void setUp() {
			driver=new ChromeDriver();
			driver.get("file:///C:/Users/User/Desktop/megharenny.html");
		}
		//using megharenny.htmil indesktop,inspect each options
		@Test
		public void alertHandling() {
			driver.findElement(By.xpath("/html/body/input[1]")).click();//click display alert box2
			//below is handling an alert
			Alert a=driver.switchTo().alert();   //switching to alert box
			String s=a.getText();                //to get text in the alert message
			System.out.println(s);
			a.accept();  //clicking ok to alert
			//a.dismis//s()  to cancel an alert
			driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Megha");
			driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("Renny");
			
		}

}
