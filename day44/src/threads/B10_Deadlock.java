package threads;

class Deadlock extends Thread {
	
	static Object m1 = new Object();
	static Object m2 = new Object();
	
	@Override
	public void run() {
		synchronized (m1) {
			System.out.println("m1 " + getName());
			
			synchronized (m2) {
				System.out.println("m1.m2 " + getName());
			}
		}
		
		synchronized (m2) {
			System.out.println("m2 " + getName());
			
			synchronized (m1) {
				System.out.println("m2.m1 " + getName());
			}
		}
	}
}

public class B10_Deadlock {

	public static void main(String[] args) {

		new Deadlock().start();
		new Deadlock().start();

	}

}
