package SeleniumBrushUp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class JavaScriptExecuterConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "F:\\Rishabh Data\\Selenium Dowload\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.freecrm.com");	
		
		WebElement sltest=driver.findElement(By.xpath("//a[text() = 'Pricing']"));
		drawborder(sltest, driver);
		WebElement sltest1=driver.findElement(By.xpath("//a[text() = 'Compare']"));
		flash(sltest1, driver);
		drawborder(sltest1, driver);
		System.out.println(gettitlebyjs(driver));
		System.out.println(getpagetext(driver));
		//scrollpagedow(driver);
		clickElementbyjs(sltest1, driver);
		WebElement sltest2=driver.findElement(By.xpath("//a[text()='Privacy Policy']"));
		scrollintoview(sltest2, driver);
	}
	
	public static void drawborder(WebElement element,WebDriver driver) {	
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);	
	}
	public static void flash(WebElement element,WebDriver driver) {	
		JavascriptExecutor js=((JavascriptExecutor) driver);
		String bgcolour=element.getCssValue("backgroundColor");
		for(int i=0;i<100;i++) {
			changeColor("rgb,(0,200,0)",element,driver);
			changeColor(bgcolour,element,driver);
		}
		
	}

	private static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor='"+color+"'", element);	
	}
	
	private static void clickElementbyjs(WebElement element, WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click()", element);	
	}
	private static String gettitlebyjs(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor) driver);
		String title =js.executeScript("return document.title;").toString();
		return title;
	}
	private static String getpagetext(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor) driver);
		String pageText =js.executeScript("return document.documentElement.innerText;").toString();
		return pageText;
	}
	private static void scrollpagedow(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollheight)");
		
	}
	private static void scrollintoview(WebElement element,WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);",element);
		
	}

}
