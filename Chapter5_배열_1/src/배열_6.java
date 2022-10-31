import java.util.Arrays;

/* 1. 선언
 * 		알파벳 대문자 전체를 저장 => 선언하는 프로그램
 * 2. 초기화
 * 		1) 명시적 초기화
 * 			int[] arr={10,20,30,40,50,};
		  	int[] arr=new int[5];
		  	arr[0]=10;
		 	arr[1]=20;
		  	...
 * 		2) 난수
 * 			int[] arr = new int[5];
 * 			arr[0]=(int)(Math.random()*100)
 * 		3) 입력값
 * 			int[] arr=new int[3];
 * 			arr[0] = scan.nextInt();
 * 			...
 * 			...
 * 		4) 웹에 데이터 읽기 : ex) Jsoup
 * 3. 출력
 * 		일반 for
 * 			for(int i=0;i<개수;i++){} => 앞에서부터
 * 			for(int i=개수-1;i>=0;i--){} => 뒤에서부터 출력(이진법 ..)
 * 		forEach(향상된 for) ==> jdk 1.5 이상
 * 4. 배열개수
 * ---------------관련된 데이터
 */
public class 배열_6 {

	public static void main(String[] args) {
		
		// 선언
		char[]alpha=new char[26]; // 알파벳 26자 저장
		int[]arr = new int[10]; // 정수저장
		double[]arr1 = new double[10]; // 실수저장
		boolean[] seat = new boolean[100]; // true/false 저장
		
		//초기화
		char c='A';
		for(int i=0;i<alpha.length;i++) {
			alpha[i]=c;
			c++;
		}
		
		//출력
		for(char ch:alpha) // 읽기전용, 출력만하고 데이터 저장(변경)은 못함
		{
			System.out.print(ch + " ");
		}
		
		// 값을 소문자로 변경(인덱스를 이용하여 변경)
		System.out.println();
		for(int i=0;i<alpha.length;i++) {
			alpha[i]=(char)(alpha[i]+32);
		}
		
		System.out.println(alpha);

		
		
		int[]arr2=new int[30];
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=(int)(Math.random()*3);
		}
		System.out.println(Arrays.toString(arr2));
		//빈도수 구하기(통계)
		int a=0,b=0,d=0;
		for(int i:arr2) {
			if(i==0) a++;
			else if(i==1) b++;
			else if(i==2) d++;
		}
		System.out.println("0>=" + a);
		System.out.println("1=>" + b);
		System.out.println("2=>"+d);
		
		//배열개수

	}

}
