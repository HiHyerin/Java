package com.sist.util;
import java.util.*;
public class MainClass_Calendar_4_달력만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자로부터 년 월 일 받기
		Scanner scan=new Scanner(System.in);
		System.out.println("년도 월 입력(2022 11):");
		int year=scan.nextInt();
		int month=scan.nextInt();
		
		//1일자의 요일 확인, 요청한 달의 마지막 날짜 확인
		Calendar cal=Calendar.getInstance(); // 객체 생성
		cal.set(Calendar.YEAR, year); // 사용자가 입력한 날짜로 변경
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, 1);
		
		int week=cal.get(Calendar.DAY_OF_WEEK)-1;
		int lastday=cal.getActualMaximum(Calendar.DATE);
		
		String[] strWeek= {"일","월","화","수","목","금","토"};
		System.out.println("요청 일자의 1일자 요일:"+strWeek[week]);
	
		System.out.println(year+"년도 "+month+"월");
		System.out.println("\n");
		for(String s:strWeek) {
			System.out.print(s+"\t");
		}
		System.out.println();
		for(int i=1;i<=lastday;i++) {
			if(i==1) {
			for(int j=0;j<week;j++) {
				//요일 전까지 공백 출력
				System.out.print("\t");
			}
			
		}
		System.out.printf("%2d\t",i);
		week++;
		if(week>6) { // 일요일이라면
			week=0;
			System.out.println();
		}
		}
	}

}
