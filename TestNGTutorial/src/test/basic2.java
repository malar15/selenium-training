package test;

import org.testng.annotations.Test;

public class basic2 {

	@Test
	public void login() {
		System.out.println("Weblogin");
	}
	@Test
	public void mobilelogin() {
		System.out.println("Mobile Login");
	}
	@Test
	public void mobileloginout() {
		System.out.println("Mobile logout");
	}
	@Test
	public void mobileprop() {
		System.out.println("Mobile property");
	}
	@Test
	public void mobilenav() {
		System.out.println("Mobile Navigation");
	}
	@Test
	public void loginAPI() {
		System.out.println("Login API");
	}

}
