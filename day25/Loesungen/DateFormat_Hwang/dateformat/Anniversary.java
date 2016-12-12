package dateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import com.sun.swing.internal.plaf.metal.resources.metal;

public class Anniversary {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kind of date (e.g. Birthday, Wedding, Death) : ");
		String desc = scanner.nextLine();
		System.out.println("date of event (YYYY-MM-DD): ");
		String eventday ="";
		Date event = null;
		while (event == null) {
			eventday = scanner.nextLine();
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			try {
				event = df.parse(eventday);
			}
			catch (ParseException exc) {
				 System.out.println("Wrong dateformat! Try again : ");
			}
		}
		String input = "";
		System.out.println("1 - 100 Days");
		System.out.println("2 - 1 Year");
		System.out.println("3 - 10 Years");
		System.out.println("4 - 15 Years");
		System.out.println("5 - 30 Years");
		System.out.println("q - quit");
		while (!input.equals("q")) {
			input = scanner.nextLine();
			Calendar cal = Calendar.getInstance();
			cal.setTime(event);
			String output = "";
			boolean inputValid = true;
			switch (input.charAt(0)) {
			case '1' : cal.add(Calendar.DATE, 100);
					   output = "Paper (100days)";
					break;
			case '2' : cal.add(Calendar.YEAR, 1);
					 output = "Wood(1 Year)";
					 break;
			case '3' : cal.add(Calendar.YEAR, 10);
					 output = "Bronce(10 Years)";
					 break;
			case '4' : cal.add(Calendar.YEAR, 15);
					 output = "Silver(15 Years)";
					 break;
			case '5' : cal.add(Calendar.YEAR, 30);
					 output = "Gold(30 Years)";
					 break;
			case 'q' : 
			default : 
				inputValid = false;
			}
			if (inputValid) {
				System.out.println("Next Anniversary, " + output + " is at " 
									+ SimpleDateFormat.getDateInstance(SimpleDateFormat.SHORT)
										.format(cal.getTime()));
				long diff = cal.getTimeInMillis()-System.currentTimeMillis();
				//new Date(System.currentTimeMillis()) 
				//cal.setTimeInMillis (System.currentTimeMillis())
				if (diff < 0) {
					System.out.println("too late...:D");
				}
				else {
					long days = diff/(1000*60*60*24);
					System.out.println(days+" days left!" );
				}
			}
		}
	}
}
