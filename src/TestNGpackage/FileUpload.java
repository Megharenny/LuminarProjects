package TestNGpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileUpload {
	ChromeDriver driver;
	@BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
    }
	
	@Test
	public void fileUp() throws InterruptedException, AWTException {
		driver.get("https://www.ilovepdf.com/word_to_pdf");   //url load
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();  //inspect word to pdf
		fileUpload("\"C:\\Users\\User\\Downloads\\MEGHA RENNY.doc\"");    //call below method and add path where to copy
		
	}
	
	public void fileUpload(String p) throws InterruptedException, AWTException {  //method create and pass parameter   
		StringSelection strslct=new StringSelection(p);                        //stringselection class for transfer path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strslct, null);  //study byheart,it is for copying to clipboad
		Robot robot=new Robot();      //robot class, here not actions class bcs its window based qn
		robot.delay(3000);  //delay time
		
		robot.keyPress(KeyEvent.VK_CONTROL);  //pasting
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);     
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_ENTER);  //press
		robot.keyRelease(KeyEvent.VK_ENTER); //release
		robot.delay(2000);
		
	}
    

}
