package com.sist.main;

class Super2{
	int a=10;
	int b=20;
	public void display() {
		System.out.println("Super: display() Call...");
	}
	// 생성자, 초기화블록, static은 상속이 아니라 공유
	// private은 상속은 되지만, 접근 할 수 없다. getter/setter
}

class Sub2 extends Super2{
	int c=300;
	public Sub2() {
		a=100;
		b=200;
	}
}



public class MainClass_상속_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 하위클래스
		Sub2 sub=new Sub2(); // Sub2의 변수 a,b,c 사용 / 메소드는 Sub2 사용
		System.out.println("sub.a="+sub.a);
		System.out.println("sub.b="+sub.b);
		System.out.println("sub.c="+sub.c);
		
		// 상위클래스
		Super2 sup=new Sub2(); //(상위클래스 = new 하위클래스 -> 상위클래스에 하위클래스 객체 메모리 생성??)
		// Super2의 변수 a,b 사용 / 메소드는 Sub2 사용
		System.out.println("sup.a="+sup.a);
		System.out.println("sup.b="+sup.b);
		// System.out.println("sup.c="+sup.c);
		
		Sub2 sup2=new Sub2(); //(하위클래스 = new 상위클래스) => 형변환
		Sub2 sub2=(Sub2)sup2;
		System.out.println("sub2.a="+sub2.a);
		System.out.println("sub2.b="+sub2.b);
		System.out.println("sub2.c="+sub2.c);
		// 변수는 클래스 타입 / 메소드는 생성자 타입을 따른다
	}

}
