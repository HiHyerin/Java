package com.sist.string;
//format => printf()
// join, format => byte[] 배열로 변환( 인코딩으로 전송)
public class MainClass_String_3_format {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 시간처리 할 떄 가끔 나옴(원하는 형식으로 변경) => 웹에서는 System.out.printf("")가 존재하지 않는다.
		int a=10;
		int b=20;
		String temp=String.format("%d + %d=%d", a,b,a+b);
		System.out.println(temp);
	
		//12세관람가 => 12 => format("%d관람가",12)
	}

}
