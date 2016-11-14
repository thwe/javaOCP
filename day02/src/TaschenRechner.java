
/**
 * Write a description of class TaschenRechner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TaschenRechner
{
    // instance variables - replace the example below with your own
    //private int x;

    /**
     * Constructor for objects of class TaschenRechner
     */
    public TaschenRechner()
    {
        // initialise instance variables
       // x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
   public static void main(String[] args)
    {
        // put your code here
        //return x + y;
// Umwandlung Parameter der CMD zeile in INT
int zahl = Integer.parseInt(args[0]);

        //demoZahlen();
        demoWerteBereichGanzeZahlen();

       
    }


public static void demoZahlen()
{
    // Ganze Zahlen: byte(8bit),short(16bit),int(32bit),long(64bit),
        //Lokale Variablen werden in der Methode definiert, müssen initialisiert werden.
    int zahl1=10;
    byte zahl2=20;   
    short zahl3 = 30;
    long zahl4= 40;     
       
    System.out.println(zahl1);
    System.out.println(zahl1 + zahl1);
       
    System.out.println(zahl2);
    System.out.println(zahl2 + zahl2);   

    System.out.println(zahl3);
    System.out.println(zahl3 + zahl3);   

    System.out.println(zahl4);
    System.out.println(zahl4 + zahl4);   

}

public static void demoWerteBereichGanzeZahlen(){

    byte byte01 = -128;
    byte byte02 = 127;


    //System.out.print(byte01);
    //System.out.print(" ");
    //System.out.println(byte02);
    //System.out.print(" ");
    printConsole(byte01, byte02);
    byte02= (byte)(byte02 + (byte)1);
    System.out.print(byte02);
    System.out.println(" ");

    int int01 = Integer.MAX_VALUE;
    int int02 = Integer.MIN_VALUE;
    System.out.println(int01);
    System.out.println(" ");
    System.out.println(int02);
    System.out.println(" ");
    int01=int01+1;
    int02=int02-1;
    printConsole(int01, int02);

}


public static void demoZeichenketten()
{

    String zahlStr="10";

    System.out.println(zahlStr);
    System.out.println(zahlStr + zahlStr);

}
// Methode mit Paramtern
public static void printConsole(int int1, int int2){
    System.out.println("int Werte: ");
    System.out.println(int1);
    System.out.println(" ");
    System.out.println(int2);
    System.out.println(" ");
}
//Methodenüberladung
public static void printConsole(byte int1, byte int2){
    System.out.println("byte Werte: ");
    System.out.println(int1);
    System.out.println(" ");
    System.out.println(int2);
    System.out.println(" ");

}

public static void demoOperatoren(){

    int int01 = 20;
    int int02 = 3;

    System.out.println(int02/int02);
    System.out.println(int01%int02);
}

}
