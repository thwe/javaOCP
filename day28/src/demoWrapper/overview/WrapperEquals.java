package demoWrapper.overview;

//SCJP 246 (286) Chapter 3: Assignments, Autoboxing

//	In order to save memory, two instances of the
//	following wrapper objects (created through boxing), will always 
// be == when their	primitive values are the same:
//	–  Boolean
//	–  Byte
//	–  Character from \u0000 to \u007f (7f is 127 in decimal)
//	–  Short and Integer from -128 to 127
//	Note: When == is used to compare a primitive to a wrapper, 
// the wrapper will be unwrapped and the comparison will be primitive 
// to primitive.
public class WrapperEquals {

	public static void main(String[] args) {
		Integer i1 = 1000;
		Integer i2 = 1000;
		if(i1!=i2){
			System.out.print("different objects ");
		}
		if(i1.equals(i2)){
			System.out.println("meaningfully equal");
		}
		
		Integer i3 = 10;
		Integer i4 = 10;
//		i3++;
//		i4 = new Integer(++i4);
		if(i3==i4){
			System.out.print("same object ");
		}
		if(i3.equals(i4)){
			System.out.println("meaningfully equal");
		}
		
	}
}
