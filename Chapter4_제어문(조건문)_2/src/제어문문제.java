import java.util.Scanner;

public class 제어문문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int even = 0;
		int x = 0;
		
		
		//Q8
		for(int i=2;i<=100;i+=2) {
			even += i;
			System.out.print(i + "\t");
						
		}
		System.out.println("\n짝수의 합: " + even);
		
		//Q9
		for(int i=5;i<=50;i+=5) {
			x += i;
			System.out.print(i + "\t");
		}
		System.out.println("\n5의 배수 합 : " + x);
		
		//Q10
		for(char i='B'; i<='N';i+=2) {
			
			System.out.print(i + "\t");
			
		}
		
//		//Q11
//		System.out.print("\n정수 입력: ");
//		int a = scan.nextInt();
//		int sum=0;
//		for(int i=1; i<=a; i++) {
//			sum += i;
//		}
//		System.out.println("1~" + a + "까지의 합:" + sum);
		
		

		// Q12
		System.out.println();
		for(int i=1; i<=30; i++) {
			
			if(i%2==0) {
				System.out.printf("%-5d",i);
				if(i%3==0)
					System.out.println();
			}
			
		
		}
		
		// Q13
		int sum =0;
		for(int i=1; i<=10; i++) {
			if(i%2==0)
				sum-=i;
			else
				sum	+= i;
					}
		System.out.println("1-2+3-4+5-6+7-8+9-10의 합: " +sum);
		
		
		// Q14
	}

}
