import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
//		double d = div(3,4);
//		System.out.println(d);
		Scanner scan = new Scanner(System.in);
		System.out.print("정수1 입력: ");
		int a = scan.nextInt();
		System.out.print("정수2 입력: ");
		int b = scan.nextInt();
		
		System.out.printf("%.2f",div(a,b));
		

	}

/*
4. 두 정수의 나눗셈 결과를 구하는 메소드를 구현하시오(실수)
5. 문자열의 소문자를 대문자로 바꾸는 메소드를 구현하시오
6. 문자열을 입력받아서 좌우 대칭인지 확인하는 메소드를 구현하시오
7. 문자열을 거꾸로 출력하는 메소드를 구현하시오
8. 학점을 구하는 메소드를 구현하시오
9. 년도를 입력받아서 윤년인지 여부를 확인하는 메소드를 구현하시오
10. 두수를 입력받아 큰 수를 출력하는 메소드를 구현하시오.
11. 입력 받은 값이 짝수인지 홀숨인지 판별하는 메소드를 구현하시오
12. 3의 배수를 판별하는 메소드를 구현하시오
13. 년,월,일을 입력받아서 요일을 구하는 메소드를 구현하시오
14. 메소드를 정의하여 입력받은 숫자를 거꾸로 뒤집은 쉬를 출력하는 프로그램을 작성하세요

 */
// Q4 두 정수의 나눗셈 결과를 구하는 메소드를 구현하시오(실수) 
	//리턴형 o, 매개변수 o
	static double div(int a, int b) {
		double div = (double)a/b;
		//System.out.println(div);
		return div;
		
	}
}
