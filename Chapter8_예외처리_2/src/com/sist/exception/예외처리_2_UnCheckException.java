package com.sist.exception;

import java.util.Scanner;

// 멀티 catch블럭
public class 예외처리_2_UnCheckException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문자열로 받아서 정수화 => 나누기
		try {
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수입력: ");
		String num1=scan.next();
		System.out.print("두번째 정수 입력: ");
		String num2=scan.next();
		//오류가 예상되는 부분 : 정수아닌 문자 입력시..
		int n1=Integer.parseInt(num1);
		int n2=Integer.parseInt(num2); //NumberFormatException
		
		// 나누기 오류예상(0입력시..)
		int n3=n1/n2;
		System.out.println("결과값:"+n3);
		}catch(NumberFormatException | ArithmeticException e){ // 오류처리
			//e는 객체 - 어떤 클래스의 객체인지 확인할 때 instanceof 연산자 이용
			if(e instanceof NumberFormatException)
				System.out.println("문자열 입력. \n 정수 입력");
			else if(e instanceof ArithmeticException)
				System.out.println("0으로 나눌 수 없습니다.");
		}
		System.out.println("화면출력유지...");
		
	}

}
