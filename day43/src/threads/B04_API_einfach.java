package threads;

public class B04_API_einfach {

	public static void main(String[] args) {


		Thread t1 = new Thread();					//Constructor
		System.out.println(t1);		
		
		Runnable target = new Runnable() {
			public void run() {
				System.out.println("run 1");
			}
		};
		Thread t2 = new Thread(target);				//Constructor
		System.out.println("t2: " + t2);
		t2.setName("Jerry");						//setName
		System.out.println("t2: " + t2);
		System.out.println("t2: " + t2.getName());	//getName
		
		
		Thread t3 = new Thread("Tom");				//Constructor
		System.out.println(t3);
		
		
		System.out.println("t3.getId(): " + t3.getId());	//getId
		
		
		System.out.println("t3.getPriority(): " + t3.getPriority());	//getPriority
		t3.setPriority(Thread.MAX_PRIORITY);							//setPriority
		System.out.println("t3.getPriority(): " + t3.getPriority());
		
		//------------------------------------------------------------
		
		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread);
		
		Thread.yield();	//

	}

}
