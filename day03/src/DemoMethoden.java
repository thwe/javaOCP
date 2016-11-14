public class DemoMethoden{


// Klassenvariable

	static int zahl = 25;

	
	public static void main(String[] args){
		methodePar("Das ist ein Test...");
		addiereZahlen(10, 100);
		methodeOhnePar();
		quadriereZahl();

	}

//methode mit Rückgabewerten

	int zahl1 = 23;
	int zahl2 = 46;
	int ergbnis = addiereZweiZahlen(23,46); //zahl1 + zahl2;
	System out println(zahl1 + " + " +zahl2 +":= " + ergbnis;
	addiereZweiZahlen(23,46);


//Methode mit Parameter

	public static void methodePar(String str){
		System.out.println(str);
	}

public static void addiereZahlen(int zahl1, int zahl2) {
	int summe =  zahl1 + zahl2;
	System.out.println("Die Summe von " + zahl1 +" und "  + zahl2 +" ist: " + summe);
}

// Methoden ohne Parameter

public static void methodeOhnePar(){

	System.out.println("Ich habe keinen Parameter bekommen");
}

public static void quadriereZahl(){
	int quadrat = zahl * zahl;   //zahl ist die Klassenvariable
	System.out.println("Das Quadrat von " + zahl + " ist: " + quadrat);
}

//Methode mit Rückgabewerten

public static int addiereZweiZahlen(intzahl1, int zahl2){
	int summe= zahl1 + zahl2;
	return summe;
}


public static String verbindeZeichenkette(String str1, String str2){
	String neuStr=str1+str2;
	return neuStr;
}


//void bedeutet kein Rückgabewert
public static void verbindeZeichenketteVoid(String str1, String str2){
	String neuStr=str1+str2;
	System.out.println(str1 "+" str2 " := " + neuStr);


}