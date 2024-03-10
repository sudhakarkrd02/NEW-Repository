package utlilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	
	public static void captureScrenShot(WebDriver driver, String name) throws IOException {
		
		TakesScreenshot tss=(TakesScreenshot)driver;
				
				File source=tss.getScreenshotAs(OutputType.FILE);
				
				File destination=new File(System.getProperty("user.dir")+"\\Screenshots\\"+name+".png");
				
				FileHandler.copy(source, destination);
				
				System.out.println("Screenshot captured");
			
				
			}

}
