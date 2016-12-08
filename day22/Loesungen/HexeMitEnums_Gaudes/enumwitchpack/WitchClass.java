package enumwitchpack;

/**
 * @author Stefan Michael Gaudes
 *
 */
class ClockClass {

	enum Clock {
		H6("", "kommt die kleine Hex."), H7("", "schabt sie gelbe Rüben."), 
		H8("", "wird Kaffee gemacht."), H9("", "geht sie in die Scheun'."), 
		H10("", "hackt sie Holz und Spän'."), H11("Feuert an um", ","), 
		H12("kocht dann bis um", ":"), H0("Fröschebein und Krebs und Fisch.", 
										   "Hurtig Kinder kommt zu Tisch!");
		private String preText;
		private String postText;

		private Clock(String preText, String postText) {
			this.postText = postText;
			this.preText = (preText.equals("") ? "Morgens früh um" : preText);
		}

		public String getIt() {
			return this.preText
					+ (this.ordinal() < 7 ? " " + String.valueOf(6 + this.ordinal()) : "\n")
					+ (this.ordinal() < 5 ? "\n" : "") + this.postText;
		}
	}
}

public class WitchClass {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (ClockClass.Clock clock : ClockClass.Clock.values()) {
			System.out.println(clock.getIt());
		}
	}
}
