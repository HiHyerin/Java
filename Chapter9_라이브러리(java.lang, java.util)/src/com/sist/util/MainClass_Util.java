package com.sist.util;
import java.util.*;

public class MainClass_Util {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Random 클래스 생성
		Random r=new Random();
		//int i=r.nextInt(31)+1;
		//System.out.println(i);
		int[] reserve=new int[r.nextInt(10)+11]; // 11~20
		for(int i=0;i<reserve.length;i++) {
			reserve[i]=r.nextInt(31)+1;
		}
		
		Arrays.sort(reserve);
		System.out.println("====예약 가능 날짜===");
		for(int i:reserve) {
			if(i>21) {
				System.out.print(i+" ");
			}
		}
		
	}

}
