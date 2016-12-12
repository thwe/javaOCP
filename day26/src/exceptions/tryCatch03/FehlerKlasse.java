package exceptions.tryCatch03;

public class FehlerKlasse {

	public static void main(String[] args) {
		methodTryCatchFinally();
	}

	public static void methodTryCatchFinally() {
		int number1 = 1;
		int number2 = 0;
		

		for (; number2 < number1; number2++) {
			try {
				System.out.println("Try ... ");
				System.out.println(number1 / number2);
				return;
				
				//Kein Fehler; Beispiel  number1 = 1, number2 = 1
				//finally wird ausgeführt 
				//Methode wird verlassen 
				//- Methodenende wird nicht ausgegeben
				
				//Mit Fehler; Beispiel  number1 = 1, number2 = 0
				//Fehler wird geworfen, d.h es geht zum Catch Block
				//Dann wird alles abgearbeitet
				//Methodenende wird auch ausgegeben
			
			} catch (ArithmeticException e) {
				System.out.println("Catch ... ");
				e.printStackTrace(System.out);
			
			} finally {
				System.out.println("Finally wird immer ausgeführt ... \n");
			}
		}
		
		System.out.println("Methodenende ... ");
	}

}
