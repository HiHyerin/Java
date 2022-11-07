
public class 산술연산자_2 {

	public static void main(String[] args) {
		int c = 'A' + 'B';
		System.out.println(c);
		
		byte b1 = 10;
		byte b2 = 20;
		byte b3 = (byte)(b1+b2); // byte로 강제 변환 시 오버플로우 발생할 가능성 있음
		System.out.println(b3);
		
				

	}

}
