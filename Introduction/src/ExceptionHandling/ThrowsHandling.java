package ExceptionHandling;

public class ThrowsHandling {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		//throws keyword handling there is no reporting - means get the message as in try catch block
		//always in method chaining 
		//program gets terminated this can handled by using try catch in another method
		//thrown one method to another method  
		//Throwable super class handles both error and exception
		//Throw keyword
		
		ThrowsHandling t=new ThrowsHandling();
		t.sum();
		System.out.println("Thrown exception in Sum method is Handled");
	}
	
	public void sum()  
	{
		try {
			div();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	}
	public void div()throws Exception 
	{
		int i = 9/0;
	}

}
