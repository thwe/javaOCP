package anonymousInnerClasses.classes;

public class Applikation {

	public static void main(String[] args) {
		Point pointAIK1 = new Point(10,20){
			
			{System.out.println("toString()): " + quote());}
			
			@Override
			public String toString() {

				return "x: " + getX() + " y: " + getY();
			}
			
			public double quote(){
				return getX()/getY();
			}
			
		};
		
		OuterClass oClass = new OuterClass();
		//oClass.printPoint();
		
		Point point = new SubPoint();
		point.toString();
		//point.quote();
		//The method quote() is undefined for the type Point
		//Statische Polymorphie
		
		//((SubPoint) point).quote();
		
		//new SubPoint().quote();
		
		//Mit anonmymer innerer Klasse
		
		Point pointAIK = new Point(10,20){
			@Override
			public String toString() {

				return "x: " + getX() + " y: " + getY();
			}
			
			public double quote(){
				return getX()/getY();
			}
			
		};
		
		
		System.out.println(pointAIK.toString());
		//System.out.println(pointAIK.quote());
		
		
		//Mit Aufruf von Quote
		
		System.out.println(new Point(10,20){
			@Override
			public String toString() {

				return "x: " + getX() + " y: " + getY();
			}
			
			public double quote(){
				return (double)getX()/getY();
			}
		}.quote());
		
		java.awt.Point p = null;
		
		
	}
	

}
