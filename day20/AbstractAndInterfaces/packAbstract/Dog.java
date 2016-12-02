package packAbstract;

public abstract class Dog extends Animal {

	protected abstract void bark();
	
	@Override
	protected void drink() {
		System.out.println("I am drinking water, I am a Dog");
	}
	@Override
	public abstract void report();
}
