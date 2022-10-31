package 배열문제_221031;

import java.util.Arrays;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*10)+1;
		}
		System.out.println(Arrays.toString(arr));
		int sum =0;
		double avg = 0;
		for(int i:arr) {
			sum += i;
		}
		avg=sum/10.0;
		System.out.println(avg);
		
	}

}
