package conSuper;

public class Persian extends Cat {
	// Attribute
	private static int counter;
	protected String color;
	protected int price;

	//Konstruktoren
	public Persian(){
		//super();
		this.setCounterAndMonitorInfo();
	}
	
	public Persian(String name){
		super(name);
		this.setCounterAndMonitorInfo();
	}
	
	public Persian(String name, int age){
		super(name,age);
		this.setCounterAndMonitorInfo();
	}
	
	public Persian(String name, int age, int price){
		super(name,age);
		this.setPrice(price);
		this.setCounterAndMonitorInfo();
	}

	// Methode
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	private void setCounterAndMonitorInfo() {
		counter++;
		System.out.println("I am Persian no.: " + counter);
	}
	
	public void report(){
		super.report();
		System.out.print("My price is: " + this.getPrice());
	}
}
