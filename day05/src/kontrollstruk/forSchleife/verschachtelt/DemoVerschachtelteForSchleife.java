package kontrollstruk.forSchleife.verschachtelt;

public class DemoVerschachtelteForSchleife {

	public static void main(String[] args) {
		//verschachtelteForSchleife(1005, 105);
		verschachtelteWhileSchleife(1005, 105);
	}

	public static void verschachtelteForSchleife(int bound1, int bound2) {
		int produkt = 0;
		for (int i = 1; i <= bound1; i++) {
			for (int j = 1; j <= bound2; j++) {
				produkt = i * j;
				if (produkt % 10 == 0) {
					System.out.printf("i: %4d j: %4d Produkt: %10d %n", i, j, produkt);
				}
			}
		}
	}
	
	public static void verschachtelteWhileSchleife(int bound1, int bound2){
		int i = 1;
		int produkt = 0;
		while (i <= bound1) {
			int j = 1;
			while (j <= bound2) {
				produkt = i * j;
				if (produkt % 10 == 0) {
					System.out.printf("i: %4d j: %4d Produkt: %10d %n", i, j, produkt);
				}
				j++;
			}// Ende while (j <= bound2) {
			i++;
		}//Ende while (i <= bound1) {
	}
	

}
