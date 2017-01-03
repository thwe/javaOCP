package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class B03_Zuweisungskontrollen {
	
	static List<Integer> getList(int count) {
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i<count; i++) {
			list.add(i);
		}
		
		// return-'Zuweisung':
		//
		// List<Integer> cpu = list;
		// 1. IS-A-Kontrolle
		// 2. Generics-Kontrolle
		return list;
	}
	

	public static void main(String[] args) {

		Collection<Integer> coll = getList(30);
		// 1. IS-A-Kontrolle:
		//		Collection <= List
		// 2. Generics-Kontrolle
		// 		<Integer> <= <Integer>
		
		Collection<Object> coll2 = getList(30);
		// 1. IS-A-Kontrolle:
		//		Collection <= List
		// 2. Generics-Kontrolle
		// 		<Object> <= <Integer>		Fehler!
		
		
		Collection<? extends Object> coll3 = getList(30);
		// 1. IS-A-Kontrolle:
		//		Collection <= List
		// 2. Generics-Kontrolle
		// 		<? extends Object> <= <Integer>
		
		System.out.println("---------------------------------");
		
		ArrayList<Integer> list01 = null;
		List<Integer> var = list01;

	}

}
