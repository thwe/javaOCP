package day010;

import java.util.Arrays;
import java.util.Random;

public class Pass {

	public static char[] generate() {
		
		char[] pass = new char[8];
		
		Random rand = new Random();
		
		pass[0] = (char)(rand.nextInt(15) + 33); //33-47 Sonderzeichen
		pass[1] = (char)(rand.nextInt(10) + 48); //48-57  2 Ziffern
		pass[2] = (char)(rand.nextInt(10) + 48); 
		
		int grossbuchstabenAnzahl = rand.nextInt(4)+1;
		
		for(int i=3;i<grossbuchstabenAnzahl+3;i++) {
			pass[i] = (char)(rand.nextInt(26) + 65); //65-90 Grossbuchstaben
		}
		
		for(int i=3+grossbuchstabenAnzahl;i<8;i++) {
			pass[i] = (char)(rand.nextInt(26) + 97); //97-122 Kleinbuchstaben
		}
		
		// Shuffle
		char temp;
		int i1,i2;
		for(int j=0;j<6;j++) {
			i1 = rand.nextInt(8);
			i2 = rand.nextInt(8);
			temp = pass[i1];
			pass[i1] = pass[i2];
			pass[i2] = temp;
			
		}
		
		return pass;
	}
	
	public static void main(String[] args) {
		for(char c:generate()) {
			System.out.print(c);
		}
	}

}
