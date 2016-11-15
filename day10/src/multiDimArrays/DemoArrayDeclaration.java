package multiDimArrays;

import java.util.Arrays;

public class DemoArrayDeclaration {

	public static void main(String[] args) {
		// declarationOne01();
		declarationOne02();
	}

	public static void declarationOne01() {
		int[][] ganzeZahlenArray;
		ganzeZahlenArray = new int[8][];
		// Bei der Instantiierung:
		// Erste Dimension muss angegeben werden,
		// zweite nicht zwingend

		System.out.println(ganzeZahlenArray.length);
		System.out.println(ganzeZahlenArray + " " + ganzeZahlenArray.toString());

		for (int i = 0; i < ganzeZahlenArray.length; i++) {
			System.out.println(Arrays.toString(ganzeZahlenArray[i]));
		}
	}

	public static void declarationOne02() {
		int[][] ganzeZahlen01 = new int[6][10];
		// Bei der Instantiierung:
		// Erste Dimension muss angegeben werden,
		// zweite nicht zwingend
		System.out.println(ganzeZahlen01.length);
		for (int i = 0; i < ganzeZahlen01.length; i++) {
			System.out.println(ganzeZahlen01[i] + " " + Arrays.toString(ganzeZahlen01[i]));
		}
		System.out.println(Arrays.deepToString(ganzeZahlen01));
		print01(ganzeZahlen01);

	}

	public static void print01(int[][] twoDimArrays) {
		System.out.println("\nArray Inhalt: \n");
		for (int i = 0; i < twoDimArrays.length; i++) {
			for (int j = 0; j < twoDimArrays[i].length; j++) {
				System.out.print(twoDimArrays[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void print02(int[][] twoDimArrays) {
		System.out.println("\nArray Inhalt: \n");

		for (int[] is : twoDimArrays) {
			for (int i : is) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}
}
