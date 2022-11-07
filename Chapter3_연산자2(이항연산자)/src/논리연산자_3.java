
import java.util.Scanner; // 외부에 있는 클래스를 읽어올 때 사용
// Math, System ==> java.lang(생략 가능)
public class 논리연산자_3 {

	public static void main(String[] args) {
		
		// 알파벳을 입력 받아서 대문자 / 소문자 => &&
		Scanner scan = new Scanner(System.in);
		System.out.print("알파벳 입력: ");
		char c = scan.next().charAt(0);
		boolean b1 = c >='A' && c <='Z';
		boolean b2 = c >= 'a' && c <= 'z';
		System.out.println("b1(대문자) = " + b1 + ", "
				+ "b2(소문자) = " + b2);
		
		// c >='A' && c <='Z'      c >= 'a' && c <= 'z'
		// -------------------      ---------------------
		//   알파벳 대문자 조건				알파벳 소문자 조건

	}

}
