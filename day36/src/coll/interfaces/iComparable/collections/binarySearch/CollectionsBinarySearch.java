package coll.interfaces.iComparable.collections.binarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import coll.interfaces.Fahrrad;
import coll.interfaces.Fahrrad.Art;


public class CollectionsBinarySearch {

	public static void main(String[] args) {
		collectionBinarySearch();

	}

	public static void collectionBinarySearch(){
		List<Fahrrad> liste = new ArrayList<Fahrrad>();
		Fahrrad fahrrad1 = new Fahrrad(26, Art.DAMEN, Fahrrad.Farben.ROT);
		Fahrrad fahrrad2 = new Fahrrad(16, Art.KINDER, Fahrrad.Farben.GELB);
		Fahrrad fahrrad3 = new Fahrrad(28, Art.HERREN, Fahrrad.Farben.SCHWARZ);
		Fahrrad fahrrad4 = new Fahrrad(16, Art.KINDER, Fahrrad.Farben.ROT);
		Fahrrad fahrrad5 = new Fahrrad(16, Art.KINDER, Fahrrad.Farben.SCHWARZ);
		
		liste.add(fahrrad1);
		liste.add(fahrrad2);
		liste.add(fahrrad3);
		liste.add(fahrrad4);
		
		Collections.sort(liste);
		System.out.println(Arrays.toString(liste.toArray()));
		
		System.out.println(Collections.binarySearch(liste, fahrrad4));
		
		System.out.println(Collections.binarySearch(liste, fahrrad5));
	}
}
