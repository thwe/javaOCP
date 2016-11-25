package aufgabe.bigInteger;
/**
 * @author Monika Tepfenhart
 * @version 1.0
 * 26.11.2010
 * 
 * Mit dieser Klasse laesst sich die Summe zweier großer positiver Zahlen berechnen.
 * 
 * Die Methode add() addiert Zahlen stellenweise nach dem Schema der schriftlichen 
 * Addition, wie es Grundschülern beigebracht wird.
 */

public class BigInteger {
	
	//Zeichenpuffer fuer die große Zahl
	private StringBuffer digits = new StringBuffer();
	
	/**
	 * Default-Konstruktor für den Wert null
	 */
	public BigInteger(){
		this("");
	}
	
	/**
	 * Konstruktor für den Wert der int-Zahl n
	 * @param n
	 */
	public BigInteger(int n){
		digits.append(String.valueOf(n));
	}
	
	/**
	 *  Konstruktor, der denWert aus dem String s liest
	 * @param pString
	 */
	public BigInteger(String pString){
		digits.append(pString);
		
	}
	
	/**
	 * Kopier-Konstruktor, der die Zahl b kopiert.
	 * @param b
	 */
	public BigInteger(BigInteger b){
        digits = new StringBuffer(b.digits);
    }
		
	 /** Gibt die Ziffer des BigIntegers an der Stelle p zurueck  
	 *
     * @param p Position des Ziffers
     * @return Ziffer an der Position p.
     * 
     * Steht in einem Zeichen c zum Beispiel '3' und soll aus diesem
     * die Ganzzahl 3 werden, so besteht die traditionelle Art darin, 
     * eine '0' abzuziehen. Die ASCII-Null '0' hat den char-Wert 48, 
     * '1' dann 49, bis '9' schließlich 57 erreicht. 
     * 
     * So ist logischerweise '3' – '0' = 51 – 48 = 3.) 
     * Die digit()-Methode ist dazu eine Alternative. 
     * Wir nutzen sie in einem kleinen Beispiel, um eine Zeichenkette
     * mit Ziffern schließlich in eine Ganzzahl zu konvertieren. 
     *
     * Quelle: Kapitel 4.2.3 Ziffern einer Basis - Java ist auch eine Insel
     * http://openbook.rheinwerk-verlag.de/javainsel/javainsel_04_002.html#dodtp0b270e00-e3a1-4095-aa33-a58a636b5466 
     */
    private int getDigit(int p)
    {
        if(p >= digits.length())
            return 0;

        return digits.charAt(p) - '0';
    }
	

	
    /** Methode vergleicht die Laenge der Strings welche große Zahlen repraesentieren
     *  und fuellt die kleinere Zahl am Anfang mit Nullen auf, damit Beide Zahlen die 
     *  gleiche Laenge haben. 
     *  
     * @param b
     * @return Die Zahl welche mit Nullen aufgefuellt wurde, wird zurueckgegeben 
     */
    public BigInteger adjustLength(BigInteger b){
    	
    	//Rueckgabewert der Methode
    	BigInteger result = new BigInteger(); 
    	
    	//OffsetIndex bis zu dem Nullen aufgefuellt werden muessen
    	int offsetIndex = 0;
    	
    	//Ermittlung des OffsetIndex und des BigIntegers welche aufgefuellt werden muß
    	if (digits.length() >= b.digits.length()){
    		offsetIndex = digits.length() - b.digits.length();
    		result = b;
    	} else{
    		offsetIndex = b.digits.length() - digits.length();
    		result = this;
		}
    	
    	//Auffuellen des kuerzeren BigIntegers
    	for (int i = 1; i <= offsetIndex; i++){
        	result.digits.insert(0, 0);
    	} 
    	return result;
    }
     
    
    
	/** Addition zweier BigInteger. Die Methode addiert Zahlen stellenweise nach dem Schema
     *  der schriftlichen Addition, wie es Grundschülern beigebracht wird.
	 * 
	 * @param b
	 * @return Summe der zwei BigInteger
	 */
	public BigInteger add(BigInteger b){
		
		//Rueckgabewert der Methode
		 BigInteger result = new BigInteger();
		 
		 //Restwert 
		 int carry = 0;
		 
		 //Summe zweier Ziffern untereinander
	     int sumDigit = 0;
  
	     //Anpassung der Laengen der zwei Zahlen
		 if (digits.length() >= b.digits.length()){
			 this.adjustLength(b);
			
		 } else{
			 b.adjustLength(this);	 
		 }
		 
		 //Addition der zwei Zahlen
		for (int i = digits.length()-1; i >=0; i--){
			sumDigit = getDigit(i) + b.getDigit(i) + carry;
			
			// Die Summe zweier Ziffer ist groesser 10 
			if(sumDigit > 9){
				
				//Betraegt die Summe der ersten zwei Ziffern 10 oder mehr,
				//so muss dies entsprechend berueckschtigt werden und die 
				//Zahl vorne um die eins erweitert werden
				if(i==0){
					carry = 0;
					result.digits.append(sumDigit%10);
					result.digits.append(1);
				} //Alle uebrigen Stellen 
				else{
					carry = 1;
					sumDigit = sumDigit -10 ;
					result.digits.append(sumDigit);
				}
			}// Die Summe zweier Ziffer ist kleiner 10 
			else{
				carry = 0;
				result.digits.append(sumDigit);
			}
		 }
		//Umkehrung des Buffers, da die Ziffern in umgekehrter Reihenfolge eingetragen werden
		result.digits.reverse();  	
		return result;
		  	
	    }
	
	 /** Ausgabe eines BigIntegers auf der Konsole  */
    public void print()
    {
        System.out.print(digits);
    }

}
