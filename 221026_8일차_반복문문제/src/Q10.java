// 10. 1~100까지의 정수 중 4의 배수의 합계를 구하라

public class Q10 {

	public static void main(String[] args) {
		int sum=0;
		System.out.println("=========for문=========");
		for(int i=1;i<=100;i++) {
			if(i%4==0) {
				System.out.print(i + " ");
				sum += i;
			}
		}
		System.out.println();
		System.out.println("4의 배수 합계: " + sum);

		
		//while문
		System.out.println();
		System.out.println("=========while문=========");
		sum=0;
		int i = 1;
		while(i<=100) {
			if(i%4==0) {
				System.out.print(i + " ");
				sum += i;
			}
			i++;
		}
		System.out.println();
		System.out.println("4의 배수 합계: " + sum);
	}

}
