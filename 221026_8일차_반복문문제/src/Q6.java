import java.util.Scanner;

//6. 사용자로부터 두개의 정수(시작,끝)를 입력받아 시작(포함)해서 
//   끝(포함)까지의 곱을 출력하는 프로그램을 작성하시오.

public class Q6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("두 개의 정수 입력(x y): ");
		int x = scan.nextInt();
		int y = scan.nextInt();
		int gop = 1;
		
		System.out.println("=========for문=========");
		for(int i=x;i<=y;i++) {
			gop*=i;
		}
		System.out.println("시작 값= "+x+", 끝 값= "+y);
		System.out.println("gop = " + gop);

		System.out.println();
		System.out.println("=========while문=========");
		
		System.out.println("두 개의 정수 입력(x y): ");
		x = scan.nextInt();
		y = scan.nextInt();
		gop = 1;
		int i=x;
		while(i<=y) {
			gop*=i;
			i++;
			
			if(x>y)
				break;
		}
		System.out.println("시작 값= "+x+", 끝 값= "+y);
		System.out.println("gop = " + gop);
	}

}
