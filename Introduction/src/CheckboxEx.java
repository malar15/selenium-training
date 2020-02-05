import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CheckboxEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().window().fullscreen();
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		checkbox.click();
		System.out.println("checkbox is checked "+ checkbox.isSelected());
		int count=driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println("The no of checkboxes " +count);
		checkbox.click();
		System.out.println("checkbox checked "+checkbox.isSelected());
//		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
//		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
//		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
//		
		driver.close();
		

	}

}
