package facebookAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pageObjects.Loginpage;

public class Footer {
	
  @Test (priority = 1)
  public void LanguagesDisplay() {
	  // Launch Facebook
	  Browser browserSession = new Browser();
	  WebDriver driver = browserSession.driver;
	  Browser.browser_Driver();
	  // 1 - English
	  Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='pageFooter']/ul/li[1]")).isDisplayed());
	  Reporter.log("Step 1 Passed - English language link displays");
	  // 2 - Polish
	  Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='pageFooter']/ul/li[2]/a")).isDisplayed());
	  Reporter.log("Step 2 Passed  - Polish language link displays"); 
	  // 3 - Spanish
	  Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='pageFooter']/ul/li[3]/a")).isDisplayed());
	  Reporter.log("Step 3 Passed  - Spanish language link displays");
	  // 4 - French
	  Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='pageFooter']/ul/li[4]/a")).isDisplayed());
	  Reporter.log("Step 4 Passed  - French language link displays");
	  // 5 - Italian
	  Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='pageFooter']/ul/li[5]/a")).isDisplayed());
	  Reporter.log("Step 5 Passed  - Italian language link displays ");
	  // 6 - Lithuanian
	  Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='pageFooter']/ul/li[6]/a")).isDisplayed());
	  Reporter.log("Step 6 Passed  - Lithuanian language link displays");
	  // 7 - Romanian 
	  Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='pageFooter']/ul/li[7]/a")).isDisplayed());
	  Reporter.log("Step 7 Passed  - Romanian language link displays");
	  // 8 - Portuguese 
	  Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='pageFooter']/ul/li[8]/a")).isDisplayed());
	  Reporter.log("Step 8 Passed  - Portuguese language link displays");
	  // 9 - German
	  Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='pageFooter']/ul/li[9]/a")).isDisplayed());
	  Reporter.log("Step 9 Passed  - German language link displays");
	  // 10 - Arabic
	  Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='pageFooter']/ul/li[10]/a")).isDisplayed());
	  Reporter.log("Step 10 Passed  - Arabic language link displays");
	  Reporter.log("Test Passed - All Language Links Display");
  }
  
  @Test (priority = 2)
  public void ExtendedLanguages() {
	  // Launch Facebook
	  Browser browserSession = new Browser();
	  WebDriver driver = browserSession.driver;
	  Browser.browser_Driver();
	  // Select the more languages button in Footer
	  Loginpage.btn_Languages(driver).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.switchTo().activeElement();
	  Assert.assertTrue(driver.findElement(By.className("_1yv")).isDisplayed());
	  Reporter.log("01. Step Passed - Extended language modal was launched.");
	  // Close the modal
	  Loginpage.btn_LanguageClse(driver).click();
	  Reporter.log("02. Step Passed - Extended language modal was closed.");
	  Reporter.log("Test Passed - More Languages Popup Displays");
  } 
  
  @Test (priority = 3)
  public void FooterContent() {
	  // Launch Facebook
	  Browser browserSession = new Browser();
	  WebDriver driver = browserSession.driver;
	  Browser.browser_Driver();
	  // 01 - Test sign up displays.
	  Assert.assertTrue(driver.findElement(By.xpath("")).isDisplayed());
	  Reporter.log("01 - ");
	  // 02
	  Assert.assertTrue(driver.findElement(By.xpath("")).isDisplayed());
	  Reporter.log("02 - ");
	  // 03
	  Assert.assertTrue(driver.findElement(By.xpath("")).isDisplayed());
	  Reporter.log("03 - ");
	  // 04
	  Assert.assertTrue(driver.findElement(By.xpath("")).isDisplayed());
	  Reporter.log("04 - ");
	  // 05
	  Assert.assertTrue(driver.findElement(By.xpath("")).isDisplayed());
	  Reporter.log("05 - ");
	   // 06
	  Assert.assertTrue(driver.findElement(By.xpath("")).isDisplayed());
	  Reporter.log("06 - ");
       // 07
	  Assert.assertTrue(driver.findElement(By.xpath("")).isDisplayed());
	  Reporter.log("07 - ");
	  // 08
	  Assert.assertTrue(driver.findElement(By.xpath("")).isDisplayed());
	  Reporter.log("08 - ");
	  // 09
	  Assert.assertTrue(driver.findElement(By.xpath("")).isDisplayed());
	  Reporter.log("09 - ");
	  // 10
	  Assert.assertTrue(driver.findElement(By.xpath("")).isDisplayed());
	  Reporter.log("10 - ");  
	  // 11
	  Assert.assertTrue(driver.findElement(By.xpath("")).isDisplayed());
      Reporter.log("11 - ");
	  // 12
	  Assert.assertTrue(driver.findElement(By.xpath("")).isDisplayed());
	  Reporter.log("12 - ");
	  // 13
	  Assert.assertTrue(driver.findElement(By.xpath("")).isDisplayed());
	  Reporter.log("13 - ");
	  // 14
	  Assert.assertTrue(driver.findElement(By.xpath("")).isDisplayed());
	  Reporter.log("14 - ");
	  // 15
	  Assert.assertTrue(driver.findElement(By.xpath("")).isDisplayed());
	  Reporter.log("15 - ");
	  // 16
	  Assert.assertTrue(driver.findElement(By.xpath("")).isDisplayed());
	  Reporter.log("16 - ");
	  // 17
	  Assert.assertTrue(driver.findElement(By.xpath("")).isDisplayed());
	  Reporter.log("17 - ");
	  // 18
	  Assert.assertTrue(driver.findElement(By.xpath("")).isDisplayed());
	  Reporter.log("18 - ");
	  // 19
	  Assert.assertTrue(driver.findElement(By.xpath("")).isDisplayed());
	  Reporter.log("19 - ");
	  // 20
	  Assert.assertTrue(driver.findElement(By.xpath("")).isDisplayed());
	  Reporter.log("20 - ");
	  // 21
	  Assert.assertTrue(driver.findElement(By.xpath("")).isDisplayed());
	  Reporter.log("21 - ");
	  // 22
	  Assert.assertTrue(driver.findElement(By.xpath("")).isDisplayed());
	  Reporter.log("22 - ");
	  // 23
	  Assert.assertTrue(driver.findElement(By.xpath("")).isDisplayed());
	  Reporter.log("23 - ");
	  // 24
	  Assert.assertTrue(driver.findElement(By.xpath("")).isDisplayed());
	  Reporter.log("24 - ");
	  // 25
	  Assert.assertTrue(driver.findElement(By.xpath("")).isDisplayed());
	  Reporter.log("25 - ");

  } 
  
}
