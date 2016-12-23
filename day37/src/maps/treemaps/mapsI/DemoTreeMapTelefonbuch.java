package coll.maps.treemaps.mapsI;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
/**
 * Die Klasse TreeMap<K,V> implementiert die Schnittstelle SortedMap<K,V>. 
 * Elemente, die in ein Objekt der Klasse TreeMap<K,V> eingefuegt werden,
 * werden gleich sortiert eingefuegt.
 */
public class DemoTreeMapTelefonbuch {

	public static void main(String[] args) {
		Map<String, String> telefonbuch = new TreeMap<String,String >(); 
		
		telefonbuch.put("Klaus", "0711-654321");
		telefonbuch.put("Peter", "0711-123456");
		telefonbuch.put("Armin", "0711-123456");
		//Peter wohnt mit Armin zusammen - gleiche Rufnummer
		
		//Abfrage der Telefonnummer
		System.out.println("Nummer von Armin: \t ");
		System.out.println(telefonbuch.get("Armin"));
		
		System.out.println("Nummer von Silvia: \t ");
		System.out.println(telefonbuch.get("Sivia"));
		
		System.out.println("\n Alle Nummern: ");
		System.out.println("----------------");
		
		//Alle Schlüsseln
		
		printTelBuch(telefonbuch);
		
		telefonbuch.put("Klaus", "0711-0987789");
		
		printTelBuch(telefonbuch);
		
		telefonbuch.remove("Peter");
		
		printTelBuch(telefonbuch);
		
		telefonbuch.remove("Name");
		
		printTelBuch(telefonbuch);
		}
		
		
		static public void printTelBuch(Map<String, String> telBuch){
			Set<String> namen = telBuch.keySet();
			
			//Alle Schlüssel 
			Iterator<String> it =  namen.iterator();
			String naechsterName = null;
			String naechsteTelNummer = null;
			while(it.hasNext()){
				naechsterName = it.next();
				naechsteTelNummer = telBuch.get(naechsterName);
				System.out.printf("Nummer von %s ist %s \n", naechsterName, naechsteTelNummer);
		}
		System.out.println();
	}

}
