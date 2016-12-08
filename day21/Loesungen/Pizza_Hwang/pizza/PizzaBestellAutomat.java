package pizza;

import java.util.Scanner;

import pizza.bottom.*;
import pizza.topping.*;

public class PizzaBestellAutomat {

	public static final int INPUT_STATE_WELCOME = 0;
	public static final int INPUT_STATE_CHOOSE_BOTTOM = 1;
	public static final int INPUT_STATE_CHOOSE_TOPPING = 2;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = "";
		int state = INPUT_STATE_WELCOME;
		boolean q = false;
		Pizza pizza = null;
		do {
			if (state == INPUT_STATE_CHOOSE_TOPPING) {
				System.out.println ("********bisherige Pizza*********");
				System.out.println(pizza.toString());
				System.out.println("bisheriger Preis : " + pizza.getPrice());
				System.out.println("vegetarisch : " + (pizza.isVegetable() ? "Ja" : "Nein"));
				System.out.println("scharf : " + (pizza.isHot() ? "Ja" : "Nein"));
				System.out.println ("*******************************");
			}
			
			outputToUser(state);
			
			input = scanner.nextLine();
			switch (state) {
			case INPUT_STATE_WELCOME:
				state = INPUT_STATE_CHOOSE_BOTTOM;
				if (input.compareTo ("q") == 0)
					q = true;
				break;
			case INPUT_STATE_CHOOSE_BOTTOM:
				/*Crusty, Grundpreis 3,40 €
				Munchy, Grundpreis 3,95 €
				CuscinoSpeciale, Grundpreis 4,95 €*/
				if (input.compareTo("1") == 0)
					pizza = new Crusty();
				else if (input.compareTo("2") == 0)
						pizza = new Munchy();
				else if (input.compareTo("3") == 0)
					pizza = new CuscinoSpeciale();
				else {
					System.out.println("Falsche Eingabe. Erneut versuchen.");
					break;
				}
				state = INPUT_STATE_CHOOSE_TOPPING;
				break;
			case INPUT_STATE_CHOOSE_TOPPING:
				/*Onions,0,65 C, vegetarisch, mild
				 Ham,2,45 C, nicht vegetarisch, mild
				Salami,2,25 C, nicht vegetarisch, scharf
				Chili,0,95 C, vegetarisch, scharf
				Cheese,1,95 C, vegetarisch, mild
				*/
				if (input.compareTo("0") == 0) {
					state = INPUT_STATE_WELCOME;
					pizza = null;
				}
				else if (input.compareTo("1") == 0)
					pizza = new Onions(pizza);
				else if (input.compareTo("2") == 0)
					pizza = new Ham(pizza);
				else if (input.compareTo("3") == 0)
					pizza = new Salami(pizza);
				else if (input.compareTo("4") == 0)
					pizza = new Chilli(pizza);
				else if (input.compareTo("5") == 0)
					pizza = new Cheese(pizza);
				break;
			}

		} while (!q);

	}
	
	public static void outputToUser(int state) {
		switch (state) {
		case INPUT_STATE_WELCOME:
			System.out.println("Willkommen beim Pizzaautomaten. Drücken Sie eine beliebige Taste zum fortfahren.");
			break;
		case INPUT_STATE_CHOOSE_BOTTOM:
			System.out.println("Wählen Sie einen Boden aus : ");
			System.out.println("1 : Crusty");
			System.out.println("2 : Munchy");
			System.out.println("3 : CusinoSpeciale");
			break;
		case INPUT_STATE_CHOOSE_TOPPING:
			System.out.println("Wählen Sie Beläge aus : ");
			System.out.println("1 : Onions");
			System.out.println("2 : Ham");
			System.out.println("3 : Salami");
			System.out.println("4 : Chili");
			System.out.println("5 : Cheese");
			System.out.println("0 : Kein weiteren Beläge mehr");
			break;
		}
	}


}
