//updown게임
import java.util.Scanner;
public class 제어문_반복문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int com = (int)(Math.random()*100)+1;
		
		for(;;)//무한루프 
		{
			System.out.println("1~100까지 정수를 입력: ");
			int user = scan.nextInt();
			if(user<1 || user>100) {
				System.out.println("잘못된 입력입니다.");
				continue; // 처음부터 다시 실행, 증가식으로 돌아간다
			}
			if(com>user) {
				System.out.println("더 큰 수를 입력하세요");
			}
			else if(com<user) {
				System.out.println("더 작은 수를 입력하세요");
			}
			else{
				System.out.println("정답!!");
				System.exit(0);
			}
		}
	}

}
