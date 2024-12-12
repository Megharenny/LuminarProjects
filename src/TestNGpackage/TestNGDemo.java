
package TestNGpackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {
	
	@BeforeTest
	public void setUp() {
		System.out.println("Browser loading");
	}
	
	@BeforeMethod
	public void urlLoading() {
		System.out.println("url details"); 
	}
	
	@Test(priority=3,invocationCount=3,groups="smoke")//executed 3 times
	public void test1() {
		System.out.println("Test 1");
	}
	@Test(priority=2,enabled =false)
	public void test2() {
		System.out.println("Test 2");
	}
	@Test(priority=1,dependsOnMethods="test2",groups="smoke")  //test 3 depends on test 2
	public void test3() {
		System.out.println("Test 3");
	}
	
	@AfterMethod
	public void afterMethodDetails() {
		System.out.println("AFTER METHOD DETAILS");
	}
	
	@AfterTest
	public void tearDown() {
		System.out.println("Quit browser");
	}

}
