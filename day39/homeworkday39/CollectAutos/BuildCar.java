package CollectAutos;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

import java.util.Iterator;


public class BuildCar {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VW vw1 = new VW("Golf", 1990);
		VW vw2 = new VW("Tassat", 2010);
		VW vw3 = new VW("Pouran", 2015);
		VW vw4 = new VW("Pouran", 2014);
		
		BMW bmw1 = new BMW("Z4", 2000);
		BMW bmw2 = new BMW("X5", 2001);
				
		//System.out.println(vw1);
		//System.out.println(bmw1);
		
		
		
		TreeSet<VW> treesVW = new TreeSet<VW>(new SortModel());
		
		//ArrayList<BMW> aListBMW =
		//HashSet<BMW>
		//TreeSet<BMW>
		LinkedList<VW> llistVW = new LinkedList<VW>();
		
		llistVW.add(vw1);
		llistVW.add(vw2);
		llistVW.add(vw3);
		
		print(llistVW);
		/*
		System.out.println("#LinkedList:");
		Iterator<VW> it = llistVW.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
				}
*/
		HashSet<VW> hashsVW = new HashSet<VW>(llistVW);
		// hashsVW.add(vw1);
		// hashsVW.add(vw2);
		// hashsVW.add(vw3);
		print(hashsVW);
		
		System.out.println("#HashSet:");
		Iterator<VW> it1 = hashsVW.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
				}
				
		
		
		treesVW.add(vw1);
		treesVW.add(vw2);
		treesVW.add(vw3);
		treesVW.add(vw4);
		//treesVW.add(vw3);
		
		Iterator<VW> it2 = treesVW.iterator();
		System.out.println("#TreeSet:");
		while (it2.hasNext()) {
			System.out.println(it2.next());
				}
		
	}
		
		// Print Methode
		static void print(Collection<VW> coll){
		System.out.println("-----------------------------------------------");
		System.out.println("---Collection: " +coll.getClass() + "----------------");
		for (VW vw : coll){
			System.out.println(vw);
		}
	}

	
	
}

class SortModel implements Comparator<VW> {
	public int compare(VW one, VW two) {
		int modellRes = one.getModell().compareToIgnoreCase(two.getModell());
		if (modellRes == 0)
			return one.getBaujahr() - two.getBaujahr();
		return modellRes;
	}
	}


