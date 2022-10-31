// 배열 복사의 잘못된 예

import java.util.Arrays;

public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int[] copy = arr; //Call By Reference(주소에 의한 참조), 
						  //보통 클래스가 여러개 있을 때 사용, 다른 클래스에서 제어 가능
		System.out.println("arr=" + Arrays.toString(arr));
		System.out.println("copy= " + Arrays.toString(copy));
		copy[0]=100; // 참조형(주소값을 공유하는 것이기 때문에 복사개념보다는 값을 변경하는 것이 더 가깝다.)
		
		/*int a=10; // Call By Value
		int b=a;
		b=15;
		System.out.println(a);
		System.out.println(b);*/ //기본형(메모리 자체를 변경)
	}

}
