package 배열문제_221031;

public class Q9 {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 50, 3, 60, -3};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==60)
				System.out.println(i);
		}
		
	}

}
