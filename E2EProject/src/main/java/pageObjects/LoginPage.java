package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LoginPage  {

	
	WebDriver driver;
	
	
	By email = By.cssSelector("#user_email");
	By pwd = By.cssSelector("#user_password");
	By submit = By.cssSelector("input[type='submit']");
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver= driver;
	}

	public WebElement getlogin() {
		return driver.findElement(email);
	}
	public WebElement getpassword() {
		return driver.findElement(pwd);
	}
	
	public WebElement submit() {
		return driver.findElement(submit);
	}
}
