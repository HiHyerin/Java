
public class 단항연산자_증감연산자 {
	
	/*
	 * § 단항연산자 (데이터 한 개를 연산)
	- 증감 연산자 (++, --) : 한 개를 증감 (제어문의 반복문에서 많이 쓰임)
	- 반전 연산자(~) : 양수를 음수로 바꾸는것
	- 부정 연산자(!) : 반드시 boolean만 사용 가능 ex) (!true) = false,    (!false) = true (조건문에서 많이 쓰임)
	- 형변환 연산자 : (type) => (int), (double)…
	- 음수/양수 : - , +


	- 전치연산자 : 먼저 증가 (++a;)
	- 후치연산자 : 나중 증가 (a++;)

	int a =10;
	int b = ++a
	=============> a = 11  ,  b = 11

	int a = 10;
	int b = a++;
	=============> a = 11  ,  b = 10
	 */

	public static void main(String[] args) {
		int a = 10;
		int b = ++a;
		
		int c = 10;
		int d = c++;
		
		char e = 'A';
		e++; // e = 'B'
		System.out.println(e);
		

				

	}

}
