package casting_oreferences;

public class CastTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal [] a = {new Animal(), new Dog(), new Animal() };
		for(Animal animal : a) {
			animal.makeNoise();
		if(animal instanceof Dog) {
			// animal.playDead(); // try to do a Dog behavior ?
			Dog d = (Dog) animal; //CastDown
			d.playDead(); 
			}
		}
		Animal animal = new Animal();
		Dog d = (Dog) animal;
		String s = (String) animal; // animal can't EVER be a String
	}
}
