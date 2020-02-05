package practise;
import java.util.Arrays;

public class FindDuplicate {
	
	static int findDuplicate(int[] inp) {
		int num =0;
		int[] sort = null;
		Arrays.sort(inp);
		for (int i =1;i<inp.length;i++) //[1,2,3,1] [1123]
		{
			if(inp[i-1]==inp[i])
			{
				num = inp[i];// 2 3 1
				
			}
		}
		
		return num;
		
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] b = {1,2,2,1};
	int[] c= {5,2,5,1};
       int sum =findDuplicate(b);
       int sum1 =findDuplicate(c);
       System.out.println(sum );
       System.out.println(sum1 );
	}

}
