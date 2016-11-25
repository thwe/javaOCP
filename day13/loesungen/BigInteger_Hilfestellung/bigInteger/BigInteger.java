package bigInteger;

public class BigInteger {
	// Attribut
	private StringBuffer digits = new StringBuffer();
	

	// Konstruktor 
	public BigInteger(){
		this("");		
	}
	
	public BigInteger(int pNumber) {
		digits.append(pNumber);		
	}
	
	public BigInteger(String sNumber){
		digits.append(sNumber);		
	}
	// Stellenweise Zugriff auf die Ziffern eines Buffers (BigIntegers)
	// for (int i = digits.length()-1; i >=0; i--){
	// getDigit(i); //
	// }
	// getDigit(i) - Ziffer an der i-ten Stelle s. bereits vorhandene Methode
	// die erste Stelle eines StringBuffers (auch Strings = Zeichenkette) hat
	// den Index 0

	// Methoden
	public BigInteger add(BigInteger b) {

		// Rueckgabewert der Methode
		BigInteger result = new BigInteger();

		int sumDigit = 0;
		//sumDigit = Zahl aus Digits + Zahl aus Digits b
		sumDigit = getDigit(1) + b.getDigit(1);
		result.digits.append(sumDigit);
		sumDigit = getDigit(0) + b.getDigit(0);
		result.digits.append(sumDigit);
		
		
		// Umkehrung des Buffers, da die Ziffern in umgekehrter Reihenfolge
		// eingetragen werden
		result.digits.reverse();
		return result;

	}
	
	/** Gibt die Ziffer des BigIntegers an der Stelle p zurueck  
	   *
	     * @param p Position des Ziffers
	     * @return Ziffer an der Position p.
	     */
	private int getDigit(int p) {
		if (p >= digits.length())
			return 0;

		return digits.charAt(p) - '0';
	}
	
	public void print() {
		System.out.println(digits);

	}

}
