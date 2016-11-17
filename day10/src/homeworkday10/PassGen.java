package homeworkday10;
import java.util.*;


public class PassGen {
	
	public static void main(String[] args){
		
		generatePass();
		String pass= convertToStr(generatePass());
		System.out.println(pass);
		
}
	
	public static int[] generatePass(){
		int minSc=33;
		int maxSc=47;
		int minChrUp=65;
		int maxChrUp=90;
		int minChrLo=97;
		int maxChrLo=122;
		int minDec=48;
		int maxDec=57;
		
		int[] passchr= new int[8];
				
		for (int i = 1; i < passchr.length; i++) {
			
			passchr[i] = generateRandomInteger(minChrUp, maxChrUp);
			
			
			for (int j = 2; j < passchr.length; j++) {
				if (j==6) {
					break;
				}
				passchr[j] = generateRandomInteger(minChrLo, maxChrLo);
				
				for (int k = 6; k < passchr.length; k++) {
					if (k==7) {
						break;
					}
					passchr[k] = generateRandomInteger(minSc, maxSc);
					
					
						for (int d = 0; d < passchr.length; d++) {
							if (d==2) {
								break;
							}
							passchr[d] = generateRandomInteger(minDec, maxDec);
						
						}
					}
					
				}
			
			
		}
		return passchr;
		
	}
	
	public static int generateRandomInteger(int min, int max) {
	    Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;
	    return randomNum;
	}
	
	public static String convertToStr(int passchr[]){
		String passLetters="";
		for (int i = 0; i < passchr.length; i++) {
			passLetters = passLetters + (char)passchr[i];
		}
		return passLetters;
		
	}
		
}
		


	
