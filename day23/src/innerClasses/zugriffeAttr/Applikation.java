package innerClasses.zugriffeAttr;

public class Applikation {

	public static void main(String[] args) {
		
		OutClass outClass = new OutClass();
		OutClass.InClass inClass = outClass.new InClass();
		
		inClass.seeOut();
		
		
		
	}

}
