package coll.maps.hashmaps.mapsI;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Maps werden gelegentlich auch als:
 *  	Assoziative Arrays 
 *  oder
 *  	Assoziative Speicher 
 *  bezeichnet.
 *  
 *  Assoziative Arrays: 
 *  Im Map liegt Wertepaare: Schlüssel + Wert 
 *  Begriff kommt daher weil Verknüpfung zwischen Schlüssel und Wert hergestellt wird
 *  
 *   Bei einer Map wird sowohl der Schlüssel, nach dem eine Map durchsucht wird, 
 *   als auch die Bedeutung des Schlüssels durch ein Objekt repräsentiert. Das 
 *   bedeutet, dass man mit einer Map beliebige Objekte miteinander in Beziehung 
 *   setzen kann (engl. to map = zuordnen). Daher werden sie auch als 
 *   Assoziativspeicher bezeichnet.
 *   
 *   Die Klasse HashMap<K,V> verwendet den Hash-Code des Schlüssels, um die
 *   Position zu ermitteln, an welcher Stelle ein Schlüssel-Wert-Paar in der 
 *   Collection abgelegt wird.
 *   
 *   Entspricht dem Verfahren wie es beim HashSet verwerndet wird.
 *   
 *   Es können beliebige Objekte als Schluessel verwendet werden, allerdings 
 *   muessen die Klassen der Schluessel-Objekte ggf. die Methoden equals() und 
 *   hashCode() implementieren.  
 */
public class DemoHashMapTelefonbuch {

	public static void main(String[] args) {
		Map<String, String> telefonbuch = new HashMap<String,String >(); 
		
		telefonbuch.put("Armin", "0711-123456");
		telefonbuch.put("Klaus", "0711-654321");
		telefonbuch.put("Peter", "0711-123456");
		//Peter wohnt mit Armin zusammen - gleiche Rufnummer
		
		//Abfrage der Telefonnummer
		System.out.println("Nummer von Armin: \t ");
		System.out.println(telefonbuch.get("Armin"));
		
		System.out.println("Nummer von Silvia: \t ");
		System.out.println(telefonbuch.get("Sivia"));
		
		//Alle Namen (Schlüssel)
		
		printTelBuch(telefonbuch);
		
		telefonbuch.put("Klaus", "0711-0987789");
		
		printTelBuch(telefonbuch);
		
		telefonbuch.remove("Peter");
		
		printTelBuch(telefonbuch);
		
		telefonbuch.remove("Name"); //Es kracht nicht
		
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
