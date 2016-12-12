package exceptions.myException.primNumbers;

public class ApplikationPrimNumbers {

	public static void main(String[] args) throws NegPrimNumberException {
		GeneratePrimNumbers gNumbers = new GeneratePrimNumbers();
		//primNumbersTryCatch(gNumbers);
		primNumbersThrows(gNumbers);
	}

	public static void primNumbersTryCatch(GeneratePrimNumbers gNumbers) {
		boolean isPrim = false;
		for (int i = -4; i <= 10; i++) {
			try {
				isPrim = gNumbers.isPrim(i);
				System.out.printf("Die Zahl %d ist eine Primzahl: %b %n", i, isPrim);
			} catch (NegPrimNumberException e) {
				e.printStackTrace();
			}
		}
	}

	public static void primNumbersThrows(GeneratePrimNumbers gNumbers) throws NegPrimNumberException {
		boolean isPrim = false;
		for (int i = -4; i <= 10; i++) {

			isPrim = gNumbers.isPrim(i);
			System.out.printf("Die Zahl %d ist eine Primzahl: %b %n", i, isPrim);

		}
	}
	
	void method(GeneratePrimNumbers generatePrimNumbers){
		
	}

}
