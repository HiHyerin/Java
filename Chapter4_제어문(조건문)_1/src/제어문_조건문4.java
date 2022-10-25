/*중첩if문 p.144
 * 
 */

import java.util.Scanner;
public class 제어문_조건문4 {

	public static void main(String[] args) {
		System.out.println("==========MENU=========");
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		System.out.println("3. 영화목록 요청");
		System.out.println("4. 영화 상세보기");
		System.out.println("5. 예매요청");
		System.out.println("6. 종류");
		System.out.println("======================");
		// 단일 조건문을 쓰던가, 다중 조건문을 쓰던가.(조건이 6개라 else를 못 쓴다. 지금은)
		
		Scanner scan = new Scanner(System.in);
		System.out.print("메뉴 선택(1~6): ");
		int menu = scan.nextInt();
		if(menu == 1)
			System.out.println("로그인을 요청했습니다.");
		
		if(menu ==2)
			System.out.println("회원가입을 요청했습니다.");
		
		if(menu ==3)
			System.out.println("영화목록을 요청했습니다.");
		
		if(menu ==4)
			System.out.println("영화 상세보기를 요청했습니다.");
		
		if(menu ==5)
			System.out.println("예매를 요청했습니다.");
		
		if(menu ==6)
			
			System.exit(0 ); //프로그램 종료
		
		
		
	
		

	}

}
