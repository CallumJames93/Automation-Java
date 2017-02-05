package facebookAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	
	public static WebDriver driver = new FirefoxDriver();
	
	
	public static void browser_Driver () {
		String URL = "https://www.facebook.com/";
		driver.get(URL);
		
	}
	
	public static void browser_Quit () {
		driver.quit();
	}
		
}
