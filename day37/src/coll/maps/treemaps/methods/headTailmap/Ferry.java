package coll.maps.treemaps.methods.headTailmap;

import java.util.TreeSet;

public class Ferry {
	
	public static void main(String[] args){
		TreeSet<Integer> times = new TreeSet<Integer>();
		times.add(1205);
		times.add(1505);
		times.add(1545);
		times.add(1830);
		times.add(2010);
		times.add(2105);
		
		//Methode headSet()
		
		TreeSet<Integer> subset = new TreeSet<Integer>();
		subset = (TreeSet)times.headSet(1600);
		//Returns a view of the portion of this 
		//set whose elements are strictly less than the value of the parameter.
		
		for (Integer depTimes : subset) {
			System.out.print(depTimes + "\t");
		}
		System.out.println();
		
		subset = (TreeSet)times.headSet(1545);
		for (Integer depTimes : subset) {
			System.out.print(depTimes + "\t");
		}
		System.out.println();
		
		//Methode tailSet()
		TreeSet<Integer> subset2 = new TreeSet<Integer>();
		subset2 = (TreeSet)times.tailSet(1545);
		// Returns a view of the portion of this set 
		// whose elements are greater than or equal to fromElement. 
		for (Integer depTimes : subset2) {
			System.out.print(depTimes + "\t");
		}
		System.out.println();
		
		//Methode subSet()
		TreeSet<Integer> subset3 = new TreeSet<Integer>();
		subset3 = (TreeSet)times.subSet(1505, 1830);
		// Returns a view of the portion of this set whose elements 
		// range from fromElement, inclusive, 
		// to toElement, exclusive. 
		// (If fromElement and toElement are equal, the returned set is empty.) 
		
		for (Integer depTimes : subset3) {
			System.out.print(depTimes + "\t");
		}
		System.out.println();
	}

}
