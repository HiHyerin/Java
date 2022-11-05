import java.util.Scanner;

public class 비교연산자_2 {
	/*
	 * 	• Char 비교 : char은 정수형으로 변경 후 비교
			'A' < 'B' ------ true
			 65    66
	
			1 > '0'  ----- false
			1    48
	
				----> 모든 문자마다 번호가 있다.(아스키 코드)
	
		C 언어  /  자바
			=> C언어는 변수 선언 시 먼저
=> 		자바는 원하는 위치에서 변수 선언이 가능
	 */

	public static void main(String[] args) {
		char a = 'A';  //65
		char b = 'a';  //97
		
		System.out.printf("%c == %c : %b \n", a,b,a==b);
		System.out.printf("%c == %c : %b \n", a,b,(a+32)==b);
		System.out.printf("%c == %c : %b \n", a,b,a!=b);
		
		// %b ==> boolean 출력
		// %c ==> 문자
		// %f ==> 실수
		// %s ==> 문자'열'
		// %d ==>  대입하는 데이터는 정수
		
		int c = 97;
		System.out.printf("%d == %c : %b\n", c,b,c==b);

		
		boolean b1 = true;
		boolean b2 = false;
		System.out.printf("%b == %b : %b \n", b1, b2, b1==b2);
		System.out.printf("%b != %b : %b \n", b1, b2, b1!=b2);
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력: ");
		int k = scan.nextInt();
		System.out.println((k%2 == 0)?"짝수":"홀수"); // 삼항연산자
	}

}
