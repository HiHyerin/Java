package com.sist.exception;

import java.util.Scanner;

public class 예외처리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//UnCheckException => 예외처리 생략이 가능(정수변환, 배열, 나누기 ...)
		try {
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 두 개 입력: ");
		int[] arr=new int[2];
		arr[0]=scan.nextInt();
		arr[2]=scan.nextInt(); //오류발생
		
		int res=arr[0]/arr[1];
		System.out.println("res="+res);
		}catch(ArrayIndexOutOfBoundsException ex) {
			//에러 확인
			//System.out.println(ex.getMessage());
			ex.printStackTrace();//실행과정 출력
		}
		System.out.println("프로그램 종료");
	}

	

}
