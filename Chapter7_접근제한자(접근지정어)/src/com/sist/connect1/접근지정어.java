package com.sist.connect1;
// 다른 클래스에서 접근 시 import
// import
import static java.lang.Math.random;
import static java.lang.System.out;
import static java.lang.String.valueOf;
//import java.util.Scanner; // 권장
public class 접근지정어 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(random()*10)+1;
		out.println(valueOf(a));
	}

}
