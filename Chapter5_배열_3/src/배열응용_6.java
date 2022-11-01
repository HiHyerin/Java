import java.util.Arrays;

/*
 	버블 정렬
 	20 30 10 50 40
 */
public class 배열응용_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정렬 대상
		int[] arr = new int[5];
		
		//초기화
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		
		//출력
		System.out.println("정렬 전: ");
		System.out.println(Arrays.toString(arr));
		
		//버블정렬 시작
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
		System.out.println("정렬 후: ");
		System.out.println(Arrays.toString(arr));

	}

}
