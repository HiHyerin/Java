import java.util.Scanner;

public class 대입연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력: ");
		
		int num = scan.nextInt();
		num += 5; // num = num + 5
		
		System.out.println("num=" + num);
		
		num-=5;
		System.out.println("num=" + num);
		
		num *= 5;
		System.out.println("num=" + num);
		
		num /= 5;
		System.out.println("num=" + num);
		

	}

}
