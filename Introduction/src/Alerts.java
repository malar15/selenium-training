import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.findElement(By.xpath("//div[@class='display']//form//input" )).click();
       System.out.print( driver.switchTo().alert().getText());
     //  driver.switchTo().alert().sendKeys(arg0); for edit box
		driver.switchTo().alert().accept();;
	}

}
