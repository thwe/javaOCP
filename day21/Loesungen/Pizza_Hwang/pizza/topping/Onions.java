package pizza.topping;

import pizza.Pizza;

public class Onions extends Topping {

	public Onions(Pizza below) {
		super (below);
		setPrice(65);
		setHot (false);
		setVegetable(true);
		setName ("Onions");
	}
	
	
}
