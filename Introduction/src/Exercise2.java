import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exercise2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://cleartrip.com");
	    Thread.sleep(1000);
	    WebElement from =driver.findElement(By.id("FromTag"));
	    from.sendKeys("chennai");
        from.sendKeys(Keys.ARROW_DOWN);	
        from.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        WebElement to =driver.findElement(By.id("ToTag"));
        to.sendKeys("sanfransisco");
        from.sendKeys(Keys.ARROW_DOWN);	
        from.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
	    driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active ")).click();
		Select sel =new Select(driver.findElement(By.id("Adults")));
		sel.selectByValue("4");;
		Select child=new Select(driver.findElement(By.id("Childrens")));
		child.selectByIndex(1);
		Select inf=new Select(driver.findElement(By.id("Infants")));
		inf.selectByIndex(1);
		driver.findElement(By.id("MoreOptionsDiv")).click();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Emirates");
		driver.findElement(By.id("SearchBtn")).click();;
		System.out.println("The error message is "+driver.findElement(By.id("homeErrorMessage")).getText());
		
//		driver.switchTo().alert();
//		System.out.println(driver.switchTo().alert().getText());
		
//		driver.close();
	
		
	}
	

}
