import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingchildwindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signup");
		
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
		System.out.println(driver.getTitle());
		
		Set<String>id=driver.getWindowHandles();
		Iterator<String> it=id.iterator();
		it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
	}

}
