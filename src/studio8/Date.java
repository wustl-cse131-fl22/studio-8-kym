package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	private int day;
	private int month;
	private int year;
	/*private int timeHour;
	private int timeMin; */
	public Date(int m, int d, int y) {
		month = m;
		day = d;
		year = y;
		/*timeHour = h;
		timeMin = min;*/
	}
	public int hashCode() {
		return Objects.hash(day, month, year);
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}
	public String toString() {
		return month + "/" + day + "/" + year;
	}
	
    public static void main(String[] args) {
    	LinkedList<Date> list = new LinkedList<Date>();
    	Date christmas = new Date (12, 25, 2022);
    	Date christmasEve = new Date (12, 24, 2022);
    	list.add(christmas);
    	list.add(christmasEve);
    	list.add(christmas);
    	HashSet<Date> set = new HashSet<Date>();
    	set.add(christmas);
    	set.add(christmasEve);
    	set.add(christmas);
    	System.out.println(set);
    	System.out.println(list);
    	System.out.println(christmas);
    	System.out.println(christmas.equals(christmasEve));
    }

	

}
