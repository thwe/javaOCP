package coll.maps.treemaps.mapsII;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Die Klasse TreeMap<K,V> implementiert die Schnittstelle SortedMap<K,V>. 
 * Elemente, die in ein Objekt der Klasse TreeMap<K,V> eingefuegt werden,
 * werden gleich sortiert eingefuegt.
 */
public class DemoTreeMapTelBuchPerson {

	public static void main(String[] args) {
		Map<Person, String> telefonbuch = new TreeMap<Person,String >(); 
		
		Person klaus = new Person("Klaus", "Müller", 25);
		Person peter = new Person("Peter", "Miller", 40);
		Person armin = new Person("Armin", "Feuerstein", 15); 
		Person silvia = new Person("Silvia", "Martina", 1); 
		
		telefonbuch.put(klaus, "0711-654321");
		telefonbuch.put(peter, "0711-123456");
		telefonbuch.put(armin, "0711-123456");
		//Peter wohnt mit Armin zusammen - gleiche Rufnummer
		
		//Abfrage der Telefonnummer
		System.out.println("Nummer von Armin: \t ");
		System.out.println(telefonbuch.get(armin));
		
		System.out.println("Nummer von Silvia: \t ");
		System.out.println(telefonbuch.get(silvia));
		
		//Alle Namen (Schlüssel)
		
		printTelBuch(telefonbuch);
		
		//telefonbuch.put(new Person("Klaus", "Müller", 25), "0711-0987789");
		
		//printTelBuch(telefonbuch);
		
		telefonbuch.remove(peter);
		
		printTelBuch(telefonbuch);
		}
		
		
		static public void printTelBuch(Map<Person, String> telBuch){
			Set<Person> namen = telBuch.keySet();
			
			//Alle Schlüssel 
			Iterator<Person> it =  namen.iterator();
			Person naechstePerson = null;
			String naechsteTelNummer = null;
			while(it.hasNext()){
				naechstePerson = it.next();
				naechsteTelNummer = telBuch.get(naechstePerson);
				System.out.printf("Nummer von %s ist %s \n", naechstePerson, naechsteTelNummer);
		}
		System.out.println();
	}

}
