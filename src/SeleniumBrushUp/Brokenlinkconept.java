package SeleniumBrushUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Brokenlinkconept {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.gecko.driver", "F:\\Rishabh Data\\Selenium Dowload\\geckodriver.exe");	
		//WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "F:\\Rishabh Data\\Selenium Dowload\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");	
		driver.manage().deleteAllCookies();
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("nitiverma");
		driver.findElement(By.name("password")).sendKeys("test1234");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("mainpanel");
		List<WebElement> listoflink=driver.findElements(By.tagName("a"));
		System.out.println(listoflink);
		listoflink.addAll(driver.findElements(By.tagName("img")));
		System.out.println(listoflink);
	}

}
