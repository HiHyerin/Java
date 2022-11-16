package com.sist.exception;

public class MainClass_예외처리 {

	public static void main(String[] args) {
		/*try {
			for(int i=1;i<=10;i++) {
				int r=(int)(Math.random()*3);//0, 1, 2
				System.out.println(i+"-"+(i/r));
			}
		}catch(Exception ex) {
			ex.printStackTrace();//에러 확인
		}*/

		
		for(int i=1;i<=10;i++) {
			try {
				int r=(int)(Math.random()*3);//0, 1, 2
				System.out.println(i+"-"+(i/r));
			}catch(Exception ex) {
				i--;
			}
		}
	}

}
