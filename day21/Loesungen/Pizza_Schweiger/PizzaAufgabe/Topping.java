package PizzaAufgabe;

public abstract class Topping implements Pizza{

	private final Pizza below;
//	private int price;
	
	public Topping(Pizza pizza){
		this.below = pizza;
		
	}
	
//	public int getPrice(){
//		price = this.price + below.getPrice();
//		return price;
//	}
//	
//	public void setPrice(int price){
//		this.price = price;
//	}
}
