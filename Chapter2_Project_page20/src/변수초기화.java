// 변수 초기화 : 변수를 사용하기 전에 처음으로 들어가는 값을 저장하는 것 == 21page
/*
 * 1. 선언과 동시에 초기화
 * 2. 선언후에 나중에 초기화
 */
public class 변수초기화 {
	// 클래스 블록 변수 => 멤버변수, 전역변수 (자동 초기화)

	public static void main(String[] args) {
		// 메소드 변수 => 지역변수, 로컬변수 (반드시 초기화 한 후에 사용 가능)
		
		
		int a = 10;
		int b = 20;
	
		System.out.println("a : " + a + ", b : "  + b);
		
		int c = a;
		a=b;
		b=c;
		
		System.out.println("a : " + a + ", b : "  + b);
		
		

	}

}
