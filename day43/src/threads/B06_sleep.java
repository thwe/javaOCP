package threads;

public class B06_sleep {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			System.out.println("i = " + i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
