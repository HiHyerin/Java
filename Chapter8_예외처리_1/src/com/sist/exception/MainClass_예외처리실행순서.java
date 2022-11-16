package com.sist.exception;//p.414

public class MainClass_예외처리실행순서 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(10/0); //오류났기때문에 try는 빠져나가고 catch로 이동(5번을 수행 못함)
			System.out.println(5);
		}catch(RuntimeException ex) {
			System.out.println(6);
		}
		finally {
			System.out.println(7);//에러가 나던 안나던 수행
		}
		System.out.println(8);
		System.out.println(9);
	}

}
