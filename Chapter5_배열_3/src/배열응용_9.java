import java.util.Arrays;

//빈도 구하기 p.204
public class 배열응용_9 {

	public static void main(String[] args) {
		int[] arr=new int[100];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10);
		}
		System.out.println(Arrays.toString(arr));

		//빈도 저장 배열(0~9)
		int[] result=new int[10];
		for(int i=0;i<arr.length;i++){
			result[arr[i]]++;
		}
		
		//출력
		for(int i=0;i<result.length;i++) {
			System.out.println(i+ "=>" + result[i]);
		}
		
	}

}
