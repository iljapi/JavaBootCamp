package sef.module9.activity;
//Needs to be completed

import com.sun.source.tree.NewArrayTree;

import java.util.List;
import java.util.ArrayList;

public class ListActivity {

	public static void main(String[] args) {
			//1 - Type code to create a list of names. Use ArrayList.
			List<String> listOfNames = new ArrayList<>();
		listOfNames.add("Cat");
		listOfNames.add("Dog");
		listOfNames.add("Fish");

		//2 - Call print method to print the list passed as its parameter.
		print(listOfNames);
	}

	static void print(List <String> list)
	{
		for (String name : list){
			System.out.println(name);
		}
		//3 - Type code to print this list
		//Notice the order in which elements get printed.

	}
}
