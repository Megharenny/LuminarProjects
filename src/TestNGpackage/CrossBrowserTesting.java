package TestNGpackage;


import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	RemoteWebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void setUp(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
           driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } 
        else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } 
            
        }
	
	@Test
	public void crossBrowser() {
		driver.get("https://google.com/");
	}

}
