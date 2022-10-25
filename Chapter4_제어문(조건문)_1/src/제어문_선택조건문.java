// 알파벳의 난수 발생(대,소문자)
import java.util.Scanner;
//Scanner의 단점 : 문자 입력이 없다 ==> 문자열은 OK(한글자만은 charAt() -> 문자 하나 잘라내는 것)
public class 제어문_선택조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("알파벳 문자 입력: ");
		char alpha = scan.next().charAt(0);
		if(alpha>='A' && alpha<='Z')
			System.out.println(alpha + "는(은) 대문자입니다.");
		else
			System.out.println(alpha + "는(은) 소문자입니다.");

	}

}
