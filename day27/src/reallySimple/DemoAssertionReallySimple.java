package reallySimple;

public class DemoAssertionReallySimple {
	
	private void doStuff() {
		int y = 10;
		int x = 15;
		assert (y > x);
		// more code assuming y is greater than x
	}
	
	public static void main(String[] args) {
		DemoAssertionReallySimple dSimple = new DemoAssertionReallySimple();
		dSimple.doStuff();
		
	}
}
