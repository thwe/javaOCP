package p021TypKonvertierungReferenzen.tiere;

public class ApplikationTyKonvertierung {

	public static void main(String[] args) {
		// showAccess();

		// Implizite Typkonvertierung
		// implKonvertierung();

		// Explizite Konvertierung
		 explKonvertierung01();
		 explKonvertierung02();

	}

	private static void implKonvertierung() {
		Dog dog = new Dog();
		Animal animal = dog;
		animal.report();
		dog.report();
		dog.bark();
	}

	private static void explKonvertierung01() {
		Animal animal = new Dog();
		Dog dog = (Dog) animal;

		/*
		 * dog = (Dog)animal ist nur dann zul�ssig, wenn die Referenz animal auf
		 * ein Objekt vom Typ Dog zeigt.
		 *
		 * Sonst gibt es Class Cast Exception
		 */

		animal.report();
		dog.report();
		dog.bark();

	}

	private static void explKonvertierung02() {
		Animal animal = new Animal();
		Dog dog = (Dog) animal;

		animal.report();
		dog.report();
		dog.bark();

	}
	
	private static void showAccess() {
		Animal animalCat = new Cat();
		System.out.println(animalCat.getAge());
		((Cat) animalCat).meow();

		Animal animalDog = new Dog();
		System.out.println(animalDog.getAge());
		((Dog) animalDog).bark();

		Animal[] animalArray = new Animal[2];
		animalArray[0] = animalCat;
		animalArray[1] = animalDog;

		for (Animal animal : animalArray) {
			animal.report();
			if (animal instanceof Cat) {
				((Cat) animal).meow();
			} else if (animal instanceof Dog) {
				((Dog) animal).bark();
			}
		}

	}

}
