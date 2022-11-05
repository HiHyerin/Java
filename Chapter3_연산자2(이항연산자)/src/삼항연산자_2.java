import java.util.Scanner;

// 년도를 입력 받아서 윤년 여부 확인
/*
 * 		○ 윤년의 조건
			- 4년마다 == (year % 4 == 0)
			- 100년마다 제외  == (year % 100 != 0)
			- 400년마다 == (year % 400 == 0)
 */

public class 삼항연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("년도 입력");
		
		int year = scan.nextInt();
		
		// 결과값 출력
		System.out.println((year%4 == 0 && year%100 != 0) || (year%400 == 0)?
				year + "년도는 윤년입니다." : year + "년도는 윤년이 아닙니다.");
	}

}
