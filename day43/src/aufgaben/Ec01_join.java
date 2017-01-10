package aufgaben;

class ThreadIncVar extends Thread {
	//public static int countx;
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			Ec01_join.countx++;
			
			
		}
		
		System.out.println(getName() + " ist vorbei");
	}
}

public class Ec01_join {
	static int countx;
	public static void main(String[] args) {

		Thread th = new ThreadIncVar();
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
		System.out.println("countx = " +  countx);
		System.out.println("main ist vorbei");

	}

}
