package overriding;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Oberklasse {
	//Anzahl der Parameter
	public void methode1(String str, int i, long l) {
		System.out.printf("String: %s int: %d long: %d %n",str,i,l);
	}
	
	//Rückgatyp der überschriebenen Methode
	public int methode2(String str){
		System.out.println("methode2 Oberklasse");
		return 1;
	}
	
	//Kovarianter Rückgabetyp der überschriebenen Methode
	public Oberklasse methode3(String str){
		return this;
	}
	
	public Oberklasse methode4(String str){
		return this;
	}
	
	public Animal methode5(String str){
		return new Animal();
	}
	
	public long method(){
		return 7L;
	}
	//Access level (Sichtbarkeit)
	
	public void methode6(String str){
		System.out.println("String: " + str);;
	}
	
	protected void methode7(String str){
		System.out.println("String: " + str);;
	}
	
	void methode8(String str){
		System.out.println("String: " + str);;
	}
	
	private void methode9(String str){
		System.out.println("String: " + str);;
	}
	
	//Accces level 2 - Erweiterung
	void methode10(String str){
		System.out.println("String: " + str);;
	}
	
	//Final
	public final void methode11(String str){
		System.out.println("String: " + str);;
	}
	
	//Unchecked Exceptions
	public void methode12(String str){
		System.out.println("String: " + str);;
	}
	
	//Ckecked Exceptions
	public void methode13 (String str) throws FileNotFoundException{
		//FileNotFoundException ->  IOException - > Exception
		System.out.println("String: " + str);
	}
	
	public void methode14 (String str) throws IOException{
		//FileNotFoundException ->  IOException - > Exception
		System.out.println("String: " + str);
	}
	
	//Static
	public static void methode15 (String str) {
		//FileNotFoundException ->  IOException - > Exception
		System.out.println("String Oberklasse: " + str);
	}
}
