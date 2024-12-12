package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RishiHerbalPage {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"menu\"]/ul/li[2]/a")
	 WebElement Health;
    
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a/img") 
	WebElement product;  
	
	
	public RishiHerbalPage (WebDriver driver) {   //constructor creation and passing driver details
		this.driver=driver;      //to ensure that driver is this driver
		PageFactory.initElements(driver,this);
	}
	
	//creating diff methods below
	public void healthDetails() {
		Health.click();
		product.click();
	}
	
	
	
}






