package testPackage;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pagePackage.FbLoginPage;


public class FbLoginTest extends BaseClassFb {
public static WebDriver driver;

		
		@Test
		public void testLogin()
		{
			//by object creation chromedriver details passed to the constructor webdriver of page package
			FbLoginPage ob=new FbLoginPage(driver);//creating object of fbloginpage ie,pagepackage class where we located elements
			ob.setValues("ajhscv@gmail.com","jahscbjah");
			ob.login();
		}
		

	}

