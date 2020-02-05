package qaclickacademy;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import org.testng.annotations.Test;

import pageObjects.LandingPage;

import resources.base;

public class TitleValidation extends base{
	public static Logger log = LogManager.getLogger(base.class.getName());
	LandingPage title;
	@BeforeTest
	public void initialize() throws IOException
	{
		driver =initializeDriver();
		log.info("Driver Initialized");
		driver.get(prop.getProperty("url"));
	}
	
	
	
	@Test
	public void basePageNavigation() throws IOException
	{
		
		
		 title = new LandingPage(driver);
		AssertJUnit.assertEquals(title.getTitle().getText(), "FEATURED COURSES");
		
		AssertJUnit.assertTrue(title.getContact().isDisplayed());
	}
	@Test
	public void validateHeader()
	{
		AssertJUnit.assertEquals(title.getHeader().getText(),"An academy to learn everything about testing");
	}
	
	@AfterTest
	public void close() {
		driver.close();
		driver = null;
	}
	

}
