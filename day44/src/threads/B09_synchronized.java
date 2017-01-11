package threads;

class Shared {
	static int count;
}

class Increment extends Thread {

	public void run() {
		for (int i = 0; i < 1000000; i++) {
			synchronized (Shared.class) {
				Shared.count++;
			}
//			System.out.println(getName());
		}
	}
}

public class B09_synchronized {

	public static void main(String[] args) throws InterruptedException {

//		Class x = String.class;
//		String s = new String("Hallo");

		Thread t1 = new Increment();
		Thread t2 = new Increment();

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println("count = " + Shared.count);

	}

}
