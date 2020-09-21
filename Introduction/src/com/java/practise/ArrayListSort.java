package com.java.practise;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayListSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names=new ArrayList<String>();
		names.add("John");
		names.add("Anna");
		names.add("Lara");
		names.add("Stacy");
		Comparable<String> c;
		//Collections.sort(names);//sort the list in ascending order 
		names.add(3, "Alex");
		//Collections.reverse(names);;//sort the list in descending order
		//Collections.sort(names,Collections.reverseOrder());//another way of displaying in descending order
		for(String s:names)
		{
			System.out.println(s);
		}
		System.out.println("Getting the value of index 3: "+names.get(3));
		System.out.println();
		System.out.println("After removing the element "+names.remove(3));
		
		for(String s:names)
		{
			System.out.println(s);
		}

	}

}
