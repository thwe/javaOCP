package sf403task5;

public class Loopy {
	public static void main(String[] args) {
		int[] x = {7,6,5,4,3,2,1};
		// insert code here
		// for(int y : x) { //A OK!
		// for(x : int y) { //B NOK!
		// int y = 0; for(y : x) { //C NOK!
		// for(int y=0, z=0; z<x.length; z++) { y = x[z]; //D OK!
		// for(int y=0, int z=0; z<x.length; z++) { y = x[z]; //E NOK!
		int y = 0; for(int z=0; z<x.length; z++) { y = x[z]; //F OK!
		
		System.out.print(y + " ");
		}
		}
		
}
