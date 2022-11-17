package studio8;

import java.util.Objects;

public class Time {
	private int timeHour;
	private int timeMin; 
	private boolean militaryTime;
	public Time(int h, int min, boolean timeFormat) {
		timeHour = h;
		timeMin = min;
		militaryTime = timeFormat;
	}
	public int hashCode() {
		return Objects.hash(militaryTime, timeHour, timeMin);
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return militaryTime == other.militaryTime && timeHour == other.timeHour && timeMin == other.timeMin;
	}
	public String toString() {
		if (militaryTime == true) {
			return timeHour + ":" + timeMin;
		} else {
			return (timeHour-12) + ":" + timeMin;
		}
	}
	
	public static void main(String[] args) {
		Time check = new Time(23,11,false);
		Time checkTwo = new Time(23,59,false);
		System.out.println(check);
		System.out.println(check.equals(checkTwo));		
    }

}