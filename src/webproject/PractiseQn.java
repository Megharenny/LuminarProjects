package webproject;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseQn {
	ChromeDriver driver;
	@Before
    public void setUp()
		{
			driver =new ChromeDriver();
			driver.get("https://www.ebay.com/");
		}
		
	@Test
	public void titleVerify()
		{
			String expTitle="Ebay.com";
			String title=driver.getTitle(); //actual
			if(title.equalsIgnoreCase(expTitle))
			{
				System.out.println("Title is Ebay.com");
			}
			else
			{
				System.out.println("Title not correct");
				
			driver.findElement(By.id("gh-shop-a")).click();
				
			driver.findElement(By.xpath("//a[@href='https://www.ebay.com/b/Art/550/bn_1853728']")).click();
				
			String pageSource=driver.getPageSource();
			String expected="Shop by category";
			if(pageSource.contains(expected))
			{
				System.out.println("page contains Shop by category");
			}
			else {
				System.out.println("not contains");
			}
				
			driver.findElement(By.xpath("//img[@src='https://i.ebayimg.com/thumbs/images/g/9coAAOSwCyZiYiY8/s-l225.webp']")).click();
			driver.findElement(By.xpath("//*[@id='gh']/div[1]/ul[2]/li[6]/div[1]/a[1]")).click();
				
			driver.findElement(By.name("_nkw")).sendKeys("Books",Keys.ENTER);
				
			}
		}
	}


