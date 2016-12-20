package packSer.demoSer01;

import java.io.Serializable;

public class Time implements Serializable{

	private int hour;
	private int minute;
	private int second = 5;
	
	public Time(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}
	
	@Override
	public String toString() {
		return "hour: " + hour + " minute: " + minute;
	}
}
