
import java.util.Scanner;

public class 산술연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b;
		Scanner scan=new Scanner(System.in);
		System.out.print("두 개의 정수를 입력하시오(a b) : ");
		a = scan.nextInt(); //입력된 정수값을 가지고 온다 => a라는 메모리에 저장
		b = scan.nextInt(); // b라는 메모리에 저장
		
		// 출력
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
		// 연산처리
		System.out.printf("%d + %d = %d \n", a,b, a+b);
		//               ------------------   -------
		//					  출력 형식          값 대입
		System.out.printf("%d - %d = %d \n", a,b, a-b);
		System.out.printf("%d * %d = %d \n", a,b, a*b);
		System.out.printf("%d / %d = %.2f \n", a,b, a/(double)b); // 패턴을 맞게 값을 입력 .2f가 소수점(실수)이니까 int는 정수이므로 안됨
		System.out.printf("%d %% %d = %d \n", a,b, a%b);
		
		
	}

}
