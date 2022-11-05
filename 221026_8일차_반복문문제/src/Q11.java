import java.util.Scanner;

// 11. 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇개인지 
// 출력하는 프로그램 작성

public class Q11 {

	public static void main(String[] args) {
		
		System.out.println("10개 정수: ");
		System.out.print("짝수: ");
		int count = 0;
		for(int i=1;i<=10;i++) {
			int a = (int)(Math.random()*1000)+1;
//			System.out.print(a + " ");
			if(a%2==0) {
				System.out.print(a + " ");
				count++;
				
			}
		}
		System.out.println("\n짝수의 개수: " + count + "개");

	}

}
