package assertionsAppropriate;
/**
 * 
 * Don't Use Assertions to Validate Arguments to a Public Method
 * 
 * A public method might be called from code that you don't control (or from
 * code you have never seen).
 * 
 * If you need to validate public method arguments, you'll probably use
 * exceptions to throw, say, an IllegalArgumentException if the values passed to
 * the public method are invalid.
 *
 */
public class DemoAssert01PubMethod {
	public void doStuffA(int x) {
		assert (x > 0); // inappropriate !
		// do things with x
	}
	
	public void doStuffE(int x) throws IllegalArgumentException  {
		if(x<0){
			throw new IllegalArgumentException();
		}
	}
	
	public static void main(String[] args) {
		DemoAssert01PubMethod dMethod = new DemoAssert01PubMethod();
		dMethod.doStuffA(10);
		dMethod.doStuffE(-10);
	}
}
