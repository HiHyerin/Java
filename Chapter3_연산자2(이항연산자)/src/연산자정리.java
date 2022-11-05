import java.util.Scanner;

public class 연산자정리 {

	public static void main(String[] args) {
		// 국어, 영어, 수학 점수를 받아서 총점, 평균 구한 후 60 이상 pass, 이하 fail
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("국어, 영어, 수학 점수 입력: ");
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		
		int sum = kor + eng + math;
		double avg = sum/3.0;
		int temp = (int) avg;

		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + math);

		System.out.println("총점: " + sum);
		System.out.printf("평균:%.2f\n " , avg);
		
		System.out.println(temp>60? "pass":"fail");
		

		
	}

}
