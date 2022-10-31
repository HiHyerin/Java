
public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=80, b=49, c=40,d=60,e=100;
//		int max = 0;
//		if(max<a)
//			max=a;
//		if(max>b)
//			max=b;
//		if(max<c)
//			max = c;
//		if(max<d)
//			max = d;
//		if(max<e)
//			max = e;
//		System.out.println("a="+a);
//		System.out.println("b="+b);
//		System.out.println("c="+c);
//		System.out.println("d="+d);
//		System.out.println("e="+e);
//		System.out.println("max="+ max);
		
		int[] arr= {80,70,60,50,100};
		int max = 0;
		for(int i=0;i<5;i++) {
			if(max<arr[i])
				max = arr[i];
		}
		for(int i=0;i<5;i++) {
			System.out.println("arr["+i+"]= " + arr[i]);
			
		}
		System.out.println("max = " + max);
	}

}
