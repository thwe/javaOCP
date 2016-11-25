package conSuper;

public class ApplikationAnimal {

	public static void main(String[] args) {
		Animal animal01 = new Animal();
		animal01.report();
		
		Animal animal02 = new Animal("Struppi");
		animal02.report();
		
		Animal animal03 = new Animal("Ani", 14);
		animal03.report();
		
		Cat cat01 = new Cat();
		cat01.report();
		
		Cat cat02 = new Cat("Speedbump");
		cat02.report();
		
		Cat cat03 = new Cat("Garfield", 50);
		cat03.report();
		
		Cat cat04 = new Cat("Baghira", 25, "Panther");
		cat04.report();
		
		Persian persian01 = new Persian("Mitzi", 10, 300);
		persian01.report();

	}

}
