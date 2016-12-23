package coll.interfaces.iComparable.collections.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import coll.interfaces.Fahrrad;
import coll.interfaces.Fahrrad.Art;


public class CollectionsSort {

	public static void main(String[] args) {
		collectionSort();

	}

	public static void collectionSort(){
		List<Fahrrad> liste = new ArrayList<Fahrrad>();
		Fahrrad fahrrad1 = new Fahrrad(26, Art.DAMEN, Fahrrad.Farben.ROT);
		Fahrrad fahrrad2 = new Fahrrad(16, Art.KINDER, Fahrrad.Farben.GELB);
		Fahrrad fahrrad3 = new Fahrrad(28, Art.HERREN, Fahrrad.Farben.SCHWARZ);
		Fahrrad fahrrad4 = new Fahrrad(16, Art.KINDER, Fahrrad.Farben.ROT);
		
		liste.add(fahrrad1);
		liste.add(fahrrad2);
		liste.add(fahrrad3);
		liste.add(fahrrad4);
		
		Collections.sort(liste);
		System.out.println(Arrays.toString(liste.toArray()));
	}
}
