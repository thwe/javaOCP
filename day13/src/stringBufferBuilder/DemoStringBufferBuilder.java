package stringBufferBuilder;

import java.math.BigInteger;

public class DemoStringBufferBuilder {
	//A common use for StringBuffers and StringBuilders is file I/O when large,
	//ever-changing streams of input are being handled by the program. In these
	//cases, large blocks of characters are handled as units, and StringBuffer
	//objects are the ideal way to handle a block of data, pass it on, and then
	//reuse the same memory to handle the next block of data.
			
	//The StringBuilder class was added in Java 5. It has exactly the same API as the
	//StringBuffer class, except StringBuilder is not thread safe.
	public static void main(String[] args) {
		
		StringBuilder sBuilder = new StringBuilder("abc");
		StringBuffer sBuffer = new StringBuffer("abc");
		
		sBuffer.replace(1, 2, "Hu");
		System.out.println(sBuffer);
		
		//append
		sBuffer.append("def");
		sBuilder.append("def");
		
		System.out.println(sBuffer + " " + sBuilder);
		
		//reverse
		System.out.println(sBuilder.reverse());
		System.out.println(sBuffer.reverse());
		
		System.out.println(sBuffer + " " + sBuilder);
		
		//delete (Anfangsindex iunklusiv - Ende exklusiv
		System.out.println(sBuffer.delete(3, 6));
		System.out.println(sBuilder.delete(3, 6));
		
		//insert
		System.out.println(sBuffer.insert(1,"----"));
		System.out.println(sBuilder.insert(1,"----"));
		
		//toString
		System.out.println(sBuffer.toString() + " " + sBuffer);
		System.out.println(sBuilder.toString() + " " + sBuilder);
		
		//Verkettete Aufrufe
		String x = "abc";
		String y1 = x.concat("def").toUpperCase().replace('C', 'x');
		String y2 = x.concat("def");
		y2 = y2.toUpperCase();
		y2 = y2.replace('C', 'x');
		System.out.println(y1);
		System.out.println(y2);
		
		BigInteger bi = null;
		
	}

}
