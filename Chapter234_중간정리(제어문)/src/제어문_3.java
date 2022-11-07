import java.util.Scanner;

//문자 입력 받아서 대문자, 소문자, 알파벳인지 아닌지 확인
public class 제어문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	while (true) {
		Scanner scan = new Scanner(System.in);
		System.out.print("문자 하나 입력 > ");
		String msg = scan.next();
		char c = msg.charAt(0);//문자열 1번째 문자를 가지고 온다.
		if(c >= 'A' && c<='Z')
			System.out.println("대문자 입니다.");
			
		else if(c>='a' && c<='z') {
			System.out.println("소문자 입니다.");
		}
		else {
			System.out.println("알파벳이 아닙니다.");
		}
		
	}
	
	}

}
