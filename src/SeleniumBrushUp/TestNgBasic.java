package SeleniumBrushUp;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasic {
	
	@BeforeTest
	public void Launchbrowser() {
		System.out.println("Pease Laaunch Browser ");
	}
	@BeforeClass
	public void openUrl() {
		System.out.println("Pease open url ");
	}
	@BeforeMethod
	public void logintoapp() {
		System.out.println("Pease login to app ");
	}
	@Test
	public void verifygooglepage() {
		System.out.println("verify google title test");
	}
	@AfterMethod
	public void loguot() {
		System.out.println("Logout to app ");
	}
	@AfterTest
	public void delectetallcookies() {
		System.out.println("delectetallcookies ");
	}
	@AfterClass
	public void closebrowser() {
		System.out.println("closebrowser ");
	}

}
