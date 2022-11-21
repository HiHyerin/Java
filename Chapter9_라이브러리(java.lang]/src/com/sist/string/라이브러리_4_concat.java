package com.sist.string;
// concat, replace, replaceAll, substring, split
// indexOf, lastIndexOf, valueOf
public class 라이브러리_4_concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		// concat => 문자열 결합(+)
		// 원형 : public String concat(String s)
//		String s1="Hello";
//		String s2="Java!!";
//		String s12=s1.concat(s2);
//		String s3=s1+s2;
//		System.out.println(s12);
//		System.out.println(s3);
		
		
		
		
		
		// replace => 단어, 문자열 변경
//		String s="Hello Java";
//		String s1=s.replace('a','b'); // Hello Jbvb
//		String s2=s.replace("Java","Oracle"); // Hello Oracle
		
		
		
		
		
		// replaceAll => 정규식
		// 원형 : public String replaceAll(String p, String s)
		String s="안녕하세요 Hello 12345";
		System.out.println("한글만 출력:" + s.replaceAll("[^가-힣]", ""));
		// ^ 제외하고 [가-힣] => 한글 전체
		System.out.println("영어만 출력:" + s.replaceAll("[^A-Za-z]", ""));
		System.out.println("숫자만 출력:" + s.replaceAll("[^0-9]", ""));
		
		
		
		
		//subString 
		// 원형 : public String substring(int s) : s부터 나머지 전체를 읽어 온다.
		//		 public String substring(int s, int e) : s부터 e-1번까지 읽어온다.
		String ss="Hello Java";
		String ss1=ss.substring(6);
		System.out.println(ss1);
		String ss2=ss.substring(0,5); // 5번 제외 (0-4)
		System.out.println(ss2);
	
		
		
		
		
		// split
		// 원형 : String[] split(String regex) => 정규식 => \\(|)
		// 정규식에서 사용되는 기호 : . | ^ ? + * 
		// \\. \\| \\^ \\? \\+ \\*
		String sss="red, green, black, white, pink";
		String[] color=sss.split(",");
		for(String c:color) {
			System.out.println(c);
		}
		
		
		
		
		
		// indexOf , lastIndexOf : 해당 문자의 위치값
		String temp="Hello Java";
		int index=temp.indexOf("a"); //앞에서부터 먼저나오는 a의 위치
		System.out.println(index);
		index=temp.lastIndexOf("a"); // 뒤에서부터 먼저 나오는 a의 위치
		System.out.println(index);
		
		
		
	
	}

}
