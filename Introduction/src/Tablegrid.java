import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablegrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20716/eng-vs-aus-2nd-test-the-ashes-2019	");
		WebElement table=driver.findElement(By.xpath("	(//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])[3]"));
		int size=table.findElements(By.cssSelector("div[id='innings_2'] div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		System.out.println(size);
		int count=table.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']/div[3]")).size();
		System.out.println(count);
		
		
        for (int i=0;i<size-2;i++)
        {
        	System.out.println(table.findElements(By.cssSelector("div[id='innings_2'] div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
        }
	}

}
