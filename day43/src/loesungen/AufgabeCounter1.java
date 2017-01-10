package loesungen;

class Counter1 extends Thread {
//	static int count;
	
	@Override
	public void run() {
		
		for (int i = 0; i < 1000; i++) {
			AufgabeCounter1.count++;
		}
		
		System.out.println( getName() + " ist fertig" );
	}
}

public class AufgabeCounter1 {

	static int count;
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread th = new Counter1();
		th.start();
		
		th.join();
		System.out.println("count: " + count);

	}

}
