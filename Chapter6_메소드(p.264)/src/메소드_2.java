import java.util.Arrays;

public class 메소드_2 {

	int[] rand(int no) {
		int[] com=new int[no]; // 배열을 동적
		for(int i=0;i<com.length;i++) {
			com[i]=(int)(Math.random()*45)+1;
			for(int j=0;j<i;j++) {
				if(com[i]==com[j]) {
					i--;
					break;
				}
			}
		}
		return com; // 배열을 리턴형으로 지정하면 => 주소(배열명)만 넘기면 됨
	}
	
	
	
	void rand(int[] com) {
		for(int i=0;i<com.length;i++) {
			com[i]=(int)(Math.random()*45)+1;
			for(int j=0;j<i;j++) {
				if(com[i]==com[j]) {
					i--;
					break;
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] arr= {1,2,3,4,5};
		int[] temp=arr;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));
		
		temp[0]= 100;
		temp[1]= 200;
		temp[2]= 300;
		temp[3]= 400;
		temp[4]= 500;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp)); */
		메소드_2 m=new 메소드_2();
		int[]arr=m.rand(5);
		System.out.println(Arrays.toString(arr));
		
		int[]arr1=m.rand(6);
		m.rand(arr1);
		System.out.println(Arrays.toString(arr1));
	}

}
