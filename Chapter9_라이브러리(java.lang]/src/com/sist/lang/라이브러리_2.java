package com.sist.lang;
// 객체를 문자열로 변환
/*
 	1. toString 생략 가능
 	2. 오버라이딩 : 출력 형식 변경
 	3. String으로 형변환이 필요 없어진다.
 		1)
 		class A
 		A aa=new A();
 		String a=(String)aa;
 		String a=String.valueOf(aa)
 		-----------------------------
 		2)
 		String a=aa.toString()
 */

class Main2{
	private String name;
	private String sex;
	private int age;
	public Main2(String name, String sex, int age) {
		this.name=name;
		this.sex=sex;
		this.age=age;
	}
	//데이터베이스 => toString() 많이 사용
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름:	"+name+", 성별: "+sex+", 나이: "+age;
	}
	
}


public class 라이브러리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main2 m=new Main2("홍길동","남자",30);
		System.out.println(m); // 주소값 출력(toString생략)
		System.out.println(m.toString()); //생략이 가능
	}

}
