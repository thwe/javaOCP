package oneDimArrays;

import java.util.Arrays;

public class DemoArrayClone {
	/*
	 * Hausaufgabe: Arrays.copyOf() - testen System.arraycopy() - testen
	 */
	
	public static void main(String[] args) {
		//arrayCloneOne();

		int[] iZahlen = new int[] { 6, 7, 8, 9, 10 };
		//arrayModify(iZahlen);
		//System.out.println(Arrays.toString(iZahlen));
		
		// arrayModify(iZahlen.clone());
		// System.out.println(Arrays.toString(iZahlen));
		
		int[] copyArray = copyIntArray(iZahlen);
		arrayModify(copyArray);
		System.out.println(Arrays.toString(copyArray));
		System.out.println(Arrays.toString(iZahlen));
		
		// arrayModify2(iZahlen);
		// System.out.println(Arrays.toString(iZahlen));
	}

	public static void arrayCloneOne() {
		int[] iZahlen = new int[] { 1, 2, 3, 4, 5 };
		int[] copyIZahlen = iZahlen.clone();
		System.out.println(Arrays.toString(copyIZahlen));

	}

	public static void arrayModify(int[] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i + 1; 
		}
	}
	
	public static void arrayModify2(int[] intArray) {
		int[] tempArray = new int[intArray.length];
		
		for (int i = 0; i < intArray.length; i++) {
			tempArray[i] = i + 1; 
		}
	}

	public static int[] copyIntArray(int[] origArray) {
		int[] copyArray = new int[origArray.length];
		for (int i = 0; i < origArray.length; i++) {
			copyArray[i] = origArray[i];
		}
		return copyArray;
	}

}
