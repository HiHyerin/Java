package com.sist.exception;

import java.util.Arrays;

public class 예외처리_4_CheckException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[]arr = new int[6];
			for(int i=0;i<arr.length;i++) {
				arr[i]=(int)(Math.random()*45)+1; //1~45
				for(int j=0;j<i;j++) {
					if(arr[j]==arr[i]) {// 중복이 있다면~
						i--;
						break;
					}
				}
			}
			System.out.println("오늘의 로또번호~!: "); // 잠실역 8번출구 로또
			Arrays.sort(arr);
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
				Thread.sleep(1000);//1초 500:0.5초
			}
		}catch(InterruptedException e) {// 충돌방지. 인터럽트 나오면 쓰레드?
			System.out.println(e.getMessage());
		}
	}

}
