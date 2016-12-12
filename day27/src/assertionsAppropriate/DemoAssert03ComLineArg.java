package assertionsAppropriate;

/**
 * Don't Use Assertions to Validate Command-Line Arguments
 * 
 * This is really just a special case of the "Do not use assertions to validate
 * arguments to a public method" rule.
 * 
 * If your program requires command-line arguments, you'll probably use the
 * exception mechanism to enforce them.
 *
 */
public class DemoAssert03ComLineArg {

	public static void main(String[] args) {
		// System.out.println(args[0]); // Erstes Element - ganze Zahl
		// System.out.println(args[1]); // Zweites Element - boolean
		// System.out.println(args[2]); // Drittes Element - Flieﬂkommazahl
		// System.out.println(args[3]); // Viertes Element
		// System.out.println(args.length);

		int ganzeZahl = 0;
		boolean wahrheitsWert = false;
		double fliessZahl = 0;
		String operator = "";

		try {
			ganzeZahl = Integer.parseInt(args[0]);
			System.out.println(2 * ganzeZahl);

			// wahrheitsWert = Boolean.parseBoolean(args[1]);
			System.out.println(wahrheitsWert);

			// fliessZahl = Double.parseDouble(args[2]);
			System.out.println(3 * fliessZahl);

			// operator = args[3];
			System.out.println(operator);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

	}

}
