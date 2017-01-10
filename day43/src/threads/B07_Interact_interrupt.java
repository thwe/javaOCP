package threads;

class MyRunnableDieSichInterruptenLaesst implements Runnable {
	
	@Override
	public void run() {
		
		while(true) {
			System.out.println("laufe...");
			
			try {
				Thread.sleep(1000); 		//wenn interrupted == true:
											//- InterruptedException werfen 
											//- und interrupted = false setzen
			} catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getName() + " wurde interrupted");
				break;
			}
		}
		
	}
}

public class B07_Interact_interrupt {

	public static void main(String[] args) throws InterruptedException {

		Thread th = new Thread(new MyRunnableDieSichInterruptenLaesst());
		th.start();

		Thread.sleep(5000);
		System.out.println("main-Thread interrupted den anderen Thread:");
		th.interrupt();
		
	}

}
