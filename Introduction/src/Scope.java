import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerdriver =driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		WebElement col1=footerdriver.findElement(By.xpath("//td[1]//ul[1]"));
		System.out.println(col1.findElements(By.tagName("a")).size());
		int colsize=col1.findElements(By.tagName("a")).size();
		for(int i=1;i<colsize;i++)
		{
			String ctrl=Keys.chord(Keys.COMMAND,Keys.ENTER);
			col1.findElements(By.tagName("a")).get(i).sendKeys(ctrl);;
			Thread.sleep(5000);
			
			
		
		}
		Set<String> win =driver.getWindowHandles();
		Iterator<String> it = win.iterator();
		while(it.hasNext())
		{
			String child =it.next();
			System.out.println("The page title is "+driver.switchTo().window(child).getTitle());
		}
		
	}

}
