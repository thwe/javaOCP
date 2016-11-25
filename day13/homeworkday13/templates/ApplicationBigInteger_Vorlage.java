package templates;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ApplicationBigInteger_Vorlage {

	/** Die Methode readConsole() liest Zeichenfolge von der Konsole ein und gibt diese zurueck
	 * @return
	 */
	public static String readConsole(){
		String number = new String("");
		
		System.out.println("Bitte geben Sie eine gro�e Zahl ein!");
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
	public static BigInteger_Vorlage sumBigInteger(int pNumber){
		BigInteger_Vorlage sum = new BigInteger_Vorlage();
		// Methode muss fertig implementiert werden 
		return sum;
	}
	
	public static void main(String[] args) {
		
		int n = 0; // Anzahl der Zahlen, welche aufaddiert werden sollen
		System.out.println("Wieviele Zahlen sollen aufaddiert werden?");
		n = Integer.parseInt(readConsole());
		
		// Methode muss fertig implementiert werden 
		
	}

}
