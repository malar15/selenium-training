package resources;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class base {
	
public  static WebDriver driver;
public Properties prop;
	
	public WebDriver initializeDriver() throws IOException 
	{
		 prop = new Properties();
		FileInputStream fis = new FileInputStream("/Users/saravmalar/E2EProject/src/main/java/Data.properties");
		prop.load(fis);
		String browsername=prop.getProperty("browser");
		//String browsername=System.getProperty("browser");
		if(browsername.equalsIgnoreCase("chrome") ){
			System.setProperty("webdriver.chrome.driver", "chromedriver");
			 driver=new ChromeDriver();
			
		}
		else if (browsername.equalsIgnoreCase("firefox") ){
			
		}
		else if (browsername.equalsIgnoreCase("IE")) {
			
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	public void screenshot(String name) throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(src,new File("/Users/saravmalar/test/"+name+"screenshot1.png"));
	
	}
	


}
