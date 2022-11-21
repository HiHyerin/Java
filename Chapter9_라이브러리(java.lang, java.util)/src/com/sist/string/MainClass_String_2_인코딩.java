package com.sist.string;

import java.util.Arrays;
//https://www.google.com/search?q=%EC%9E%90%EB%B0%94&oq=%EC%9E%90%EB%B0%94&aqs=chrome..69i57j69i59j69i61l3.391j0j15&sourceid=chrome&ie=UTF-8

public class MainClass_String_2_인코딩 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//%EC%9E%90%EB%B0%94
			// EC9E90EBB094 => 인코딩(byte[])
		String name="자바";
		// 인코딩(byte로 변환)
		System.out.println("====인코딩====");
		byte[] b=name.getBytes("UTF-8");
		for(byte bb:b) {
			System.out.print(String.format("%02X", bb));
		}
		System.out.println("\n====디코딩====");
		//브라우저: Asc(아스키코드) 1byte
		//자바 : uni code 2byte
		byte[] b2=name.getBytes("CP949");
		for(byte bb:b2) {
			System.out.print(String.format("%02X", bb));
		}
		
		} catch(Exception ex) {}
	}

}
