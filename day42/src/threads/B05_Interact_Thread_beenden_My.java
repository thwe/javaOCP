package threads;

class MyThreadDerBeendenLaesst extends Thread {
	
	boolean laufen = true;
	
	@Override
	public void run() {
		System.out.println("Run by "+ Thread.currentThread().getName());
		int x = 0;
		for (int i = 0; i < 10; i++) {
			x++;
			System.out.println(x);
			try {
				Thread.sleep(1000); // Sleep 1s
				} catch (InterruptedException ex) {
					System.out.println("interupt by main ");
				}

		}
		/*
		while(laufen) {
			System.out.println("laufe...");
		}
		*/
		System.out.println("loop beendet");
	}
	
}

public class B05_Interact_Thread_beenden_My {

	public static void main(String[] args) throws InterruptedException  {
		
		
		MyThreadDerBeendenLaesst th = new MyThreadDerBeendenLaesst();
		th.start();
		
		/*
		int x = 0;
		for (int i = 0; i < 10; i++) {
			x++;
			
		}
		*/
		Thread.sleep(2000);
		
		System.out.println("Run by "+ Thread.currentThread().getName());
		th.interrupt();
		//th.laufen = false;
		
	}

}
