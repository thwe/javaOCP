package hausaufgaben.statInnereKlassen.schnittstellen;

public class TestObst
{
   public static void main (String [] args)
   {
      Obst obst1 = new Apfel (9);
      Obst.Obstmengenausgabe.printS (obst1);
      Obst obst2 = new Birne (7);
      Obst.Obstmengenausgabe.printS (obst2);
      
      Obst obst3 = new Apfel(5);
//      Obst.Obstmengenausgabe.printNS (obst3);      
//      Cannot make a static reference to the non-static method printNS(Obst) 
//      from the type Obst.Obstmengenausgabe
      new Obst.Obstmengenausgabe().printNS(obst3);
      new Obst.Obstmengenausgabe("5 Äpfel").printNS(obst3);
      
      Obst.Obstmengenausgabe obstmengenausgabe = new Obst.Obstmengenausgabe();
      obstmengenausgabe.printNS(obst3);
      
      
   }
}