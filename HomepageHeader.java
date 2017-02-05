package facebookAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pageObjects.Homepage;
import pageObjects.Loginpage;



public class HomepageHeader extends Login {
	
	  public static String baseURL = "https://facebook.com";
	  public static WebDriver driver;
	  
	@BeforeMethod
	public void SetURL(){
		WebDriver driver = new FirefoxDriver();
	    driver.get(baseURL);
	}

	@Test
	public void LogoCheck(){
	Loginpage.field_Username(driver).sendKeys("callumcode@gmail.com");
	Reporter.log("01. Step Passed - Username was added to username field");
	Loginpage.field_Pwd(driver).sendKeys("testpass123");
	Reporter.log("02. Step Passed - Password was added to password field");
	Loginpage.btn_Submit(driver).submit();
	Reporter.log("03. Step Passed - Login Form was submitted successfully");
	Assert.assertTrue(driver.findElement(By.className("_19ea")).isDisplayed());
	Reporter.log("04. Step Passed - Facebook logo displays");
	Assert.assertTrue(Homepage.homepage_Search(driver).isDisplayed());
	Reporter.log("05. Step Passed - Search Bar displays");
	Assert.assertTrue(Homepage.homepage_Portrait(driver).isDisplayed());
	Reporter.log("05. Step Passed - Homepage Portrait displays");
	Assert.assertTrue(Homepage.homepage_HomeTxt(driver).isDisplayed());
	Reporter.log("06. Step Passed - Homepage Text displays");
	Assert.assertTrue(Homepage.homepage_FindFriends(driver).isDisplayed());
	Reporter.log("07. Step Passed - Find Friends displays");
	Assert.assertTrue(Homepage.homepage_FriendRequests(driver).isDisplayed());
	Reporter.log("08. Step Passed - Friend Requests displays");
	Assert.assertTrue(Homepage.homepage_PrivacyShortcuts(driver).isDisplayed());
	Reporter.log("08. Step Passed - Privacy Shortcuts displays");
	Assert.assertTrue(Homepage.homepage_DownArrow(driver).isDisplayed());
	Reporter.log("09. Step Passed - Dropdown Arrow displays");
	Reporter.log("Test Passed - Logged in and Header Content Displays");
	}
	
	@AfterMethod
	public void endSession(){
		driver.quit();
		Reporter.log("Browser was closed");
	}

}
