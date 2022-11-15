package com.sist.main;
//p.375
abstract class 도형{
	public abstract void draw(); // 공통적으로 사용되는 기능을 모아서 관리
	// 공통으로 구현
	public void selectColor() {
		System.out.println("선택한 색상: 검정색");
	}
	// 선택적 구현 => 오버라이딩
	/*
	 	추상클래스는 
	 		= 클래스마다 따로 구현해야 되는 메소드(선언)
	 		= 필요시마다 구현해야 되는 메소드(구현=>오버라이딩)
	 		= 멤버 변수도 가지고 있다.
	 		= 사용시에는 반드시 메소드를 구현한 클래스를 이용해서 메모리 할당
	 		= 관련된 클래스 여러개를 엮어서 한개의 이름으로 제어
	 */
}

class 사각형 extends 도형{
	// 상속시에 구현이 안된 메소드는 반드시 구현해서 사용
	public void draw() {
		System.out.println("사각형을 그린다");
	}
	public void selectColor() {
		System.out.println("선택한 색상: 노란색");
	}
}

class 원 extends 도형{
	// 상속시에 구현이 안된 메소드는 반드시 구현해서 사용
	public void draw() {
		System.out.println("원을 그린다");
	}
}

class 삼각형 extends 도형{
	// 상속시에 구현이 안된 메소드는 반드시 구현해서 사용
	public void draw() {
		System.out.println("삼각형을 그린다");
	}
}


// 추상클래스 ex) 게임: 아바타, 적군비행기 / 쓰레드 동작
public class MainClass_클래스종류 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		도형 graph=new 사각형();
		graph.draw(); // 생성자에 맞게 메소드 호출
		graph=new 원();
		graph.draw();
		graph=new 삼각형();
		graph.draw();
		
	}

}
