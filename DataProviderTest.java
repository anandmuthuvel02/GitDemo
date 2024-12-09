package testNgP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	
	  @Test(dataProvider = "getData") public void displayDatasuper(String data[]) {
	  System.out.println("SuperClassData>>>>>>>>>>>>>>>>>"+data[0]);
	  System.out.println("SuperClassData>>>>>>>>>>>>>>>>>"+data[1]); }
	 
	 
	WebDriver driver = new ChromeDriver();
	@DataProvider(indices = {2},parallel= true)
	public Object getData() {
		
		Object[][] data = new Object[3][2];
		
		data[0][0] = "Uname1";
		data[0][1] = "Password1";
		
		data[1][0] = "Uname2";
		data[1][1] = "Password2";
		
		data[2][0] = "Uname3";
		data[2][1] = "Password3";
		
		return data;
		
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before-SuperClass");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("after-SuperClass");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before-SuperClassMethode");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after-SuperClassMethode");
	}

}
