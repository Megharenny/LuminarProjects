package pagePackage;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;


	public class FbLoginPage {
		WebDriver driver;
		
		By fbemail=By.id("email");    //locating each field by id and storing it in a refernce name fbemail
		By fbpassword=By.id("pass");
		By fbloginbutton=By.name("login");
		// or @Findby(id="email")
		//    WebElement fbemail;  similarly each field
		
		public FbLoginPage(WebDriver driver) {   //constructor creation and passing driver details
			this.driver=driver;      //to ensure that driver is this driver
			//PageFactory.initElements(driver,this);
		}
		
		public void setValues(String email,String password) {   //sending values to each field
			driver.findElement(fbemail).sendKeys(email);  //fbemail alredy declared on top instead of using by.id again
			driver.findElement(fbpassword).sendKeys(password);
			//fbemail.sendKeys(email);
			
		}
		
		public void login() {
			driver.findElement(fbloginbutton).click();
			
		}

	}


