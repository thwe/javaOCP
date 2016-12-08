package anonymousInnerClasses.interfaces01;

public class ClassWithAnonymousClass {

	IIInterface iiInterface = new IIInterface() {
		
		@Override
		public void printSomething() {
			System.out.println("Wann ist endlich WE?");
			
		}
	};
	
	
	public void accessInnerClass(){
		iiInterface.printSomething();
	}
	
}
