package com.sist.util;
import java.util.*;
public class MainCloass_Calendar_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Calendar ⇒ Date로 변환해서 오라클에 저장
		Calendar cal=Calendar.getInstance();
		Date date=new Date(cal.getTimeInMillis()); // 날짜가 long형으로 되어있음
		System.out.println(date);
		
		//2. Date ⇒ Calendar
		Date date2=new Date();
		Calendar cal2=Calendar.getInstance();
		cal2.setTime(date2);
		System.out.println("년도:"+cal2.get(Calendar.YEAR));
		System.out.println("월:"+(cal2.get(Calendar.MONTH)+1));
		System.out.println("일:"+cal2.get(Calendar.DATE));
	}

}
