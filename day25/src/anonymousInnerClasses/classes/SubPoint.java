package anonymousInnerClasses.classes;

public class SubPoint extends Point{
	@Override
	public String toString() {

		return "x: " + getX() + " y: " + getY();
	}
	
	public double quote(){
		return getX()/getY();
	}
}
