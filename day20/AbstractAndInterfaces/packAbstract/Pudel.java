package packAbstract;

public class Pudel extends Dog {

	@Override
	protected void bark() {
		System.out.println("I am barking");
	}

	@Override
	protected void eat() {
		System.out.println("I am chewing a bone, I am a Pudel");
	}
	
	protected void play(){
		System.out.println("I am playing");
	}
	
	//ist nicht Pr�fungsrelevant
	public void report(){
		((Animal)this).report();
		System.out.println("report Pudel");
	}

}
