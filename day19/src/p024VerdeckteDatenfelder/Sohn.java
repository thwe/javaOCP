package p024VerdeckteDatenfelder;

public class Sohn extends Vater {
	protected int x = 2;
	protected float y = 2;
	
	static protected String s = "zwei";
	
	public void test(){
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
		System.out.println(((Vater)this).x);
		System.out.println(((Grossvater)this).x + "\n");
		
		System.out.println(y);
		System.out.println(this.y);
		System.out.println(super.y);
		System.out.println(((Vater)this).y);
		System.out.println(((Grossvater)this).y + "\n");
	}
	
	public void testStatic(){
		//sohn
		System.out.println(s); //Korrekt
		System.out.println(this.s); //Compiler warnt lediglich
		System.out.println(Sohn.s); //Korrekt
		
		//Vater
		System.out.println(super.s); //Nicht korrekt - Compiler warnt aber nur
		System.out.println(Vater.s);
		System.out.println(((Vater)this).s);
		
		//Grossvater
		System.out.println(Grossvater.s); //Korrekter Aufruf
		System.out.println(((Grossvater)this).s); //Nicht korrekt - Compiler warnt aber nur
	}
	
	public static void testStaticStatic(){
		//sohn
		System.out.println(s); //Korrekt
		//System.out.println(this.s); //Compilerfehler
		System.out.println(Sohn.s); //Korrekt
		
		//Vater
		//System.out.println(super.s); //Nicht korrekt - Compilerfehler
		System.out.println(Vater.s);
		//System.out.println(((Vater)this).s); //Compilerfehler
		
		//Grossvater
		System.out.println(Grossvater.s); //Korrekter Aufruf
		//System.out.println(((Grossvater)this).s); //Compilerfehler
	}
	
	
}
