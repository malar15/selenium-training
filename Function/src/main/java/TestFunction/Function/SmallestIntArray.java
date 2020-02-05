package TestFunction.Function;

import java.util.Arrays;

public class SmallestIntArray {
	
	public int solution()
	{
		
		int result = 0;
		int a[]= {1, 3, 6, 4, 1, 2};
		Arrays.sort(a); //[1,1,2,3,4,6]
		int b[];
		int len = a.length;
		int max =0;
		for (int i =1;i<len;i++)
		{
			if(a[i-1]!=a[i])
			{
				System.out.println(a[i]);
			}
			
		}
		
		
		return max;
	}
	public static void main(String[] args)
	{
		SmallestIntArray arr= new SmallestIntArray();
		arr.solution();
	}

}
