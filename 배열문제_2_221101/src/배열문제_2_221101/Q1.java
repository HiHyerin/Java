/*
 1. (1차배열)1번 학생 100점 2번 학생 90점 3번학생 85점이다. 점수를 score 배열 변수에 저장하 고 1) 아래와 같이 출력하시오.
1번 학생 : 100점  
2번 학생 : 90점  
3번 학생 : 85점  


2) 학생들의 총점을 출력하시오.

 */

package 배열문제_2_221101;

import java.util.Arrays;

public class Q1 {

	public static void main(String[] args) {
		int [] arr= {100, 90, 85};
		for(int i=0; i<arr.length;i++) {
			System.out.println((i+1)+"번 학생 : " + arr[i] + "점");
		}
		
		int sum = 0;
		for(int i:arr) {
			sum += i;
		}
		System.out.println("총점: " + sum + "점");

		
	}

}
