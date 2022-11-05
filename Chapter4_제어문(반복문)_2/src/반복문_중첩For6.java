import java.util.Scanner;

/* 
 * 		aBCDE
 * 		AbCDE
 * 		ABcDE
 * 		ABCdE
 * 		ABCDe
 */
public class 반복문_중첩For6 {

	public static void main(String[] args) {
		
//		for(int i=1; i<=5; i++) {
//			char c = 'A';
//			for(int j=1; j<=5;j++) {
//				if(i==j)
//					System.out.print((char)(c+32));
//				else
//					System.out.print(c);
//				c++;
//			}
//			
//			System.out.println();
//		}
		
		Scanner scan = new Scanner(System.in);
		System.out.print("2~12 사이의 정수를 입력: ");
		int hap = scan.nextInt();
		for(int i=1;i<=6;i++) { // 1주사위
			for(int j=1;j<=6;j++) { // 2주사위
				if(i+j==hap) {
					System.out.println("[" +i+","+j+"]");
				}
			}
		}
	}

}
