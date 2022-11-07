//9. 0~12까지 2의 배수, 3의 배수의 합을 구하여라.

public class Q9 {

	public static void main(String[] args) {
		int sum=0;
		
		System.out.println("=========for문=========");
		System.out.print("2, 3의 배수: ");
		for(int i=2;i<=12;i++) {
			if(i%2==0 || i%3==0) {
				System.out.print( i + " ");
				sum += i;
			}			
		}
		System.out.println();
		System.out.println("sum= "+sum);
		
	//while문
		System.out.println();
		System.out.println("=========while문=========");
		System.out.print("2, 3의 배수: ");
		sum=0;
		int i=2;
		while(i<=12) {
			if(i%2==0 || i%3==0) {
				System.out.print( i + " ");
				sum += i;
				}
			i++;
	}
		System.out.println();
		System.out.println("sum= "+sum);
}
}
