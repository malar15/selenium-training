import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestiveEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		driver.findElement(By.id("autocomplete")).sendKeys("IND");
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		//String text=driver.findElement(By.id("autocomplete")).getText();
		
       // System.out.println(text);
        JavascriptExecutor js=(JavascriptExecutor) driver;
        String script = "return document.getElementById(\'autocomplete\').value;";
        String value=(String) js.executeScript(script);
        System.out.println(value);
        
	}

}
