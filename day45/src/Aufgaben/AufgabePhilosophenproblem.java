package aufgaben;

import java.util.ArrayList;
import java.util.List;

class Philosoph extends Thread {
	
	private Object linkeGabel, rechteGabel;
	
	private void pause(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void setLinkeGabel(Object linkeGabel) {
		this.linkeGabel = linkeGabel;
	}
	
	public void setRechteGabel(Object rechteGabel) {
		this.rechteGabel = rechteGabel;
	}
	
	@Override
	public void run() {
		
		while(true) {
			
			System.out.println(getName() + " denkt nach...");
			pause(100);
			
			System.out.println(getName() + " bekommt Hunger");
			
			synchronized (linkeGabel) {
				System.out.println(getName() + " nimmt die linke Gabel");
				pause(50);
				
				synchronized (rechteGabel) {
					System.out.println(getName() + " nimmt die rechte Gabel");
					
					System.out.println(getName() + " isst...");
					pause(300);
					
					System.out.println(getName() + " legt die rechte Gabel ab");
				}
				
				System.out.println(getName() + " legt die linke Gabel ab");
			}
		}
	}
}


public class AufgabePhilosophenproblem {

	public static void main(String[] args) {

		int anzahlPlaetze = 10;
		
		List<Philosoph> philosophen = new ArrayList<>(anzahlPlaetze);
		List<Object> gabeln = new ArrayList<>(anzahlPlaetze);
		
		for (int i = 0; i < anzahlPlaetze; i++) {
			philosophen.add(new Philosoph());
			gabeln.add(new Object());
		}
		
		for (int i = 0; i < anzahlPlaetze; i++) {
			Philosoph p = philosophen.get(i);

			Object linkeGabel = gabeln.get(i);
			p.setLinkeGabel(linkeGabel);
			
			int indexRechteGabel = (i+1) % anzahlPlaetze;
			Object rechteGabel = gabeln.get(indexRechteGabel);
			p.setRechteGabel(rechteGabel);
		}
		
		for (Philosoph p : philosophen) {
			p.start();
		}

	}

}




