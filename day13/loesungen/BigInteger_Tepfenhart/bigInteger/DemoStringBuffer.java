package aufgabe.bigInteger;

public class DemoStringBuffer {
	
	private StringBuffer digits = new StringBuffer();
	
	public void demoStringBufferAppend(String str){
		digits.append(str);
	}
	
	public void demoStringBufferSetCharAt(int i, char c){
		digits.setCharAt(i, c);
	}

	public void demoStringBufferReverse(){
		digits.reverse();
	}
	public StringBuffer getDigits() {
		return digits;
	}

	public void setDigits(StringBuffer digits) {
		this.digits = digits;
	}
	
	public static void main(String[] args){
		DemoStringBuffer demoStringBuffer = new DemoStringBuffer();
		demoStringBuffer.demoStringBufferAppend("Hallo");
		System.out.println(demoStringBuffer.getDigits().toString());
		demoStringBuffer.demoStringBufferSetCharAt(4, 'D');
		System.out.println(demoStringBuffer.getDigits().toString());
		demoStringBuffer.demoStringBufferReverse();
		System.out.println(demoStringBuffer.getDigits().toString());
		
	}
}
