package innerClasses.zugriffsModifizierer;

public class OutChildClassSP{

	public static void main(String[] args) {
		
		OutClass outClass = new OutClass();
		OutClass.InClass inClass = outClass.new InClass();
		
	}

}
