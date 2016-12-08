package innerClasses.instantiierung;

public class OutClass {

	//Attribute
	private int number = 8;
	
	
	public InClass instantiateInClass(){
		InClass inClass = this.new InClass();
		return inClass;
	}
	
	public void inMethod(){
		System.out.println(number);
	}
	
	public class InClass{
		//Aus einer inneren Klasse kann auf ein priv. Attribut der 
		// ‰uﬂeren Klasse zugegriffen werden
		
		public void seeOut(){
			System.out.println("priv Attr. der a‰ﬂeren Klasse: " + number);
		}
	}
	
	
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		OutClass.InClass inClass01 = outClass.new InClass();
		InClass inClass02 = outClass.new InClass();
		//InClass inClass03 = this.new InClass();
		inClass01.seeOut();
	}
	
}
