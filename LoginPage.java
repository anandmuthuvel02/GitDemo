package testNgP;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginPage {
	
	@BeforeTest(groups= {"Reg","Test"})
	public void beforeTest() {
		System.out.println("beforeTestg");
	}
	@Test (dependsOnMethods= {"MobileLoginPage"})
	public void webLoginPage() {
		System.out.println("webLoginPage");
	}
	
	@Test(groups= {"Reg"})
	public void MobileLoginPage() {
		System.out.println("MobileLoginPage");
	}
	@Parameters ({"URL"})
	@Test(dependsOnMethods= {"webLoginPage"})
	public void windowsLoginPage(String urlname) {
		
		System.out.println(urlname);
		System.out.println("windowsLoginPage");
	}
}
