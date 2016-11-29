package sichtbarkeit.pack02;

public class SubFirstClass extends FirstClass {
	public int attr02 = 10;

	public void method02() {
		//Sichtabrkeit der Klasse FirstClass über Vererebung
		System.out.println(this.attr01); //Zugriff über vererbung
		this.method01();  //Zugriff über vererbung
		System.out.println("SubFirstClass: method02");
	}
}
