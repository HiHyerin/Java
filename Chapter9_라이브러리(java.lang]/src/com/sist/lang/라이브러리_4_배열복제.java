package com.sist.lang;

import java.util.Arrays;

//clone => 복제 / 참조
public class 라이브러리_4_배열복제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CallByReference
		int[] arr= {10, 20, 30, 40, 50};
		int[] copy=arr;
		int[] copy1=arr.clone();
		System.out.println("arr:"+arr);
		System.out.println("copy:"+copy);
		System.out.println("copy1:"+copy1);
		//참조
		System.out.println("===arr===");
		System.out.println(Arrays.toString(arr));
		System.out.println("---copy---");
		System.out.println(Arrays.toString(copy));
		System.out.println("===변경후===");
		
		arr[0]=100;
		arr[1]=200;
		System.out.println("===arr===");
		System.out.println(Arrays.toString(arr));
		System.out.println("---copy---");
		System.out.println(Arrays.toString(copy));
		System.out.println("===변경후===");
		
		copy[2]=300;
		copy[3]=400;
		System.out.println("===arr===");
		System.out.println(Arrays.toString(arr));
		System.out.println("---copy---");
		System.out.println(Arrays.toString(copy));
		
		
			

	}

}
