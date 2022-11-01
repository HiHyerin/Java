// 1~100 사이의 정수 10개를 저장 ==> 최대값, 최소값을 구하고 차를 출력(최대값-최소값)

import java.util.Arrays;

public class 배열_2 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		//출력
		System.out.println(Arrays.toString(arr));

		// 최대, 최소값 구하기
		// 최대값 => 가장 낮은 값
		int max = 1; // arr[0]
		// 최소값 => 가장 큰 값
		int min=100;// arr[0]
		
		for(int i:arr) {
			if(max<i)
				max=i;
			else if(min>i)
				min=i;
		}
		int index = 0;
		int j = 0;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i] == max) {
//				index=i;
//				
//			}else if(arr[i]==min) {
//				j = i;
//				
//			}
//		} // 비효율적 break를 걸지 않으면 10개면 10바퀴 100만개면 100만바퀴를 돌려야 하기 때문에 오래걸림
		
		
		System.out.println("최대값" + max + "의 저장 위치는" + (index+1) + "입니다.");
		System.out.println("최소값" + min + "의 저장 위치는" + (j+1) + "입니다.");
		System.out.println("최대값" + max);
		System.out.println("최소값" + min);
		System.out.println("최대값과 최소값의 차 : " + (max-min));
		
	}

}
