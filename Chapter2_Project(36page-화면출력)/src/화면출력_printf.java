/*
 *  데이터 저장
 */
public class 화면출력_printf {

	public static void main(String[] args) {
//		System.out.println("Hello");
//		System.out.println("Java");
//		System.out.print("Hello\t");
//		System.out.println("Java");
		System.out.printf("%s, %s\n", "Hello", "Java");
		
		byte b1 = 10;
		byte b2 = 23;
		//byte b3 = (byte) (b1 + b2); -> 오버플로우 발생 할 가능성 있음(범위 벗어날 경우)
		int b3 = b1 + b2;
		
		char a = 'A';
		char b = 'B';
		System.out.println(a+b);
		

	}

}
