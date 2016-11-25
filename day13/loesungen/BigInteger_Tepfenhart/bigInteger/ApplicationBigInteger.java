package aufgabe.bigInteger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Monika Tepfenhart
 * @version 1.0
 * 26.11.2010
 * 
 * Klasse zum Testen der Klasse BigInteger, welche die Summe zweier gro�er prositiver Zahlen berechnet
 */
public class ApplicationBigInteger {

	/** Die Methode readConsole() liest Zeichenfolge von der Konsole ein und gibt diese zurueck
	 * @return
	 */
	public static String readConsole(){
		String number = new String("");
		
		System.out.println("Bitte geben Sie eine Zahl ein!");
		BufferedReader bufferOne = new BufferedReader(new InputStreamReader(System.in));

		try {
			number = bufferOne.readLine();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return number;
	}
	
	
	/** Methode sumBigInteger(int pNumber) um eine beliebige Anzahl von gro�en Zahlen aufzusummieren  
	 * @param pNumber - Anzahl der BigInteger welche aufaddiert werden soll
	 * @return Summe der BigIntegers, welche aufaddiert werden sollen
	 */
	public static BigInteger sumBigInteger(int pNumber){
		BigInteger sum = new BigInteger();
		BigInteger nextBigInteger = null;
		for (int i = 0; i < pNumber; i++){
			nextBigInteger = new BigInteger(readConsole());
			sum = sum.add(nextBigInteger);
		}
		return sum;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int n = 0; // Anzahl der Zahlen, welche aufaddiert werden sollen
		System.out.println("Wieviele Zahlen sollen aufaddiert werden?");
		n = Integer.parseInt(readConsole());
		
		BigInteger sumBI = new BigInteger();
		
		sumBI = sumBigInteger(n);
		System.out.println("Die Summe der " + n + " Zahlen, die Sie eingeben haben, ist: " );
		sumBI.print();
		
	}

}
