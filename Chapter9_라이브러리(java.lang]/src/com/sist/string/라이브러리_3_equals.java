package com.sist.string;

public class 라이브러리_3_equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello";
		String s2="Hello";
		
		if(s1==s2) { //메모리 주소값이 동일?
			System.out.println("s1==s2");
		}else {
			System.out.println("s1!=s2");
		}
		String s3=new String("Hello"); // 새로운 메모리에 저장
		if (s1==s3) {
			System.out.println("s1==s3");
		}else {
			System.out.println("s1!=s3");
		}
		
		
		// /////////////////////////// 주소값 비교
		
		// /////////////////////////// 실제값 비교
		if(s1.equals(s3)) {//실제 저장되어 있는 값 비교
			System.out.println("같은 문자열을 가지고 있다");
		} else {
			System.out.println("다른 문자열");
		}

		
		// 대소문자 구분 없이 비교
		// 원형 : public boolean equalsIgnoreCase(String s)
		if(s1.equalsIgnoreCase(s3)) {
			System.out.println("equalsIgnoreCase: 같은 문자열");
			
		}else {
			System.out.println("equalsIgnoreCase: 다른 문자열");
		}
		
		
		
		
		// trim
		// 원형 : public String trim()
		
		String temp2=" Hello Java ";
		System.out.println(temp2.length());
		temp2.trim();
		System.out.println(temp2.length());
	
		
		
		// valueOf() : 문자열 변환
		int a=10;
		int b=20;
		String p1=String.valueOf(a);
		String p2=String.valueOf(b);
		System.out.println(p1+p2);
		
	}

}
