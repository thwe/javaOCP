package multiDimArrays;

import java.util.Arrays;

public class HandlingMuliDimArrays {

	public static void main(String[] args) {

		//oneDimArray();
		//twoDimArray01();
		//twoDimArray02();
		//threeDimArray01();
		//threeDimArray02();
		//threeDimArray03();
		declarationDimensions();
	}

	public static void oneDimArray() {

		int ganzeZahl = 10;
		int[] einDimArray = new int[] { 1, 2, 3, 4, 5 };

		for (int i = 0; i < einDimArray.length; i++) {
			einDimArray[i] += ganzeZahl;
			//einDimArray[i] = einDimArray[i] + ganzeZahl;
		}
		System.out.println(Arrays.toString(einDimArray));
	}
	
	public static void twoDimArray01() {

		int[] einDimArray = new int[] { 1, 2, 3, 4, 5 };
		int[][] zweiDimArray = new int[2][2];
		
		System.out.println("Vor Zuweisung: zweiDimArray[i] = " + "einDimArray \n" + Arrays.deepToString(zweiDimArray));
		
		for (int i = 0; i < zweiDimArray.length; i++) {
			zweiDimArray[i] = einDimArray;
		}
		System.out.println("Nach Zuweisung: zweiDimArray[i] = " + "einDimArray \n" + Arrays.deepToString(zweiDimArray));
	}
	
	public static void twoDimArray02() {
		int ganzeZahl = 10;
		int[][] zweiDimArray = new int[2][2];
		
		System.out.println("Vor Zuweisung: zweiDimArray[i] = " + "einDimArray \n" + Arrays.deepToString(zweiDimArray));
		
		for (int i = 0; i < zweiDimArray.length; i++) {
			for (int j = 0; j < zweiDimArray[i].length; j++) {
				zweiDimArray[i][j] = ganzeZahl;
			}
		}
		System.out.println("Nach Zuweisung: zweiDimArray[i] = " + "einDimArray \n" + Arrays.deepToString(zweiDimArray));
	}
	
	public static void threeDimArray01() {

		int[][] zweiDimArray = new int[][] { { 6, 7 }, { 8, 9 } };
		int[][][] dreiDimArray = new int[2][3][4];

		System.out.println(Arrays.deepToString(dreiDimArray) + "\n");

		for (int i = 0; i < dreiDimArray.length; i++) {
			System.out.println(Arrays.deepToString(dreiDimArray[i]));
		}

		for (int i = 0; i < dreiDimArray.length; i++) {
			dreiDimArray[i] = zweiDimArray;
		}
		System.out.println("\nNach Zuweisung: \n" + "dreiDimArray[i] = zweiDimArray \n");

		for (int i = 0; i < dreiDimArray.length; i++) {
			System.out.println(Arrays.deepToString(dreiDimArray[i]));
		}
	}
	
	public static void threeDimArray02() {

		int[] einDimArray = new int[] { 1, 2, 3, 4, 5 };
		int[][][] dreiDimArray = new int[2][2][2];

		System.out.println(Arrays.deepToString(dreiDimArray) + "\n");

		for (int i = 0; i < dreiDimArray.length; i++) {
			for (int j = 0; j < dreiDimArray[i].length; j++) {
				dreiDimArray[i][j] = einDimArray;
			}
		}

		System.out.println("\nNach Zuweisung: \n" + "dreiDimArray[i][j] = einDimArray \n");

		System.out.println(Arrays.deepToString(dreiDimArray) + "\n");

		for (int i = 0; i < dreiDimArray.length; i++) {
			System.out.println("\n" + i + ": " + Arrays.deepToString(dreiDimArray[i]) + "\n");
			for (int j = 0; j < dreiDimArray[i].length; j++) {
				System.out.println(i + "," + j + ": " + Arrays.toString(dreiDimArray[i][j]));
			}
		}
		
		
	}

	public static void threeDimArray03() {
		int[][][] dreiDimArray = new int[2][2][5];
		
		dreiDimArray[0][0][0] = 25;
		System.out.println(Arrays.deepToString(dreiDimArray) + "\n");
		dreiDimArray[0][1][3] = 12;
		System.out.println(Arrays.deepToString(dreiDimArray) + "\n");
		dreiDimArray[1][0][1] = 10;
		System.out.println(Arrays.deepToString(dreiDimArray) + "\n");
	}
	
	public static void declarationDimensions() {
		int ganzeZahl = 20;
		int[] einDimArray = new int[] { 1, 2, 3, 4, 20, 6 };
		int[][] zweiDimArray = new int[6][1];
		// System.out.println(Arrays.deepToString(ganzeZahlen02));
		zweiDimArray[5] = einDimArray;
		// System.out.println(Arrays.deepToString(ganzeZahlen02));
		zweiDimArray[5][2] = ganzeZahl;
		// System.out.println(Arrays.deepToString(ganzeZahlen02));

		int[][][] dreiDimArray = new int[2][3][4];
		dreiDimArray[1] = zweiDimArray;
		System.out.println(Arrays.deepToString(dreiDimArray));
		dreiDimArray[1][0] = einDimArray;
		dreiDimArray[1][0][0] = ganzeZahl;

		int[][][][] vierDimArray = new int[1][2][3][4];
		vierDimArray[0] = dreiDimArray;
		vierDimArray[0][1] = zweiDimArray;
		vierDimArray[0][1][2] = einDimArray;
		vierDimArray[0][1][2][3] = ganzeZahl;
		System.out.println(Arrays.deepToString(vierDimArray));

	}
}
