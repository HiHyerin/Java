package com.sist.main3;
class A{
	int a,b,c;
	public A() {
		a=10; // 우선순위 지역변수 > 멤버변수
		b=20;
		c=30;
		
	}
	
	public A(int a, int b) {
		this.a=a;
		this.b=b;
	}
	
	public A(int a, int b, int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
}
/////////////////////////////////////////////////////
class B extends A{
	int a,b,c;
	public B() {
		a=100;
		b=200;
		c=300;
	}
	public B(int a, int b, int c) {
//		super(a,b);
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void print() {
		System.out.println("this.a="+this.a);// B class가 가지고 있는 a,b,c
		System.out.println("this.b="+this.b);
		System.out.println("this.c="+this.c);
		
		System.out.println("super.a="+super.a);//A class가 가지고있는 a,b,c
		System.out.println("super.b="+super.b);
		System.out.println("super.c="+super.c);
	}
	
}
////////////////////////////////////////////
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		B b=new B(70, 80, 80);
//		b.print();
		
		Object obj=new Object();
		A a=new A();
		B b=new B();
		
		if(a instanceof Object) { // a는 object이다
			System.out.println(true);
		}
		
		if(b instanceof Object) { // b는 object이다
			System.out.println(true);
		}
		
		if(b instanceof A) { // b는 a이다
			System.out.println(true);
		}
		
		if(b instanceof B) { // a는 object이다
			System.out.println(true);
		}
		
		if(a instanceof B) { // a는 object이다
			System.out.println(true);
		}else
			System.out.println(false);
	}

}
