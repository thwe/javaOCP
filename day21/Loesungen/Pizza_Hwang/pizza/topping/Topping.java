package pizza.topping;

import pizza.Pizza;

public abstract class Topping implements Pizza {
	
	private Pizza below = null;
	private int price = 0;
	private boolean hot = false;
	private boolean vegetable = false;
	private String name = "";
	public Topping (Pizza below) {
		this.below = below;
	}

	@Override
	public int getPrice() {
		return this.price + below.getPrice();
	}
	
	public void setPrice (int price) {
		this.price = price;
	}

	@Override
	public boolean isVegetable() {
		return this.vegetable && below.isVegetable();
	}
	
	public void setVegetable (boolean vegetable) {
		this.vegetable = vegetable;
	}

	@Override
	public boolean isHot() {
		int hotitems = countHot();
		return hotitems > 1;
	}
	
	public void setHot (boolean hot) {
		this.hot = hot;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	protected int countHot () {
		int counthot =this.hot ? 1 : 0;
		if (below instanceof Topping)
			counthot +=((Topping)below).countHot() ;
		return counthot ;
	}

	public String toString() {
		return below.toString() + ";" + this.getName();
	}
}
