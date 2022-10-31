import java.util.*;

public class 배열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr= {'a','b','c','d','e'};
		char[] copy = new char[arr.length];
		// 값을 복사 => 출력 arr/copy
		System.arraycopy(arr, 0, copy, 0, arr.length);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(copy));
		copy[1]= 'K';
		System.out.println("copy = " + Arrays.toString(copy));
		System.out.println("arr = " + Arrays.toString(arr));
	}

}
