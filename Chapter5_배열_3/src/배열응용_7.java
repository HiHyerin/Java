//알파벳 정렬
// select sort는 앞에서부터 고정
// bubble sort는 뒤에서부터 고정

import java.util.Arrays;

public class 배열응용_7 {

	public static void main(String[] args) {
		char[]arr=new char[10];
		
		//초기화
		for(int i=0;i<arr.length;i++) {
			arr[i] = (char)((Math.random()*26)+65);
		}
		System.out.println("정렬 전: ");
		System.out.println(Arrays.toString(arr));
		
		// 정렬
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					char temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("정렬 전: ");
		System.out.println(Arrays.toString(arr));	
	}

}
