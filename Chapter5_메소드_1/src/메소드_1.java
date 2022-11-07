// 년도 월 일을 입력
import java.util.Scanner;
public class 메소드_1 {

	public static void main(String[] args) {
		
		int year = userInput("년도 입력:");
		int month = userInput("월 입력:");
		int day = userInput("일 입력:");
		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("년도 입력: ");
//		int year = scan.nextInt();
//		
//		System.out.print("월 입력: ");
//		int month = scan.nextInt();
//		
//		System.out.print("일 입력: ");
//		int day = scan.nextInt();
//		
//		System.out.println(year+"년도 " +month+"월 " + day+"일" );

	}
	/*
	 	int userInput(){} => 메소드_1 a = new 메소드_1();
	 						 a.userInput()
	 	static int userInput(){} =>
	 	ㄴ> 자동메모리 할당(static)
	 */
	static int userInput(String msg) {
		Scanner scan = new Scanner(System.in);
		System.out.print(msg);
		int value = scan.nextInt();
		
		return value;
	}

}
