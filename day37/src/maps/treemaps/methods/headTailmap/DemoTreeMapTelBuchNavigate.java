package coll.maps.treemaps.methods.headTailmap;

import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Die Klasse TreeMap<K,V> implementiert die Schnittstelle SortedMap<K,V>.
 * Elemente, die in ein Objekt der Klasse TreeMap<K,V> eingefuegt werden, werden
 * gleich sortiert eingefuegt.
 */
public class DemoTreeMapTelBuchNavigate {

	public static void main(String[] args) {
		//demoHeadMap();
		demoTailMap();
		// FAZIT:
		// Wenn eine Teilmenge verändert wird,
		// dann wird auch das Original auch verändert

	}

	public static void demoHeadMap() {
		SortedMap<String, String> telefonbuch = new TreeMap<String, String>();

		telefonbuch.put("Armin", "0711-123456");
		telefonbuch.put("Klaus", "0711-654321");
		telefonbuch.put("Peter", "0711-123456");
		telefonbuch.put("Walter", "0711-123457");
		telefonbuch.put("Xaver", "0711-123458");

		SortedMap<String, String> headMap = telefonbuch.headMap("Peter");
		// Returns a view of the portion of this map whose keys are
		// strictly less than toKey.

		printMap(headMap);

		System.out.println("\nMartina hinzufügen \n");
		headMap.put("Martina", "0711-123468");

		System.out.println("\nStefan hinzufügen \n");
		
		try {
			headMap.put("Stefan", "0711-123468");
		} catch (IllegalArgumentException e) {
			System.out.println("Stefan is ausserhalb des gegebenen Bereichs: "
					+ "Alles vorm Peter \n ");
		}
		
		printMap(headMap); // Alle Schlüsseln Ausgeben
	}

	public static void demoTailMap() {

		SortedMap<String, String> telefonbuch = new TreeMap<String, String>();

		telefonbuch.put("Armin", "0711-123456");
		telefonbuch.put("Klaus", "0711-654321");
		telefonbuch.put("Peter", "0711-123456");
		telefonbuch.put("Walter", "0711-123457");
		telefonbuch.put("Xaver", "0711-123458");

		SortedMap<String, String> tailMap = telefonbuch.tailMap("Peter");
		// Alle Schlüsseln Ausgeben
		printMap(tailMap);

		tailMap.put("Stefan", "0711-123468");
		// Returns a view of the portion of this map whose keys are strictly
		// greater or equal than toKey.

		System.out.println("\nMartina hinzufügen \n");
		
		try {
			tailMap.put("Martina", "0711-123468");
		} catch (IllegalArgumentException e) {
			System.out.println("Martina is ausserhalb des gegebenen Bereichs: "
					+ "Alles nach Peter \n ");
		}
		
		// Alle Schlüsseln Ausgeben
		printMap(tailMap);
	}

	public static void printMap(SortedMap<String, String> map) {
		Set<String> namenT = map.keySet();
		for (String name : namenT) {
			System.out.println("Nummer von " + name + ":\t");
			System.out.println(map.get(name));
		}
	}
}
