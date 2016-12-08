package anonymousInnerClasses.classes;

public class Point {
	private int x;
	private int y;

	public Point() {
	}

	public Point(int x, int y) {
		System.out.println("Konstruktor Point");
		this.x = x;
		this.y = y;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public double distance(double px, double py) {
		px -= getX();
		py -= getY();
		return Math.sqrt(px * px + py * py);
	}
}
