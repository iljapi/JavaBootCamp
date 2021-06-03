package sef.module9.activity;

//Needs to be completed
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
public class SetActivity {

	public static void main(String[] args) {
		//1 - Type code to create a set of names.
		//Names must be sorted by their natural order.
		//Do research to find if you already have such a class.
		//Also try adding a few duplicate entries to this set.
		Set listOfNames = new HashSet();
		listOfNames.add("Cat");
		listOfNames.add("Dog");
		listOfNames.add("Cat");
		listOfNames.add("Cat1");
		listOfNames.add("Dog1");
		listOfNames.add("Cat2");
		//2 - Call print method to print the set passed as its parameter.
		print(listOfNames);

	}

	static void print(Set set) {
		//3 - Type code to print this set
		//Notice the order in which elements get printed.
		Iterator<String> it = set.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());

		}
	}
}