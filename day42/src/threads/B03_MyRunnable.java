package threads;


class MyRunnable implements Runnable {
	@Override
	public void run() {
		while(true) {
			System.out.println("run");
		}
	}
}


public class B03_MyRunnable {

	public static void main(String[] args) {
		
		Runnable target = new MyRunnable();
		
		Thread th = new Thread(target);
		th.start();

		while(true) {
			System.out.println("main");
		}
		
	}

}
