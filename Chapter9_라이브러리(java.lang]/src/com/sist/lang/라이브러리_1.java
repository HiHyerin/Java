package com.sist.lang;
//소멸자 예제
/*
 	1) 클래스 설계
 	2) 객체 생성해서 저장(클래스 내용 저장)
 	3) 객체 활용(객체가 갖고있는 메소드나 변수 활용)
 	4) 객체 소멸
 	5) 소멸여부 확인(GC) : finalize()가 호출 되면 소멸된 것.
 */
class Main{
	private int a=10; // 필드
	public Main(int a) { // 생성자
		this.a=a;
		System.out.println("Main클래스 메모리 할당..(객체생성)");
	}
	
	public void display() { // 메소드
		System.out.println("Main클래스의 객체 활용..");
	}
//------------------------------------------------
	//소멸 될 때 자동 호출(소멸자)
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("객체 소멸(메모리 해제)");
	}
//-------------------------------------------------	
}


public class 라이브러리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m=new Main(10); //객체생성
		
		// 저장된 메모리에서 필요한 내용 호출
		m.display(); //객체 활용
		m=null; // 주소해제 (안됨)
		System.gc();
	}

}
