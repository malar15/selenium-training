import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://spicejet.com");
		
		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
        s.selectByValue("AED");
        //s.deselectByIndex(3);
       // s.selectByVisibleText("INR");
	}

}
