package testNgP;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HomePage {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("<<<<<<<beforeClass>>>>>");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("<<<<<<<afterClass>>>>>");
	}
	
	
	
	@BeforeMethod(enabled=false)
	public void beforeMethode() {
		System.out.println("<<<<<<<beforeMethod>>>>>");
	}
	
	@AfterMethod(timeOut = 4000)
	public void afterMethode() {
		System.out.println("<<<<<<<afterMethod>>>>>");
	}
	
	@Test(groups= {"Reg"})
	public void webHomePage() {
		System.out.println("webHomePage");
	}
	
	@Test 
	public void MobileHomePage() {
		System.out.println("MobileHomePage");
	}
	
	@Test 
	public void windowsHomePage() {
		System.out.println("windowsHomePage");
	}
	@AfterSuite
	public void AfterSuite() {
		System.out.println("afterSuite");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest");
	}

}
