import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		//Locators for browser elements
		
		driver.get("https:\\facebook.com");
        driver.findElement(By.id("email")).sendKeys("this is the email");
        driver.findElement(By.name("pass")).sendKeys("pwd");
  driver.findElement(By.xpath("//input[@value='Log In']")).click();
        driver.findElement(By.linkText("Forgot account?")).click();	
  
        //Another site
	
    
	
	}
}
