package com.java.practise;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import java.util.TreeMap;


public class HashMapSortByKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * TreeMap is a key,value pair uses tree data structure to store keys as nodes and sort keys 
		 * using red black tree algorithm  sorts keys in ascending order
		 
		 */
		HashMap<String, Double> hm=new LinkedHashMap<String,Double>();
		hm.put("Berry", 6.0);
		hm.put("Herry",9.5);
		hm.put("Lerry", 5.0);
		hm.put("Merry",9.5);
		hm.put("Cherry",9.5);
		hm.put("Kerry",9.8);
		System.out.println("Before Sorting");
		System.out.println("--------------");
		for(Map.Entry<String, Double> m:hm.entrySet())
		{
			System.out.print(m.getKey() + ":");
			System.out.println(m.getValue());
			
		}
		System.out.println();
		System.out.println("After Sorting");
		System.out.println("-------------");
		Map<String,Double> map =new TreeMap<String,Double>(hm);
		for(Map.Entry<String, Double> e:map.entrySet())
		{
			System.out.print(e.getKey() + ":");
			System.out.println(e.getValue());
		}
		
	}

}
