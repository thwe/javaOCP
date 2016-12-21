package coll.interfaces.iComparator.arrays.binarySearch;

import java.util.Arrays;
import java.util.Comparator;

import coll.interfaces.iComparator.Artikel;
import coll.interfaces.iComparator.SortArtikelNachArtNr;
import coll.interfaces.iComparator.SortArtikelNachName;

public class ArraysBinarySearch {

	public static void main(String[] args) {
		System.out.println("Sortiert nach Artikel Name: ");
		SortArtikelNachName sNachName = new SortArtikelNachName();
		searchComparator(sNachName);
		
		System.out.println("Sortiert nach Artikel ArtNr: ");
		SortArtikelNachArtNr sNachArtNr = new SortArtikelNachArtNr();
		searchComparator(sNachArtNr);

	}

	public static void searchComparator(Comparator<Artikel> comp){
		Artikel a = new Artikel("1000", "Mutter 8x10");
		Artikel b = new Artikel("1001", "Dichtungsring 20x100");
		Artikel c = new Artikel("1002", "Abstreifring 25x125");
		Artikel d = new Artikel("1003", "Montierbarer Zackenring");
		Artikel e = new Artikel("1000", "Mutter 8x100");
		Artikel f = new Artikel("1000", "Dichtungsring 20x100");
		Artikel g = new Artikel("(999", "Nontierbarer Zackenring");
		
		Artikel[] arrArtikel = new Artikel[]{a,d,e,b,c,f};
		System.out.println("Vor dem Sortieren ");
		System.out.print(Arrays.toString(arrArtikel));
		
		Arrays.sort(arrArtikel, comp);
		
		System.out.println("\nNach dem Sortieren ");
		System.out.print(Arrays.toString(arrArtikel));
		
		System.out.println("\nBinäre Suche nach Objekt a ");
		System.out.println(Arrays.binarySearch(arrArtikel, a, comp));
		
		System.out.println("\nBinäre Suche nach Objekt e ");
		System.out.println(Arrays.binarySearch(arrArtikel, e, comp));
		
		System.out.println("\nBinäre Suche nach Objekt b ");
		System.out.println(Arrays.binarySearch(arrArtikel, b, comp));
		
		System.out.println("\nBinäre Suche nach Objekt g ");
		System.out.println(Arrays.binarySearch(arrArtikel, g, comp));
		//compareTo() von Artikel benutzt compareTo von String,
		//wir brauchen einen Anafangszeichen in dem String welches 
		//vor 1 ist in der Dezimaltabelle, damit der insertionpoint -1 ist 
			
	}
}
