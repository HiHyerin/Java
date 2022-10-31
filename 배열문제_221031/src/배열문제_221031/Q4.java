/*
 * 4. 양의 정수 10개 입력받아 배열에 저장하고, 
 * 배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하라

 */
package 배열문제_221031;

import java.util.Arrays;

public class Q4 {

	public static void main(String[] args) {
		int[]arr = new int[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*101);
			if(arr[i]%3==0)
				System.out.print(arr[i] + " "); // 인덱스를 이용해서 값을 얻어온다
		
		}
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		for(int i:arr) {
			i=(int)(Math.random()*101);
			if(i%3==0)
				System.out.print(i + " "); // 실제 저장된 값을 얻어온다
		
		}
		

	}

}
