package basic_exam;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONDAY) + 1;
		int day = now.get(Calendar.DATE);
		int week = now.get(Calendar.DAY_OF_WEEK);
		int amPm = now.get(Calendar.AM_PM);
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		now.set(Calendar.DATE, 1);
		year = now.get(Calendar.YEAR);
		month = now.get(Calendar.MONDAY);
		day = now.get(Calendar.DATE);
		week = now.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("년도 : " + year);
		System.out.println("월 : " + month);
		System.out.println("일 : " + day);
		System.out.println("요일 : " + week);
		System.out.println("마지막 날 : " + now.getActualMaximum(Calendar.DATE));
		
		
	}

}
