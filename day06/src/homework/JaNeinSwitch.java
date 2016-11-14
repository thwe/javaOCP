package homework;

public class JaNeinSwitch {

	
	
public static void main(String[] args){
	
	System.out.println("Antworten sie mit Ja (j oder J) oder Nein (n oder N)");
	
	
	String input= args[0];
	char x=input.charAt(0);
	
	methodCheckInput(x);
	
}	

public static void methodCheckInput(char x) {
	
	System.out.println(x);
	switch (x) {
	case 'j':
		System.out.println("Sie haben mit: 'ja' genatwortet");
		break;
	case 'J':
		System.out.println("Sie habne mit: 'Ja' geantwortet");
		break;
	case 'n':
		System.out.println("Sie habne mit: 'nein' geantwortet");
		break;
	case 'N':
		System.out.println("Sie habne mit: 'Nein' geantwortet");
		break;
	default:
		System.out.println("Sie haben eine undefinierte Eingabe gemacht");
		break;
	}
}

}