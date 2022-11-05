/*
 * 출력 : system.out.println(), System.out.print(), system.out.printf()
 * 입력 : System.in(키보드 입력값), Scanner, BufferedReader
 */

import java.util.Scanner;
public class 화면출력_print2 {

	public static void main(String[] args) {
		//1. 변수선언
		int kor, eng, math, total;
		double avg;
		
		//2. 입력값을 받아서 변수 초기화
		Scanner scan = new Scanner(System.in);
			// new => 메모리에 저장 , System.in = 키보드 입력값
		System.out.print("국어점수 입력:");
		kor = scan.nextInt(); // 정수값 저장, next(): 문자열 입력, nextDouble(): 실수형 입력 ==> p.40
		System.out.print("영어점수 입력:");
		eng = scan.nextInt();
		System.out.print("수학점수 입력:");
		math = scan.nextInt();
		
		total = kor+eng+math;
		avg = total/3.0;
		
		//%d(정수입력), %f(실수), %s(문자열), %c(문자)
		System.out.printf("%-5s%-5s%-5s%-8s%-5s\n", "kor", "eng", "math", "total", "avg");
		System.out.printf("%-5d%-5d%-5d%-7d%-5.1f", kor, eng, math, total, avg);
		
		
		//3. 연산
		//4. 화면 출력

	}

}
