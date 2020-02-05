package practise;
import java.util.Scanner;

public class addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Input numbers");
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = 0 ;
		
		if (num1 >0 && num2>0 )
		{
			
			num3=num1+num2;
		    
		}
		System.out.println("The user input addition is : "+num3);
		

	}

}
