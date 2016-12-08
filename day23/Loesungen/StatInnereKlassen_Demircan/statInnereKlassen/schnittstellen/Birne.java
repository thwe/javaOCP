package hausaufgaben.statInnereKlassen.schnittstellen;

public class Birne implements Obst
{
   private String name;
   private int anzahl;

   public Birne (int anzahl)
   {
      this.anzahl = anzahl;
      this.name = "Birne";
   }

   public String getObstname()
   {
      return this.name;
   }

   public int getAnzahl()
   {
      return this.anzahl;
   }
}