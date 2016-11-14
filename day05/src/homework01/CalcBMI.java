package homework01;


public class CalcBMI {

	/**
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
	
		float bmi = 0;
		int gewicht = Integer.parseInt(args[0]);
		String groesse = (args[1]);
		int alter = Integer.parseInt(args[2]);
	
		 float fgroesse = Float.parseFloat(groesse);
		
		 bmi = gewicht / (fgroesse * fgroesse);
		
		System.out.println("Der BMI beträgt: " + (String.format("%.2f", bmi)));
		
		if (bmi >24 && alter <=24){
			System.out.println("Für ihr angegebenes Alter: " + alter+ " ist der BMI etwas zu hoch");
		}
		else if (bmi >25 && alter <=34){
			System.out.println("Für ihr angegebenes Alter: " + alter+ " ist der BMI etwas zu hoch");
		}
		else if (bmi >26 && alter <=44){
			System.out.println("Für ihr angegebenes Alter: " + alter+ " ist der BMI etwas zu hoch");		
		}
		else if (bmi >27 && alter <=54){
			System.out.println("Für ihr angegebenes Alter: " + alter+ " ist der BMI etwas zu hoch");
		}
		else if (bmi >28 && alter <=64){
			System.out.println("Für ihr angegebenes Alter: " + alter+ " ist der BMI etwas zu hoch");
		}
		else if (bmi >29 && alter >64){
			System.out.println("Für ihr angegebenes Alter: " + alter+ " ist der BMI etwas zu hoch");
		}
		else{
			System.out.println("Alles OK! (Für ihr angegebenes Alter: " + alter+ ")");
		}
			

}

	
	
}
