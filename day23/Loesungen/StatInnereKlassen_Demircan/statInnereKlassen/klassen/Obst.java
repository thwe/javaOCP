package hausaufgaben.statInnereKlassen.klassen;

public abstract class Obst {
	
	  protected String name;
	   protected int anzahl;
	   
	   public Obst(String name, int anzahl){
		   this.name=name;
		   this.anzahl=anzahl;
		   
	   }
	
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