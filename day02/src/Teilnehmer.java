
/**
 * Write a description of class Teilnehmer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Teilnehmer
{
    // instance variables - replace the example below with your own
    String lname;
    String sname;
    
    //Klassenvariablen
    static String vorname;
    static String nachname;
    

    /**
     * Constructor for objects of class Teilnehmer
     */
    
  
    //Methode statisch
    public static void writeNameStatic()
    {
        System.out.println("Hallo " +nachname + " " +vorname);
        
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
        nachname = args[1];
        vorname = args[0];
         //System.out.println("Hallo " +args[0] + " " +args[1]);
        writeNameStatic();
            }
}
