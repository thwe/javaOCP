package casting_oreferences;

public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal();
		Dog d = (Dog) animal;
		// compiles but fails later
	}

}
