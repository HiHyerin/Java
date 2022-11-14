package com.sist.main;
class 동물{
	void eat() {
		System.out.println("먹는다");
	}
}

class 개 extends 동물{ // 데이터형이 두 개 : 개, 동물
//	protected void eat() { // 오버라이딩
//		System.out.println("개같이 먹는다");
//	}
//	
	
	protected void eat(int a) { // 오버로딩
		System.out.println("개같이 먹는다");
	}

	@Override // source -> Override
	void eat() {
		
	}
}

class 소 extends 동물{  // 데이터형이 두 개 : 소, 동물
	public void eat() {
		System.out.println("소같이 먹는다");
	}
}

class 돼지 extends 동물{	 // 데이터형이 두 개 : 돼지, 동물
	 void eat() {
		System.out.println("돼지같이 먹는다");
	}
}
public class MainClass_다형성_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		동물 ani=new 개(); // 변수는 클래스타입
		//     ---------
		ani.eat();
		
		ani=new 소();
		//	--------
		ani.eat();
		
		ani=new 돼지();
		//	---------  메소드는 생성자가 가지고 있는 메소드를 호출한다.
		ani.eat();
		
		돼지 pig = new 돼지();
		pig.eat();
	}

}
