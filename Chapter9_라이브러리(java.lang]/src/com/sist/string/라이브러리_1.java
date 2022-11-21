package com.sist.string;

public class 라이브러리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// charAt : public char charAt(int index) : 지정된 위치의 문자를 읽어 올때 사용(웹에서 사용빈도는 거의 없음)
//		String s="Hello Java";
//		char c=s.charAt(4);
//		System.out.println("c="+c);
		
		// length() : public int length() => 문자의 갯수를 읽어온다(영문, 한글 동일)
		//  		  => 화면 UI 글자수 확인, 비밀번호 검사
//		String e="ABC";
//		String h="홍길동";
//		System.out.println("e의 글자수:"+e.length());
//		System.out.println("h의 글자수:"+h.length());
		
		String s="hello Java";
		System.out.println("대문자 변환:" + s.toUpperCase());
		System.out.println("소문자 변환: "+s.toLowerCase());
		//문자열에 저장된 데이터는 변경이 안된다. 위에 저렇게 대문자 소문자 바꿔도 s자체가 바뀌진 않는다.
		System.out.println("원본:"+ s);
		s=s.toUpperCase(); // 이렇게 하면 원본도 바뀜
		System.out.println("원본:"+ s);
		
		
	}

}
