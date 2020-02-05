import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDP {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver=new ChromeDriver();

		driver.get("https://makemytrip.com");
 //driver.findElement(By.id("fromCity")).clear();
 driver.findElement(By.id("fromCity")).click();
 WebElement source=driver.findElement(By.xpath("//input[@placeholder='From']"));
 
 source.sendKeys("MAA");
 Thread.sleep(1000);
 source.sendKeys(Keys.ARROW_DOWN);
 source.sendKeys(Keys.ENTER);

WebElement tocity=driver.findElement(By.xpath("//input[@placeholder='To']"));
tocity.sendKeys("BAN");
Thread.sleep(1000);
tocity.sendKeys(Keys.ARROW_DOWN);
source.sendKeys(Keys.ENTER);
	}
	

}
