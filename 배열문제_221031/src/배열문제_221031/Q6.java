package 배열문제_221031;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 94, 85, 95, 88, 90 };
		int max = 0;
		int min = num[0];
		for(int i=0;i<num.length;i++) {
			if(max<num[i])
				max= num[i];
		}
		for(int i=0;i<num.length;i++) {
			if(min>num[i])
				min=num[i];
		}
		
//		for(int i=0;i<num.length;i++) {
//			System.out.println("num[" + i + "] = " + num[i]);
//		}
		System.out.println("max= " + max);
		System.out.println("min= " + min);
		
			
	}

}
