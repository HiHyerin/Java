package com.sist.main3;

class Super{
	
	int a,b;
	public Super(int a, int b) {
		this.a=a;
		this.b=b;
			
	}
	/////////////////
	public Super() {
		a=1000;
		b=2000;
	}
	///////////////////
	public void print() {
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}

class Sub extends Super	{ // Super 메모리를 할당하려면 기본생성자를 호출한다.
						// 만약 매개변수가 있는 생성자라면 밑에처럼 상위클래스 생성자를 먼저 호출해야한다.
	int c;
	int a,b;
	public Sub(int a, int b, int c) {
		//상위 클래스 생성자를 먼저 호출
		super(a,b);
		this.a=100;
		this.b=200;
		this.c=c;
	}
	public void print() {
		System.out.println("super.a="+super.a);
		System.out.println("super.b="+super.a);
		System.out.println("this.a="+a);
		System.out.println("this.b="+b);
		System.out.println("this.c="+c);
	}
	
	
}



public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub sub=new Sub(10,20,30);
		sub.print();
		
		
	}

}
