package coll.sets.hashSet.setsI;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * Jedes Element kann in einem Set nur einmal enthalten werden
 *
 */
public class DemoHashSet {

	public static void main(String[] args) {
		Set<String> anmeldungen = new HashSet<String>();
		
		anmeldungen.add("Anja");
		anmeldungen.add("Karl");
		anmeldungen.add("Christina");
		
		anmeldungen.add("Anja");
		//Anja wird zum zweiten mal hinzugef�gt
		
		System.out.println(anmeldungen.size());
		
		anmeldungen.add(null);
		//Null f�hrt zu keinem Null Pointer Exception

		for (String name : anmeldungen) {
			System.out.println(name);
		}
		
		System.out.println(anmeldungen.size());

	}

}
