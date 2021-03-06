package multiDimArrays;

import java.util.Arrays;
import static java.lang.System.out;

public class DemoArrayDeclaration {

	public static void main(String name[]) {
		// declarationOne01();
		//declarationOne02();
		//declarationTwo();
		//declarationThree();
		//print02(new int[][]{{1},{2}});
		//print01(new int[][]{{1},{2}});
		
		int[][] ganzeZahlen = new int[][] {{1},{2,3},{4,5,6},{7,8,9,10}};
		int[][] ganzeZahlen2 = new int[5][10];
		String[][] ganzeZahlenS = new String[5][10];
		//print01(ganzeZahlen2);
		System.out.println(Arrays.deepToString(ganzeZahlen2));
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

	public static void declarationTwo() {
		int[][] ganzeZahlen;
		ganzeZahlen = new int[][] {{1},{2,3},{4,5,6},{7,8,9,10}};
		print01(ganzeZahlen);
		System.out.println(ganzeZahlen.length);
		System.out.println(ganzeZahlen[0].length);
		System.out.println(ganzeZahlen[1].length);
		System.out.println(ganzeZahlen[2].length);
		System.out.println(ganzeZahlen[3].length);
	}
	
	public static void declarationThree() {
		int[][] ganzeZahlen= {{1},{2,3},{4,5,6},{7,8,9,10}};
		print01(ganzeZahlen);
		System.out.println(ganzeZahlen.length);
		System.out.println(ganzeZahlen[0].length);
		System.out.println(ganzeZahlen[1].length);
		System.out.println(ganzeZahlen[2].length);
		System.out.println(ganzeZahlen[3].length);
	}
	
	public static void declarationBrackets(){
		int[][] ganzeZahlen = new int[][] { {1},{2,3},{4,5,6},{7,8,9,10} };
		
		int ganzeZahlen01[][] = new int[][] {{1},{2,3},{4,5,6},{7,8,9,10}};
		
		//[][]int ganzeZahlen02 = new int[][] {{1},{2,3},{4,5,6},{7,8,9,10}};
		//Eckige Klammer k�nnen nicht vor dem Typ stehen
		
		int[] ganzeZahlen03[] = new int[][] {{1},{2,3},{4,5,6},{7,8,9,10}};
		
		int[][][] ganzeZahlen04[] = new int[3][][][];
		
	}
	
	public static void print01(int[][] twoDimArrays) {
		System.out.println("\nArray Inhalt: \n");
		for (int i = 0; i < twoDimArrays.length; i++) {
			System.out.println(Arrays.toString(twoDimArrays[i]));
			for (int j = 0; j < twoDimArrays[i].length; j++) {
				System.out.print(twoDimArrays[i][j] + " ");
			}
			out.println();
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
