package webproject;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumScriptPgm {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();    //object creation
		driver.get("https://www.facebook.com");    //url loading
		String actualtitle=driver.getTitle();      //getting title
		System.out.println(actualtitle);
		
		//expected title=Facebook
		String expectedtitle="Facebook";
		System.out.println(expectedtitle);
		//comparing actual and expected titles
		if(actualtitle.equals(expectedtitle)) {
			System.out.println("Title matches");
		}else {
			System.out.println("Title not matching");
		}

	}

}
