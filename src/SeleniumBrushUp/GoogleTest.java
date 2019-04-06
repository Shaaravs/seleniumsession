package SeleniumBrushUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	@BeforeMethod
	public void setp() {
		System.setProperty("webdriver.gecko.driver", "F:\\Rishabh Data\\Selenium Dowload\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}
	@Test
	public void verifygooglepagetitle() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	
	@AfterMethod
	public void Teardown() {
		driver.quit();;
	}

}
