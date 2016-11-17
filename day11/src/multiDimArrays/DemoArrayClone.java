package multiDimArrays;

import java.util.Arrays;

public class DemoArrayClone {

	public static void main(String[] args) {
		int[][] ganzeZahlen = new int[][] {{1},{2,3},{4,5,6},{7,8,9,10}};
		String[][] ganzeZahlenS = new String[][] {{"1"},{"2","3"},{"4","5","6"},{"7","8","9","10"}};
		int[][] kopieGanzeZahlen;
		//kopieGanzeZahlen = ganzeZahlen.clone();
		kopieGanzeZahlen = copyIntArray02(ganzeZahlen);
		System.out.println(Arrays.deepToString(kopieGanzeZahlen));
		arrayModify(kopieGanzeZahlen);
		System.out.println(Arrays.deepToString(ganzeZahlen));
	}
	
	
	public static void arrayModify(int[][] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				intArray[i][j]= (i+1)*10 + (j+1); 
			}
			//System.out.println(Arrays.toString(intArray[i]));
		}
	}
	
	public static int[][] copyIntArray(int[][] origArray) {
		int[][] copyArray = new int[origArray.length][];
		for (int i = 0; i < origArray.length; i++) {
			copyArray[i] = new int[origArray[i].length];
			copyArray[i] = origArray[i].clone();
		}
		return copyArray;
	}

	
	public static int[][] copyIntArray02(int[][] origArray) {
		int[][] copyArray = new int[origArray.length][];
		for (int i = 0; i < origArray.length; i++) {
			copyArray[i] = new int[origArray[i].length];
			for (int j = 0; j < origArray[i].length; j++) {
				copyArray[i][j]= origArray[i][j];
			}
		}
		return copyArray;
	}

}
