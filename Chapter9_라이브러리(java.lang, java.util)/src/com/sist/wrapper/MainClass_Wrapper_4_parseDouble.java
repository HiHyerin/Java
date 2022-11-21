package com.sist.wrapper;

public class MainClass_Wrapper_4_parseDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double d=10.5; //박싱(클래스에 기본형 데이터 값 대입) => 클래스에는 원래 주소값을 대입해야함 래퍼클래스는 실제 값을 넣을 수 있음
		double d1=d; //언박싱 //원래 기본형에는 클래스 값을 대입할 수 없지만 wrapper클래스는 가능?(혼합사용 가능)
		
		System.out.println("d="+d);
		System.out.println("d1="+d1);
		String s="100.67";
		double d2=Double.parseDouble(s); //문자열을 double형으로 바꿀 때
		System.out.println("d2="+d2);
		String s1="true";
		boolean b=Boolean.parseBoolean(s1);//문자열은 boolrsn형으로 바꿀 때
		System.out.println("b="+b);
	}

}
