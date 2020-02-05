package practise;

public class Palindrome {
	
	static void palindrome(String name) {
		
		
		int len = name.length();
		char[] str = new char[len] ;
		for (int i =0;i<len;i++)
		{
			//System.out.println(name.charAt(i));
	
			str[i]=name.charAt(i);
	
		}
		System.out.println(str);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		palindrome("madam");

	}

}
