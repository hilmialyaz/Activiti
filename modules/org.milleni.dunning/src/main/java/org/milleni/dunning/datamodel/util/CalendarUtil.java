package org.milleni.dunning.datamodel.util;

import java.util.Calendar;
import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.Period;

public class CalendarUtil {

	public static int mountLastWorkDay(){
		Calendar calendar = Calendar.getInstance();				
		return getMountLastWorkDay(calendar);
	}
	
	
	public static int nextMountLastWorkDay(){
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MONTH,1);
		int nextMountDays = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		calendar.set(Calendar.DATE,nextMountDays);		
		if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
			nextMountDays--;
		}
		if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
			nextMountDays=nextMountDays-2;
		}
		
		int thisMountDiff=  mountLastWorkDay();		
		return thisMountDiff+nextMountDays;
	}


	private static int getMountLastWorkDay(Calendar calendar) {
		int maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		calendar.set(Calendar.DATE,maxDay);		
		if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
			maxDay--;
		}
		if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
			maxDay=maxDay-2;
		}
		Calendar calendarNow = Calendar.getInstance();
		int now = calendarNow.get(Calendar.DAY_OF_MONTH);
		return maxDay - now;
	}
	
	public static Date arrangeJodaToDate(String processWaitTime){
		return DateTime.now().plus(Period.parse(processWaitTime)).toDate();
	}
	
	
	public static void main(String[] args) {
		int next = nextMountLastWorkDay();
		Date dd = arrangeJodaToDate("P"+next+"D");
		System.out.println(dd);
	}
}
