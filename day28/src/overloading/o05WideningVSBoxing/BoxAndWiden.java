package overloading.o05WideningVSBoxing;

public class BoxAndWiden {

	public static void main(String[] args) {
		byte b = 5;
		go(b);
		// can this byte turn into an Object ?

		// Wow! Here's what happened under the covers when the compiler,
		// then the JVM, got to the line that invokes the go() method:

		// 1. The byte b was boxed to a Byte.

		// 2. The Byte reference was widened to an Object (since Byte extends
		// Object).

		// 3. The go() method got an Object reference that actually refers to
		// a Byte object.

		// 4. The go() method cast the Object reference back to a Byte reference
		// (re
		// member, there was never an object of type Object in this scenario,
		// only an
		// object of type Byte!).

		// 5. The go() method printed the Byte's value.
	}

	static void go(Object o) {
		Byte b2 = (Byte) o; 
		//Voraussetzung hinter dem o ist tatsächlich Byte -Objekt
		System.out.println(b2);
	}
}
