package CollectAutos;

public class BMW extends Auto{

	public BMW(String modell, int baujahr) {
		super(modell, baujahr);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		
		return ("BMW. Modell: " + getModell() + ", Baujahr " + getBaujahr() );
	}

	
}
