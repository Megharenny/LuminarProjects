package webproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayPgm {
	ChromeDriver driver;
	@Before
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
	}
	
	@Test
	public void automateEbay() {
        String expectedTitle = "eBay";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title matches");
        } else {
            System.out.println("Title does not match");
        }
	
        
        String pageSource = driver.getPageSource();
        if (pageSource.contains("Shop by category")) {
            System.out.println("contains");
        } else {
            System.out.println("not contains");
        }
        
        driver.findElement(By.xpath("//*[@id='gh-shop-a']")).click();
        driver.findElement(By.xpath("//*[@id='gh-sbc']/tbody/tr/td[1]/ul[1]/li[4]/a")).click();
        driver.findElement(By.xpath("//*[@id='s0-17-12_2-0-1[0]-0-0']/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id='gh-minicart-hover']/div/a[1]/svg")).click();
        driver.findElement(By.xpath("//*[@id='gh-ac']")).sendKeys("Books,Keys.ENTER");
	}}