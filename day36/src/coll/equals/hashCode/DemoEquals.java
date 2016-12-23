package coll.equals.hashCode;

import java.util.HashSet;
import java.util.Set;

public class DemoEquals {

	public static void main(String[] args) {
		
		//artikelOhneEquals();
		artikelMitEquals();
	}

	public static void artikelMitEquals(){
		Set<ArtikelMitEquals> menge = new HashSet<ArtikelMitEquals>();
		ArtikelMitEquals a = new ArtikelMitEquals("1000", "Mutter 8x10");
		ArtikelMitEquals b = new ArtikelMitEquals("1001", "Dichtungsring 20x100");
		ArtikelMitEquals c = new ArtikelMitEquals("1002", "Abstreifring 25x125");
		ArtikelMitEquals d = new ArtikelMitEquals("1003", "Montierbarer Zackenring");
		
		menge.add(a);
		menge.add(b);
		menge.add(c);
		menge.add(d);
		
		System.out.println(menge);
		
		ArtikelMitEquals e =  new ArtikelMitEquals("1000", "Mutter 8x10");
		menge.add(e);
		
		System.out.println(menge);
	}
	
	public static void artikelOhneEquals(){
		ArtikelOhneEquals a = new ArtikelOhneEquals("1000", "Mutter 8x10");
		ArtikelOhneEquals b = new ArtikelOhneEquals("1001", "Dichtungsring 20x100");
		ArtikelOhneEquals c = new ArtikelOhneEquals("1002", "Abstreifring 25x125");
		ArtikelOhneEquals d = new ArtikelOhneEquals("1003", "Montierbarer Zackenring");
		ArtikelOhneEquals e = new ArtikelOhneEquals("1000", "Mutter 8x10");
		
		System.out.println(a == b);
		System.out.println(a == e);
		
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(e));

	}
}
