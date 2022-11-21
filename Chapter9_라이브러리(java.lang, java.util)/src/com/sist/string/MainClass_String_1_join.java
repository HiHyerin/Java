package com.sist.string;

import java.util.StringJoiner;

//p.471
public class MainClass_String_1_join {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color="red,green,blue,black,white,yellow, magenta";
		
		//컬러별 분리
		String[] colors=color.split(",");
		for(String c:colors) {
			System.out.println(c);
		}
		System.out.println("===출력형식(join)===");
		String ss=String.join("-", colors);
		System.out.println(ss);
		System.out.println("===출력형식(replace)===");
		ss=color.replace(",", "-");
		System.out.println(ss);
		
		// 이미지(여러개를 동시에 묶어서 저장) => 구분자 사용해서 저장(데이터를 나눠서 출력)
		// 오라클 => ^로 통일
		
		StringJoiner sj=new StringJoiner("/","{","}");
		
		for(String s:colors) {
			sj.add(s);
		}
		System.out.println(sj.toString());
	}

}
