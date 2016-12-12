package simple;

/** The simple version adds a second expression,
 * separated from the first (boolean expression) 
 * by a colon, this expression's string value is 
 * added to the stack trace. 
 * 
 * Both versions throw an immediate AssertionError,
 * but the simple version gives you a little more 
 * debugging help while the really simple version 
 * simply tells you only that your assumption was 
 * false.
 * 
 * Assertions are typically enabled when an application
 * is being tested and debugged, but disabled when the
 * application is deployed. The assertions are still
 * in the code, although ignored by the JVM, so if 
 * you do have a deployed application that starts 
 * misbehaving, you can always choose to enable 
 * assertions in the field for additional testing.*/
public class DemoAssertionSimple {
	
	private void doStuff() {
		int y = 10;
		int x = 15;
		assert (y > x): "y is " + y + " x is " + x;
		// more code assuming y is greater than x
	}
	
	public static void main(String[] args) {
		DemoAssertionSimple dSimple = new DemoAssertionSimple();
		dSimple.doStuff();
		
	}
}
