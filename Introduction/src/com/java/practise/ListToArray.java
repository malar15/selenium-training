package com.java.practise;

import java.util.ArrayList;

public class ListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names=new ArrayList<String>();
		names.add("John");
		names.add("Joe");
		names.add("Lara");
		names.add("Stacy");
		String a[]=new String[names.size()];
		for(int i=0;i<a.length;i++)
		{
			a[i]=names.get(i);
			System.out.println(a[i]);
		}
	}

}
