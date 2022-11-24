package com.sist.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class MainCloass_Time_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		
		//날짜 설정 ==> 생년월일, 예약일 등록... /Date클래스는 설정 못함
		date=LocalDate.of(2022, 12, 1); 
		System.out.println(date);
		time=LocalTime.of(15, 30, 45);
		System.out.println(time);
	}

}
