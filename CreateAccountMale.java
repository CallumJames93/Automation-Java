package facebookAutomation;

import org.testng.annotations.Test;

import pageObjects.Loginpage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class CreateAccountMale {
	
  @Test 
  public void Male() {
	    // Launch Facebook
	    Browser browserSession = new Browser();
	    WebDriver driver = browserSession.driver;
	    Browser.browser_Driver();
	    // Ensure user is on Facebook
	    WebElement pageTitle = driver.findElement(By.xpath(".//*[@id='blueBarDOMInspector']/div/div/div/div[1]/h1/a/i"));
	    Assert.assertTrue(pageTitle.isDisplayed());
	    Reporter.log("01. Step Passed : Browser Opened");
	    // Send the data to the Open Account form
	    Loginpage.field_FName(driver).sendKeys("Callum");
	    Reporter.log("02. Step Passed : Firstname entered correctly");
		Loginpage.field_LName(driver).sendKeys("Gill");
		Reporter.log("03. Step Passed : Lastname entered correctly");
		Loginpage.field_Email1(driver).sendKeys("testing@hotmail.co.uk");
		Loginpage.field_Email2(driver).sendKeys("testing@hotmail.co.uk");
		Reporter.log("04. Step Passed : Email was entered correctly");
		Loginpage.field_OA_pwd(driver).sendKeys("testpass123");
		Reporter.log("05. Step Passed : Password was entered correctly");
		Select oSelect1 = new Select (Loginpage.dropdown_Day(driver));
		oSelect1.selectByIndex(1);
		Select oSelect2 = new Select (Loginpage.dropdown_Month(driver));
		oSelect2.selectByIndex(1);
		Select oSelect3 = new Select (Loginpage.dropdown_Year(driver));
		Reporter.log("06. Step Passed : DOB was entered correctly");
		oSelect3.selectByIndex(9);
		Loginpage.radio_Male(driver).click();
	    Reporter.log("Test Passed: Male Account was created successfully");
  }
  
}
