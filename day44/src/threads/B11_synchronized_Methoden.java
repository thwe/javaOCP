package threads;

class MyLogger {
	
	private StringBuilder sb = new StringBuilder();
//	private StringBuffer sb = new StringBuffer();
	
//	public void addMessage(String caller, String msg) {
//		synchronized (this) {
//			sb.append(caller);
//			sb.append(" - ");
//			sb.append(msg);
//			sb.append("\n");
//		}
//	}

	public synchronized void addMessage(String caller, String msg) {
		sb.append(caller);
		sb.append(" - ");
		sb.append(msg);
		sb.append("\n");
	}

//	@Override
//	public String toString() {
//		synchronized (this) {
//			return sb.toString();
//		}
//	}
	
	@Override
	public synchronized String toString() {
		return sb.toString();
	}
	
} //end of MyLogger

class Service extends Thread {
	private MyLogger logger;
	
	public Service(MyLogger logger) {
		this.logger = logger;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			logger.addMessage(getName(), "Nachricht " + i);
		}
	}
} // End of Service

public class B11_synchronized_Methoden {

	public static void main(String[] args) throws InterruptedException {

		MyLogger logger = new MyLogger();

		Thread t1 = new Service(logger);
		Thread t2 = new Service(logger);
		
		Thread t3 = new Service(new MyLogger());
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(logger);

	}

}
