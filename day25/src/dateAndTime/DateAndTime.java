package dateAndTime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import sun.java2d.pipe.SpanShapeRenderer.Simple;

public class DateAndTime {

	public static void main(String[] args) {
		// Get the current date and time
		Date datum1 = new Date();
		//System.out.println(datum1.toString());
		
		//Formatieren des Datums mit SimpleDateFormat
		//demoSimpleDateFormat(datum1);
		
		//Formatieren des Datums mit DateFormat
		//demoDateFormat(datum1);

		//Kalender
		//demoCalendar();
		
		//Systemzeit
		demoSystemTime();
	}

	public static void demoSimpleDateFormat(Date datum) {
		// Formatieren des Datums mit SimpleDateFormat
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd.MM.yyyy");
		String formatiertesDatum1 = sdf1.format(datum);
		System.out.println(formatiertesDatum1);

		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd");
		String formatiertesDatum2 = sdf2.format(datum);
		System.out.println(formatiertesDatum2);
		
		//Parsen eines Datums aus einem String
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd.MM.yyyy");
		String datumString = "6.12.2016";
		Date datum2 = null;
		
		try {
			datum2 = sdf3.parse(datumString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println(datum2);
	}
	
	public static void demoDateFormat(Date datum) {
		//DateInstance: Datumsangabe
		DateFormat df1 = DateFormat.getDateInstance();
		String formatiertesDatum = df1.format(datum);
		System.out.println(formatiertesDatum);
		
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.SHORT);
		String formatiertesDatum2 = df2.format(datum);
		System.out.println(formatiertesDatum2);
		
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		String formatiertesDatum3 = df3.format(datum);
		System.out.println(formatiertesDatum3);
		
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.LONG);
		String formatiertesDatum4 = df4.format(datum);
		System.out.println(formatiertesDatum4);
		
		//TimeInstance: Zeitangabe
		DateFormat df5 = DateFormat.getTimeInstance();
		String formatiertesDatum5 = df5.format(datum);
		System.out.println(formatiertesDatum5);
		
		DateFormat df6 = DateFormat.getTimeInstance(DateFormat.SHORT);
		String formatiertesDatum6 = df6.format(datum);
		System.out.println(formatiertesDatum6);
		
		DateFormat df7 = DateFormat.getTimeInstance(DateFormat.MEDIUM);
		String formatiertesDatum7 = df7.format(datum);
		System.out.println(formatiertesDatum7);
		
		DateFormat df8 = DateFormat.getTimeInstance(DateFormat.LONG);
		String formatiertesDatum8 = df8.format(datum);
		System.out.println(formatiertesDatum8);
		
		//DateTimeInstance
		DateFormat df9 = DateFormat.getDateTimeInstance();
		String formatiertesDatum9 = df9.format(datum);
		System.out.println(formatiertesDatum9);
	
		DateFormat df10 = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
		String formatiertesDatum10 = df10.format(datum);
		System.out.println(formatiertesDatum10);
		
		DateFormat df11 = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);
		String formatiertesDatum11 = df11.format(datum);
		System.out.println(formatiertesDatum11);
		
		DateFormat df12 = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);
		String formatiertesDatum12 = df12.format(datum);
		System.out.println(formatiertesDatum12);
	}

	
	public static void demoCalendar() {
		//Kalender: java.util.Calendar
		//In Europa: java.util.GregorianCalendar
		
		GregorianCalendar kalender1= new GregorianCalendar();
		GregorianCalendar kalender2 = new GregorianCalendar(2016, 11, 7, 12, 23);
		
		Date datum1 = kalender1.getTime();
		Date datum2 = kalender2.getTime();
			
		System.out.println(datum1);
		System.out.println(datum2);
		
		//Setzen von Attributen
		kalender1.set(Calendar.YEAR, 2222);
		kalender1.set(Calendar.MONTH, Calendar.DECEMBER);
		kalender1.set(Calendar.DAY_OF_MONTH, 7);
		
		System.out.println(kalender1.getTime());
		
		int jahr1 = kalender1.get(Calendar.YEAR);
		System.out.println(jahr1);
		System.out.println(kalender1.get(Calendar.MONTH));
		System.out.println(kalender1.get(Calendar.DAY_OF_MONTH));
		System.out.println(kalender1.get(Calendar.DAY_OF_WEEK));
		
		//Kalendermanipulationen
		kalender1.roll(Calendar.YEAR, 778);
		System.out.println(kalender1.get(Calendar.YEAR));
		System.out.printf("Jahr: %s Monat: %s  Tag: %s %n", 
				kalender1.get(Calendar.YEAR),
				kalender1.get(Calendar.MONTH),
				kalender1.get(Calendar.DAY_OF_MONTH));
		kalender1.roll(Calendar.MONTH, 1);
		
		System.out.printf("Jahr: %s Monat: %s  Tag: %s %n", 
				kalender1.get(Calendar.YEAR),
				kalender1.get(Calendar.MONTH),
				kalender1.get(Calendar.DAY_OF_MONTH));	
	}
	
	public static void demoSystemTime(){
		long timeNow = System.currentTimeMillis();
		
		Date datum = new Date(timeNow);
		SimpleDateFormat sdf = new SimpleDateFormat();
		System.out.println(sdf.format(datum));
		
		GregorianCalendar gCalendar = new GregorianCalendar();
		gCalendar.setTimeInMillis(timeNow);
		
		System.out.printf("Jahr: %s Monat: %s  Tag: %s %n", 
				gCalendar.get(Calendar.YEAR),
				gCalendar.get(Calendar.MONTH),
				gCalendar.get(Calendar.DAY_OF_MONTH));	
	}
}
