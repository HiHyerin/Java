
public class 반복문_1 {

	public static void main(String[] args) {
		// 1~100까지의 합을 구한다
		
		System.out.println("===for문===");
		int sum = 0;
		for(int i=1;i<=100;i++) {
			sum += i;	
//			System.out.println("i= "+i+", sum= "+sum);
		}
		System.out.println(sum);
		
		System.out.println("\n===while문===");
		sum=0;
		int i=1;
		while(i<=100) {
			sum += i;	
//			System.out.println("i= "+i+", sum= "+sum);
			i++;
		}
		System.out.println(sum);
		
		System.out.println("\n===dowhile문===");
		sum=0;
		i=1;
		do {
			sum+=i;
//			System.out.println("i= "+i+", sum= "+sum);
			i++;
			} while(i<=100);
		System.out.println(sum);
	}

}
