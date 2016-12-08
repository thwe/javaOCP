package PizzaAufgabe;

import java.util.Scanner;

public class PizzaAnwendung {

	public static void main(String[] args) {

		Pizza[] pizza1 = createPizza();
		askCustomer(pizza1);
		showTheCheck(pizza1);
		}
	

	public static Pizza[] createPizza(){
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Guten Tag! Welchen Teig hätten Sie gerne? 1 = Crusty, 2 = Munchy, 3 = CuscinoSpeciale");
		int eingabe = scanner.nextInt();
		Pizza[] pizza1 = new Pizza[10];
		//ArrayList<Pizza> al = new ArrayList<Pizza>();	// mit ArrayList muss man sich nicht auf eine Größe wie bei einem Array festlegen
		String teig = "";
		
		switch(eingabe){
		case 1:
			pizza1[0] = new BottomCrusty();
			teig = "Crusty";
			System.out.printf("Danke, Sie haben Teig %s gewählt.%n", teig);
			return pizza1;
		case 2:
			pizza1[0] = new BottomMunchy();
			teig = "Munchy";
			System.out.printf("Danke, Sie haben Teig %s gewählt.%n", teig);
			return pizza1;
		case 3:
			pizza1[0] = new BottomCuscinoSpeciale();
			teig = "CuscinoSpeciale";
			System.out.printf("Danke, Sie haben Teig %s gewählt.%n", teig);
			return pizza1;
		default:
			System.out.println("Ihre Eingabe war fehlerhaft.");
			return createPizza();
			// kann man hier alternativ zum return Wert noch was anderes angeben?
		}
		

	}
	
	public static void addTopping(Pizza pizza1[]){
		int i=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte wählen Sie Ihre Toppings: 1= Zwiebeln, 2 = Schinken, 3 = Salami, 4 = Chilli, 5 = Käse");
		int eingabe = scanner.nextInt();
		for (int j = 0; j < pizza1.length; j++) {
			if(pizza1[j]==null){
				i=j;
				break;
				}
			}
		
		//System.out.println("i = " + i); 	// Test, welche Stelle des Arrays jetzt beschrieben wird
		
		switch(eingabe){
			case 1:
				ToppingOnions onion1 = new ToppingOnions(pizza1[0]);
				pizza1[i] = onion1;				// das hier ist soweit richtig
				askCustomer(pizza1);
				break;
			case 2:
				ToppingHam ham1 = new ToppingHam(pizza1[0]);
				pizza1[i] = ham1;
				askCustomer(pizza1);
				break;
			case 3:
				ToppingSalami salami1 = new ToppingSalami(pizza1[0]);
				pizza1[i] = salami1;
				askCustomer(pizza1);
				break;
			case 4:
				ToppingChili chili1 = new ToppingChili(pizza1[0]);
				pizza1[i] = chili1;
				askCustomer(pizza1);
				break;
			case 5:
				ToppingCheese cheese1 = new ToppingCheese(pizza1[0]);
				pizza1[i] = cheese1;
				askCustomer(pizza1);
				break;
			default:
				System.out.println("Ihre Eingabe war fehlerhaft.");
				addTopping(pizza1);
				break;
		}
		
	}
	
	public static void askCustomer(Pizza[] pizza1){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Möchten Sie zu Ihrer Pizza Toppings hinzufügen? J = Ja, N = Nein");
		String eingabeString = scanner.nextLine();
		//System.out.println(eingabeString.length());
		if(eingabeString.equalsIgnoreCase("J")){
		//if(eingabeString=="J"){ --> funktioniert in diesem Programm nicht! Besser vermeiden!
			addTopping(pizza1);
		}
	}
	
//	public static void askCustomer(Pizza[] pizza1){
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Möchten Sie zu Ihrer Pizza Toppings hinzufügen? 1 = Ja, 0 = Nein");
//		int eingabeInt = scanner.nextInt();
//		if(eingabeInt == 1){
//			addTopping(pizza1);
//		}
//	}
	
	public static void showTheCheck(Pizza[] pizza1){
		int sum = 0;
		boolean vegetarian = true;
		boolean hotness = false;
		for (int i = 0; i < pizza1.length && pizza1[i]!=null; i++) {
			sum = sum + pizza1[i].getPrice();
			if(pizza1[i].isVegetable() == false){
			vegetarian = false;
			}
			if(pizza1[i].isHot() == true){
			hotness = true;
			}
			
		}
		double endsum = (double)sum;
		endsum = endsum/100;
		
		String vegetarisch = "vegetarisch";
		String scharf = "mild";
		if(vegetarian == false){
			vegetarisch = "nicht vegetarisch";
		}
		if(hotness == true){
		scharf = "scharf";
		}
		
		System.out.printf("Ihre Pizza ist %s und %s.%n", vegetarisch, scharf);
		System.out.println("Die Pizza kostet " + endsum + " €." );
		System.out.println("Guten Appetit!");
	}

}
