package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedInLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/saravmalar/SeleniumSoftwares/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.linkedin.com/");
		driver.findElement(By.className("nav__button-secondary")).click();
		driver.findElement(By.id("username")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.xpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button")).click();

	}

}
