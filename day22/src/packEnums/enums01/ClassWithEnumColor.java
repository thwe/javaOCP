package packEnums.enums01;

public class ClassWithEnumColor {

	private Color color = Color.RED;

	enum Color {
		RED, GREEN, BLUE, YELLOW;
	}

	public void zugriffEnumColor() {
		System.out.println(Color.BLUE);
		System.out.println(Color.GREEN);
	}

	// Methoden
	public Color getColor() {
		return color;
	}

	public void vergleicheEnums() {
		Color color1 = Color.RED;
		
		//mit Vergleichsoperator
		if(color1 != Color.GREEN){
			System.out.println("Gruen wurde nicht ausgewaehlt");
		}
		
		//Alternativ 
		if(color1.equals(Color.RED)){
			System.out.println("Rot wurde ausgewaehlt");
		}
	}
	
	public void vergleicheCompareTo(){
		Color color1 = Color.RED;
		Color color2 = Color.GREEN;
		Color color3 = Color.BLUE;
		Color color4 = Color.YELLOW;
		
		//Links - Rechts
		System.out.println("color1.compareTo(color1): " + color1.compareTo(color1));
		System.out.println("color1.compareTo(color2): " + color1.compareTo(color2));
		System.out.println("color1.compareTo(color3): " + color1.compareTo(color3));
		System.out.println("color1.compareTo(color4): " + color1.compareTo(color4));
		
		System.out.println("color4.compareTo(color3): " + color4.compareTo(color3));
	}

	
	public void methOrdinal(){
		Color color1 = Color.RED;
		Color color2 = Color.GREEN;
		Color color3 = Color.BLUE;
		Color color4 = Color.YELLOW;
		
		System.out.printf("Color.%s hat den Index %d %n", color1, color1.ordinal());
		System.out.printf("Color.%s hat den Index %d %n", color2, color2.ordinal());
		System.out.printf("Color.%s hat den Index %d %n", color3, color3.ordinal());
		System.out.printf("Color.%s hat den Index %d %n", color4, color4.ordinal());
	}
}
