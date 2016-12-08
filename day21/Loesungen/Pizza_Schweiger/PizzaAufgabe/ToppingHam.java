package PizzaAufgabe;

public class ToppingHam extends Topping {

	
	public ToppingHam(Pizza pizza) {
		super(pizza);
		}

	@Override
	public int getPrice() {
		int price = 245;
		return price;
	}

	@Override
	public boolean isVegetable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isHot() {
		// TODO Auto-generated method stub
		return false;
	}

}
