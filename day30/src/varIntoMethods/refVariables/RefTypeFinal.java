package varIntoMethods.refVariables;

//class Sub extends RefTypeFinal{}
//The type Sub cannot subclass the final class RefTypeFinal

public final class RefTypeFinal {
	private int zahl1;
	private int zahl2;
	
	private String str1;
	
	public RefTypeFinal() {
		zahl1 = 10;
		zahl2 = 20;
		str1 = "zeichenkette";
	}
	
	public RefTypeFinal(int z1, int z2, String str) {
		zahl1 = z1;
		zahl2 = z2;
		str1 = str;
	}
	
	public int getZahl1() {
		return zahl1;
	}

	public void setZahl1(int zahl1) {
		this.zahl1 = zahl1;
	}

	public int getZahl2() {
		return zahl2;
	}

	public void setZahl2(int zahl2) {
		this.zahl2 = zahl2;
	}
	
	public String getStr1() {
		return str1;
	}

	public void setStr1(String str1) {
		this.str1 = str1;
	}

	@Override
	public String toString() {
		
		return "zahl1: " + zahl1 + " zahl2: " + zahl2 + " str1: " + str1;
	}

}
