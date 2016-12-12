package exceptions.myException;

public class MyClass {
	public static void main(String[] args) throws MyException {
		//myExceptionTryCatch();
		myExceptionThrow();
	}

	static public void myExceptionTryCatch() {
		MyException myException = null;

		myException = new MyException();
		try {
			throw myException;
			
		} catch (MyException e) {
			e.printStackTrace();
		}

		System.out.println("Hallo ...");

	}
	
	static public void myExceptionThrow() throws MyException {
		
		MyException myException = null;
		myException = new MyException();
		throw myException;
		//System.out.println("Hallo ...");
		//Unreachable Code ...
	}
}
