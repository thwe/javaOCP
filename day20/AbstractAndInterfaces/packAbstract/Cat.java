package packAbstract;

public class Cat extends Animal{

	public Cat(){
		//super();
	}
	
	public Cat(String name){
		super(name);
	}
	
	@Override
	protected void eat() {
		System.out.println("I am a Cat and I am drinking Milk!");
	}
	
	@Override
	protected void drink() {
		System.out.println("I am drinking water, I am a Cat");
	}
	
	public void meau(){
		System.out.println("Meeaaau ...");
	}

}
