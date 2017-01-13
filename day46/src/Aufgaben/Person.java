package aufgaben.baeckerei;

import java.util.Random;

public class Person implements Runnable {
	private String name;
	private Baeckerei baeckerei;

	public Person(String name, Baeckerei baeckerei) {
		this.name = name;
		this.baeckerei = baeckerei;
	}
	
	@Override
	public void run() {
		
		Random r = new Random();
		
		while(true) {

			if(baeckerei.isLeer()) {
				try {
					synchronized (baeckerei) {
						baeckerei.wait();
					}
				} catch (InterruptedException e) {
					throw new RuntimeException(e);
				}
				
			} else {
				int anzahlGewuenscht = r.nextInt(13) + 3;
				System.out.println(name + " möchte " + anzahlGewuenscht + " kaufen");
				
				int anzahlGekauft = baeckerei.verkaufen(anzahlGewuenscht);
				System.out.println(name + " hat " + anzahlGekauft + " gekauft");
			}
			
		}
		
	}
}
