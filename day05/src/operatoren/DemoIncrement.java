package operatoren;

public class DemoIncrement {

	public static void main(String[] args) {
		//simpleDecrement();
		//simpleIncrement();
		increment();
		
	}

	public static void simpleIncrement(){
		int int1 = 0;
		int1++; //Postinkrement
		System.out.println("int1: " + int1);
		++int1; //Präinkrement
		System.out.println("int1: " + int1);
	}
	
	public static void increment(){
		int int1 = 0;
		System.out.println("int1: " + int1++ + " : " + int1);
		System.out.println("int1: " + int1 + " Kontrollausgabe");
		
		System.out.println("int1: " + ++int1 + " : " + int1);
		System.out.println("int1: " + int1 + " Kontrollausgabe");
	}
	
	public static void simpleDecrement(){
		int int1 = 0;
		int1--; //Postdekrement
		System.out.println("int1: " + int1);
		--int1; //PräDekrement
		System.out.println("int1: " + int1);
	}
	
	public static void decrement(){
		int int1 = 0;
		
		System.out.println("int1: " + int1-- + " : " + int1);
		System.out.println("int1: " + --int1 + " : " + int1);
	}
}

