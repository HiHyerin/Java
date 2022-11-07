// 7.  5~16까지의 합을 구하시오

public class Q7 {

	public static void main(String[] args) {
		int sum=0;
		System.out.println("=========for문=========");
		for(int i=5; i<=16; i++) {
			sum += i;
			System.out.print(i + " + ");
		}
		System.out.println();
		System.out.println("5~16의 합 : " + sum);
		
		System.out.println();
		
		
			
//while문
		System.out.println("=========while문=========");
		sum = 0;
		int i=5;
		while(i<=16) {
			sum+=i;
			System.out.print(i + " + ");
			i++;
		}
		System.out.println();
		System.out.println("5~16의 합 : " + sum);
		
	}

}
