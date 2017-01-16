package test;


class TestClass {
//class KlassMitEnum {

	// public enum FARBEN{ROT, BLAU;}
	//
	// }
	//
	//// Alternative
	//// ROT("hell", "mittel", "dunkel"), BLAU("hell", "mittel", "dunkel");
	//// String stufe1;
	//// String stufe2;
	//// String stufe3;
	//// public FARBEN(String stufe1, String stufe2, String stufe3){
	//// this.strufe1 = stufe1;
	//// this.stufe2 = stufe2;
	//// this.stufe3 = stufe3;
	//// }
	//// }
	//
	// }
	//
	//
	//
	// public class VerwendeEnum{
	//
	// public static void main(String args[]){
	// KlassMitEnum.FARBEN farben = KlassMitEnum.FARBEN.ROT; //Korrekter Aufruf
	// FARBEN2 farben2 = FARBEN2.ROT; //Korrekter Aufruf
	//
	//
	//
	//
	//
	// }
	//
	//
	// public enum FARBEN2{
	// ROT, BLAU;
	// //Semikolon ist optional
	// }
	//
	//
	//
	//// Vergleich der ENUM WERTE
	//
	// Zugriff ist hier nicht die Frage
	// FARBEN2.ROT == FARBEN2.ROT is true; //geht (true)
	// FARBEN2.ROT == FARBEN2.BLAU is false; //geht
	// FARBEN2.ROT.equals(FARBEN2.ROT) is true; //geht
	// FARBEN2.ROT < FARBEN2.BLAU is true; //geht ganz klar nicht
	// FARBEN2.ROT.ordinal() < FARBEN2.BLAU.ordinal(); // geht OK.
	//
	//// -------------------------------
	// package com.klausur;
	//
	// public class MyClass{
	// public int attrPub;
	// }
	//
	//// What can directly access and change the value of the variable attrPub
	//
	//// Only MyClass - falsch
	//// Any class - richtig
	//// Any class in com.klausur package - falsch - hier müßte noch only dabei
	// bestehen
	//// Any class that extends MyClass - falsch
	//
	//// --------------------------------------
	//// 1. Frage
	// public class MyClass{
	// int attr = 20;
	//
	// public void myMethod(int attr){
	// attr +=2;
	// syso(attr ++);
	// }
	//
	//
	// static public void main(String[] args){
	// MyClass myClass = new MyClass();
	// myClass.myMethod(4);
	//
	// }
	//
	// }
	//// => die Ausgabe ist 6.
	//
	//// 2. Aufgabe
	//
	// int lokVar = 20;
	// while(++lokVar <= 20){
	//
	// lokVar++;
	// }
	//
	// SystemPrintOut(lokVar);
	//
	//// What is the result? => 21
	//
	//// 3. Frage
	//// What is the result?
	//// 21
	// void test_for(){
	// for(int i = 0; i < 10; i++ ){
	// int x = i;
	// syso(x);
	//// Hier (nach den Anweisungen im Block) wird i++ vom Kopf ausgeführt
	// }
	// syso(x);
	// }
	//// ----------------------------------------
	//
	//
	//
	//
	//
	//
	//// ----------------------------------------
	//
	//
	// package packOne;
	//
	//
	// public class ClassOne{
	// public static void methodOne(){
	// syso("methodOne");
	// }
	// }
	//
	// ........
	//
	//
	// public class classTwo{
	//
	// main(String[] args){
	// methodOne();
	// }
	//
	// }
	// What should be inserted?
	// import static packOne.ClassOne.methodOne;

// ----------------------------------------------------------------
	
//	main(String [] args){
//
//		String lokVar = null;
//
//		if(lokVar==null){
//		   syso("1");
//		}else (lokVar.length() == 0){ //Kompilierfehler if fehlt
//		    syso("2");
//		}else{
//		    syso("3");
//		}
//		}
//		//Andere Aufgabe
//
//		public class MyClass{
//
//		private static void myMethod(String str){
//		int lokVar = 5;
//		if(lokVar == str.length()){
//		    syso(str.charAt(--lokVar) + "");
//		}else{
//		   syso(str.charAt(0) + "");
//		}
//		}
//
//		static void main(String[] args){
//		    myMethod("abcde");
//		    myMethod("abcd");
//		    myMethod("abc");
//
//		}
//
//		}
//
//		//Ausgabe: e a a
//		
// -------------------------------------------
		
//		// Static nicht static
//
//
//		public class MyClass{
//
//		public static void methodStatic(){
//		    // ...
//		}
//
//		public void methodInstance(){
//		    //...
//		}
//
//		}
//
//
//		//methodStatic can directly call methodInstance - falsch
//		//methodInstance can directly call methodStatic - richtig
//		//MyClass.methodStatic() is a valid invocation - richtig
//		//MyClass.methodInstance is a valid invocation - falsch  
//
//		(new MyClass()).methodInstance();
		
// -------------------------------------------

//		public class MyClass{
//
//			private int attr = 10; //Attribut; Instanzvariable
//			private static int = 20; //Klassenvariable
//
//
//			public int getAttr(){
//			    return attr;
//			}
//
//			public void changeAttr(int attr){
//			    attr = attr; 
//			    //Attribut wird durch lok Variable überdeckt
//			    //der Wert 20 wird nicht dem Attribut attr zugewiesen 
//			}
//
//			main(String[] args){
//			   int lokVar = 20; //lokale 
//			   MyClass myClass = new MyClass(); //myClass ist eine Referenzvariable
//			   myClass.changeAttr(lokVar);
//			   syso(myClass.getAttr());
//			}
//
//			}
//			//Ausgabe 10
		
// -------------------------------------------

//	import java.io.*;
//
//	public class MyClass implements Serializable{
//	   private transient SecondClass secClass = new SecondClass();
//
//
//	  main(String[] args){
//	   MyClass myClass = new MyClass();
//	    try{
//	        FileOutputStream fos = new FileOutputStream("MyClass.ser");
//	        ObjectOutputStream oos = new ObjectOutputStream(fos);
//	        oos.writeObject(myClass);
//	        oos.close();
//	    }
//	    catch(Exception ex){
//	        ex.printStacktrace();
//	    }
//
//	  }  
//	}
//
//
//
//	class SecondClass{
//
//	}
//
//
//	//Compilation fails - falsch
//	// An exception is Thrown - falsch
//	// An instance of MyClass is serialized - richtig
//	// An instance of MyClass and SecondClass is serialized - falsch	
// -------------------------------------------

//	import java.io.*;
//
//	public class MyClass implements Serializable{
//	   private SecondClass secClass = new SecondClass();
//
//
//	  main(String[] args){
//	   MyClass myClass = new MyClass();
//	    try{
//	        FileOutputStream fos = new FileOutputStream("MyClass.ser");
//	        ObjectOutputStream oos = new ObjectOutputStream(fos);
//	        oos.writeObject(myClass);
//	        oos.close();
//	    }
//	    catch(Exception ex){
//	        ex.printStacktrace();
//	    }
//
//	  }  
//	}
//
//
//
//	class SecondClass implements Serializable{
//
//	}
//
//
//	//Compilation fails - flasch
//	// An exception is Thrown - falsch 
//	// An instance of MyClass is serialized - falsch
//	// An instance of MyClass and SecondClass is serialized - richtig
	
// -------------------------------------------

//	import java.io.*;
//
//	public class MyClass implements Serializable{
//	   private SecondClass secClass = new SecondClass();
//
//
//	  main(String[] args){
//	   MyClass myClass = new MyClass();
//	    try{
//	        FileOutputStream fos = new FileOutputStream("MyClass.ser");
//	        ObjectOutputStream oos = new ObjectOutputStream(fos);
//	        oos.writeObject(myClass);
//	        oos.close();
//	    }
//	    catch(Exception ex){
//	        ex.printStacktrace();
//	    }
//
//	  }  
//	}
//
//
//
//	class SecondClass {
//
//	}
//
//
//	// Compilation fails - falsch 
//	// An exception is Thrown - richtig  
//	// An instance of MyClass is serialized - falsch 
//	// An instance of MyClass and SecondClass is serialized - falsch
	

//import java.io.*;
//
//public class MyClass implements Serializable{
//   public int attr1;
//   public int attr2;
//
//   private void writeObject(ObjectOutputStream oos)
//       throws IOException{
//       oos.writeInt(attr1);
//       oos.writeInt(attr2);
//  }
//
//   
// private void readObject(ObjectInputStream ois) throws IOException{
//    .....
//}
//
//}
//
//// this = ois.defaultReadObject();
//// attr1 = ois.readInt(); attr2 = ois.readInt(); //richtig
//// attr2 = ois.readInt(); attr1 = ois.readInt();
// 
	
	
// -------------------------------------------

//	class OberK{
//
//		   public void print(){
//		       syso("oberk");
//		   }
//
//		}
//
//
//		class UnterK1 extends OberK{
//		   public void print(){
//		       syso("unterK1");
//		   }
//		}
//
//		class UnterK2 extends OberK{
//		   public void print(){
//		       syso("unterK2");
//		   }
//		}
//
//
//		public class Applikation{
//
//		   main(String[] args){
//		       OberK ok = new UnterK1();
//		       UnterK2 uk2 = (UnterK2) ok;
//
//		      ok.print();
//		      uk2.print();
//		   }
//
//		}
//
//
//		// Compilation fails  - falsch 
//		// An exception is thrown - richtig 
//		// ClassCastException
	
	
// -------------------------------------------


//class OberK{
//
//   public void print(){
//       syso("oberk");
//   }
//
//}
//
//
//class UnterK1 extends OberK{
//   public void print(){
//       syso("unterK1");
//   }
//}
//
//class UnterK2 extends OberK{
//   public void print(){
//       syso("unterK2");
//   }
//}
//
//
//public class Applikation{
//
//   main(String[] args){
//       OberK ok = new UnterK1();
//       UnterK1 uk1 = (UnterK1) ok;
//
//      ok.print();  
//     // dyn. Polymorphie - 
//     // print() von UnterK1 wird aufgerufen
//      uk1.print();
//   }
//
//}
//
//
//// Compilation fails  -  falsch 
//// An exception is thrown - falsch
//// unterK1 und unterK1
//
	
	
// -------------------------------------------
		
//	class OberK{
//		   public int attr;
//		   public void method(){
//		      attr ++;
//		   }
//		}
//
//
//		public class UnterK extends OberK{
//		     public void method(){
//		      attr --;
//		   }
//
//		    public void method(int i){
//		      method();
//		      super.method();
//		      attr += i;
//		   }
//
//
//		    main (String[] args){
//		    UnterK uk = new UnterK();
//		    uk.method(5);
//		    syso(uk.attr);   
//		 }
//		}
//
//
//		//Compilation fails - falsch
//		// An exception is thrown - falsch
//		// 5 - richtig
		
	
// -------------------------------------------

//	public class MyClass <X extends Number>{
//
//		   private X x;
//
//		  public MyClass( X x){
//		   this.x = x;
//		   }
//
//		   private double getDouble(){
//		       return x.doubleValue();
//		   }
//
//		   main(String[] args){
//		      MyClass<Integer> mC = new MyClass<Integer>(new Integer(2));
//		      syso(mc.getDouble());
//		  }
//		}
//
//		//Compilation fails - falsch
//		//Exception - falsch
//		// 2.0
//
	
	
// -------------------------------------------
		
//	public class MyClass{
//
//		main(String[] args){
//		  List list = new LinkedList<String>();
//		  list.add("one");
//		  list.add("two");
//		  list.add("three");
//		  
//		  Collections.reverse(list);
//		  Iterator iter = list.iterator();
//		  
//		  for (Object o : iter){
//		   syso(o + " ");
//		   } 
//
//		}
//		}
//
//
//		//compilation fails - richtig (Can only iterate over an array or an instance of java.lang.Iterable)	
	
	
// -------------------------------------------
		
//	public class MyClass{
//
//	    private int attr1;
//	    
//	   public MyClass(int attr1){
//	        this.attr1 = attr1;
//	    }
//
//	   public int getAttr1(){
//	      return attr1;    
//	   }
//
//	   static MyClass method(MyClass myClass){
//	      myClass = new MyClass(3); 
//	      return myClass;  
//	  }
//
//	   main(String[] args){
//	     MyClass mC1 = new MyClass(300);
//	     syso(mC1.getAttr1() + " " );
//
//	      MyClass mC2 = method(mC1)
//	     syso(mC1.getAttr1() + " " );
//	     syso(mC2.getAttr1() + " " );
//
//	    mC1 = method(mC2);
//	    syso(mC1.getAttr1() + " " );
//	    syso(mC2.getAttr1() + " " );
//	  }
//	 }
//
//
//	//300 300 3 3 3
	
// -------------------------------------------

//	public class MyClass{
//		 
//		private String attr;
//		 
//		public MyClass(String attr){
//		    this.attr = attr; 
//		}
//
//		main(String[] args){
//		    MyClass mC1 = new MyClass("10");
//		    MyClass mC2 = new MyClass("10");
//		   String str1 = new String ("20");
//		   String str2 = new String ("20"); 
//
//
//		    HashSet<Object> hs = new HashSet<Object>();
//		    hs.add(mC1);
//		    hs.add(mC2);
//		    hs.add(str1);
//		    hs.add(str2);
//
//		   syso(hs.size()); 
//		 
//		} 
//		 
//		}
//
//		//3 ... 
	
// -------------------------------------------

//	class OberK{
//		   public OberK(){
//		       syso("ok");
//		   }
//		}
//
//
//		class UnterK extends OberK{
//
//		    public UnterK(){
//		       syso("uk);
//		       super(); 
//		   }
//		}
//
//
//		class UUnterK extends UnterK{
//		    public UUnterK(){
//		       syso("uuk");
//		       super();
//		    }
//		}
//
//
//		public class Appl{
//
//		     main(String[] args){
//		       new UUnterK();
//		     }
//
//		}
//
//
//		//compilation fails - super() muss an erster Stelle stehen
//
//		// ok - uk - uuk - falls super korrekt
		
	
// -------------------------------------------
		
	public static void main(String args[]) {
		test_for();
	}

	static void test_for() {
		int i = 0;
		for (; i < 10; i++) {
			int x = i;
			System.out.println(x); // => 0 ... 9 
		}
		System.out.println(i); // => 10
	}
	
	
	
} // ENDE DER KLASSE TestClass

// -------------------------------------------
