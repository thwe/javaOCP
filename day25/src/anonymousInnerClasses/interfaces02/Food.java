package anonymousInnerClasses.interfaces02;

public class Food {
	Cookable c = new Cookable() {
		public void cook() {
			System.out.println("anonymous cookable implementer");
		}
	};
	
	public void callCook(){
		c.cook();
	}
}
