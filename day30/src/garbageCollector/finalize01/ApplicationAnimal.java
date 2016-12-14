package garbageCollector.finalize01;

public class ApplicationAnimal {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		for (int i = 0; i < 1000000000; i++) {
			Animal animal01 = new Animal("Arco", 7);
			//animal01.report();
			System.out.println("\tFree Memory: " + rt.freeMemory());	
		}

	}

}
