// 배열 복사하는 법
import java.util.Arrays;
/*
 * 배열 , 클래스 => 참조변수(메모리 주소)
 * 기본형 => 메모리 그 자체
 */
//p.173
public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int[] copy = new int[arr.length];
		
		
		for(int i=0;i<arr.length;i++) {
			copy[i]=arr[i];
		}
		System.out.println("arr=" + Arrays.toString(arr));
		System.out.println("copy=" + Arrays.toString(copy));
		
		copy[0] = 156;
		System.out.println("copy=" + Arrays.toString(copy));
		System.out.println("arr=" + Arrays.toString(arr));
		
	}

}
