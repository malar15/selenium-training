import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class endtoend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[contains(@id,'login')]")).sendKeys("malar");
		driver.findElement(By.xpath("//input[contains(@name,'wd')]")).sendKeys("malar123");
		driver.findElement(By.cssSelector("input[title*='Sign']")).click();;
		//driver.findElement(By.cssSelector("a[title*='Create']")).click();
	}

}
