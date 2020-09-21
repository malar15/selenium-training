package ExceptionHandling;

public class ExceptionHandling {
	 static int i = 1;
	private int j;
	private static ExceptionHandling eh;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		try {
		 i=9/0;  //uncaught exception
		}
		catch(Exception e)
		{
			//System.out.println("Catched exception is "+e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println(i);
		
		//caught exception
		Thread.sleep(2000);
		//eh = new ExceptionHandling();
		eh=null;
		System.out.println(eh.j);
		System.out.println(ExceptionHandling.i);
		
		//try -catch block
		//throws
	}

}
