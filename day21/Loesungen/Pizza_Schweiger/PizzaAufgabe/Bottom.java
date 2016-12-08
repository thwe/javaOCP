package PizzaAufgabe;

public abstract class Bottom implements Pizza{

	
	//muss hier noch die getPrice Methode im plementiert werden? nein

	public boolean isVegetable() {
		return true;
	}


	public boolean isHot() {
		return false;
	}
		 
}
// Herr Hwang hat in Bottom alle Methoden implementiert und sie für die verschiedenen Klassen 
// aufgerufen und mit Werten besetzt. Er hat auch private Instanzvariablen gesetzt
// return price = this.price + below.getPrice()
// --> below ist immer das, was gerade unter dem aktuellen Topping ist.