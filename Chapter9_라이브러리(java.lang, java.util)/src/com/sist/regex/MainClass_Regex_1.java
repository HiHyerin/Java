package com.sist.regex;
// p.505
// 패턴 => 형태를 만들어서 찾기
// 예) IP전체를 가지고 온다 => [0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}
//						   숫자(1~3개)

import java.util.regex.*;
public class MainClass_Regex_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] data= {
				"bat","babt","bo nus","c","cA","ca","co","c0","c#","car",
				"combat","count","date","disc","홍길동","맛있다OK","시작12345"
		};
		
		// c[a-z]* => c로 시작하는 단어 (소문자)
		// c[a-z] => c로시작하는 두글자 단어
		// c[a-zA-Z0-9] => c로 시작하는 모든 단어   == c\\w
		// .* => 전체 읽기
		// .+
		//[bc].* : b나 c로 시작하는 모든 단어
		//^[가-힣] => 한글 한 글자
		//[가-힣]* => 한글 여러개
		// [가-힣]*.* => 한글 여러개 + 모든 문자
		Pattern p=Pattern.compile("c[a-z]*");
		System.out.println("============c[a-z]*===========");
		for(String s:data) {
			Matcher m=p.matcher(s);
			if(m.matches()) {
				System.out.println(m.group());
			}
		}
		
		System.out.println("============c[a-z]+===========");
		
		Pattern p1=Pattern.compile("c[a-z]+");
		for(String s:data) {
			Matcher m=p1.matcher(s);
			if(m.matches()) {
				System.out.println(m.group());
			}
		}
		
		
		System.out.println("============\\w*===========");
		
		Pattern p2=Pattern.compile("\\w*");
		for(String s:data) {
			Matcher m=p2.matcher(s);
			if(m.matches()) {
				System.out.println(m.group());
			}
		}
		

	
		System.out.println("============\\W+===========");
		
		Pattern p3=Pattern.compile("\\W+");
		for(String s:data) {
			Matcher m=p3.matcher(s);
			if(m.matches()) {
				System.out.println(m.group());
			}
		}
	
		
		System.out.println("============[b]S.*===========");
		
		Pattern p4=Pattern.compile("[b]S.*");
		for(String s:data) {
			Matcher m=p4.matcher(s);
			if(m.matches()) {
				System.out.println(m.group());
			}
		}
	
	}

}
