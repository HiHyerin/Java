
public class 배열_2 {

	public static void main(String[] args) {
		//배열 초기화 => 명시적, 난수, 사용자 입력을 받아서 저장
		// 명시적 초기화
		int[]arr= {10,20,30,40,50}; // 뒤에 있는 개수만큼 지정 => int변수 다섯개 저장한다는 의미
		// 변수, 배열(변수의 일종) => 읽기(메모리에 저장된 데이터 가지고 오기) / 쓰기(저장, 수정해서 저장 가능)
		// 값 읽어오는 방법
		// 1. 4번째에 있는 데이터 읽어 온다 => 출력
		System.out.println("arr=>4번째 데이터: " + arr[3]);
		System.out.println("arr=>5번째 데이터: " + arr[4]);
		// 값 변경하는 방법
		// 2번째 있는 데이털ㄹ 200으로 변경
		arr[1] =200;
		arr[2]= 300;
		
		//배열에 저장된 데이터 전체를 출력
		for(int i=0;i<5;i++)
			System.out.printf("arr[%d] = %d\n",i,arr[i]);

	}

}
