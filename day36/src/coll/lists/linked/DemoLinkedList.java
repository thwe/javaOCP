package coll.lists.linked;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {

	public static void main(String[] args) {
		Collection<String> listeC = new LinkedList<String>();
		LinkedList<String> listeLL = new LinkedList<String>();
		List<String> listeL = new LinkedList<String>();
		
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
