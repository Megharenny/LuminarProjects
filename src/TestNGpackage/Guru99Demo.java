package TestNGpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Guru99Demo {
    ChromeDriver driver;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
    }

    @Test
    public void guruDemo() {
        Actions act = new Actions(driver);

        WebElement rightClickElement = driver.findElement(By.xpath("//*[@id='authentication']/span"));
        act.contextClick(rightClickElement).perform();

        WebElement editOption = driver.findElement(By.xpath("//*[@id='authentication']/ul/li[1]"));
        editOption.click();

        Alert a1 = driver.switchTo().alert();
        String alertText = a1.getText();
        System.out.println(alertText);
        a1.accept();

        WebElement doubleClickElement = driver.findElement(By.xpath("//*[@id='authentication']/button"));
        act.doubleClick(doubleClickElement).perform();

        Alert a = driver.switchTo().alert();
        String secondAlertText = a.getText();
        System.out.println(secondAlertText);
        a.accept();
    }
}
