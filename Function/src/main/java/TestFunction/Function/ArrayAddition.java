package TestFunction.Function;

public class ArrayAddition {
	
	public int arrayAdd(int a[])

	{
		int res =0;
		
		for (int i =0;i<a.length;i++)
		{
			res= res+a[i];
		}
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[]= {1,2,2,4,5,7};
		ArrayAddition a= new ArrayAddition();
		int result=a.arrayAdd(a1);
		System.out.println("Addition of Arrays :" + result);

	}

}
