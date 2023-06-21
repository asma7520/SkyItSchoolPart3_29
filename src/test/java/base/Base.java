package base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;// driver declaration

	

	public static void navigateURL(String url) throws InterruptedException {
		Thread.sleep(2000);
		driver.get(url);
	}

	public static void click(By locator) throws InterruptedException {
		driver.findElement(locator).click();
	}

	public static void sendkeys(By locator, String value) throws InterruptedException {
		driver.findElement(locator).sendKeys(value);
	}

	public static void clear(By object) throws InterruptedException {
	driver.findElement(object).clear();
	}
	
	public static void select(By object) {
		driver.findElement(object).click();
	}

	public static String getElementText(By locator) {
		// Get the text of the Element (H3) Expert Teacher
		// locate that element

		String s = driver.findElement(locator).getText();
		// WebElement element = driver.findElement( locator);
		// get the text of that element
		// String s = element.getText();
		return s;
	}
	
	public static String getattributeValue(By locator,String value) throws InterruptedException {
	String s = driver.findElement(locator).getAttribute(value);
		return s;
	}
	



}
