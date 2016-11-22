package packFormatPrintF;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class DemoNumberFormat {

	public static void main(String[] args) {
		NumberFormat nf = NumberFormat.getInstance();

		System.out.println(nf.format(2E30));
		// 2.000.000.000.000.000.000.000.000.000.000
		System.out.println(nf.format(2E-30));
		// 0

		double d = 12345.67890;
		DecimalFormat df = new DecimalFormat("##,##0.00");
		System.out.println(df.format(d));

		NumberFormat frmt1 = DecimalFormat.getCurrencyInstance(Locale.FRANCE);
		System.out.println(frmt1.format(d));

		NumberFormat frmt2 = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
		frmt2.setCurrency(Currency.getInstance("EUR"));
		System.out.println(frmt2.format(d));

		NumberFormat frmt3 = NumberFormat.getCurrencyInstance(Locale.UK);
		frmt3.setCurrency(Currency.getInstance("GBP"));
		System.out.println(frmt3.format(d));

		NumberFormat frmt4 = NumberFormat.getCurrencyInstance(Locale.GERMANY);
		frmt4.setCurrency(Currency.getInstance("DEM"));
		System.out.println(frmt4.format(d));
		
		// Funktioniert mit Java 6 nicht
		// for (Currency currency : Currency.getAvailableCurrencies()) {
		// System.out.printf("%s , %s, %s, (%s)%n",
		// currency.getCurrencyCode(),
		// currency.getSymbol(Locale.UK),
		// currency.getDisplayName(Locale.ENGLISH),
		// currency.getDisplayName());
		// }


	}

}
