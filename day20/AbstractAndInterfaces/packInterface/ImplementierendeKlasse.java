package packInterface;

public class ImplementierendeKlasse implements ISchnittstelle{
	
	@Override
	public void method01() {		
		System.out.println("method01()");
	}

	@Override
	public void method02() {
		System.out.println("method02()");
	}
	
	public void method03() {
		System.out.println("method03()");
	}


}
