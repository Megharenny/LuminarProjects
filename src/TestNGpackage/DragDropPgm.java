package TestNGpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragDropPgm {
	ChromeDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/drag_drop.html");
    }
    
    @Test
    public void dragDrop() {
    	Actions act = new Actions(driver);
    	
    	WebElement AmntSrc = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
    	WebElement AmntDest = driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
        WebElement BankSrc = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
        WebElement BankDest = driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
        
        act.dragAndDrop(AmntSrc, AmntDest); 
        act.dragAndDrop(BankSrc, BankDest);
        act.perform();
        
        

}}
