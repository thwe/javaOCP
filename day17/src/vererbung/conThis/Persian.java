package vererbung.conThis;

public class Persian extends Cat{
	// Attribute
	protected int price;
	protected String color;
	
	private static int persCounter;
	
	//Kosntruktoren
	public Persian(){
		//super(); //implizit auch dabei
		persCounter++;
		System.out.println("I am Persian no.: " + persCounter);	
	}
	
	public Persian(String name){
		this();
		this.setName(name);
	}
	
	public Persian(String name, int age){
		this(name);
		this.setAge(age);
	}
	
	public Persian(String name, int age, int price){
		this(name,age);
		this.price = price;
	}
	
	public Persian(String name, int age, int price, String color){
		this(name,age,price);
		this.color = color;
	}
	
	@Override
	public void report() {
		super.report();
		System.out.printf("color: %s price: %d", this.color, this.price);
	}
		
}
