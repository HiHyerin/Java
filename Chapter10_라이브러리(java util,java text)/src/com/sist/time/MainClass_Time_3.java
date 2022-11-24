package com.sist.time;

import java.time.LocalDate;
import java.time.Period;

/*
 	Period(날짜차이) / Duration(시간차이)
 	
 	LocalDate d1
 	Localdate d2
 	
 	Period p = d1-d2
 	
 	LocalTime t1
 	LocalTime t2
 	
 	Period d= t1-t2
 */
public class MainClass_Time_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date1=LocalDate.now();
		LocalDate date2=LocalDate.of(2022, 11, 23);
		
		Period p=Period.between(date1, date2);
		System.out.println(p.getDays());
		// 음수(이전), 양수(이후), 0(같은 날)
	}

}
