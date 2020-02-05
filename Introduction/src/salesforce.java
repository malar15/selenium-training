import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\login.salesforce.com");
		driver.findElement(By.id("username")).sendKeys("malar");
		driver.findElement(By.name("pw")).sendKeys("malar123");
		driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		
		String str1= driver.findElement(By.cssSelector("#error")).getText();
		System.out.println("The error is " + "'"+str1+"'");
		driver.findElement(By.cssSelector("#rememberUn")).click();
		
		//validate the xPath
		driver.findElement(By.xpath("//*[@id='forgot_password_link']")).click();
		driver.close();

	}

}
