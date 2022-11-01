/*
2. 1월달 사원(1번부터 5번사원)의 실적이 50 45 35 12 70 이다. 
(실적 0~100)
1) 사번별 실적을 출력하시오. ex) 사원(1) 50
2) 1월 실적의 총점과 평균을 출력하시오.
3) 실적이 제일 큰 사원의 사번과 실적, 작은 사원의 사번과 실적을 출력하시오.
 */

package 배열문제_2_221101;

import java.util.Arrays;

public class Q2 {

	public static void main(String[] args) {
		int [] arr = {50, 45, 35, 12, 70};
		for(int i=0;i<arr.length;i++) {
			System.out.println("사원 " + (i+1) + ": " + arr[i]);
		}
		int sum=0;
		for(int i : arr) {
			sum += i;
		}
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + (double)(sum/5.0));
		System.out.printf("평균 : %.2f\n",sum/(double)arr.length);
		
		int max = arr[0], sabun1 = 0;
		int min = arr[0], sabun2 = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i])
				max=arr[i];
			if(min>arr[i])
				min=arr[i];
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==max) {
				sabun1=i;
				break;
			}
			if(arr[i]==min) {
				sabun2 = i;
				break;
			}
		}
		System.out.println("최대실적사원(" + (sabun1+1) + ") " + max);
		System.out.println("최저실적사원(" + (sabun2+1) + ") " + min);

	}

}
