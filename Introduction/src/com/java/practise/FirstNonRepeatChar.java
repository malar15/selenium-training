package com.java.practise;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String st=s.nextLine();
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(int i=0;i<st.length();i++)
		{
			if(hm.containsKey(st.charAt(i)))
			{
				hm.put(st.charAt(i), hm.get(st.charAt(i))+1);
			}
			else
			{
				hm.put(st.charAt(i), 1);
			}
		}
		for(char tr:hm.keySet())
		{
			if(hm.get(tr)==1)
			{
				System.out.println(tr);
			}
		}
		
	}

}
