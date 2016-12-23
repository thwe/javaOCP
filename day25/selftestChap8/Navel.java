/*
 * Question 11
 */

public class Navel {

private int size = 7;
private static int length = 3;

	public static void main(String[] args) {

		new Navel().go();
	}

	void go() {

		int size = 5;
		System.out.println(new Gazer().adder());
	}

class Gazer {

	int adder() {
		return size * length; }
	}
}

/*
What is the result?
A. 15
B. 21
C. An exception is thrown at runtime
D. Compilation fails due to multiple errors
E. Compilation fails due only to an error on line 4
F. Compilation fails due only to an error on line 5
*/