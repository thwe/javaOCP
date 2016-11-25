package bigInteger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ApplicationBigInteger {

	/** Die Methode readConsole() liest Zeichenfolge von der Konsole ein und gibt diese zurueck
	 * @return
	 */
	public static String readConsole(){
		String number = new String("");
		BufferedReader bufferOne = new BufferedReader(new InputStreamReader(System.in));

		try {
			number = bufferOne.readLine();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return number;
	}
	
	
	/** Methode sumBigInteger(int pNumber) um eine beliebige Anzahl von groﬂen Zahlen aufzusummieren  
	 * @param pNumber - Anzahl der BigInteger welche aufaddiert werden soll
	 * @return Summe der BigIntegers, welche aufaddiert werden sollen
	 */
	public static BigInteger sumBigInteger(int pNumber){
		BigInteger sum = new BigInteger();
		BigInteger nextBI = null;
		for(int i = 0; i<pNumber; i++){
			System.out.println("Bitte n‰chste Zahl eingeben: ");
			nextBI = new BigInteger(readConsole());
			sum = sum.add(nextBI);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		int n = 0; // Anzahl der Zahlen, welche aufaddiert werden sollen		
		System.out.println("Wieviele Zahlen sollen aufaddiert werden?");
		System.out.println("Bitte geben Sie eine Zahl ein!");
		n = Integer.parseInt(readConsole());
		BigInteger sumBI = new BigInteger();
		sumBI = sumBigInteger(n);
		sumBI.print();
	}

}
