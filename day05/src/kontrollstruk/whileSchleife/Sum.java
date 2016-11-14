package kontrollstruk.whileSchleife;

public class Sum {
	public static void main(String[] args) {
		int boundary = 4;
		int sum = 0;
		int counter = 1;
		
		sum = methodWhile(counter, boundary);
		//sum = methodDoWhile(counter, boundary);
		methodPrint(counter, boundary, sum);
		
	}
	
	public static int methodWhile(int counter, int boundary){
		int sum = 0;
		while (counter <= boundary) {
			sum = sum + counter;
			counter = counter + 1;
		}
		return sum;
	}
	
	
	public static int methodDoWhile(int counter, int boundary){
		int sum = 0;
		do {
			sum = sum + counter;
			counter = counter + 1;
		} while (counter <= boundary);
		return sum;
	}
	
	 public static void methodPrint(int counter, int boundary, int sum){
			System.out.printf("Die Summe der Zahlen von %d bis %d",counter, boundary);
			System.out.print(" ist ");
			System.out.println(sum);
	 }
	
}
