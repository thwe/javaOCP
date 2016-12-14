package overloading2;

public class Applikation {

	public static void main(String[] args) {
		DemoOverloadingSub dSub = new DemoOverloadingSub();
		dSub.methode1((byte)3, 5);
		dSub.methode1((byte)5);
		//Es sind vier Methoden da, d.h. 
		//methode1 wurde in der Subklasse überladen
	}

}
