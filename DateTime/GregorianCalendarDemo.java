package DateTime;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendarDemo {

	public static void main(String[] args) {
		String months[]={
				"jan","feb",",Mar","Apr",
				"May","Jun","Jul","Aug",
				"Sep","Oct","Nov","Dec"};
		int year;//create a Gregorain calnder intialized
		//with the current date and time in the
		//default locale and time in zone.
		GregorianCalendar gcalender=new GregorianCalendar();
		//display current date and time information.
		System.out.println("Date: ");
		System.out.println(months[gcalender.get(Calendar.MONTH)]);
		System.out.println(year = gcalender.get(Calendar.DATE));
		System.out.println(year = gcalender.get(Calendar.YEAR));
		System.out.println("Time: ");
		System.out.println(year = gcalender.get(Calendar.HOUR));
		System.out.println(year = gcalender.get(Calendar.MINUTE));
		System.out.println(year = gcalender.get(Calendar.SECOND));
		//test if the current year is the leap year
		if(gcalender.isLeapYear(year)){
			System.out.println("the current year is the leap year");
		}else{
			System.out.println("the current year is not a leap year");
		}
	}

}
