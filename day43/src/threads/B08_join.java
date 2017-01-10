package threads;

class ThreadFiveSeconds extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("i = " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(getName() + " ist vorbei");
	}
}

public class B08_join {

	public static void main(String[] args) {

		Thread th = new ThreadFiveSeconds();
		th.start();
		
		try {
			System.out.println("main wird gleich angehalten");
			th.join();
			//Der Thread, in dem die join aufgerufen wird (hier: main),
			//wird angehalten bis der Thread, zu dem die join aufgerufen wird (hier: th), 
			//beendet ist
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main ist vorbei");

	}

}
