package multiDimArrays;

import java.util.Arrays;

public class TransponMartix2 {

	public static void main(String[] args) {
		int[][] mat = new int[][] { { 1, 2 }, { 3, 4 },{5,6}};
		printIntArrayTwoDim(mat);
		transpon(mat);
		int[][] mat2 = new int[][] { { 1 }, { 2,3},{4,5,6}};
		printIntArrayTwoDim(mat2);
		//copyTwoDimArray(mat2);
		copyTwoDimArraySys(mat2);
	}

	public static void printIntArrayTwoDim(int[][] mat) {

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");	
			}
			System.out.println();
			
		}
		System.out.println("\n");
	}
	
	public static int[][] transpon(int[][] arrToTrans){
		int [][] transmat=new int[arrToTrans[0].length][arrToTrans.length];
		//System.out.println(arrToTrans.length);
		//System.out.println(arrToTrans[0].length);
      for(int i=0; i < arrToTrans[0].length; i++){
        for(int j=0; j < arrToTrans.length; j++){
        	transmat[i][j]=arrToTrans[j][i];
        }
      }
      printIntArrayTwoDim(transmat);
		return transmat;
	}

	public static int[][] copyTwoDimArray(int[][] arrToTrans){
		int [][] transmat=new int[arrToTrans.length][];
      for(int i=0; i < arrToTrans.length; i++){
    	  transmat[i]= new int [arrToTrans[i].length];
    	  transmat[i]=Arrays.copyOf(arrToTrans[i], arrToTrans[i].length);
      }
      printIntArrayTwoDim(transmat);
		return transmat;
	} 
	public static int[][] copyTwoDimArraySys(int[][] arrToTrans){
		int [][] transmat=new int[arrToTrans.length][];
      for(int i=0; i < arrToTrans.length; i++){
    	  transmat[i]= new int [arrToTrans[i].length];
    	  System.arraycopy(arrToTrans[i],0 , transmat[i], 0, arrToTrans[i].length-1);
      }
      printIntArrayTwoDim(transmat);
		return transmat;
	} 
}  

