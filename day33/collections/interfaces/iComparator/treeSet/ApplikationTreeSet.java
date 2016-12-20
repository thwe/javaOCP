package interfaces.iComparator.treeSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import interfaces.iComparator.Artikel;
import interfaces.iComparator.SortArtikelNachArtNr;
import interfaces.iComparator.SortArtikelNachName;

public class ApplikationTreeSet {
	public static void main(String[] args) {
		System.out.println("Sortiert nach Artikel Name: ");
		SortArtikelNachName sNachName = new SortArtikelNachName();
		demoTreeSetComparatorName(sNachName);
		
		System.out.println("\nSortiert nach Artikel Nummer: ");
		SortArtikelNachArtNr sArtikelNachArtNr = new SortArtikelNachArtNr();
		demoTreeSetComparatorName(sArtikelNachArtNr);
	}

	public static void demoTreeSetComparatorName(Comparator<Artikel> comp) {
		Set<Artikel> setArtikel = new TreeSet<Artikel>(comp);

		Artikel a = new Artikel("1000", "Mutter 8x10");
		Artikel b = new Artikel("1001", "Dichtungsring 20x100");
		Artikel c = new Artikel("1002", "Abstreifring 25x125");
		Artikel d = new Artikel("1003", "Montierbarer Zackenring");
		Artikel e = new Artikel("1000", "Mutter 8x10");
		Artikel f = new Artikel("1000", "Dichtungsring 20x100");

		setArtikel.add(a);
		setArtikel.add(d);
		setArtikel.add(b);
		setArtikel.add(e);
		setArtikel.add(c);
		setArtikel.add(f);

		System.out.println(setArtikel.size());

		for (Artikel artikel : setArtikel) {
			System.out.println(artikel);
		}
	}
}
