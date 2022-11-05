
public class 단항연산자정리 {

	public static void main(String[] args) {
		
		// 자동 형변환
		int a = 'A';
		System.out.println(a); // 65
		
		// 강제 형변환
		int b = 'A';
		System.out.println((char)b);  // A (강제형변환)
		
		System.out.println(true + "");
		
		
		// System.out.println(true + null); --> null값은 연산을 못하기 때문에 오류
		
		System.out.println('2');
		char c =  ' ';
		System.out.println("c="+ c);

	}

}
