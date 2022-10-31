//화면출력
import java.util.*;// import가 있음  라이브러리 이용한다는 의미
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int[] arrcopy = new int[arr.length*2];
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
	}

}
