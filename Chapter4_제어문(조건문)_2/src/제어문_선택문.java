/*
 * 90-100 A
 * 80-89  B
 * 70-79  C
 * 60-69  D
 * 59     F
 */
import java.util.Scanner;
public class 제어문_선택문 {

	public static void main(String[] args) {
		// 3개의 정수(국, 영, 수)
		Scanner scan = new Scanner(System.in);
		System.out.print("국영수 점수 입력(80 80 80) : ");
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		
		// 총점
		int total = kor + eng + math;
		//평균
		double avg = total/3.0;
		
		// 학점
		char score;
		switch(((int)avg/10)) // 문자, 문자열, 정수 => 10, 9, 8, ... 0
		{
			// if(avg == 10 || avg == 9)
			case 10:
			case 9:
				score = 'A';
				break;
			case 8:
				score = 'B';
				break;
			case 7:
				score = 'C';
				break;
			case 6:
				score = 'D';
				break;
			default:
				score = 'F';
				break;
			
		}
		System.out.println("국어점수: " + kor);
		System.out.println("영어점수: " + eng);
		System.out.println("수학점수: " + math);
		System.out.println("총점: " + total);
		System.out.printf("퍙군:%.2f\n " , avg);
		System.out.println("학점: " + score);

	}

}
