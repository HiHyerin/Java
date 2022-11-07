
public class 변수초기화_2 {
/*
 	Char (문자를 저장하는 메모리의 크기) => 2byte(0 ~ 65535) - 유니코드
	초기값 설정 : ' ' (홑따움표) ==> 모든 문자는 번호를 가지고 있다.
						 		실제 저장 시 숫자가 저장
								'A' ==> 65 ==> 1000001
	실수 초기화
		float f = 10.5; -> 오류나는 코드  ===> double d = 10.5; (o)
		float f = 10.5f;
		
		boolean => true / false

		final int k = 100;  //상수(변경할 수 없는 수) ==> 상수는 모든 알파벳을 대문자로 사용한다.
													// final int K = 100;

 */
	public static void main(String[] args) {
		System.out.println('A');
		System.out.println((int)'A');
		System.out.println((double)'A');

	}

}
