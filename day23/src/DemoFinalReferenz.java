
public class DemoFinalReferenz {

	public static void main(String[] args) {
	Point point = new Point();
	System.out.println(point);
	
	point.setX(5);
	point.setY(10);
	System.out.println(point);
	
	point = new Point(12,24);
	System.out.println(point);
	
	
	final Point point2 = new Point();
	System.out.println(point2);
	
	point2.setX(5);
	point2.setY(10);
	System.out.println(point2);
	
	//point2 = new Point();
	
	final String[] str01 = new String[5];
	//str01 = new String[10]; 
	
	
	}

}
