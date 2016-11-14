
public class DemoTypAnpassung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
// Implizit	
	
public static void implGanzeZahlen(){
	long long1= 10000;
	int int1= 1000;
	long1 = int1;
}
//Explizit

public static void explGanzeZahlen(){
	long long1= 10000;
	int int1= 1000;
	int1 = long1;	
	
}

}
