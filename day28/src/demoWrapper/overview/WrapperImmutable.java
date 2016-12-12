package demoWrapper.overview;

public class WrapperImmutable {

	public static void main(String[] args) {
		//Wrapper Objekte sind unveränderlich
		Integer y3 = 567; //Wird ein Wrapper Objekt erzeugt
		Integer x3 = y3; //ref.varable y3 wird x3 zugewiesen
		
		System.out.println(x3 + " " + y3);
		System.out.println("x3 == y3: "+ (x3 == y3));
		//Wir überprüfen, ob sie das gleiche Objekt referenzieren
		System.out.println("x3.equals(y3): " + x3.equals(y3));
		//Hier wird Objekt Inhalt verglichen
		
		y3++;
		System.out.println(x3 + " " + y3);
		System.out.println("x3 == y3: "+ (x3 == y3));
		//Wir überprüfen, ob sie das gleiche Objekt referenzieren
		System.out.println("x3.equals(y3): " +x3.equals(y3));
		//Hier wird Objekt Inhalt verglichen
		
		//Im Hintergrund passiert Folgendes 
		y3++; //unwrap, prim. Typ wird erhöht, 
		//zum Schluss wird erneut ein Wrapper objekt erstellt
	}

}
