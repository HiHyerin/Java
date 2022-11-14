package com.sist.main4;
/* 
 		A a=new B();
 		A a=new C();
 		
 		B b=new D();
 		B b=new E();
 		B b=new B();
 		
 		C c=new F();
 */

class A{
	
}
///////////////////////////////////////////////////////////////
class B extends A{
	public void display() {
		System.out.println("B:display() Call...");
	}
}
///////////////////////////////////////////////////////////////
class C extends A{

}
///////////////////////////////////////////////////////////////
class D extends B{
	public void display() {
		System.out.println("D:display() Call...");
	}
	
	//메소드 추가
	public void ddd() {
		System.out.println("D:ddd() Call...");
	}
}
///////////////////////////////////////////////////////////////
class E extends B{
	public void display() {
		System.out.println("E:display() Call...");
	}
}
///////////////////////////////////////////////////////////////
class F extends C{
	
}
///////////////////////////////////////////////////////////////
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		B b=new D();
//		B b1=new E();
//		B b2=new B();
//		// B b3=(B) new A(); => 오류
//		A a=new B();
//		B b3=(B) a;
		
		B b1=new D(); //=> 오버라이딩된 메소드만 접근 가능
		b1.display(); // D가 갖고있는 메소드 호출
		// b1.ddd(); => 오류 왜왜오애왜?????????
		
		D d=new D();
		d.display();
		d.ddd();
		
		D d1=(D)b1;
		d1.display();
		d.ddd();
		
		new D().display(); // 객체가 필요없는 경우
		new D().ddd();
			
	}

}
