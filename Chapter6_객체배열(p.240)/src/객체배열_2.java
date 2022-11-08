import java.util.Scanner;

public class 객체배열_2 {

	public static void main(String[] args) {
		Student[] std=new Student[3]; // 같은 폴더에 생성된 클래스는 어떤 클래스든 상관없이 사용 가능

		/* 
		 		std			std[0]	    std[0]	  std[0]
		 		---			-------------------------------
		 		0x100		null 	|	null   |   null
		 		---			------------------------------
		 					  |	 		 |			|
		 					 name		name	   name
		 					 kor		kor		   kor
		 					 eng		eng		   eng
		 					 math		math	   math
		 					 ==> std[0].name="홍길동"; => 오류발생
		 		
		 		
		 		int[] arr = new int[3];
		 		
		 		arr			arr[0]		arr[1]		arr[2]
		 	  -------	  ----------------------------------
		 	  0x100			  0		|	 0		|	  0	
		 	  -------	  ----------------------------------
		 */
	
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<std.length;i++) {
			// std[i]에 메모리 저장
			
			//Student[] std=new Student[3]; => 위에 이거는 그냥 배열을 만든거지 메모리를 저장한 것이 아니다.
			std[i]=new Student();
			// NullPointerException 오류 : new 사용 여부
			
			System.out.print("이름입력: ");
			std[i].name = scan.next();
			
			System.out.print("국어입력: ");
			std[i].kor= scan.nextInt();
			
			System.out.print("영어입력: ");
			std[i].eng= scan.nextInt();
			
			System.out.print("수학입력: ");
			std[i].math= scan.nextInt();
		}
		
		//출력
		for(int i=0;i<std.length;i++) {
			System.out.println(std[i].name+" "
					+ std[i].kor + " " + std[i].eng + " " + std[i].math
					+ " "+(std[i].kor+std[i].eng+std[i].math)/3.0);
			
		}
	
	}

}
