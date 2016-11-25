package packFormatPrintF;

import java.text.ParseException;

import javax.swing.text.MaskFormatter;

/**
 * 
 * Nicht pr�fungsrelevant
 *
 */
public class DemoMaskFormatter {

	public static void main(String[] args) {
		String value = "A1234B567Z";
		String mask = "A-AAAA-AAAA-A";
		//System.out.println(formatString(value, mask, false));
		
		value = "A-1234-B567-Z";
		System.out.println(formatString(value, mask, true));
	}

	public static String formatString(String string, String mask, boolean conLitChar){
		MaskFormatter mf;
		String valueToString = null;
		try {
			mf = new MaskFormatter(mask);
			mf.setValueContainsLiteralCharacters(conLitChar);
			valueToString = mf.valueToString(string);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return valueToString;
	}
}
