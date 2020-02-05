import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver=new ChromeDriver();

		driver.get("https://spicejet.com");
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount'")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount'")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount'")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
	    driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		for(int i =1;i<5;i++)
		{
		driver.findElement(By.id("hrefIncAdt")).click();
		}
	
		driver.findElement(By.id("btnclosepaxoption")).click();
		String text= driver.findElement(By.id("divpaxinfo")).getText();
		System.out.println(text);
	//Assert.assertEquals(text, "5 Adult");
		driver.close();
		
		
		////div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[@value='BLR'] parent-child unique 
	}
	////div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='BLR']
}
