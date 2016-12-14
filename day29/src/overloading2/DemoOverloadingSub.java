package overloading2;

public class DemoOverloadingSub extends DemoOverloading {

	// A method can be overloaded in the same class or in
	// a subclass. In other words, if class A defines a 
	// doStuff(int i) method, the subclass B could define a 
	// doStuff(String s) method without overriding the superclass
	// version that takes an int. So two methods with the same name
	// but in different classes can still be considered overloaded,
	// if the subclass inherits one version of the method and then
	// declares another overloaded version in its class definition.
	//
	// Overloaded methods MUST change the argument list.
	public void methode1(byte b, int i, int l) {
		System.out.println();
	}

	public void methode1(byte b) {
		System.out.println();
	}

	protected String methode4(String str, String str2) {
		System.out.println();
		return "";
	}
}
