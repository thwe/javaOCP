package interfaces.iComparable.treeSet;

import java.util.Set;
import java.util.TreeSet;

import interfaces.iComparable.Artikel;

public class ApplikationTreeSet {
	public static void main(String[] args) {
		demoTreeSetComparable();
	}

	public static void demoTreeSetComparable() {
		Set<Artikel> setArtikel = new TreeSet<Artikel>();
		
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
