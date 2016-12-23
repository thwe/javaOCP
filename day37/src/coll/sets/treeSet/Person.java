package coll.sets.treeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class Person /*implements Comparable<Person>*/{

//	@Override
//	public int compareTo(Person o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

	static class PersonComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return 0;
	}
		
	}
	
	
	static PersonComparator createPersonComp(){
		return new PersonComparator();
	}
	
	
}
