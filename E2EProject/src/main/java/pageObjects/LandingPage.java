package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LandingPage  {

	
	WebDriver driver;
	
	
	By signin = By.cssSelector("a[href*='sign_in']");
	By title= By.cssSelector("div[class='text-center']");
	By contact = By.xpath("//a[contains(text(),'Contact')]");
	By header =By.cssSelector("div[class*='video-banner'] h3");
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
	}

	public WebElement getlogin() {
		return driver.findElement(signin);
	}
	public WebElement getTitle() {
		return driver.findElement(title);
	}
	public WebElement getContact() {
		return driver.findElement(contact);
	}
	public WebElement getHeader() {
		return driver.findElement(header);
	}
}
