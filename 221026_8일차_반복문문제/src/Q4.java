import java.util.Scanner;

// 4. char형 변수 ch가 숫자('0' ~ '9')일 때 true인 조건식 작성

public class Q4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for(;;) {
			System.out.println("ch를 입력하세요: ");
			char ch = scan.next().charAt(0);
			if(ch>='0' && ch<='9') {
				System.out.println("true");
			}else{
				System.out.println("false");
			}
			
		}

	}

}
