package coll.lists.performance;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Vector;

public class ListenAnalyse {

	public static void main(String[] args) {
		// Listentyp auswählen
		int auswahl = 0;
		try {
			Scanner eingabe = new Scanner(System.in);
			System.out.println("Welcher Listentyp soll getestet werden?");
			System.out.println("1 - ArrayList");
			System.out.println("2 - LinkedList");
			System.out.println("3 - Vector");
			System.out.println("Auswahl: ");
			auswahl = eingabe.nextInt();
		} catch (Exception ex) {
			System.out.println("Fehlerhafte Eingabe!");
			System.exit(1);
		}

		// Zweiter Schritt: Liste initialisieren
		String name = null;
		List<Integer> list = null;
	
		switch (auswahl) {
		case 1:
			name = "ArrayList";
			list = new ArrayList<Integer>();
			break;
		case 2:
			name = "LinkedList";
			list = new LinkedList<Integer>();
			break;
		case 3:
			name = "Vector";
			list = new Vector<Integer>();
			break;
		default:
			System.out.println("Keine gültige Auswahl geroffen!");
			System.exit(1);
		}
		
		//Dritter Schritt: Messungen durchführen
		int anzahl = 50000;
		long t0 = System.currentTimeMillis();
		
		//Liste erzeugen
		for (int i = 0; i < anzahl; i++) {
			list.add(i);
		}
	
		long t1 = System.currentTimeMillis();
		
		//Vorne weiter Elemente rein
		ListIterator<Integer> iter = list.listIterator();
		long t2 = System.currentTimeMillis();
		for (int i = 0; i < anzahl; i++) {
			iter.add(i);		
		//Iterator kümmert sich darum, dass Element vorne eingefügt wird,
		// siehe Javadoc
		}
		
		long t3 = System.currentTimeMillis();
		
		//10000 Mal auf das mittlere Element zugreifen
		int mitte = anzahl/2;
		long t4 = System.currentTimeMillis();
		for (int i = 0; i < mitte; i++) {
			int value = list.get(i);
		}
		
		long t5 = System.currentTimeMillis();
		//Vierter Schritt: Ergebnisse ausgeben
		System.out.println("Ergebnisse mit " +  name + ":");
		System.out.println("Elemente direkt erzeugen : " + (t1-t0) + " ms");
		System.out.println("Elemente mit Iterator erzeugen : " + (t3-t2) + " ms");
		System.out.println("Zugriff auf mittleres Element : " + (t5-t4) + " ms");
	}
}


//Ergebnisse mit ArrayList:
//Elemente direkt erzeugen : 6 ms
//Elemente mit Iterator erzeugen : 528 ms
//Zugriff auf mittleres Element : 1 ms

//Ergebnisse mit Vector:
//Elemente direkt erzeugen : 6 ms
//Elemente mit Iterator erzeugen : 602 ms
//Zugriff auf mittleres Element : 0 ms

//Ergebnisse mit LinkedList:
//Elemente direkt erzeugen : 5 ms
//Elemente mit Iterator erzeugen : 6 ms
//Zugriff auf mittleres Element : 419 ms



