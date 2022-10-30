import java.util.Scanner;

public class 제어문_선택문3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 사용자 입력
		System.out.print("가위(0), 바위(1), 보(2): ");
		int user = scan.nextInt();
		// 컴퓨터 (난수 출력)
		int com = (int)(Math.random()*3); // 0~2)
		
		switch(com)
		{
		case 0 :
			System.out.println("컴퓨터 : 가위");
			break;
		case 1 :
			System.out.println("컴퓨터 : 바위");
			break;
		case 2 :
			System.out.println("컴퓨터 : 보");
			break;
				
		}
		
		switch(user)
		{
		case 0 :
			System.out.println("사용자 : 가위");
			break;
		case 1 :
			System.out.println("사용자 : 바위");
			break;
		case 2 :
			System.out.println("사용자 : 보");
			break;
				
		}
		
		switch(com)
		{
		case 0: //가위
			switch(user)
			{
			case 0: //가위
				System.out.println("비겼다!");
				break;
			case 1://바위
				System.out.println("사용자 win");
				break;
			case 2: //보
				System.out.println("컴퓨터 Win!");
				break;
			}
			break;
			
		case 1: //바위
			switch(user)
			{
			case 0: //가위
				System.out.println("컴퓨터 win");
				break;
			case 1://바위
				System.out.println("비겼다!");
				break;
			case 2: //보
				System.out.println("사용자 win");
				break;
			}
			
		case 2: //보
			switch(user)
			{
			case 0: //가위
				System.out.println("사용자 win");
				break;
			case 1://바위
				System.out.println("컴퓨터 Win!");
				break;
			case 2: //보
				System.out.println("비겼다!");
				break;
			}
		}
		

	}

}
