import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class endtoendspicjet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://spicejet.com");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
//	  
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("Its enabled");
			
		}
		else
		{
			System.out.println("Its not enabled");
		}
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		Thread.sleep(1000);
		 driver.findElement(By.id("divpaxinfo")).click();
			Thread.sleep(1000);
			for(int i =1;i<5;i++)
			{
			driver.findElement(By.cssSelector("#hrefIncAdt")).click();
			}
		
			driver.findElement(By.id("btnclosepaxoption")).click();
			driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
			driver.close();
	}

}
