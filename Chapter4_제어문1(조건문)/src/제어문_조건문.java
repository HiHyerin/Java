import java.util.Scanner;
public class 제어문_조건문 {
	/*
	• 제어문 (프로그램의 흐름 제어)
		1) 제어문 종류
			- 조건문
				□ 단일 조건문 : 조건이 true일 경우에만 수행
				□ 선택 조건문 : 조건이 true, false일 경우 각각 수행
				□ 다중 조건문 : 조건이 여러 개 일때
			- 선택문 : 게임(keyboard), 네트워크   ==> switch(값)
			- 반복문
				□ 자바 - for : 반복횟수가 지정된 경우
				□ 데이터베이스 - while : 반복횟수가 없는 경우(무한루프) ==> 선조건
				□ do ~ while : 한번 이상 반드시 수행해야 되는 경우 ==> 후조건
			- 반복제어문
				□ break ==> 반복 중지
				□ continue ==> 특정부분을 제외할 때 사용
		2) 제어문에 대한 형식
			- 조건문
				□ 단일 조건문
				if(조건) ---> 부정, 비교, 논리연산자 중에 1개를 선택(true/false)
					수행문장 (조건이 true일 경우에만 수행)
				--------
				문장 수행
				
					® 여러 개의 문장을 if문에서 제어할 때에는 {}사용
						if(조건) {
							수행문장1
							수행문장2
							}
							---------------> 조건이 true : 수행문장1, 수행문장2
							---------------> 조건 false : 수행문장이 없다.
	 */

	public static void main(String[] args) {
		
		int com = (int)(Math.random()*3);
		Scanner sc = new Scanner(System.in);
		System.out.println("가위(0), 바위(1), 보(2)");
		int user = sc.nextInt();
		if(com==0)
			System.out.println("컴퓨터: 가위");
		if(com==1)
			System.out.println("컴퓨터: 바위");
		if(com==2)
			System.out.println("컴퓨터: 보");

	}

}
