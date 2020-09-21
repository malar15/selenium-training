package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//throw keyword is used when throw a custom exception 
		//throw keyword surrounded by try catch block
		try {
		throw new Exception("My Own Exception");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		String flag="Y";
		try {
		throw new Exception("Flag Exception");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		throw new Exception("MyException");
		//System.out.println();//throw surround by try catch block
	}

}
