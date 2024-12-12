package testPackage;

import org.testng.annotations.Test;

import pagePackage.RishiHerbalPage;

public class RishiHerbalTest extends BaseClassRishi{
	@Test
	
	public void testHealth() {
		RishiHerbalPage ob=new RishiHerbalPage (driver);
		ob.healthDetails();
	}

}
