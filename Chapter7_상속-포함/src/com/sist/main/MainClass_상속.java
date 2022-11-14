package com.sist.main;

class Super{
	int a=10;
	int b=20;
	static int c=30;
	
	public Super() { // 생성자
		System.out.println("super() call...");
	}
	
	public void print() { //메소드
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
	}
}

class Sub extends Super{
	//생성자
	public Sub() {
		a=100;
		b=200;
		c=300;
		
		System.out.println("Sub() Call...");
	}
}



public class MainClass_상속 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub sub=new Sub();
		sub.print();
		Super sup=new Super();
		sup.print();
		
		
	}

}
