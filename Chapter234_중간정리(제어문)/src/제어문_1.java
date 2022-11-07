import java.util.Scanner;
public class 제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String ID = "Admin";
		final String PWD = "1234";
		
		Scanner scan = new Scanner(System.in);
		System.out.print("ID를 입력하세요 > ");
		String id = scan.next();
		
		System.out.print("비밀번호를 입력하세요 > ");
		String pwd = scan.next();
		
		//로그인 
//		if(id.equals(ID) && pwd.equals(PWD)) {
//			System.out.println("로그인 성공!");
//			System.out.println("메인페이지로 이동");
//		}else {
//			System.out.println("로그인 실패!!");
//			System.out.println("로그인 || 회원가입으로 이동");
//		}
//		
		
			if(id.equals(ID)) {
				if(pwd.equals(PWD)) {
					System.out.println("로그인 성공");
				}else {
					System.out.println("비밀번호가 틀립니다.");
				}
				
			}else {
				System.out.println("ID가 존재하지 않습니다.");
			}
		

		
	}

}
