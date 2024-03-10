package test;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class BaseTest {
	public static WebDriver driver;
	
	String path=System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties";
	public Properties prop;
	FileInputStream fis;
  
  @BeforeSuite
  public void beforeSuite() throws IOException {
	 
	  WebDriverManager.chromedriver().setup();
	  
		 driver= new ChromeDriver();
		
		 driver.manage().window().maximize();
		 
		 //read proprties- config.propeties
		 prop=new Properties();
		 
		 fis=new FileInputStream(path);
		 
		 prop.load(fis);
		 
		 
			driver.get(prop.getProperty("url"));
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
  }

  @AfterSuite
  public void afterSuite() {
	  
	  driver.close();
  }

}
