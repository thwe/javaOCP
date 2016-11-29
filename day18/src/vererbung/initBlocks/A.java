package vererbung.initBlocks;

import vererbung.Animal;

public class A {

	
	static{
		System.out.println("Klasse A - Statischer Initialisierungsblock I ");
	}
	
	static{
		System.out.println("Klasse A - Statischer Initialisierungsblock II");
	}
	
	{
		System.out.println("Klasse A - Initialisierungsblock I");
	}
	
	{
		System.out.println("Klasse A - Initialisierungsblock II");
	}
	
	public A() {
		System.out.println("Klasse A - Konstruktor ohne Parameter");
	}
	
	public static void method01(){
		System.out.println("method01");
	}
}
