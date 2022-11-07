import java.util.Arrays;

public class 문자열정리 {

	public static void main(String[] args) {
		// 1. 문자열 선언
		String name = "홍길동이다.";
		System.out.println("name: " + name);
		
		System.out.println("문자의 개수: " + name.length());
		
		char[] arr = name.toCharArray();// char로 변환
		System.out.println(Arrays.toString(arr));
				
		String temp = String.valueOf(arr); // char[]을 String로 변경
		System.out.println(temp);
		
		
		
		
		
		if(name.contains("홍")) {
			System.out.println("포함하고 있다.");
		}else {
			System.out.println("포함하지 않는다.");
		}
		System.out.println("=============");
		if(name.startsWith("홍")) {
			System.out.println("시작하는 문자열이다.");
		}else {
			System.out.println("시작하는 문자열이 아니다.");
		}
		
		System.out.println("=============");
		if(name.endsWith("홍")) {
			System.out.println("끝나는 문자열이다.");
		}else {
			System.out.println("끝나는 문자열이 아니다.");
		}
	}

}
