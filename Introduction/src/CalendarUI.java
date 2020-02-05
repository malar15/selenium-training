import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.id("travel_date")).click();
		driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("December");
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("April"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
		List<WebElement> datelist =driver.findElements(By.cssSelector(".day"));
		int size=driver.findElements(By.cssSelector(".day")).size();
		for (int i=0;i<size;i++)
		{
			String text =driver.findElements(By.cssSelector(".day")).get(i).getText();
			if(text.equalsIgnoreCase("27"))
			{
			driver.findElements(By.cssSelector(".day")).get(i).click();
			break;
		    }
		}

	}

}
