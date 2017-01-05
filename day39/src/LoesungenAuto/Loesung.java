package LoesungenAuto;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Loesung {
	
	public static void main(String[] args) {
		
		/* Aufgaben 1, 2, 3 */
		
		VW vw1 = new VW("Golf", 1990);
		VW vw2 = new VW("Polo", 2001);
		VW vw3 = new VW("Golf", 2007);
		
		BMW bmw1 = new BMW("Z4", 2000);
		
		System.out.println(vw1);
		System.out.println(bmw1);
		
		/* Aufgabe 4 */
		LinkedList<VW> listVW = new LinkedList<VW>();
		listVW.add(vw1);
		listVW.add(vw2);
		listVW.add(vw3);
		
		print(listVW);	
		
		HashSet<VW> hashSetVW = new HashSet<VW>(listVW);
		hashSetVW.add(new VW("Golf", 1990));
		
		print(hashSetVW);  
		
		TreeSet<VW> treeSetVW = new TreeSet<VW>();
		treeSetVW.addAll(listVW);
		
		print(treeSetVW);
		
		PriorityQueue<VW> pQueue = new PriorityQueue<VW>(listVW);
		
		print(pQueue);
		
		System.out.println("--------- mit der poll: ---------");
		while( !pQueue.isEmpty() ) {
			VW vw = pQueue.poll();
			System.out.println(vw);
		}
		
		//-------------------
//		BMW bmw2 = new BMW("Z5", 2000);
//		bmw1.compareTo(bmw2); //muss gehen
//		vw1.compareTo(vw2); //muss gehen
//		//vw1.compareTo(bmw1); //darf nicht kompilieren
		
		
	} // end of main
	
	static void print(Collection<VW> coll) {
		
		System.out.println("-------------------------------------------");
		System.out.println("--- Collection: " + coll.getClass() + " ----");
		
		for (VW vw : coll) {
			System.out.println(vw);
		}
	}

}
