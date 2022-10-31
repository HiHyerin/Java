
package 배열문제_221031;

import java.util.Arrays;

public class Q4 {

	public static void main(String[] args) {
		int[]arr = new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*101);
			if(arr[i]%3==0)
				System.out.println(arr[i]);
				
				
				
		}
		

	}

}
