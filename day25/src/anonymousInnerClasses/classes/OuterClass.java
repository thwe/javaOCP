package anonymousInnerClasses.classes;

public class OuterClass {

	Point p = new Point(10, 12) {
		@Override
		public String toString() {

			return "x: " + getX() + " y: " + getY();
		}
		
		public double quote(){
			return getX()/getY();
		}
		
		@Override
		public double distance(double px, double py) {
			return quote();
		};
	};

	public void printPoint() {
		System.out.println(p);
		//p.quote();
		//The method quote() is undefined for the type Point
		System.out.println(p.distance(12, 24));
		
		new Point(10, 12) {
			@Override
			public String toString() {

				return "x: " + getX() + " y: " + getY();
			}
			
			public double quote(){
				return getX()/getY();
			}
			
			@Override
			public double distance(double px, double py) {
				return quote();
			};
			
		}.quote();
	}
}