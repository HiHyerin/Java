//초기화(난수)
public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열선언
		int[]arr=new int[5];
			//arr[0]~arr[4] =0
		for(int i=0;i<5;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		// 값 출력
		// 향상된 for문 => 출력전용(forEach구문)
		/* 
		 * 		for(데이터형 변수 : 배열명) => 범위 지정 할 필요x 데이터가 모두 출력되면 자동으로 for문 종료
		 * 			ㅡㅡㅡㅡㅡㅡㅡ 실제 배열에 저장된값을 읽어온다.(항상 같은 데이터형이나, 큰 데이터형을 사용한다.)
		 * 		int[] => int, long, double
		 * 		char => int, long, doubler, char
		 * 		double => double
		 * 		long => long, double
		 * 
		 */
		for(int i:arr)
		{
			System.out.print(i + " ");
		}
		
		// forEach ==> 배열/컬렉션
		// 화면 출력시엔 forEach
		
		// 배열변경 후 다시 출력
		System.out.println();
//		arr[0] = arr[0] +1;
//		arr[0] = arr[0] +2;
//		arr[0] = arr[0] +3;
//		arr[0] = arr[0] +4;
//		arr[0] = arr[0] +5;
		
		for(int i=0;i<5;i++) {
			arr[i] = arr[i] +(i+1);
		}
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}

}
