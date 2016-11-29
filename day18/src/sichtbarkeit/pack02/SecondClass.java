package sichtbarkeit.pack02;


//import sichtbarkeit.pack01.DefaultClass;

public class SecondClass {
	
	public void method01(){
		//DefaultClass dClass = new DefaultClass();
		//(System.out.println(dClass.attr01);
		
		//Sichtbarkeit der Klasse FirstClass über Referenzvariable
		FirstClass fClass = new FirstClass();
		fClass.method01();
		System.out.println(fClass.attr01);
		
	}
}
