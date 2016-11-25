
/**
 * Mit Hilfe dieser Klasse laesst sich die Summe zweier grosser positiver Zahlen
 * berechnen.
 * 
 * Die Methode add() addiert Zahlen stellenweise nach dem Schema der
 * schriftlichen Addition, wie es Grundschülern beigebracht wird.
 */

public class BigInteger {

	// Zeichenpuffer fuer die große Zahl
	private StringBuffer digits;

	private boolean isnegative = false; 
	
	private static char negativesign = '-';
	

	/**
	 * Default-Konstruktor für den Wert null
	 */
	// Methode muss fertig implementiert werden
	public BigInteger () {
		digits = new StringBuffer ("0");
	}
	
	/**
	 * Konstruktor, der denWert aus dem String s liest
	 * 
	 * @param pString
	 */
	public BigInteger (String s) {
		if (s.startsWith(""+BigInteger.negativesign) || s.startsWith("-")) {
			s = s.substring(1);
			isnegative = true;
		}
		digits = new StringBuffer(s);
	}

	/**
	 * Konstruktor für den Wert der int-Zahl n
	 * 
	 * @param n
	 */
	public BigInteger (int n) {
		this(""+n);
	}

	public BigInteger (BigInteger b) {
		this.digits = new StringBuffer (b.digits);
		this.isnegative = b.isnegative;
	}
	
	public BigInteger copy (BigInteger b) {
		this.digits = new StringBuffer (b.digits);
		this.isnegative = b.isnegative;
		return this;
	}
	

	/**
	 * Gibt die Ziffer des BigIntegers an der Stelle p zurueck
	 *
	 * @param p
	 *            Position des Ziffers
	 * @return Ziffer an der Position p.
	 * 
	 *         Steht in einem Zeichen c zum Beispiel '3' und soll aus diesem die
	 *         Ganzzahl 3 werden, so besteht die traditionelle Art darin, eine
	 *         '0' abzuziehen. Die ASCII-Null '0' hat den char-Wert 48, '1' dann
	 *         49, bis '9' schließlich 57 erreicht.
	 * 
	 *         So ist logischerweise '3' – '0' = 51 – 48 = 3.) Die
	 *         digit()-Methode ist dazu eine Alternative. Wir nutzen sie in
	 *         einem kleinen Beispiel, um eine Zeichenkette mit Ziffern
	 *         schließlich in eine Ganzzahl zu konvertieren.
	 * 
	 *         Quelle: Kapitel 4.2.3 Ziffern einer Basis - Java ist auch eine
	 *         Insel
	 *         http://openbook.rheinwerk-verlag.de/javainsel/javainsel_04_002.
	 *         html#dodtp0b270e00-e3a1-4095-aa33-a58a636b5466
	 */
	private int getDigit(int p) {
		if (p >= digits.length()) {
			return 0;
		}
		return digits.charAt(p) - '0';
	}

	/**
	 * Addition zweier BigInteger. Die Methode addiert Zahlen stellenweise nach
	 * dem Schema der schriftlichen Addition, wie es Grundschuelern beigebracht
	 * wird.
	 * 
	 * @param b
	 * @return Summe der zwei BigInteger
	 */
	public BigInteger add(BigInteger b) {
		return this.add(b,true);
	}
	
	public BigInteger add(BigInteger b,boolean bNegativeCheck) {
		if (bNegativeCheck) {
			if (b.isnegative ^ this.isnegative) {
				if (b.isnegative) {
					b.isnegative = false;
					if (this.compareTo(b) < 0) {
						b.isnegative = true;
						return b.add(this);
					}
					else {
						b.isnegative = true;
						return this.substract(b,false);//a+ - b = a - b;
					}
				}
				else {
					BigInteger c = new BigInteger(b.digits.toString());
					this.isnegative = false;
					c.substract(this,false);//  -a +b = b - a;2
					return this.copy (c);
				}
			}
		}
		int maxIndex = getMaxIndexAndFillWithZero(b);
		int ubertrag = 0;
		int sumDigit = 0; 
		for (int i = maxIndex-1; i >=0 ;i--) {
			sumDigit = this.getDigit(i) + b.getDigit(i) + ubertrag;
			ubertrag = sumDigit / 10;
			sumDigit %= 10;
			this.digits.setCharAt(i, (char) (sumDigit+'0'));
		}
		if (ubertrag > 0) {
			this.digits.insert(0,'1');
		}
		return this;
	}
	
	private int getMaxIndexAndFillWithZero (BigInteger b) {
		int maxIndex ;
		if (this.digits.length() > b.digits.length()) {
			maxIndex = this.digits.length() ;
			 for (int i = b.digits.length(); i < maxIndex; i++) {
				 b.digits.insert(0, '0');
			 }
		} else {
			maxIndex = b.digits.length();
			 for (int i = this.digits.length();i < maxIndex;i++) {
				 this.digits.insert(0,'0');
			 }
		}
		return maxIndex;
	}

	/** Ausgabe eines BigIntegers auf der Konsole */
	public void print() {
		System.out.println(this);
	}
	
