import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablegridEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		int rowsize=driver.findElements(By.xpath("//table[@id='product']//tbody//tr")).size();
		int colsize =driver.findElements(By.xpath("//table[@id='product']//tbody//tr//th")).size();
		System.out.println(rowsize);
		System.out.println(colsize);
		System.out.println(driver.findElement(By.xpath("//table[@id='product']/tbody/tr[3]")).getText());


	}

}
