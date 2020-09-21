package com.java.practise;

import java.util.HashMap;
import java.util.Map;

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="{[]}";
		int count=0;
		int sum=0;
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++)
		{
			if( s.charAt(i)=='{' || s.charAt(i)=='[' )
			{
				if(!hm.containsKey(s.charAt(i))) 
				{
					hm.put(s.charAt(i), count+1);
			    }
			}
			else if(s.charAt(i)==']')
			{
				count=hm.get('[');
				count=count-1;
				hm.put('[', count);
//				count=hm.get(s.charAt(i));
//				hm.put(s.charAt(i), count+1);
			}
			else if(s.charAt(i)=='}')
			{
				count=hm.get('{');
				count=count-1;
				hm.put('{', count);
			}
		}
		System.out.println(hm);
		for(Map.Entry<Character, Integer> e:hm.entrySet())
		{ 
			boolean isValid=false;
			
			
			sum=sum+e.getValue();
			
			
		}
		if(sum==0)
		{
			System.out.println("Valid Parentheses");
		}
		
	}

}
