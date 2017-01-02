package generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class B02_platzhalter {

	public static void main(String[] args) {

		List<Integer> listInt = new ArrayList<Integer>();
		listInt.add(12);
		listInt.add(33);
		listInt.add(-7);
		//listInt.add(0.2);	// Integer param = new Double(0.2);

		printNumbers(listInt); // List<? extends Number> list = listInt;
							   // 1. Kontrolle: ArrayList IS-A List					- OK
							   // 2. Kontrolle: <? extends Number> <= <Integer>		- OK

		System.out.println("------------------------------------------------");
		
		List<Double> listDouble = new LinkedList<Double>();
		listDouble.add(12.);
		listDouble.add(55.7);
		
		printNumbers(listDouble); // List<? extends Number> list = listDouble;
		
		System.out.println(listDouble);
		
	} //end of main

	static void printNumbers(List<? extends Number> list) {
		System.out.println(list);
		
		list.contains(22);
		//list.add(22);		//Compilerfehler!!!!
	}
	
//	static void printNumbers(List<Integer> list) {
//		System.out.println(list);
//	}
//	static void printNumbers(List<Double> list) {
//		System.out.println(list);
//	}
//	
//	static void printNumbers(List<Number> list) {
//		System.out.println(list);
//	}
}
