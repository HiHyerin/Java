// 다음 배열에서 최대값,최소값을 출력하는 프로그램을 작성하시오
package 배열문제_221031;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 94, 85, 95, 88, 90 };
		
		int max = num[0];
		int min = num[0];
		for(int i=0;i<num.length;i++) {
			if(max<num[i])
				max= num[i];
		}
		for(int i=0;i<num.length;i++) {
			if(min>num[i])
				min=num[i];
		}
		for(int i: num) {
			if(max<i)
				max=i;
			if(min>i)
				min=i;
		}
		
//		for(int i=0;i<num.length;i++) {
//			System.out.println("num[" + i + "] = " + num[i]);
//		}
		System.out.println("max= " + max);
		System.out.println("min= " + min);
		
			
	}

}
