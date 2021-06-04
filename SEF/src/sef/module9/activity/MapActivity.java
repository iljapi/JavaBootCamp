package sef.module9.activity;
//Needs to be completed

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapActivity {

	static String temp = "My Testing";

	public static void main(String[] args) {
		//1 - Type code to create a HashMap of key value pair
		//where key is id of type String and value is a name
		Map map = new HashMap();
		map.put("A", "A String");
		map.put("B", "B String");
		map.put("C", "C String");
		map.put("D", "D String");


//		print(temp);
//		print1(10);
//		print2(temp);
//		print3(temp);
		//2 - Call print method to print the map passed as its parameter.
		print(map);

	}
	static void print(Map map)
	{
		//Keys are maintained as set in map.
		Set keySet = map.keySet();

		//You can use an iterator to access keys
		System.out.println("*************************************");
		System.out.println("ID \tName");
		Iterator it=keySet.iterator();
		while(it.hasNext())
		{
			String key=(String)it.next();
			System.out.println(key+"\t"+map.get(key));
		}

		System.out.println("*************************************");

	}



	static void print(String test)
	{
		int temp = Integer.valueOf(test);

		System.out.println(test.toUpperCase());

	}
	static void print1(int a)
	{
		//int a = 10;
		for (int i = 0 ; i< a; i++) {




		}

	}
	static void print2(String test)
	{
		int temp = Integer.valueOf(test);

		System.out.println(test.toUpperCase());

	}
	static void print3(String test)
	{
		int temp = Integer.valueOf(test);

		System.out.println(test.toUpperCase());

	}
}