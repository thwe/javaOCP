public class EuroRechner{

	public static void main(String[] args){


		int zahl = Integer.parseInt(args[0]);
		System.out.println("Das macht " + (zahl / 100) + " Euro und " + (zahl %100) + " Cent!");
		//System.out.println(zahl %100);
	}


}