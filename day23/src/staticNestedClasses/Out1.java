package staticNestedClasses;

public class Out1 {

	private static int number1 = 3;
	int number2 = 5;

	public Out1() {
		System.out.println("Konstruktor von Out1");
	}

	static class In {
	
		public In() {
			System.out.println("Konstruktor einer statischen inneren Klasse");
		}

		void doSomething() {
			System.out.println("Zugriff auf das private äußere Klassenvariable: " + number1);
			// System.out.println("Zugriff auf das Attribut der auesseren
			// Klasse: " + number2);
			// In einem statischen Kontext steht kein Referenz zum Zugriff zur
			// Verfügung
			
			demoMethodStatic();
		}
		
		static void staticMethodNC(){
			
			System.out.println("Huhu");
		}
	}
	
	static void demoMethodStatic(){
		int i =0;
		System.out.println("Ich bin eine statische Methode");
	}
	
	void demoMethodNStatic(){
		int i =0;
		System.out.println("Ich bin eine statische Methode");
	}
	
	public static void main(String[] args) {
		In in = new In();
	}

}
