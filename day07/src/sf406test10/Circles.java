package sf406test10;

public class Circles {
	
		public static void main(String[] args) {
		int[] ia = {1,3,5,7,9};
		for(int x : ia) {
		for(int j = 0; j < 3; j++) {
		if(x > 4 && x < 8) continue;
		System.out.print(" " + x);
		if(j == 1) break;
		continue;
		}
		continue;
		}
		}
		}
		/*
		 * What is the result?
		 * A. 1 3 9
		B. 5 5 7 7
		C. 1 3 3 9 9
		D. 1 1 3 3 9 9
		E. 1 1 1 3 3 3 9 9 9
		F. Compilation fails
		11. Given:
		 */
		

