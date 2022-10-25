import java.util.Scanner;
public class 제어문_중첩조건문 {

	public static void main(String[] args) {
		//컴퓨터와 가위바위보 게임
		/* 
		 가정 : 가위(0), 바위(1), 보(2)
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("가위(0), 바위(1), 보(2) : ");
		int user = scan.nextInt()	;
		
		// 컴퓨터
		int com = (int)(Math.random()*3); //0, 1, 2
		
		// 확인
		if(com == 0)
			System.out.println("컴퓨터 : 가위");
		else if(com==1)
			System.out.println("컴퓨터 : 바위");
		else if (com==2)
			System.out.println("컴퓨터 : 보");
		
		if(user == 0)
			System.out.println("사용자 : 가위");
		else if(user==1)
			System.out.println("사용자 : 바위");
		else if (user==2)
			System.out.println("사용자 : 보");
		
		//결과값
		/* if(com==0) { // 가위
			if(user == 0)
				System.out.println("비겼다!");
			else if(user==1)
				System.out.println("사용자 win!");
			else if(user == 2)
				System.out.println("컴퓨터 win!");
			}
		
		else if(com==1) { // 바위
			if(user == 0)
				System.out.println("컴퓨터 win!");
			else if(user==1)
				System.out.println("비겼다!");
			else if(user == 2)
				System.out.println("사용자 win!");
			}
			
		else if(com==2) { // 보
			if(user == 0)
				System.out.println("사용자 win!");
			else if(user==1)
				System.out.println("컴퓨터 win!");
			else if(user == 2)
				System.out.println("비겼다!");
			} */
		
		
		/*결과값2
		컴퓨터              사용자

		가위0               가위0
		                   바위1
		                   보2
		                   
		바위1               가위0
		                   바위1
		                   보2
		                   
		보2               가위0
		                   바위1
		                   보2		 */
		
		int res = com-user;
		if(res == -2 || res == 1)
			System.out.println("컴퓨터 win!");
		else if(res == -1 || res == 2)
			System.out.println("사용자 win!");
		else
			System.out.println("비겨읐다드아~!!");
		

	}

}
