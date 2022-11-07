import java.util.Scanner;

/*
 * 		
 */
public class 반복문_중첩For4 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("★");

				
			}
			System.out.println();
		}

		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=5-i;j++) {
				System.out.print("★");				
			}
			System.out.println();
		}
		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("정수입력 : ");
//		int n = scan.nextInt();
//		for(int i=1; i<=n; i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("★");
//			}
//			System.out.println();
//		}
	
		char a = 'A';
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(a++);				
			}
			System.out.println();
		}
	}

}
