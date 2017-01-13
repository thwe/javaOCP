package aufgaben.baeckerei;

public class Test {

	public static void main(String[] args) {

		Baeckerei agethen = new Baeckerei("Agethen");
		
		Thread agethenThread = new Thread(agethen);
		agethenThread.start();
		
		Person peter = new Person("Peter", agethen);
		new Thread(peter).start();

		Person paul = new Person("Paul", agethen);
		new Thread(paul).start();
		
		
		Baeckerei kamps = new Baeckerei("Kamps");
		new Thread(kamps).start();
		
		Person mary = new Person("Mary", kamps);
		new Thread(mary).start();
		
	}

}
