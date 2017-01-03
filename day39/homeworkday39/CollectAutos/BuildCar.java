package CollectAutos;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;


public class BuildCar {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VW vw1 = new VW("Golf", 1990);
		VW vw2 = new VW("Tassat", 2010);
		VW vw3 = new VW("Pouran", 2015);
		
		BMW bmw1 = new BMW("Z4",2000);
				
		//System.out.println(vw1);
		//System.out.println(bmw1);
		
		LinkedList<VW> llistVW = new LinkedList<VW>();
		HashSet<VW> hashsVW = new HashSet<VW>();
		TreeSet<VW> treesVW = new TreeSet<VW>(new SortModel());
		
		llistVW.add(vw1);
		llistVW.add(vw2);
		llistVW.add(vw3);
		System.out.println("#LinkedList:");
		for (VW element : llistVW) {
			System.out.println(element);
				}
		

		
		hashsVW.add(vw1);
		hashsVW.add(vw2);
		hashsVW.add(vw3);
		System.out.println("#HashSet:");
		for (VW element : hashsVW) {
			System.out.println(element);
				}
		
		treesVW.add(vw1);
		treesVW.add(vw2);
		treesVW.add(vw3);
		//treesVW.add(vw3);
		System.out.println("#TreeSet:");
		for (VW element : treesVW) {
			System.out.println(element);
				}
	}
}

class SortModel implements Comparator<VW> {
	public int compare(VW one, VW two) {
	return one.getModell().compareTo(two.getModell());
		}
	}


