package TestNGpackage;


	import java.io.FileInputStream;

	import java.io.IOException;

	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class DataDrivenPgm {
		ChromeDriver driver;
		
		@BeforeTest
		public void setUp()
		{
			driver=new ChromeDriver();
		}
		
		@Test
		public void dataDriven() throws IOException
	
		{
			driver.get("https://www.facebook.com/");
			FileInputStream fi=new FileInputStream("https://d.docs.live.net/4c25c4907f08372b/Documents/excelpractise.xlsx");//reads the excel file at this path
			XSSFWorkbook wb=new XSSFWorkbook(fi);//pass that file details to a workbook of that file
			XSSFSheet sh=wb.getSheet("Fbloginpractise");//Accesses the specific sheet within the workbook
			int rowCount=sh.getLastRowNum();//Retrieves the index of the last row with data in the sheet 

			for(int i=1;i<rowCount;i++) { //bcs at 0th row we wrote username so i=1
				String userName=sh.getRow(i).getCell(0).getStringCellValue();
				String passWord=sh.getRow(i).getCell(1).getStringCellValue();
				//now we got the string value at that particular cell , now pass these to fb login page(username and password)
				//for that locate fb each option
				driver.findElement(By.name("email")).clear(); //already entered details cleared
				driver.findElement(By.name("email")).sendKeys(userName);
				driver.findElement(By.name("pass")).sendKeys(userName);
				driver.findElement(By.name("login")).click();
				
			}
			
		}

	}


