package threads;

class MyThreadDerSichBeendenLaesst extends Thread {
	
	boolean laufen = true;
	
	@Override
	public void run() {
		while(laufen) {
			System.out.println("laufe...");
		}
		
		System.out.println("regulär beendet");
	}
	
}

public class B05_Interact_Thread_beenden {

	public static void main(String[] args) {
		
		
		MyThreadDerSichBeendenLaesst th = new MyThreadDerSichBeendenLaesst();
		th.start();
		
		
		int x = 0;
		for (int i = 0; i < 1000000000; i++) {
			x++;
		}
		
		System.out.println("main");
		th.laufen = false;

	}

}
