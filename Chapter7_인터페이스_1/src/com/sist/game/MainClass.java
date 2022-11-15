package com.sist.game;
interface 동물{
	void eat(); // (public abstract) void eat();
	void run();
	//void aaa(); // 나중에 추가한 메소드인데 이렇게 나중에 추가하면 상속?받은 다른 메소드들 다 오류발생 (필요없어도 무조건 적어줘야 오류가 안난다.)
	default void aaa() { // 이렇게 하면 나중에 내가 따로 필요할 때만 상속?받는 다른 메소드들에 추가하면 된다.
//  ------------ 여기에도 public 생략돼 있는 것
	}
}
class 말 implements 동물{

	@Override
	public void eat() { //오버라이딩은 접근지정어가 생략되면 안된다.
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
class 소 implements 동물{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
