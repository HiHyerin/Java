package com.sist.connect2;

class Saram{
	/*
	 	변수
	 	[접근지정어] 데이터형 변수명;
	 	
	 	메소드
	 	[접근지정어] 리턴형 메소드명(매개변수..){
	 		구현
	 	}
	 	
	 	접근지정어는 멤버에서만 사용 가능 (지역변수는 사용 할 수 없다)
	 	
	 */
	private String name; // 다른 클래스에서 접근x(은닉화)
	protected String sex; // 접근 가능
	int age; // 접근 가능
	public String address; // 접근가능
	

public String getName() { // 메소드를 통해서 변수의 기능 설정(읽기)
	return name;
}
public void setName(String name) {// 변수의 값 저장 기능(쓰기)
	this.name=name;
	}
}


public class 접근지정어_p_344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Saram s = new Saram();
		s.setName("홍길동");
		System.out.println(s.getName());
	}

}
