package threads;
class Utils {
	static void bigJob(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Producer implements Runnable {
	private boolean habeDaten = false;
	
	public boolean hasData() {
		return habeDaten;
	}
	
	public void useData() {
		habeDaten = false;
	}
	
	@Override
	public void run() {
		
		while(true) {
			System.out.println("es wird produziert...");
			Utils.bigJob(500);
			synchronized (this) {
				habeDaten = true;
				this.notifyAll(); //notify()
			}
		}
	}
}

class Consumer extends Thread {
	private Producer p;
	
	public Consumer(Producer p) {
		this.p = p;
	}

	@Override
	public void run() {
		while(true) {
			synchronized (p) {
				try {
					p.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			//Achtung! Zugriffe auf habeDaten müssen noch synchronisiert werden
			System.out.println("Consumer sucht nach Daten");
			
			if( p.hasData() ) {
				System.out.println("es wird konsumiert");
				p.useData();
			}
		}
	}
}

/*
 * - Die Kommunikation zw. dem Producer und Consumer läuft über den GEMEINSAMEN Monitor!
 * - wait/notify/notifyAll müssen aus einem synchronized-Block aufgerufen werden
 * - Synchronisiert MUSS mit demselben Monitor, mit dem wait/notify/notifyAll aufgerufen werden 
 */
public class B12_wait_notify {

	public static void main(String[] args) {
		Producer p = new Producer();
		
		Thread producerThread = new Thread(p);
		producerThread.start();

		Thread c = new Consumer(p);
		c.start();
	}

}
