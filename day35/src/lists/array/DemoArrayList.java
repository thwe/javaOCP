package coll.lists.array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class DemoArrayList {

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

	}

}
