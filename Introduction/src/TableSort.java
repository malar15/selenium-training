import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TableSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("tr th:nth-child(3)")).click();
		//driver.findElement(By.cssSelector("tr th:nth-child(3)")).click();
		List<WebElement> list1=driver.findElements(By.cssSelector("tr td:nth-child(3)"));
        sort(list1,"desc","integer");
	}
	public static void sort(List <WebElement> list1,String order,String format)
	{
	 ArrayList<String> textlist = new ArrayList<String>();
     for (int i=0;i<list1.size();i++)
     {
     	textlist.add(list1.get(i).getText());
     	System.out.println(list1.get(i).getText());
     }
     ArrayList<String> copiedlist = new ArrayList<String>();
     for(int i=0;i<textlist.size();i++)
     {
     	copiedlist.add(textlist.get(i));
     }
     //for interger use Arrays.sort
     if(format.equalsIgnoreCase("integer"))
     {
     System.out.println("Before Sorting"+copiedlist);	 
     Arrays.sort(copiedlist.toArray());
     System.out.println("Sorted nos"+copiedlist);
     if(order.equalsIgnoreCase("desc"))
     {
     Arrays.sort(copiedlist.toArray(),Collections.reverseOrder());
     }
     
     }
     else
     {
     System.out.println(copiedlist);
     Collections.sort(copiedlist);
     if(order.equalsIgnoreCase("desc"))
     {
     Collections.sort(copiedlist,Collections.reverseOrder());
     }
     System.out.println("After sorting"+copiedlist);
     
	}
     Assert.assertEquals(textlist, copiedlist);
	}

}
