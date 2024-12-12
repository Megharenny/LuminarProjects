package TestNGpackage;
	import java.time.Duration;
import java.util.List;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class DatePickerPgm {
		ChromeDriver driver;

	    @BeforeTest
	    public void setUp() {
	        driver = new ChromeDriver();
	        driver.get("https://demo.automationtesting.in/Datepicker.html");
	    }
	    
	    @Test
	    public void datePicker() {
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    	driver.findElement(By.xpath("//*[@id=\"datepicker1\"]")).click();
	    	datePickMethod("December 2024", "23");
	    }
	    
	    public void datePickMethod(String expmonth,String expdate) {
	    	while(true) {     //loop till the expected month
	    		String month=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText(); //current month text
	    		System.out.println("Month"+month);
	    		
	    	if(month.equals(expmonth)) {   //when we get expmonth, break the loop
	    		break;
	    	} 
	    	else {
	    		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();  //inspect next month option
	    	}
	    		
	    	}
	    	//locating all dates in calender of displayed month
	    	List<WebElement> date = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a"));//inspect any date of selected month and remove column and row numb from this to get this code
	    	for(WebElement d:date) {             //iterate over each date
	    		String datetext=d.getText();
	    		if(datetext.equals(expdate)) {
	    			d.click();
	    			break;
	    		}
	    	}
	    	
	    	
	    }
	}



