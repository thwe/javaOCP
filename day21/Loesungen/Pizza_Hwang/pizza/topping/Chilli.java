package pizza.topping;

import pizza.Pizza;

public class Chilli extends Topping {

	public Chilli(Pizza below) {
		super (below);
		setPrice(95);
		setHot (true);
		setVegetable(true);
		setName ("Chilli");
	}
}
