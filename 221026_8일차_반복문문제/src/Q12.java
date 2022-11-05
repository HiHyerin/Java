import java.util.Scanner;

//12. 10개의 정수를 입력받아 3의 배수의 개수와 5의 배수의 개수를 
//각각 출력하는 프로그램

public class Q12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int count = 0;
		int c = 0;
		int x = 0;
		
		
		for(int i=1; i<=10; i++ ) {
			int a = (int)(Math.random()*1000)+1;
			System.out.print(a + " ");
			if(a%3==0 ) {
				System.out.println("3의 배수: " + a);
				count++;
			}
			if(a%5==0) {
				System.out.println("5의 배수: " + a);
				c++;
			}
			if(a%15==0) {
				x++;
			}
		}
		System.out.println("\n3의 배수 개수: " + count); 
		System.out.println("5의 배수 개수: " + c); 
		System.out.println("3과 5의 공배수 개수: "+x);
	}

}
