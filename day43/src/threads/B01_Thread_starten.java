package threads;

public class B01_Thread_starten {

	public static void main(String[] args) {

		Thread th = new Thread();
		th.start();	// beim Scheduler als Runnable melden
		
		//th.start(); // java.lang.IllegalThreadStateException
		
//		public void run() {
//	        if (target != null) {
//	            target.run();
//	        }
//	    }
		
		System.out.println("main");
		
	}

}