	public StringBuffer trim() {
		int leadingZeroPos = 0; 
		while (leadingZeroPos < digits.length() && digits.charAt(leadingZeroPos) == '0') 
			leadingZeroPos++;
		digits.delete(0, leadingZeroPos);
		if (digits.toString().isEmpty())
			digits.insert(0, "0");
		return digits;
	}
	
	public String toString () {
		String s = "";
		String b =this.trim().toString(); 
		if (isnegative && !b.equals ("0"))
			s+= ""+BigInteger.negativesign;
		s+= b;
		return s;
	}
	
	public int compareTo (BigInteger b) {
		if (this.isnegative ^ b.isnegative)
			return this.isnegative? -1 : 1;
		else if (this.digits.toString().length() != b.digits.toString().length())
			return this.digits.length() - b.digits.length() ;
		else
			return this.digits.toString().trim().compareTo(b.digits.toString().trim());
	}
	
	public BigInteger substract (BigInteger b) {
		return this.substract(b,true);
	}
	
	public BigInteger substract (BigInteger b, boolean bNegativeCheck) {
		if (bNegativeCheck) {
			if (this.isnegative && b.isnegative) {
			//  (-)a- (-)b = (-)a + b= b - a;
				BigInteger c = new BigInteger(b.digits.toString()); //Kopie erstellen um b nicht zu verändern
				this.isnegative = false;
				c.substract(this,false);
				return this.copy (c);
			}
			else if (this.isnegative && !b.isnegative) {
				//	-a-b = -a + -b = - (a+b)  
				return this.add(b,false);
			}
			else if (!this.isnegative && b.isnegative) {
				return this.add(b,false); //a - -b = a + b
			}
			else if (!this.isnegative && !b.isnegative) {
				//a -b :  passt, nix tun
			}
		}
		boolean bChangeOperands = false;
		//schriftliche Subtraktion funktioniert nur wenn der linke Term größer ist als der rechte. Wenn nicht tausche um und mache das Ergebnis negativ.
		//alle anderen Fälle (Vorzeichen) wurden durch ob. Fallunterscheidung abgedeckt.
		int compare =this.compareTo (b); 
		if ( compare < 0) {
			bChangeOperands = true;
			this.isnegative = true;
		} else if (compare == 0) {
			this.digits = new StringBuffer("0");
			return this;
		}
		if (b.compareTo (new BigInteger(0)) == 0)
			return this;
		int maxIndex = getMaxIndexAndFillWithZero(b);
		int ubertrag = 0;
		int sumDigit = 0; 
		
		for (int i = maxIndex-1; i >=0 ;i--) {
			int d; 
			int d2; 
			if (bChangeOperands) {
				d2 = this.getDigit(i);
				d = b.getDigit(i);
			}
			else {
				d = this.getDigit(i);
				d2 = b.getDigit(i);
			}
			sumDigit = d - (d2+ubertrag);
			int k = 10;
			int nubertrag = 0;
			if (sumDigit < 0) {
				sumDigit = (k+ d) - (d2 + ubertrag);
				nubertrag = 1;
			}
			ubertrag = nubertrag;
			sumDigit %= 10;
			this.digits.setCharAt(i, (char) (sumDigit+'0'));
		}
		if (ubertrag > 0) {
			this.digits.insert(0,'1');
		}
		return this;
	}
	
	public BigInteger multiply (BigInteger b) {
		boolean saveIsNegative = this.isnegative;
		boolean saveBIsNegative = b.isnegative;
		this.isnegative = false;
		b.isnegative = false;
		BigInteger i = new BigInteger(1);
		BigInteger one = new BigInteger(1);
		BigInteger mul = new BigInteger (this);
		while (i.compareTo(b) < 0) {
			this.add(mul);
			i.add(one);
		}
		if (saveIsNegative ^ saveBIsNegative)
			this.isnegative = true;
		b.isnegative = saveBIsNegative;
		return this;
	}
	
	public BigInteger div (BigInteger b) {
		BigInteger i = new BigInteger(0);
		BigInteger one = new BigInteger(1);
		BigInteger mul = new BigInteger (b);
		BigInteger bc = new BigInteger (b);
		mul.isnegative = false;
		bc.isnegative = false;
		while (bc.compareTo(this) <= 0) {
			bc.add(mul);
			i.add(one);
		}
		i.isnegative = this.isnegative^b.isnegative;
		return i;
	}
	
	public BigInteger modulo (BigInteger b) {
		BigInteger i = new BigInteger(0);
		BigInteger one = new BigInteger(1);
		BigInteger mul = new BigInteger (b);
		BigInteger bc = new BigInteger (b);
		mul.isnegative = false;
		bc.isnegative = false;
		boolean savethisisnegative = this.isnegative;
		this.isnegative = false;
		while (bc.compareTo(this) <= 0) {
			bc.add(mul);
			i.add(one);
		}
		bc.substract(mul);
		//bc.isnegative = b.isnegative;
		 this.substract(bc);
		this.isnegative = savethisisnegative;
		return this;
	}
	
	public static char getNegativesign() {
		return BigInteger.negativesign;
	}

	public static void setNegativesign(char negativesign) {
		BigInteger.negativesign = negativesign;
	}
}
