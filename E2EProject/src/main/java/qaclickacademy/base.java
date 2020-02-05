package qaclickacademy;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
public WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException 
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("/Users/saravmalar/E2EProject/src/main/java/Data.properties");
		prop.load(fis);
		String browsername=prop.getProperty("browser");
		
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


}
