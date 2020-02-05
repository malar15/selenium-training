package qaclickacademy;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base{
	
	public static Logger log = LogManager.getLogger(HomePage.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
		driver =initializeDriver();
		
	}
	@Test(dataProvider="getData")
	public void basePageNavigation(String username,String password) throws IOException
	{
		
		driver.get(prop.getProperty("url"));
		
		LandingPage l = new LandingPage(driver);
		l.getlogin().click();
		LoginPage login = new LoginPage(driver);
		login.getlogin().sendKeys(username);;
		login.getpassword().sendKeys(password);
		login.submit().click();
		log.info("Login Page");
	}
	
	@AfterTest
	public void close() {
		driver.close();
		driver = null;
	}
	
	
	@DataProvider
	public Object getData()
	{
		Object[][] data = new Object[2][2];
		data[0][0]="user@gmai.com";
		data[0][1]="1234";
		data[1][0]="user@gmai.com";
		data[1][1]="1234";
		return data;
		
	}
	

}
