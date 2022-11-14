package com.sist.main2;


class A{
	int a=10;
	public void display() {
		System.out.println("A:display Call...");
	}
}

class B extends A{
	int a=100;
	public void display() {
		System.out.println("B:display Call..."); // 오버라이딩
	}
}
public class MainClass_메모리할당 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		//b.a=100 , 메소드 B()
		System.out.println(b.a);
		b.display();
		
		A c = new B();
		System.out.println(c.a);
		c.display();
		
		B d = (B)c; // A c를 (B)로 형변환
		System.out.println(d.a);
		d.display();
		
		// 형변환 => 상속 내리는 클래스 > 상속 받는 클래스
		// 자바에서 지원하는 라이브러리 => return Object
	}

}
