/*
 * 조건식
 * 	1) 90이상 ~ 100이하 (&&)
 * 		num>=90 && num <=100
 *	2) 0 보다 작고 100보다 크다(||)
 *		num<0 || num>100 ==> 잘못된 입력
 *	3) y, Y
 *		num =='y' || num =='Y'(비교연산자: 정수, 실수, 논리, 문자)
 *		*** 문자열(equals) => id, pwd(로그인 처리할 때) *** 웹은 문자열 중심
 *
 */
// 3개의 점수를 받아 평균, 총점, 학점 구해서 출력
// 90 이상 => 'A', 80은 b, 70 c, 60d, 이하는 F
import java.util.Scanner;
public class 제어문_조건문2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("국어, 영어, 수학점수 입력(80 80 80) : ");
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		
		//총점
		int total = kor + eng + math;
		//평균
		double avg = total/3.0;
		
		//결과출력
		System.out.println("국어점수: " + kor);
		System.out.println("영어점수: " + eng);
		System.out.println("수학점수: " + math);
		System.out.println("총점: " + total);
		System.out.printf("평균: %.2f\n", avg);
		//---------------------------------------평문이라 함
		
		char c ='A';
		// 학점출력
		if(avg>=90 && avg<=100)
			c='A';
		if(avg>=80 && avg< 90)
			c='B';
		if(avg>=70 && avg<80)
			c='C';
		if(avg>=60 && avg<70)
			c='D';
		if(avg<60)
			c = 'F';
		
		System.out.println("학점: " + c);
			
			
		

	}

}
