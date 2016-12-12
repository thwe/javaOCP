package assertionsAppropriate;

/**
 * If you write a private method, you almost certainly wrote (or control) any
 * code that calls it. When you assume that the logic in code calling your
 * private method is correct, you can test that assumption with an assertion as
 * follows:
 *
 */
public class DemoAssert02PrivMethod {

	private void doMore(int x) {
		assert (x > 0);
		// do things with x
	}

	public static void main(String[] args) {
		DemoAssert02PrivMethod dPrivMethod = new DemoAssert02PrivMethod();
		dPrivMethod.doMore(-10);
	}

}
