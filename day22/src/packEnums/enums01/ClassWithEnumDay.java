package packEnums.enums01;

public class ClassWithEnumDay {

	enum Day{
		MON, TUE, WED, THU, FRI, SAT, SUN;
		
		boolean isWeekend(){
			return this == MON || this == TUE || 
					this == SAT || this == SUN;
		}
	}
	
	public void methodenEnumDay(){
		Day day1 = Day.MON;
		Day day2 = Day.THU;
		
		if (day1.isWeekend() || day2.isWeekend()){
			System.out.println("Yuhu, es ist WE");
		} else{
			System.out.println("Sch ....");
		}
	}
}
