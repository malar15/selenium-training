import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qaclickacademy.com/practice.php");
		driver.findElement(By.id("checkBoxOption1")).click();
		
		String label = driver.findElement(By.id("checkBoxOption1")).getText();
		String label1 = driver.findElement(By.id("checkBoxOption1")).getAttribute("value");
		System.out.println("The selected checkbox label is "+label);
		System.out.println("The selected checkbox label is "+label1);
		//driver.findElement(By.id("dropdown-class-example")).click();
		Select s =new Select (driver.findElement(By.id("dropdown-class-example")));
		s.selectByValue(label1);
		driver.findElement(By.id("name")).sendKeys(label1);
		driver.findElement(By.id("alertbtn")).click();
		String alertText=driver.switchTo().alert().getText();
		System.out.println("The alert message is "+alertText);
		boolean option1 = alertText.contains(label1);
		if (option1==true)
		{
			System.out.println("The alert message contains the selected option");
		}
		
		
		
		
		

	}

}
