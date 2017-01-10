package loesungen;

class Counter2 implements Runnable {
	
	static final int ITERATIONS = 1_000_000;
	
	static int count;
	
	@Override
	public void run() {
		for (int i = 0; i < ITERATIONS; i++) {
			
			// Kritisch ist das parallele Inkrementieren (nicht atomar):
			count++;
			
			//					count=0
			// Thread 1						Thread 2
			// i = 0						i = 0
			// cpu = count (0)				cpu = count(0)
			// cpu = cpu + 1 (1)			cpu = cpu + 1 (1)
			// count = cpu(1)
			//								count = cpu(1)
		}
		
		System.out.println( Thread.currentThread().getName() + " ist fertig" );
	}
}

public class AufgabeCounter2 {

	public static void main(String[] args) throws InterruptedException {
		
		Counter2 c = new Counter2();
		
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);

		t1.start();
		t2.start();
		
		t2.join();
		t1.join();
		
		System.out.println("count: " + Counter2.count);
	}

}
