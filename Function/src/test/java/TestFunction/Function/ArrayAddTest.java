package TestFunction.Function;

import org.junit.Test;

import junit.framework.Assert;

public class ArrayAddTest {
	@Test
	public void arrayAddtest()
	{
		int a1[]= {1,2,2,4,5,7};
		ArrayAddition a= new ArrayAddition();
		int result=a.arrayAdd(a1);
		Assert.assertEquals(21, result);
	}

}
