package com.java.practise;

import java.util.ArrayList;
import java.util.Collections;

public class IteratingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names=new ArrayList<String>();
		names.add("John");
		names.add("Joe");
		names.add("Lara");
		names.add("Stacy");
		for (String s:names)
		{
			if(names.contains("john"))
			{
			System.out.println(s);
			}
			else
				System.out.println(s);
			
		}
		Collections.sort(names);
	}

}
