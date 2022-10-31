import java.util.Scanner;

public class 배열_1 {

	public static void main(String[] args) {
	// 1. 사용자의 입력값을 받아서 2진법 출력 ==> 16bit(32767)
	// 배열 0번부터~ , 15번부터~
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력(0~32767 사이)>> ");
		int input=scan.nextInt();
		//0,1 ==> 16개
		int[] binary=new int[16]; //0으로 초기화
		//처음부터(0~) or 마지막부터(15~)
		int index=15;
		while(true) {
			binary[index]=input%2;
			input=input/2;
			if(input==0)
				break;
			index--;
		}
		// 출력
		for(int i=0;i<binary.length;i++) {
			if(i%4==0 && i!=0)
				System.out.print(" ");
			System.out.print(binary[i]);
		}
	}
	
	static void toBinary() {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력(0~32767 사이)>> ");
		int input=scan.nextInt();
		//0,1 ==> 16개
		int[] binary=new int[16]; //0으로 초기화
		//처음부터(0~) or 마지막부터(15~)
		int index=15;
		while(true) {
			binary[index]=input%2;
			input=input/2;
			if(input==0)
				break;
			index--;
		}
		// 출력
		for(int i=0;i<binary.length;i++) {
			if(i%4==0 && i!=0)
				System.out.print(" ");
			System.out.print(binary[i]);
	}
 }
}
