import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\facebook.com");
		//using customize xpath
//		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("xpath");
//        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("passowrd");
//        driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		//using customize css
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("email");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("password");
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
	}

}
