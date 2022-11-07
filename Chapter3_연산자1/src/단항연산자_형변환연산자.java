
public class 단항연산자_형변환연산자 {
	/*
	 * 	• 형변환연산자 : (type)
			  ------------- 데이터형 (int), (double),,,
			
	크기
	Byte  < char < int < long < double
	-------------------------------------boolean은 형변환 불가능 ==> 사용자 정의 데이터형(class)
	
		1) 실수 -> 정수로 변환
		(int)10.5 => 10
		
		2) 정수 -> 문자로 변환
		(char)65 => 'A'
		
		3) 10 -> 10.0으로 변환
		(double)10 => 10.0     ------->   (자동 형변환 가능) double d = 10; --> d=10.0
		
		4) 10.5 + 10.5 = 21.0
		(int)10.5 + (int)10.5 = 20
		
		
		(int)(10.5 + 10.5) = 21
		
		
		==> 최우선순위 연산자 = "( )"
		
		5) 난수
			Int a;
			A = (int)(math.random()*100) + 1; 
				Math.random() = 0.0~0.99
				Math.random() * 100 = 0 ~ 99
				Math.random() * 100 + 1 = 1 ~ 100
			
			
			Char c;
			C = (int)(Math.random() * 25) + 65);
				Math.random() = 0.0 ~ 0.99
				Math.random() * 25 = 0 ~ 24
				(Math.random() * 25) + 65 = 65 ~ 89
	 */

	public static void main(String[] args) {


		// 난수
		int a;
		a = (int)(Math.random()*100) + 1; 
		System.out.println(a);
		
		char c;
		c = (char)((Math.random()*25)+65);
		System.out.println(c);
		
		// 음수, 양수
		int k=10;
		System.out.println(-k);  //  . (주소접근지정 연산자),  [] (배열)
		

	}

}
