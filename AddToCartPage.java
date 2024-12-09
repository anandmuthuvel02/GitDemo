package testNgP;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AddToCartPage {
	
	@BeforeTest
	@Parameters({"URL","Uname","Password"})
	public void beforeTest(String URL,String name,String password) {
		System.out.println("beforeTest  ATC");
		System.out.println(URL);
		System.out.println(name);
		System.out.println(password);
	}
	
	@AfterTest
	public void aftertTest() {
		System.out.println("aftertTest");
	}  
	
	@Test 
	public void webAddToCartPage() {
		System.out.println("web AddToCartPage");
	}
	@Test 
	public void webPricingPage() {
		System.out.println("ATCwebPricingPage");
	}

	@Test 
	public void MobileAddToCartPage() {
		System.out.println("MobileAddToCartPage");
	}
	
	@Test 
	public void windowsAddToCartPage() {
		System.out.println("windowsAddToCartPage");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite");
	}
}
