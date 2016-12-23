package coll.sets.navigableSet;

import java.util.*;

public class Ferry {
	public static void main(String[] args) {

		subSets();
	}

	public static void method01() {
		TreeSet<Integer> times = new TreeSet<Integer>();
		times.add(1205); // add some departure times
		times.add(1505);
		times.add(1545);
		times.add(1830);
		times.add(2010);
		times.add(2100);
		// 1205, 1505, 1545, 1830, 2010, 2100

		NavigableSet<Integer> subset = new TreeSet<Integer>();
		subset = (NavigableSet) times.headSet(1600);
		// 1205 1505 1545

		System.out.println("subset = (NavigableSet)times.headSet(1600);");
		// Kopf ist exklusiv
		for (Integer integer : subset) {
			System.out.print(integer + " ");
		}
		System.out.println();

		System.out.println("last before 4pm is: " + subset.last());
		// "times.lower(1600): "
		NavigableSet<Integer> sub2 = new TreeSet<Integer>();
		sub2 = (TreeSet) times.tailSet(2000);
		// 2010 2100

		System.out.println("subset = (NavigableSet)times.tailSet(2000);");
		// Schwanz ist inklusiv
		for (Integer integer : sub2) {
			System.out.print(integer + " ");
		}
		System.out.println();

		System.out.println("first after 4pm is: " + subset.first());

		// LOWER
		System.out.println("times.lower(1600): " + times.lower(1600));

		// HIGHER
		System.out.println("times.higher(1600): " + times.higher(1600));

		// PollFirst
		TreeSet<Integer> times2 = new TreeSet<Integer>();
		times2.add(1205); // add some departure times
		times2.add(1505);
		times2.add(1545);
		times2.add(1830);
		times2.add(2010);
		times2.add(2100);

		for (Integer integer : times2) {
			System.out.print(integer + " ");
		}
		System.out.println("\n Der serte Eintrag");

		System.out.println(times2.pollFirst());

		System.out.println("\n NachPollfirst");
		for (Integer integer : times2) {
			System.out.print(integer + " ");
		}
		System.out.println();

	}

	public static void subSets() {
		TreeSet<Integer> times2 = new TreeSet<Integer>();
		times2.add(1205); // add some departure times
		times2.add(1505);
		times2.add(1545);
		times2.add(1830);
		times2.add(2010);
		times2.add(2100);

		NavigableSet<Integer> subset = new TreeSet<Integer>();
		subset = (NavigableSet) times2.subSet(1545, 2010);

		for (Integer integer : subset) {
			System.out.print(integer + " ");
		}
		System.out.println();

		subset.add(2030);
		//Wenn es auﬂerhalb ist, dann kracht es
		//Exception in thread "main" java.lang.IllegalArgumentException:
		//key out of range

		for (Integer integer : subset) {
			System.out.print(integer + " ");
		}
		System.out.println();
		
		for (Integer integer : times2) {
			System.out.print(integer + " ");
		}
		System.out.println();
	}
}