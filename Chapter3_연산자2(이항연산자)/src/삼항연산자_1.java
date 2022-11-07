
public class 삼항연산자_1 {

/*
 * 	- 피연산자가 3개인 연산자
	- 형식) (조건) ? 값 : 값
			조건 true ==> 1
			조건 false ==> 2     => if ~ else (소스코딩을 줄이기 위해 사용)
 */

	public static void main(String[] args) {
		
		char c = 'A';
		
		System.out.println((c>='A' && c<='Z') || (c>='a' && c<= 'z')? "알파벳": "알파벳이 아니다");

	}

}
