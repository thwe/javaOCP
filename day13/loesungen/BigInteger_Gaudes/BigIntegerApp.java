package mybiginteger;

/**
 * @author Stefan Michael Gaudes
 *
 */
public class BigIntegerApp {
	
	private static BigInteger biggi;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length < 1) {
			bigIntegerApp();
		} else if(args.length < 2) {
			bigIntegerApp(args[0]);
		} else if(args.length < 3) {
			bigIntegerApp(args[0], args[1]);
		} else {
			bigIntegerApp(args);
		}
		
	}
	
	
	private static void bigIntegerApp() {
		biggi = new BigInteger();
		
		biggi.print("biggi", 0);
		
		BigInteger biggi1 = new BigInteger(1000000000); // Int -> 1 Mrd.
		biggi1.print("biggi1", 0);
		
		BigInteger biggi2 = new BigInteger(9000000000L); // Long -> 9 Mrd.
		biggi2.print("biggi2", 0);
		
		BigInteger biggi3 = new BigInteger("92233720368547758071");	 // String SuperLong -> 10 * Lang.MAXVALUE + 1
		biggi3.print("biggi3", 45);
		
		BigInteger biggi4 = new BigInteger("9223372036854775807009");	 // String SuperLong -> 1000 * Lang.MAXVALUE + 9
		biggi4.print("biggi4", 45);
		
		BigInteger biggi5 = biggi3.add(biggi4);
		biggi5.print("biggi5 = biggi3 + biggi4 =>", 24);

		BigInteger biggi6 = biggi5.add(biggi4);
		biggi6.print("biggi6 = biggi4 + biggi5 =>", 24);		
	}
	
	private static void bigIntegerApp(String biArg) {
		biggi = new BigInteger(biArg);
		
		biggi.print("folgende BigInteger Zahl wurde verarbeitet:", 0);
	}

	private static void bigIntegerApp(String biArg1, String biArg2) {
		BigInteger biggi1 = new BigInteger(biArg1); // Int -> 1 Mrd.
		biggi1.print("biggi1", 24);
		
		BigInteger biggi2 = new BigInteger(biArg2); // Long -> 9 Mrd.
		biggi2.print("biggi2", 24);
		
		biggi1.add(biggi2).print("Summe ", 24);				
	}
	
	private static void bigIntegerApp(String[] biArgs) {
		int i = 0;
		BigInteger[] biggis = new BigInteger[biArgs.length];
		BigInteger summe = new BigInteger("0");
		
		for(i = 0; i < biArgs.length; i++) {
			biggis[i] = new BigInteger(biArgs[i]);
			biggis[i].print("big " + (i + 1) + (i > 0 ? " + " : "   "), 24);
			summe = summe.add(biggis[i]);
		}
		System.out.println("----------------------------------------------------");
		summe.print("Summe", 24);
	}


}
