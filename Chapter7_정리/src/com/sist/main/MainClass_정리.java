package com.sist.main;

// 디자인 패턴 => 싱글톤 패턴 (메모리 누수 방지)
class A{
	private static A a;
	public static A newInstance() {
		if(a==null)
			a=new A();
		return a;
	}
}
public class MainClass_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=A.newInstance();
		System.out.println("a="+a);
		A b=A.newInstance();
		System.out.println("b="+b);
		A c=A.newInstance();
		System.out.println("c="+c);
	}

}
