package operatoren;

public class DemoAddition {

	public static void main(String[] args) {
		demoFliess();
		demoIntegers();

	}
	
	public static void demoIntegers(){
		byte byte1 = 10;
		byte byte2 = 20;
		byte bErgebnis1 = (byte)(byte1 + byte2);
		byte bErgebnis2 = (byte)(byte2 - byte1);
		System.out.println("bErgebnis1: " + bErgebnis1);
		System.out.println("bErgebnis2: " + bErgebnis2);
		
		short short1 = 50;
		short short2 = 60;
		int sErgebnis1 = short1 + short2;
		short sErgebnis2 = (short)(short2 - short1);
		System.out.println("sErgebnis1: " + sErgebnis1);
		System.out.println("sErgebnis2: " + sErgebnis2);
		
		int int1 = 30;
		int int2 = 40;
		int iErgebnis = int1 + int2;
		System.out.println("iErgebnis: " + iErgebnis);
			
		long long1 = 7000000000l; //hinten l oder L als Suffix
		long long2 = 80;
		long lErgebnis = long1 + long2;
		System.out.println("lErgebnis: " + lErgebnis);
	}
	
	public static void demoFliess(){
		float float1 = 3.14f;
		float float2 = 6.28f;
		float float3 = 3.1f;
		int int1=2;
		float fErgebnis1 = float1 + float2;
		float fErgebnis2 = float2/float1;
		float fErgebnis3 = float2/int1;
		float fErgebnis4 = float2%int1;
		float fErgebnis5 = float2%float3;
		System.out.println("fErgebnis1: " + fErgebnis1);
		System.out.println("fErgebnis2: " + fErgebnis2);
		System.out.println("fErgebnis3: " + fErgebnis3);
		System.out.println("fErgebnis4: " + fErgebnis4);
		System.out.println("fErgebnis5: " + fErgebnis5);
		
		double double1 = 3.14;
		double double2 = 6.28;
		double dErgebnis1 = double1 + double2;
		double dErgebnis2 = double2 / double1;
		double dErgebnis3 = double2 / int1;
		System.out.println("dErgebnis1: " + dErgebnis1);
		System.out.println("dErgebnis2: " + dErgebnis2);
		System.out.println("dErgebnis3: " + dErgebnis3);

	}

}
