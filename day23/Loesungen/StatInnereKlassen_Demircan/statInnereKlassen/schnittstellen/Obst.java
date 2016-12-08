package hausaufgaben.statInnereKlassen.schnittstellen;

public interface Obst {
	public abstract String getObstname();

	public abstract int getAnzahl();

	public static class Obstmengenausgabe {

		public Obstmengenausgabe() {

		}

		public Obstmengenausgabe(String test) {
			System.out.println(test);

		}

		public static void printS(Obst obst) {
			System.out.println("Obstname: " + obst.getObstname() + " Anzahl: " + obst.getAnzahl());
		}

		public void printNS(Obst obst) {
			System.out.println("Obstname: " + obst.getObstname() + " Anzahl: " + obst.getAnzahl());
		}
	}
}