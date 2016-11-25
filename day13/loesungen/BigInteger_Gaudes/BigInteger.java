/**
 * 
 */
package mybiginteger;

/**
 * @author Stefan Michael Gaudes
 *
 */
public class BigInteger {

	private StringBuffer sInteger;

	static {
		// 9 223 372 036 854 775 807
		System.out.println("Die groesste LONG Zahl hat den Wert: " + Long.MAX_VALUE + " (9,223 * 10^18)");
	}

	public BigInteger() {
		this.sInteger = null;
	}

	public BigInteger(int n) {

		// benötigt die Zahl n als String, andernfalls würde
		// für n vom Datentyp int die Kapazität des Puffers hinterlegt werden
		this.sInteger = new StringBuffer(String.valueOf(Math.abs(n)));
	}

	// gleiches Spiel für Datentyp Long
	public BigInteger(long n) {
		this.sInteger = new StringBuffer(String.valueOf(Math.abs(n)));
	}

	public BigInteger(String s) {

		// ist zu einfach
		// this.sInteger = new StringBuffer(s);

		this.sInteger = new StringBuffer("");
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				sInteger.append(s.charAt(i));
			}
		}
	}

	public BigInteger(StringBuffer sb) {
		this.sInteger = new StringBuffer(sb);
	}

	public BigInteger add(BigInteger summand) {

		int overFlowFlag = 0, a, b, sum;
		StringBuffer summe = new StringBuffer("");

		// lokale temporäre Variablen schaffen, um mit Stringbuffern
		// zu arbeiten ohne BigInteger von StringBuffer abzuleiten
		StringBuffer summand1 = new StringBuffer(summand == null ? "0" : summand.toString());
		StringBuffer summand2 = new StringBuffer(this.sInteger == null ? "0" : this.sInteger.toString());

		while (summand1.length() > summand2.length()) {
			summand2.insert(0, "0");
		}

		while (summand2.length() > summand1.length()) {
			summand1.insert(0, "0");
		}

		for (int i = summand1.length() - 1; !(i < 0); i--) {
			a = summand1.charAt(i) - 0x30;
			b = summand2.charAt(i) - 0x30;
			sum = a + b + overFlowFlag;
			overFlowFlag = sum / 10;
			sum %= 10;
			summe.insert(0, String.valueOf(sum));
			// nop();
		}

		if (overFlowFlag == 1) {
			summe.insert(0, "1");
		}

		return new BigInteger(summe);
	}

	public void print(String name, int space) {

		switch (space) {
		case 24:
			System.out.printf("%s : %24s%n", name, this.sInteger);
			break;
		case 45:
			System.out.printf("%s : %45s%n", name, this.sInteger);
			break;
		default:
			System.out.printf("%s : %s%n", name, this.sInteger);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s", this.sInteger).trim();
	}

	private void nop() {
		return;
	}

}