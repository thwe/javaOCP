package assertionsAppropriate;

/**
 * Do Use Assertions, Even in Public Methods, to Check for Cases that You Know
 * Are Never, Ever Supposed to Happen
 *
 */
public class DemoAssert04ChekCases {

	public void doStuffA() {
		int y = 0;
		for (int x = 1; x < 5; x++) {
			switch (x) {
			case 1:
				y = 3;
				System.out.println("y: " + y);
				break;
			case 2:
				y = 9;
				System.out.println("y: " + y);
				break;
			case 3:
				y = 27;
				System.out.println("y: " + y);
				break;
			default:
				assert false : "we're never supposed to get here!";
			}
		}

	}

	public static void main(String[] args) {
		DemoAssert04ChekCases dCases = new DemoAssert04ChekCases();
		dCases.doStuffA();
	}

}
