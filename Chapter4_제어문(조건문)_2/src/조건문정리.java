// 4칙연산, 학점
import java.util.Scanner;
public class 조건문정리 {

	public static void main(String[] args) {
		// + - * /
		
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int num1 = scan.nextInt();
		
		System.out.println("두번째 정수 입력 : ");
		int num2 = scan.nextInt();
		
		System.out.println("연산자 입력(+ - * /) : ");
		switch(scan.next()) // 문자열
		{
			case "+" :
				System.out.printf("%d + %d = %d\n", num1, num2, num1+num2);
				break; //switch 종료
				
			case "-" :
				System.out.printf("%d - %d = %d\n", num1, num2, num1-num2);
				break;
				
			case "*" :
				System.out.printf("%d * %d = %d\n", num1, num2, num1*num2);
				break;
				
			case "/" :
				if(num2==0)
					System.out.println("0으로 나눌 수 없습니다."); //오류처리
				else
					System.out.printf("%d / %d = %.2f\n", num1, num2, num1/(double)num2);
				break;
			
			default:
				System.out.println("+, -, *, /를 입력하세요.");
		}

	}

}
