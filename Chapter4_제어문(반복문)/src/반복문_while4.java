import java.util.Scanner;
public class 반복문_while4 {

	public static void main(String[] args) {
		// 사용자가 정수 10개 입력 => 입력값의 누적합을 출력
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int i=1;
		
		while(i<=10) {
			System.out.print(i +"번째 정수 입력: ");
			int num=scan.nextInt();
			
			//sum에 누적
			sum += num;
			i++;
		}
		System.out.println("sum= " + sum);
		
		String[] arr = {"홍길동", "심청이", "춘향이", "박문수", "이순신"	};
		for(i=0;i<5;i++	) {
			System.out.println(arr[i]);
		}
	}

}
