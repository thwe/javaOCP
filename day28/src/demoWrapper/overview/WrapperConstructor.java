package demoWrapper.overview;
/**
 *  Wrapper Klassen abgeleitet vom Object: 
 *  		Boolean and Character
 *  
 *  Wrapper Klassen abgeleitet vom Number: 
 *  		Byte, Short, Long, Integer, Float, Double
 */
public class WrapperConstructor {
	
public static void main(String[] args) {
	//Boolean
	demoBoolean();
	
	//Character
	demoCharacter();
	
	//Ganze Zahlen
	demoByte();
	demoShort();
	demoInteger();
	demoLong();
	
	//Flieﬂkommazahlen
	demoFloat();
	demoDouble();
}

	public static void demoBoolean(){
		boolean b = true;
		Boolean bool1 = new Boolean(b);
		
		String sBool = new String("treu");
		//falsche Schreibweise und null - liefert false
		Boolean bool2 = new Boolean(sBool);
		
		System.out.println("bool1: " + bool1+ " bool2 " + bool2);
	}
	
	
	public static void demoCharacter(){
		char c = 'c';
		Character char1 = new Character(c);
		System.out.println("char1: " + char1);
	}
	
	public static void demoByte(){
		byte b = 127;
		Byte byte1 = new Byte(b);
		
		String sByte = new String("127");
		Byte byte2 = new Byte(sByte);
		
		System.out.print("byte1: " + byte1);
		System.out.println(" byte2: " + byte2);
	}
	
	public static void demoShort(){
		short s1 = 127;
		Short short1 = new Short(s1);
		
		String sShort = new String("127");
		Short short2 = new Short(sShort);
		
		System.out.print("short1: " + short1);
		System.out.println(" short2: " + short2);
	}
	
	public static void demoInteger(){
		int i = 127;
		Integer int1 = new Integer(i);
		
		String sInt = new String("127");
		Integer int2 = new Integer(sInt);
		
		System.out.print("int1: " + int1);
		System.out.println(" int2: " + int2);
	}
	
	public static void demoLong(){
		long l = 127;
		Long long1 = new Long(l);
		
		String sLong = new String("127");
		Long long2 = new Long(sLong);
		
		System.out.print("long1: " + long1);
		System.out.println(" long2: " + long2);
	}
	
	public static void demoFloat(){
		double d1 = 127;
		Float float1 = new Float(d1);
		
		float f2 = 127f;
		Float float2 = new Float(f2);
		System.out.print("float1: " + float1);
		System.out.println(" float2: " + float2);
		
		String sfloat3 = new String("127");
		Float float3 = new Float(sfloat3);
		
		String sfloat4 = new String("127f");
		Float float4 = new Float(sfloat4);
		System.out.print("float3: " + float3);
		System.out.println(" float4: " + float4);
		
	}
	
	public static void demoDouble(){
		double d1 = 127d;
		Double double1 = new Double(d1);
		
		double d2 = 127d;
		Double double2 = new Double(d2);
		
		System.out.print("double1: " + double1);
		System.out.println(" double2: " + double2);
		
		String sdouble3 = new String("127");
		
		Double double3 = new Double(sdouble3);
		String sdouble4 = new String("127d");
		
		Double double4 = new Double(sdouble4);
		System.out.print("double3: " + double3);
		System.out.println(" double4: " + double4);
	}
}
