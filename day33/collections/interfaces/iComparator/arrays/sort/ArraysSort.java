package interfaces.iComparator.arrays.sort;

import java.util.Arrays;

import interfaces.iComparator.Artikel;
import interfaces.iComparator.SortArtikelNachArtNr;
import interfaces.iComparator.SortArtikelNachName;

public class ArraysSort {

	public static void main(String[] args) {
		arraySort();
	}

	public static void arraySort(){
		Artikel a = new Artikel("1000", "Mutter 8x10");
		Artikel b = new Artikel("1001", "Dichtungsring 20x100");
		Artikel c = new Artikel("1002", "Abstreifring 25x125");
		Artikel d = new Artikel("1003", "Montierbarer Zackenring");
		Artikel e = new Artikel("1000", "Mutter 8x10");
		Artikel f = new Artikel("1000", "Dichtungsring 20x100");
		
		Artikel[] arrArtikel = new Artikel[]{a,d,e,b,c,f};
		System.out.println("Vor dem Sortieren nach Name ");
		System.out.print(Arrays.toString(arrArtikel));
		
		System.out.println("Sortiert nach Artikel Name: ");
		SortArtikelNachName sNachName = new SortArtikelNachName();
		Arrays.sort(arrArtikel, sNachName);
		
		System.out.println("\nNach dem Sortieren nach Name");
		System.out.print(Arrays.toString(arrArtikel));
		
		System.out.println("\n\n");
		
		System.out.println("Vor dem Sortieren nach ArtikelNr. ");
		System.out.print(Arrays.toString(arrArtikel));
		
		System.out.println("Sortiert nach ArtikelNr.: ");
		SortArtikelNachArtNr sNachArtNr = new SortArtikelNachArtNr();
		Arrays.sort(arrArtikel, sNachArtNr);
		
		System.out.println("\nNach dem Sortieren nach Artikelnr.");
		System.out.print(Arrays.toString(arrArtikel));
		
		
		
		
		
		
	}
}
