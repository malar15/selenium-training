package com.java.practise;

import java.util.Arrays;

public class FindMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Find the maximum in the list of integers 
				// Input = 3,6,8,9,23
				// Output = 23
		
		int[] a= {3,6,8,9,23};
		int max=0;
		int max2=0;
		for(int i=0;i<a.length;i++)

		{
			if(a[i]>max)
			{
				max2=max;
				max=a[i];//3
				
			}
			else if(a[i]>max2)
			{
				max2=a[i];
			}
		}
		System.out.println(max);
		System.out.println(max2);
		Arrays.asList(a);
	}

}
