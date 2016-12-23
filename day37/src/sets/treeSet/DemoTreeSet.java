package coll.sets.treeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class DemoTreeSet {

	public static void main(String[] args) {
		TreeSet<Person> ts = new TreeSet<Person>();
		Person p1 = new Person();
		ts.add(p1);
		Person p2 = new Person();
		//ts.add(p2);
		//Krachen tut erst beim zweiten Einfügen
		
		//Zweite Option
		Comparator comp = Person.createPersonComp();
		TreeSet<Person> ts2 = new TreeSet<Person>(comp);
		ts2.add(p1);
		ts2.add(p2);
	}
}
