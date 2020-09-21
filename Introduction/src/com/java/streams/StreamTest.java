package com.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StreamTest {
	//count the no of names starting with letter A in list
	@org.testng.annotations.Test
	public  void test1() {
		// TODO Auto-generated method stub
		List<String> names=new ArrayList<String>();
		int count = 0;
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekya");
		names.add("Adam");
		names.add("Ram");
		for(String s:names)
		{

			if(s.startsWith("A"))
			{
			
			count++;
			
			}
			
		}
		System.out.println(count);
	}
	@org.testng.annotations.Test
	public void streamFilter()
	{
		List<String> names=new ArrayList<String>();
		//int count = 0;
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekya");
		names.add("Adam");
		names.add("Ram");
		
		System.out.println("Terminal operation "+names.stream().filter(s->s.startsWith("A")).count());//lambda expression
		//there is no life for intermediate operation if there is no terminal operations
		//terminal operation will execute only if filter returns true.
		//we can create stream using Stream API package
		//how to filter using stream API
		long d=Stream.of("Abhijeet","Don","Alekya").filter(s->
		{
			s.startsWith("A");
			return false;
		}).count();
		System.out.println("Stream API "+d);
		//print all the names in arraylist
		//create a sub stream and do for each to print the names
		
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println("Names with length 4 "+s));
		//limits your result as per limit parameters
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println("One name with length 4 "+s));
	}
	@Test
	public void streamMap()
	{
		//print names with 'A' ending as uppercase
		Stream.of("Abhijeet","Don","Alekya","Adam","Rama").filter(s->s.endsWith("a")).map
		(s->s.toUpperCase()).forEach(s->System.out.println(s));;
		
		//terminal operation sort
		System.out.println("***********Sort Operation****************");
		List<String> names=Arrays.asList("Azbhijeet","Don","Alekya","Adam","Rama");
		names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));;
		
		//concat two stream and display them
		List<String> name=new ArrayList<String>();
		//int count = 0;
		name.add("men");
		name.add("women");
		name.add("dave");
		System.out.println();
		System.out.println("******Concat of two Streams********");
		Stream<String >newStream=Stream.concat(name.stream(), names.stream());
		boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
		Assert.assertTrue(flag);
		//newStream.sorted().forEach(s->System.out.println(s));
		//java.lang.IllegalStateException: stream has already been operated upon or closed
		
	}

}
