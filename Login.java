package facebookAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Loginpage;

public class Login {
	
	  public static String baseURL = "https://facebook.com";
	  public WebDriver driver;
	  
	  @Test (priority = 0)
	  public void FailedLogin() {
	    WebDriver driver = Browser.driver;
		Browser.browser_Driver();
		Reporter.log("01. Step Passed - Browser was launched");
		// Fill fields in and submit form
		Loginpage.field_Username(driver).sendKeys("callumcode1@gmail.com");
		Reporter.log("02. Step Passed - Username was added to username field");
		Loginpage.field_Pwd(driver).sendKeys("testpass123");
		Reporter.log("03. Step Passed - Password was added to password field");
		Loginpage.btn_Submit(driver).submit();
		Reporter.log("04. Step Passed - Login Form was submitted successfully");
		// Wait and assert on the Failed Login Title
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertTrue(driver.findElement(By.className("_50f6")).isDisplayed());
		Reporter.log("Test Passed - User was not logged in correct page was displayed");
	  }
	
  @Test (priority = 1)
  public void NormalLogin() {
		Functions NormLog = new Functions();
		NormLog.AccountLogin();
	    Reporter.log("Test Passed - User was logged in");
  }

    
}
