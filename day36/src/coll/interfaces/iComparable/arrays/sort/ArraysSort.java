package coll.interfaces.iComparable.arrays.sort;

import java.util.Arrays;

import coll.interfaces.iComparable.Artikel;

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
		System.out.println("Vor dem Sortieren ");
		System.out.print(Arrays.toString(arrArtikel));
		
		Arrays.sort(arrArtikel);
		
		System.out.println("\nNach dem Sortieren ");
		System.out.print(Arrays.toString(arrArtikel));
		
		
		
		
	}
}
