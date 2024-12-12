package webproject;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotPgm {
	ChromeDriver driver;
	@Before
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/User/Desktop/megharenny.html");
	}
	
	@Test
	public void screenShot() throws IOException{         //to handle exception 
		File c = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(c, new File("C:\\Users\\User\\Pictures\\Saved Pictures\\Screenshot.png")); //copying from c to other folder create
	    
	    //to take element ss
		WebElement button=driver.findElement(By.xpath("/html/body/input[1]"));
		File buttonImage=button.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(buttonImage,new File("./screenshot/buttonimage.png"));
		
		
	}}


