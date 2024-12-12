package TestNGpackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonPgm {
	ChromeDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
    }
    
    @Test
    public void amazonPgm() {
       
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	driver.manage().window().maximize();
    	driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobiles", Keys.ENTER);;
    	
    	String Title=driver.getTitle();
    	String ExpectedTitle=("Amazon.in:mobiles");
    	if(Title.equalsIgnoreCase(ExpectedTitle)) {
    		System.out.println("Title matches");
    	}else {
    		System.out.println("Title doesnot match");
    	}
    	
    	driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/a/h2/span")).click();
    	String parentWindow=driver.getWindowHandle();
    	Set<String> allWindows = driver.getWindowHandles();
        for (String handle : allWindows) {
            if (!handle.equals(parentWindow)) {
                 driver.switchTo().window(handle);
                 JavascriptExecutor js = (JavascriptExecutor) driver;
                 js.executeScript("window.scrollBy(0, 250)");
                 driver.findElement(By.xpath("//*[@id=\"nav-cart\"]")).click();
                 driver.close();
                 
        }    
                 driver.switchTo().window(parentWindow);
             }
         }
     }
