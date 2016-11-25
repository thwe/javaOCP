package vererbung;

public class ApplikationAnimal {

	public static void main(String[] args) {
		Animal animal01 = new Animal();
		animal01.report();
		
		Cat cat01 = new Cat();
		cat01.report();
		cat01.setAge(10);
		cat01.setName("Susi");
		cat01.setRasse("Siamesisch");
		cat01.report();
		

	}

}
