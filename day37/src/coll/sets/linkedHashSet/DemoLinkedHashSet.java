package coll.sets.linkedHashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


/**
 * 
 * Jedes Element kann in einem Set nur einmal enthalten werden
 *
 */
public class DemoLinkedHashSet {

	public static void main(String[] args) {
		demoHashSet();
		demoLinkedHashSet();

	}
	
	public static void demoHashSet(){
		Set<Fahrrad> fahrradSet = new HashSet<Fahrrad>();
		Fahrrad fahrrad1 = new Fahrrad(26, Fahrrad.Art.DAMEN, Fahrrad.Farben.ROT);
		Fahrrad fahrrad2 = new Fahrrad(16, Fahrrad.Art.KINDER, Fahrrad.Farben.GELB);
		Fahrrad fahrrad3 = new Fahrrad(28, Fahrrad.Art.HERREN, Fahrrad.Farben.SCHWARZ);
		Fahrrad fahrrad4 = new Fahrrad(16, Fahrrad.Art.KINDER, Fahrrad.Farben.ROT);
		Fahrrad fahrrad5 = new Fahrrad(26, Fahrrad.Art.DAMEN, Fahrrad.Farben.ROT);
		
		fahrradSet.add(fahrrad1);
		fahrradSet.add(fahrrad2);
		fahrradSet.add(fahrrad3);
		fahrradSet.add(fahrrad5);
		
		fahrradSet.add(fahrrad1);
		fahrradSet.add(new Fahrrad(26, Fahrrad.Art.DAMEN, Fahrrad.Farben.ROT));
		//Anja wird zum zweiten mal hinzugefügt
		
//		System.out.println(fahrradSet.size());
//		
//		for (Fahrrad fahrrad : fahrradSet) {
//			System.out.print(fahrrad + " ");
//		}
		System.out.println();
		
		
		//fahrradSet.add(null);
		//Null führt zu keinem Null Pointer Exception
		
		Iterator<Fahrrad> it = fahrradSet.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	/**
	 * When you iterate through a LinkedHashSet, it lets you iterate 
	 * thorugh the elements in the order in which they were inserted.
	 */
	public static void demoLinkedHashSet(){
		Set<Fahrrad> fahrradSet = new LinkedHashSet<Fahrrad>();
		Fahrrad fahrrad1 = new Fahrrad(26, Fahrrad.Art.DAMEN, Fahrrad.Farben.ROT);
		Fahrrad fahrrad2 = new Fahrrad(16, Fahrrad.Art.KINDER, Fahrrad.Farben.GELB);
		Fahrrad fahrrad3 = new Fahrrad(28, Fahrrad.Art.HERREN, Fahrrad.Farben.SCHWARZ);
		Fahrrad fahrrad4 = new Fahrrad(16, Fahrrad.Art.KINDER, Fahrrad.Farben.ROT);
		Fahrrad fahrrad5 = new Fahrrad(26, Fahrrad.Art.DAMEN, Fahrrad.Farben.ROT);
		
		fahrradSet.add(fahrrad1);
		fahrradSet.add(fahrrad2);
		fahrradSet.add(fahrrad3);
		fahrradSet.add(fahrrad5);
		
		fahrradSet.add(fahrrad1);
		fahrradSet.add(new Fahrrad(26, Fahrrad.Art.DAMEN, Fahrrad.Farben.ROT));
		//Anja wird zum zweiten mal hinzugefügt
		
//		System.out.println(fahrradSet.size());
//		
//		for (Fahrrad fahrrad : fahrradSet) {
//			System.out.print(fahrrad + " ");
//		}
		System.out.println();
		
		
		//fahrradSet.add(null);
		//Null führt zu keinem Null Pointer Exception
		
		Iterator<Fahrrad> it = fahrradSet.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
