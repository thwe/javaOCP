package generics;

// Definieren:
class Foo <T extends Number> {	// übersetzt: T IS-A Number
	void process(T t) {}
}

public class B01_definieren_und_einsetzen {

	public static void main(String[] args) {
		
		// Einsetzen:
		Foo<Integer> x = new Foo<Integer>();
		//x.process("Hallo");
		x.process(22);
		
		

	}

}
