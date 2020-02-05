package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class basic3 {
	@AfterTest
	public void exit()
	{
		System.out.println("Execution after the test block");
	}
	@Test
	public void carlogin() {
		System.out.println("Weblogin Carloan");
	}
	@Test
	public void houselogin() {
		System.out.println("Mobile Login House Loan");
	}
	@Test
	public void loginAPI() {
		System.out.println("Login API House loan");
	}
}
