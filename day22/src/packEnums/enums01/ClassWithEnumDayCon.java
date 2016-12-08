package packEnums.enums01;

public class ClassWithEnumDayCon {

	enum Day {
		MON(true), TUE(true), WED(false), THU(false), FRI(true), SAT(true), SUN(true);

		boolean isWeekend() {
			return weekend;
		}

		private final boolean weekend;

		Day(boolean weekend) {
			this.weekend = weekend;
		}

	}

	public void methodenEnumDay() {
		Day day1 = Day.MON;
		Day day2 = Day.THU;

		if (day1.isWeekend() || day2.isWeekend()) {
			System.out.println("Yuhu, es ist WE");
		} else {
			System.out.println("Sch ....");
		}
	}
}
