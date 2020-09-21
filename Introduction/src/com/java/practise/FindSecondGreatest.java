package com.java.practise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindSecondGreatest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Print name of Students in ascending order of their names who have scored 2nd highest marks.
			Berry
			6
			Herry
			9.5
			Lerry
			5
			Merry
			9.5
			Cherry
			9.5
			Kerry
			9.8
		 */
		
		// Find the maximum in the list of integers 
		// Input = 3,6,8,9,23
		// Output = 23
		
		// Find the 2nd maximum in the list of integers 
		// Input = 3,6,8,9,23
		// Output = 9
				
		
		HashMap<String,Double> hm=new LinkedHashMap<String,Double>();
		hm.put("Berry", 6.0);
		hm.put("Herry",9.5);
		hm.put("Lerry", 5.0);
		hm.put("Merry",9.5);
		hm.put("Cherry",9.5);
		hm.put("Kerry",9.8);
		System.out.println(hm);
		
		ArrayList<Double> values=new ArrayList<Double>();
		for(Double d:hm.values())
		{
			values.add(d);
		}
		double max = 0;
		double max2=0;
		
		for(double d:values)
		{
			
			if(d>max)
			{
				max2=max;
				max=d;
			}
			else if (d>max2)
			{
				max2=d;
			}
		}
		//System.out.println(max+" "+max2);
		ArrayList<String> keys=new ArrayList<String>();
		for(Map.Entry<String, Double> e :hm.entrySet())
		{
			
			if(e.getValue()==max2)
			{
				keys.add(e.getKey());
			//System.out.println(e.getValue()+" "+e.getKey());
			}
			
		}
		Collections.sort(keys);
		System.out.println("Second score Candidates are :"+keys);
	}

}
