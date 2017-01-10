package aufgaben;

class ThreadIncVar2 implements Runnable{

	static final int ITERATIONS=1000000;
	
	// nicht atomar (--> Synchronisieren!)
			static int countx;
		
			@Override
			public void run() {
				for (int i = 0; i <ITERATIONS; i++) {
					countx++;
					
				}// TODO Auto-generated method stub
				
			}
			
			
	
}
public class Ec02_join{
	
	public static void main(String[] args) throws InterruptedException{
		
		ThreadIncVar2 incvar= new ThreadIncVar2();
		Thread th1= new Thread(incvar);
		Thread th2= new Thread(incvar);
		
		th1.start();
		th2.start();
		
		th1.join();
		th2.join();
		
		System.out.println("countx: "+ ThreadIncVar2.countx);
				
		
		
		
	}
}