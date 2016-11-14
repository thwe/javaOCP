package kontrollstruk.verzweigungen;
/**
 * 
 * Wichtig fuer die OSPJP Pruefung
 * In der Praxis sollte so NICHT programmiert werden
 * In der Praxis sollten immer Klammer fuer die Bloecke verwendet werden
 *
 */
public class DemoIfElseWOParentheses {

	public static void main(String[] args) {
		demoIf(100);

	}

	public static void demoIf(int i) {
		if (i <= 100) 
			System.out.println("Huhu ... " + i + " ist kleiner oder gleich 100");
			System.out.println("Huhu ... " + i + " ist kleiner oder gleich 100");

	}

	public static void demoIfElse(int i) {
		if (i <= 100) 
			System.out.println("Huhu ... " + i + " ist kleiner oder gleich 100");
			// System.out.println("Huhu ... " + i + " ist kleiner oder gleich 100");
			// führt zum Fehler, zwischen if und else darf Nichts stehen
		else 
			System.out.println(i + " ist LEIDER nicht kleiner oder gleich 100");
	}

	public static void demoIfElse2(int i) {
		if (i <= 100) 
			if (i >= 100)
			System.out.println("Huhu ... " + i + " ist kleiner oder gleich 100");
			else
			System.out.println("Innerer Else");	
		else 
			System.out.println(i + " ist LEIDER nicht kleiner oder gleich 100");
	}

	public static void demoIfElseMult(int i) {
		if (i <= 10) 
			System.out.println("10");
		 else if (i <= 20) 
			System.out.println("20");
		 else if (i <= 30) 
			//System.out.println("30");
			 if (i >= 10)
					System.out.println("Huhu ... " + i + " ist kleiner oder gleich 100");
					else
					System.out.println("Innerer Else");	
		 else 
			System.out.println("Else");
		
	}
	
	public static void demoIfElseMult2(int i) {
		if (i <= 10) 
			System.out.println("10");
		 else if (i <= 20) 
			System.out.println("20");
		 else if (i <= 30) 
			System.out.println("30");
		 else 
			System.out.println("Else");
		
	}
}
