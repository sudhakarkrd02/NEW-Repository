package test;

import org.testng.annotations.Test;

import pages.HomePageClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class HomePageTest extends BaseTest {
	
	public HomePageClass hp;
	
	@BeforeSuite
	public void initObject() {
		
		hp=new HomePageClass (driver);
		
	}
	
  @Test
  public void logout() {
	  
	  hp.getProfileLinkElement().click();
	  hp.getLogoutLink().click();
	  
  }
  
 
}
