package homeworkday12;

public class AppBuch {

	public static void main(String[] args){
				
		Buch buch01 = new Buch("Also Sprach Zarathustra", "Friedrich Nitsche", "dtv", 330);
		buch01.showObj();
		System.out.println();
		
		Buch buch02 = new Buch("Geschichten von Herrn Keuner", "Bertold Brecht", "Aufbau", 130);
		buch02.showObj();
		System.out.println();
		
		Buch buch03 = new Buch("Der alte Mann und das Mehr", "Ernest Hemmingway", "Rowohlt", 160);
		buch03.showObj();
		System.out.println("\nSorry vertippt!\n");
		buch03.setTitel("Der alte Mann und das Meer");
		buch03.showObj();
	}
}
