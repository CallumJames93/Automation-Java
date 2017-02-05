package facebookAutomation;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.Homepage;

public class Posting {
	
	private WebDriver driver;

  
	@Test
	public void MakeStatus() {
		Functions NormLog = new Functions();
		NormLog.AccountLogin();
		WebDriver driver = Browser.driver;
		Browser.browser_Driver();
		Reporter.log("PreReq Passed - User was logged in");
		Homepage.txtField_Status(driver).click();
		driver.switchTo().activeElement();
		Homepage.txtField_Status(driver).sendKeys("Test");
		Reporter.log("Step 1 Passed - User can click the status text field");
	}

}
