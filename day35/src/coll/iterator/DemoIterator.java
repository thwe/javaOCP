package coll.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DemoIterator {

	public static void main(String[] args) {
		Collection<String> listeC = new ArrayList<String>();
		ArrayList<String> listeAL = new ArrayList<String>();
		List<String> listeL = new ArrayList<String>();
		
		listeL.add("Frieder");
		listeL.add("Marie");
		listeL.add("Laura");
		listeL.add("Uli");
		listeL.add("Steven");
		
		System.out.println(listeL);
		
		listeL.remove(2); //Laura
		listeL.remove("Steven"); 
		
		System.out.println(listeL);
		
		System.out.println("\nIterator:");
		Iterator<String> it = listeL.iterator();
		while(it.hasNext()){
			System.out.println("it.next(): " + it.next());
			
		}
		
		System.out.println("\nListIterator:");
		ListIterator<String> itList = listeL.listIterator();
		while(itList.hasNext()){
			System.out.println("itList.next(): " + itList.next());
		}
		
		System.out.println("\nForEachSchleife:");
		for (String string : listeL) {
			System.out.println(string);
		}
		
		System.out.println("\nFor Schleife:");
		for (int i = 0; i < listeL.size(); i++) {
			System.out.println(listeL.get(i));
		}

		
	}

}
