import java.util.Arrays;

//배열 복사
public class 배열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int[] copy=new int[arr.length*2];
		System.arraycopy(arr,3,copy,5,2);
		System.out.println("arr=" + Arrays.toString(arr));
		System.out.println("copy= " + Arrays.toString(copy));
	}

}
