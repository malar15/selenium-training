import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
//		List<WebElement> rButtons = driver.findElements(By.xpath("//input[@name='group1']"));
//		boolean bValue = false;
//		bValue = rButtons.get(0).isSelected();
//		System.out.print("The value of the list"+bValue);
//		if(bValue==true)
//			
//		{
//			System.out.print(bValue);
//			rButtons.get(0).click();
//		}
//		else
//		{
//			rButtons.get(1).click();
//			
//		}
		
		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();
		System.out.print("The size is : " +count);
		for(int i=0;i<count;i++)
		{
			driver.findElements(By.xpath("//input[@name='group1']")).get(i);
		}
		
	}

}
