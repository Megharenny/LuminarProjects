package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FbCreateAccount {
    WebDriver driver;
    
    @FindBy(linkText="Create a Page") // Ensure exact match
    WebElement CreateApage;

    @FindBy(xpath="//a[contains(text(), 'Sign Up')]") // Update XPath for stability
    WebElement SignUp;   

    public FbCreateAccount(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void createPageLink() {
        CreateApage.click();
    }

    public void titleVerification() {
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains("Facebook")); // Use contains for flexibility
    }

    public void signUp() {
        SignUp.click();
    }
}
