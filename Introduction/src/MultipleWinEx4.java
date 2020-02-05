import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWinEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
		System.out.println("The First window is "+driver.getTitle());
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		Set<String> id =driver.getWindowHandles();
		Iterator<String> it=id.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		System.out.println("The text in new window"+driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());
		System.out.println("The New window is "+driver.getTitle());
		driver.switchTo().window(parent);
		System.out.println("Switching Back to Parent");
		System.out.println("The parent text is "+driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());
		driver.close();
	}

}
