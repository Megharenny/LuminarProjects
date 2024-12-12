package webproject;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SantamonicaPgm {
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://santamonicaedu.in/");
	}
	
	@Test
	public void santaMonica()
	{
		String expectedtitle="SantaMonica Study Abroad";
		String actualtitle = driver.getTitle();
        if (actualtitle.equals(expectedtitle)) {
            System.out.println("Title matches");
        } else {
            System.out.println("Title does not match");
        }
        
        String pageSource = driver.getPageSource();
        if (pageSource.contains("Language Training")) {
            System.out.println("contains");
        } else {
            System.out.println("not contains");
        }
        
        
        driver.findElement(By.xpath("//*[@id='menu-item-1128']/a")).click();  //find course
        
        driver.findElement(By.xpath("//*[@id='menu-item-567']/a")).click();   //study abroad
        
        driver.findElement(By.xpath("//*[@id='menu-item-53']/a")).click();   //about us
        
        driver.findElement(By.xpath("//*[@id='menu-item-81']/a")).click();  //achievements
        
        driver.findElement(By.xpath("/html/body/a[1]")).click();    //contact
        
        driver.findElement(By.xpath("//*[@id='masthead']/div[1]/div/div/div/div/div[1]/a[1]")).click(); //our branches
        
        driver.findElement(By.xpath("//*[@id='masthead']/div[1]/div/div/div/div/div[1]/a[2]")).click();//our digital office
        
        driver.findElement(By.xpath("//*[@id='btnSearchAllPrograms']/a")).click();
        
        
	}
}