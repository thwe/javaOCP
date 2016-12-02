package packInterface;

public interface ISchnittstelle {
	
	public static final int ZAHL01 = 10;
	int ZAHL02 = 20; //Muss 
	
	public abstract void method01();
	void method02(); //Muss
	
	// static void method02();
	// Illegal modifier for the interface method method02;
	// only public & abstract are permitted
}
