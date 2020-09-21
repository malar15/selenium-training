package com.java.practise;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class ReversePairinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * The string S contains multiple words separated by a single space.   Each word can have a 
		 * corresponding reverse word in the string S.
		 * Find all pairs where word and its reverse both exist in string S.
			
			 Input:         car set strings lot rac toast let tes
			 Output  :    [ "car,rac", "set,tes"] 
		 
		 */
		String s ="sem mes is si car racs";
		HashMap<String,String> hm =new LinkedHashMap<String,String>();
		String[] s1=s.split(" ");
		for(int i =0;i<s1.length-1;i++)
		{
			//System.out.println(s1[i]);
			String rev=reverse(s1[i]);
			System.out.println(rev);
			for(int j=i+1;j<=s1.length-1;j++)
			{
				if(rev.equalsIgnoreCase(s1[j]))
				{
					hm.put(s1[i], s1[j]);
					
				}
			}
			
		}
		System.out.println(hm);

	}

	public static String reverse(String s1) {
		String rev = "";
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		//System.out.println(s1);
		return rev;
		// TODO Auto-generated method stub
		
	}

}
