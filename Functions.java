package facebookAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import pageObjects.Loginpage;

public class Functions {
	
	  public WebDriver driver;
	
	  public void AccountLogin(){
			WebDriver driver = Browser.driver;
			Browser.browser_Driver();
			Reporter.log("01. Step Passed - Browser was launched");
		    Loginpage.field_Username(driver).sendKeys("callumcode@gmail.com");
			Reporter.log("02. Step Passed - Username was added to username field");
			Loginpage.field_Pwd(driver).sendKeys("testpass123");
			Reporter.log("03. Step Passed - Password was added to password field");
			Loginpage.btn_Submit(driver).submit();
			Reporter.log("04. Step Passed - Login Form was submitted successfully");
			WebElement pageTitle = driver.findElement(By.className("_2md"));
		    Assert.assertTrue(pageTitle.isDisplayed());
		    Reporter.log("05 - User was logged in");
	  }

}
