package SeleniumBrushUp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumBasic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.gecko.driver", "F:\\Rishabh Data\\Selenium Dowload\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");		
		String stitle=driver.getTitle();
		System.out.println(stitle);
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		System.out.println(driver.getWindowHandle());
		List<WebElement> listOfElements = driver.findElements(By.xpath("//a"));
		//List<WebElement> slist=driver.findElements(By.xpath("//input"));
		for (int i=0; i<listOfElements.size();i++){
		      System.out.println("Radio button text:" + listOfElements.get(i).getAttribute("value"));
		}
		System.out.println(listOfElements.size());
		
		
		//driver.quit();
		
	}

}
