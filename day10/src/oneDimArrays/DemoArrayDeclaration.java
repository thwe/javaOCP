package oneDimArrays;

import java.util.Arrays;

public class DemoArrayDeclaration {

	public static void main(String[] args) {
		//declarationOne();
		declarationTwo();
		declarationThree();
	}

	/**
	 * Standarddeklaration
	 */
	public static void declarationOne() {
		int[] iZahlen; // Array Deklaration
		iZahlen = new int[5]; // Array wurde instantiiert
		// (Es wurde ein Array Objekt erzeugt)

		System.out.println(iZahlen[0]); // Zugriff auf das erste Element
		System.out.println(iZahlen[3]); // Zugriff auf das vorletztes Element
		// System.out.println(iZahlen[5]);
		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
		// 5

		for (int i = 0; i < iZahlen.length; i++) {
			System.out.println(i + ": " + iZahlen[i]);
		}

		for (int i : iZahlen) {
			System.out.println(i);
		}

		System.out.println(Arrays.toString(iZahlen));
		
		
		// Deklaration und Instantiierung in einem Schritt
		String[] strArray = new String[10];
		strArray[0] = "Anna";
		
		for (int i = 0; i < strArray.length; i++) {
			strArray[i] = "" + (char)('A' + i);
		}
		
		for (String string : strArray) {
			// System.out.println(string.length()); NullPointerException
			System.out.println(string);
		}		
	}
	
	
	public static void declarationTwo() {
		int[] iZahlen; // Array Deklaration
		iZahlen = new int[]{1,2,3,4,5}; // Array wurde instantiiert
		printIntArray(iZahlen);
		
		String[] strArray = new String[]{"A","B","C","D"};
		System.out.println(Arrays.toString(strArray));	
	}
	
	public static void declarationThree() {
		// int[] iZahlen; // Array Deklaration
		// iZahlen = {1,2,3,4,5}; // Array wurde instantiiert
		// {1,2,3,4,5}
		int[] iZahlen = {1,2,3,4,5};
		printIntArray(iZahlen);
		
		String[] strArray = {"A","B","C","D"};
		System.out.println(Arrays.toString(strArray));	
	}
	
	public static void declarationGeneral() {
		int  iZahlen [];  //Eckiger Klammer kann bei der Deklaration überall stehen
		iZahlen = new int[5];
	}

	
	public static void printIntArray(int[] arraytoPrint){
		for (int i : arraytoPrint) {
			System.out.println(i);
		}
		
		//Option2
//		for (int i = 0; i < arraytoPrint.length; i++) {
//			System.out.println(i + ": " + arraytoPrint[i]);
//		}
		
		//Option3
//		System.out.println(Arrays.toString(arraytoPrint));
	}
}
