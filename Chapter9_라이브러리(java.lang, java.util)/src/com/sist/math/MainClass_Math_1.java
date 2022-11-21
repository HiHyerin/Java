package com.sist.math;
import static java.lang.Math.round;
import static java.lang.Math.ceil;
import static java.lang.Math.random;
public class MainClass_Math_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%.2f\n",87.555); //자동 반올림
		System.out.println(round(87.555));
		System.out.println(ceil(87.1));
		System.out.println((int)(random()*100));
		//System.out.println(Math.round(87.555)); // 반올림
		//System.out.println(Math.ceil(87.1)); //올림
		//System.out.println((int)(Math.random()*100));
	}

}
