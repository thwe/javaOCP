package coll.interfaces.iComparator.collections.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import coll.interfaces.Fahrrad;
import coll.interfaces.Fahrrad.Art;


public class CollectionsSort {

	public static void main(String[] args) {
		Fahrrad.SortFahrradReifenGroesse reifenGroesse = new Fahrrad.SortFahrradReifenGroesse();
		collectionSortComparator(reifenGroesse);
		
		//Mit der Klasenvariable comp
		Fahrrad.comp = new Fahrrad.SortFahrradArt();
		collectionSortComparator(Fahrrad.comp);
		
		Fahrrad.comp = new Fahrrad.SortFahrradFarbe();
		collectionSortComparator(Fahrrad.comp);
		
	}

	public static void collectionSortComparator(Comparator<Fahrrad> comp){
		List<Fahrrad> liste = new ArrayList<Fahrrad>();
		Fahrrad fahrrad1 = new Fahrrad(26, Art.DAMEN, Fahrrad.Farben.ROT);
		Fahrrad fahrrad2 = new Fahrrad(16, Art.KINDER, Fahrrad.Farben.GELB);
		Fahrrad fahrrad3 = new Fahrrad(28, Art.HERREN, Fahrrad.Farben.SCHWARZ);
		Fahrrad fahrrad4 = new Fahrrad(16, Art.KINDER, Fahrrad.Farben.ROT);
		
		liste.add(fahrrad1);
		liste.add(fahrrad2);
		liste.add(fahrrad3);
		liste.add(fahrrad4);
		
		Collections.sort(liste,comp);
		System.out.println(Arrays.toString(liste.toArray()));
	}
}
