package com.wood.unnecessary;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.Date;

public class Unnecessary {

	
	public static void main(String args[]) {
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		// Let's use Slow Person.
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		cal.set(1946,Calendar.JANUARY,1,0,0,0);

		Calendar finalCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		finalCal.set(1985, Calendar.JANUARY, 1, 0,0,0);

		long startTime = System.currentTimeMillis();

		while(cal.compareTo(finalCal)<0) {
			SlowPerson s = new SlowPerson(cal.getTime());
			s.isBabyBoomer();
			// System.out.println(format.format(cal.getTime()));
			cal.add(Calendar.MINUTE,1);
		}

		long endTime = System.currentTimeMillis();

		long timeDiff = endTime - startTime;
		float seconds = timeDiff / 1000F;
		System.out.println("SlowPerson Time Diff in seconds: " + seconds);

		// Now let's use Fast Person.
		cal.set(1946,Calendar.JANUARY,1,0,0,0);
		startTime = System.currentTimeMillis();

		while(cal.compareTo(finalCal)<0) {
			FastPerson s = new FastPerson(cal.getTime());
			s.isBabyBoomer();
			// System.out.println(format.format(cal.getTime()));
			cal.add(Calendar.MINUTE,1);
		}

		endTime = System.currentTimeMillis();
		timeDiff = endTime - startTime;
		seconds = timeDiff / 1000F;
		System.out.println("FastPerson Time Diff in seconds: " + seconds);

	}
}
