package exceptions.tryCatch02;

public class FehlerKlasse {

	public static void main(String[] args) {
		//methodTryCatchFinally();
		methodTryFinally();
	}

	public static void methodTryCatchFinally() {
		int number1 = 1;
		int number2 = 0;

		for (; number2 <= number1; number2++) {
			try {
				System.out.println(number1 / number2);
			} catch (ArithmeticException e) {
				e.printStackTrace();
			} finally {
				System.out.println("Finally wird immer ausgeführt ... \n");
			}
		}
	}
	
	public static void methodTryFinally() {
		int number1 = 1;
		int number2 = 0;

		for (; number2 <= number1; number2++) {
			try {
				System.out.println(number1 / number2);
			}finally {
				System.out.println("Finally wird immer ausgeführt ... \n");
			}
		}
	}

}
