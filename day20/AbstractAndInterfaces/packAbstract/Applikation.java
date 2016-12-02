package packAbstract;

public class Applikation {

	public static void main(String[] args) {
		Animal animal01 = null;
		//animal01 = new Animal();
		//Cannot instantiate the type Animal
		Animal.reportStatic();
		animal01.reportStatic();
		
		animal01 = new Cat();
		animal01.eat();
		animal01.report();
		((Cat) animal01).meau();
		
		Animal animal02 = new Cat("Mitze");
		animal02.eat();
		animal02.report();
		((Cat) animal02).meau();
		
		Cat cat01 = new Cat("Baghira");
		cat01.eat();
		cat01.report();
		cat01.meau();

		Dog dog01 = null;
		//dog01 = new Dog();
		//Cannot instantiate the type Dog
		
		Animal dog02 = new Pudel();
		dog02.eat();
		dog02.report();
		// dog02.bark();
		((Dog) dog02).bark();
		// The method bark() is undefined for the type Animal
		// dog02.play();
		// The method play() is undefined for the type Animal
		((Pudel) dog02).play();
		
		Dog dog03 = new Pudel();
		dog03.eat();
		dog03.report();
		dog03.bark();
		// dog03.play();
		// The method play() is undefined for the type Dog
		((Pudel) dog03).play();
		
		Pudel pudel = new Pudel();
		pudel.eat();
		pudel.report();
		pudel.bark();
		pudel.play();
		
	}

}
