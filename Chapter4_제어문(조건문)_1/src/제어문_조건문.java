// 사용자로부터 정수를 받아서 홀수/짝수인지 확인하는 내용
import java.util.Scanner; // 라이브러리 + 사용자 정의 => 다른 폴더(패키지 /폴더명.폴더명.클래스명)에 있는 경우
						  // import는 여러개 사용 가능
// java(jdk 1.0~), javax(jkd1.2~ : 웹, xml, Json...)
public class 제어문_조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); // new : 클래스를 메모리에 저장 / system.in : 키보드 입력값
		
		System.out.print("정수 입력: ");
		int num = scan.nextInt(); // 정수값 
		// next(); 문자열
		// nextDouble(); 실수
		// nextBoolean; 논리
		
		if(num % 2 == 0)
			System.out.println(num + "는(은) 짝수입니다!");
		if (num % 2 != 0)
			System.out.println(num + "는(은) 홀수입니다!");

	}

}
