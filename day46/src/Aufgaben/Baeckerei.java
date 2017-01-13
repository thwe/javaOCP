package aufgaben.baeckerei;

public class Baeckerei implements Runnable {
	
	private static void pause(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	private final int MAX_LAGER = 100;
	
	private String name;
	private int anzahlAufLager;
	
	public Baeckerei(String name) {
		this.name = name;
	}
	
	public int verkaufen(int anzahlGewuenscht) {
		synchronized (this) {
			if(anzahlAufLager < anzahlGewuenscht) {
				anzahlGewuenscht = anzahlAufLager;
			}
			
			anzahlAufLager -= anzahlGewuenscht;
		}
		
		return anzahlGewuenscht;
	}
	
	public synchronized boolean isLeer() {
		return anzahlAufLager == 0;
	}

	@Override
	public void run() {
		
		while(true) {
			
			System.out.println(name + " produziert...");
			pause(500);			
			
			synchronized (this) {
					
				if(anzahlAufLager + 10 <= MAX_LAGER) {
					anzahlAufLager+=10;
				} else {
					anzahlAufLager = MAX_LAGER;
				}
				System.out.println(name + " hat auf Lager: " + anzahlAufLager);
			
				this.notifyAll();
			}
			
		}
		
	}
	
	

	
	
}
