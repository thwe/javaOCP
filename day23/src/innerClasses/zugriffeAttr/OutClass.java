package innerClasses.zugriffeAttr;

public class OutClass {

	//Attribute
	private int number = 8;
	private int number2 = 10;
	
	public class InClass{
		private int number2 = 20;
		
		public void seeOut(){
			System.out.println("priv Attr. der ‰uﬂeren Klasse: " + number);
			System.out.println("Alternativer Zugriff: " + OutClass.this.number + "\n");
			//Beim Aufruf der this Referenz muss vorhier der Name der ‰uﬂeren 
			//Klasse angegeben werden
			
			System.out.println("priv Attr. der ‰uﬂeren Klasse: " + number2);
			System.out.println("priv Attr. der ‰uﬂeren Klasse: " + this.number2);
			System.out.println("Alternativer Zugriff: " + OutClass.this.number2 + "\n");
			
		}
	}

}
