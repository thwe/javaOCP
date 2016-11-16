package homeworkday10;
import java.util.*;


public class PassGen {
	
	public static void main(String[] args){
				
		
		generatePass();
		String pass= convertToStr(generatePass());
		pass = pass + String.valueOf(randNums());
		System.out.println(pass);
		
}
	

	public static int generateRandomInteger(int min, int max) {
	    Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;
	    return randomNum;
	}
	
	public static int[] generatePass(){
		int minSc=33;
		int maxSc=47;
		int minChrUp=65;
		int maxChrUp=90;
		int minChrLo=97;
		int maxChrLo=122;
		
		int[] passchr= new int[6];
				
		for (int i = 0; i < passchr.length; i++) {
			if (i==1) {
				continue;
			}
			passchr[i] = generateRandomInteger(minChrUp, maxChrUp);
			
			for (int j = 1; j < passchr.length; j++) {
				if (j==5) {
					break;
				}
				passchr[j] = generateRandomInteger(minChrLo, maxChrLo);
				
				for (int k = 0; k < passchr.length; k++) {
					if (k==1) {
						break;
					}
					passchr[k] = generateRandomInteger(minSc, maxSc);
				}
			}
			
		}
		return passchr;
		
	}
	
	public static String convertToStr(int passchr[]){
		String passLetters="";
		for (int i = 0; i < passchr.length; i++) {
			passLetters = passLetters + (char)passchr[i];
		}
		return passLetters;
		
	}
	
	public static int randNums(){
		int randnum= generateRandomInteger(10, 99);
		return randnum;
		
	}
	
}
		


	
