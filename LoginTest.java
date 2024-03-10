package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.LoginPage;



public class LoginTest extends BaseTest {
	
	public LoginPage lp;
	
	@BeforeSuite 
	public void init() {
		
	
			lp=new LoginPage(driver);
	}
	
	
	@Test
	public void login() {
		
		lp.getUsernameTab().sendKeys("Admin");
		lp.getPasswordTab().sendKeys("admin123");
		lp.getButton().click();
	}
	
	@AfterClass
	public void tearDown() {
		
		//driver.close();
	}


}
