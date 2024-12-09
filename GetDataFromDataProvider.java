package testNgP;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GetDataFromDataProvider extends DataProviderTest {
	
	  @Test(dataProvider = "getData" ,dataProviderClass = DataProviderTest.class)
	  public void displayDatasub(String data[]) {
			
		driver.get("https://www.youtube.com/");
			  
			 
		  System.out.println("subClassData>>>>>>>>>>>>"+data[0]);
		  System.out.println("subClassData>>>>>>>>>>>>"+data[1]); }
	 

	@BeforeClass
	public void beforeSubClass() {
		System.out.println("Before-SubClass");
	}

	@AfterClass
	public void afterSubClass() {
		System.out.println("after-SubClass");
	}

	@BeforeMethod
	public void beforeSubClassMethod() {
		System.out.println("Before-SubClassMethode");
		/* driver =new ChromeDriver(); */
	}

	@AfterMethod
	public void afterSubClassMethod() {
		System.out.println("after-SubClassMethode");
		/* driver.close(); */
	}

}
