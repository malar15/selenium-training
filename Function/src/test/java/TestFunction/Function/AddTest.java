package TestFunction.Function;

import org.junit.Test;

import junit.framework.Assert;

public class AddTest {
	@Test
	public void addTest()
	{
		App a = new App();
		int res = a.add1(2, 3);
	Assert.assertEquals(6, res);
		
	}
	@Test
	public void addTest1()
	{
		
	}

}
