package testBereich;

import hausaufgabenT13.BigInteger_Template;

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
	// Methoden
	public BigInteger add(BigInteger b) {

		// Rueckgabewert der Methode
		BigInteger result = new BigInteger();

		int sumDigit = 0;
		//sumDigit = Zahl aus Digits + Zahl aus Digits b
		sumDigit = getDigit(0) + b.getDigit(0);
		result.digits.append(sumDigit);
		// Umkehrung des Buffers, da die Ziffern in umgekehrter Reihenfolge
		// eingetragen werden
		result.digits.reverse();
		return result;

	}
	private int getDigit(int p) {
		if (p >= digits.length())
			return 0;

		return digits.charAt(p) - '0';
	}
	
	public StringBuffer getDigits() {
		return digits;
	}
	public void setDigits(StringBuffer digits) {
		this.digits = digits;
	}
	public void print() {
		System.out.println(digits);

	}

}
