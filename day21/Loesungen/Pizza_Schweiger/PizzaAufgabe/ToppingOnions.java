package PizzaAufgabe;

public class ToppingOnions extends Topping {

	
	
	public ToppingOnions(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public int getPrice() {
		int price = 65;
		return price;
	}

	@Override
	public boolean isVegetable() {
		return true;
	}

	@Override
	public boolean isHot() {
		// TODO Auto-generated method stub
		return false;
	}

}
