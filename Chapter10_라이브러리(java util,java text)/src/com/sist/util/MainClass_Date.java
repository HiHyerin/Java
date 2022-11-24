package com.sist.util;
// 
import java.util.*;
import java.text.*;
public class MainClass_Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 생성과정
		
		
//		System.out.println(date);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		while(true) {
			Date date=new Date(); //SimpleDateFormat
			String today=sdf.format(date);
			System.out.println(today);
			try {
				Thread.sleep(1000);
			}catch(Exception ex) {}
		}
		
	
		
	}

}
