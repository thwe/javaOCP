package overloading2;

public class DemoOverloading {

	//Overloaded methods MUST change the argument list.
	//Anzahl oder Typ der Parameter kann geändert werden
	public void methode1(byte b, int i, long l){
		System.out.println();
	}
	
	public void methode1(byte b, int i){
		System.out.println();
	}
	
	
	public void methode2(byte b){
		System.out.println();
	}
	
	public void methode2(String str){
		System.out.println();
	}
	
	//Overloaded methods CAN change the return type
	public void methode3(byte b){
		System.out.println();
	}
	
	public String methode3(String str){
		System.out.println();
		return "";
	}
	
	//Overloaded methods CAN change the access modifier.
	public String methode4(String str){
		System.out.println();
		return "";
	}
	
	String methode4(String... str){
		System.out.println();
		return "";
	}
	
	//Overloaded methods CAN declare new or broader checked exceptions
	String methode5(String... str){
		System.out.println();
		return "";
	}
	
	String methode5(String str) throws ClassNotFoundException{
		System.out.println();
		return "";
	}
	
	
	public void changeSize(int size, String name, float pattern) { }
	public void changeSize(float pattern, String name, int size) { }
}
