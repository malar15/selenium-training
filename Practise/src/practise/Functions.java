package practise;

public class Functions {
	
	
	public void add(int a , int b)
	{
		System.out.println("Calling a function");
		int c =0;
		if(a>0 && b>0)
		{
			c= a+b;
		}
		System.out.println("The addition is "+c);
		
		
	}
	public int add1(int c,int d)
	{
		int result=0;
		if(c>0 && d>0)
		{
			result = c+d;
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functions f1 = new Functions();
//		f1.add(1,1);
//		f1.add(-1, -2);
//		f1.add(-1,  3);
		int res = f1.add1(21, 31);
		System.out.println(res);
		

	}

}
