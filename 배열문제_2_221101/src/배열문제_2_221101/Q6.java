/* 
 6. 0~9사이의 난수를 100개 발생해서 
   빈도를 구해서 출력하시오 
   예)
   0의 개수: 1
   1의 개수: 1
   ..
   9의 개수: 0

 */

package 배열문제_2_221101;

import java.util.Arrays;

public class Q6 {

	public static void main(String[] args) {
		int [] arr = new int[100];
		for(int i=0; i<arr.length;i++) {
			arr[i] = (int)(Math.random()*10);			
		}
		System.out.println(Arrays.toString(arr));
		
		int[] result = new int[10];
		for(int i=0;i<arr.length;i++) {
			result[arr[i]] ++; // 의미를 잘 모르겠음
		}
		System.out.println(Arrays.toString(result));
	}

}
