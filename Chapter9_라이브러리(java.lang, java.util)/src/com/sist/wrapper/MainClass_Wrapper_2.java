package com.sist.wrapper;
//p.491~

import java.util.*;
public class MainClass_Wrapper_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		//2개 정수를 문자열로 받기 => 정수형으로 변환 => + 한 값
		System.out.print("문자열 두개 입력: ");
		String num1=scan.next();
		String num2=scan.next();
		System.out.println(Integer.parseInt(num1)+Integer.parseInt(num2));
		
	}

}
