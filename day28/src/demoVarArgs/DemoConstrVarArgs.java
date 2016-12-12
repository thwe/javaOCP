package demoVarArgs;

public class DemoConstrVarArgs {

	int[] zahlen;
 	
	public DemoConstrVarArgs(int... is ){
		//Ein Arrayobjekt ist vorhanden, auch dann wenn keine Werte mitgegeben werden, hat jedoch die Länge 0
		//if(is.length >0){
		zahlen = new int[is.length];
		System.out.println("Anzahl Parameter: " + is.length);
		//}	
	}
	
	//Fuer den Compiler sind die zwei Konstruktoren identisch 
	//public DemoConstrVarArgs(int[] is){}
	
	public static void main(String[] args) {
		DemoConstrVarArgs dArgs = new DemoConstrVarArgs();
		System.out.println(dArgs.zahlen.length);

	}

}
