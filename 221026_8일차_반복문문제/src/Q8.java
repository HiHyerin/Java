//8. 3이상 4462 이하에서 짝수인 정수의 합을 구하여라.

public class Q8 {

	public static void main(String[] args) {
		int sum=0;
		System.out.println("=========for문=========");
		for(int i=3;i<=4462;i++) {
			if(i%2==0) {
				//System.out.println(i);
				sum += i;
			}
			
		}
		System.out.println("합: " + sum);
		
	//while문
		System.out.println();
		System.out.println("=========while문=========");
		sum=0;
		int i = 3;
		while(i<= 4462) {
			if(i%2==0) {
				//System.out.println(i);
				sum += i;
			}
			i++;
		}
		System.out.println("합: " + sum);
	}

}
