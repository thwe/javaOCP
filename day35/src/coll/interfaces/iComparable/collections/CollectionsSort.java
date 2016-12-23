package coll.interfaces.iComparable.collections;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import coll.interfaces.Fahrrad;
import coll.interfaces.Fahrrad.Art;
import coll.interfaces.Fahrrad.Farben;

public class CollectionsSort {

	public static void main(String[] args) {
		collectionSort();
	}

	public static void collectionSort(){
		List<Fahrrad> liste= new ArrayList<Fahrrad>();
		Fahrrad fahrrad1= new Fahrrad(26,Fahrrad.Art.DAMEN,Fahrrad.Farben.ROT);
		Fahrrad fahrrad2= new Fahrrad(16,Fahrrad.Art.KINDER,Fahrrad.Farben.GELB);
		Fahrrad fahrrad3= new Fahrrad(28,Fahrrad.Art.HERREN ,Fahrrad.Farben.SCHWARZ);
		Fahrrad fahrrad4= new Fahrrad(24,Fahrrad.Art.DAMEN,Fahrrad.Farben.ROT);
		Fahrrad fahrrad5= new Fahrrad(20,Fahrrad.Art.KINDER,Fahrrad.Farben.ROT);
		Fahrrad fahrrad6= new Fahrrad(28,Fahrrad.Art.DAMEN ,Fahrrad.Farben.GELB);
		
		liste.add(fahrrad1);
		liste.add(fahrrad2);
		liste.add(fahrrad3);
		liste.add(fahrrad4);
		liste.add(fahrrad5);
		liste.add(fahrrad6);
		
		Collections.sort(liste);
		System.out.println(Arrays.toString(liste.toArray()));
		
				
	}
}
