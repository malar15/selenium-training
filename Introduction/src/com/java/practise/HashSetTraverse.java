package com.java.practise;

import java.util.HashSet;

public class HashSetTraverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet<String>();
		set.add("a");
		set.add("ab");
		set.add("abc");
		set.add("ab");
		set.add("abcd");
		for(String s:set)
		 System.out.println(s);
	}

}
