package threads;

class MyThread extends Thread {
	@Override
	public void run() {
		while(true) {
			System.out.println("run...");
		}
	}
}

public class B02_MyThread {

	public static void main(String[] args) {

		Thread th = new MyThread();
		th.start();
		
		while(true) {
			System.out.println("main...");
		}

	}

}
