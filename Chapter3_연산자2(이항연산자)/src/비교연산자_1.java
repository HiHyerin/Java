
public class 비교연산자_1 {
	/*
	 * 	- 비교연산자는 기본형만 비교가 가능하다
	--------- 정수 / 실수 / 문자 / 논리
	--------- 문자열 비교 (equals) ===> 로그인, 아이디체크 . . . ( 참조형 : 배열 , 클래스 )
	--------- if, false, 삼항연산자에서 자주 쓰임
	
	1)  ==  같다
	2)  !=   같지 않다
	3)  <        작다
	4)  >     크다
	5)  <=   작거나 가다
	6)  >=   크거나 같다
=====================> 무조건 결과값은 boolean(true / false) - 조건문, 반복문에서 주로 사용
	 */

	public static void main(String[] args) {
		int a = (int)(Math.random() * 5) +1;
		int b = (int)(Math.random() * 5) + 1;
		System.out.println("a="+a + ", b="+ b);
		System.out.println("a==b\t" + (a == b));
		System.out.println("a!=b\t" +(a != b));
		System.out.println("a<b\t" +(a <b));
		System.out.println("a>b\t" +(a > b));
		System.out.println("a>=b\t" +(a >= b));
		System.out.println("a<=b\t" +(a <= b));
		

	}

}
