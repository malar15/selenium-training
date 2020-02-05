package test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class basics {
@Parameters({ "URL" , "username"})
@Test
	public  void demo(String urlname  ,String name) {
		// TODO Auto-generated method stub
     System.out.println("hello");
     System.out.println(urlname);
     System.out.println(name);
	}
@Test
   public void demo2() {
	System.out.println("Welcome");
	Assert.assertTrue(false);
}
@BeforeTest
 public void prerequiste()
 {
	System.out.println("Before the test case this block wil execute");
 }
@DataProvider
public void getData()
{
	//username pwd
	// another username
}

}
