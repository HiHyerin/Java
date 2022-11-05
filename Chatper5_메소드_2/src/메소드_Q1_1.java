import java.util.Scanner;

public class 메소드_Q1_1 {

	static void binary(int num) {
		int[] arr = new int[16];
		int index=15;
		while(true) {
			arr[index]=num%2;
			num=num/2;
			if(num==0) break;
			index--;
		}
		for(int i=0;i<arr.length;i++) {
			if(i%4==0 && i!=0)
				System.out.println(" ");
			System.out.print(arr[i]);
		}
		
	}
	
	static int[] binary2(int num) {
		int[] arr = new int[16];
		int index=15;
		while(true) {
			arr[index]=num%2;
			num=num/2;
			if(num==0) break;
			index--;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력: ");
		int num = scan.nextInt();
		int[] b = binary2(num);
		for(int i=0;i<b.length;i++) {
			if(i%4==0 && i!=0)
				System.out.println(" ");
			System.out.print(b[i]);
		}
	}

}
