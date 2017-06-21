package basic_exam;

import java.util.Calendar;
import java.util.Scanner;

public class MyCalendar2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Calendar c = Calendar.getInstance();
		
		int week = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
	}
}
