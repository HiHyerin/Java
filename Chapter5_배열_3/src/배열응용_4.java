// 정렬(오름차순, 내림차순) -> 선택정렬

import java.util.Arrays;

/*
 		정렬
 		= 선택정렬
 		= 버블정력
 */
public class 배열응용_4 {

	public static void main(String[] args) {
		// 정렬 대상
		int[] arr = new int[5];
		
		//초기화
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		
		//출력
		System.out.println("정렬 전: ");
		System.out.println(Arrays.toString(arr));
		
		//정렬
		for(int i=0;i<arr.length-1;i++) { // 내림차순 (> : 오름차순)
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println((i+1)+":"+Arrays.toString(arr));
		}

		//출력
				System.out.println("정렬 후: ");
				System.out.println(Arrays.toString(arr));
	}

}
