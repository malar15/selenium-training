import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.findElement(By.cssSelector("#username")).sendKeys("malar");
		driver.findElement(By.cssSelector("#password")).sendKeys("malar");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
	}

}
