package com.sist.main;
class A{ // 윈도우 , Server(접속담당)
	class B{ //쓰레드 , 통신 담당
		public void display() {
			System.out.println("B:display Call...");
		}
	}
	public void aaa() {
		B b=new B();
		b.display();
	}
}
class D{
	E e=new E() { // 익명의 클래스 (상속없이 오버라이딩 가능) -> 마이바티스 , 스프링 => 가끔 사용
		public void display() {
			System.out.println("D.E:display() Call...");
		}
	};
}
class E{
	public void display() {
		System.out.println("E:display() Call...");
	}
}


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		A.B ab=a.new B();
		a.aaa();
		
		E e=new E();
		e.display();
		
		D d=new D();
		d.e.display();
	}

}


// 노션 https://www.notion.so/a8537f8370154b44b5a060bcbd43aa4a
