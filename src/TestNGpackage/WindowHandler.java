package TestNGpackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowHandler {
	ChromeDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/popup.php");
    }
    
    @Test
    public void windowHandlePgm() {
    	String parentWindow=driver.getWindowHandle();
    	System.out.println("Parent Window Title"+driver.getTitle());// no needed
    	driver.findElement(By.xpath("/html/body/p/a")).click();
    	//for switching to next window
    	Set<String> allWindows=driver.getWindowHandles();
    	for(String handle :allWindows) {
    		if(!handle.equalsIgnoreCase(parentWindow)) {
    			driver.switchTo().window(handle);//switch to immediate before window
    			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("megharenny");
    		    driver.close();
    		}
    		driver.switchTo().window(parentWindow);
    	}
    }

}
