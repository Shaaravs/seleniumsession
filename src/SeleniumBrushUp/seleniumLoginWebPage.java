package SeleniumBrushUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumLoginWebPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "F:\\Rishabh Data\\Selenium Dowload\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://classic.crmpro.com/index.html");	
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("nitiverma");
		driver.findElement(By.name("password")).sendKeys("test1234");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		
	}

}
