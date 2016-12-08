package hausaufgaben.statInnereKlassen.schnittstellen;

public class Apfel implements Obst
{
   private String name;
   private int anzahl;

   public Apfel (int anzahl)
   {
      this.anzahl = anzahl;
      this.name = "Apfel";
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