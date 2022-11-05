
public class 문자열_1 {

	public static void main(String[] args) {
		// 1.변수(문자열)선언
		String msg="Hello Java";
		String msg2;
		// 2. 초기화
		msg2=" hello java ";
		// 3. 활용(요청처리)
		
			// 1) 문자 개수 확인(length()) ==>
		 	System.out.println(msg.length());//공백도 문자 취급
		 	System.out.println(msg2.length());
		 	
		 	// 2) 공백 제거
		 	System.out.println(msg.trim().length()); // 좌우 공백만 제거
		 	
		 	// 3) 대문자 변환
		 	System.out.println(msg.toUpperCase());
		 	
		 	// 4) 소문자 변환
		 	System.out.println(msg.toLowerCase());
	 	
		 	System.out.println(msg.substring(6)); //6번 index부터 잘라와라
		 	System.out.println(msg.substring(0,5)); //0-4번 index 잘라와라(5번 제외)
		 	
		 	String post="101-123";
		 	System.out.println(post.substring(0,3));
		 	System.out.println(post.substring(4));
		 	
		 	String fileName = "문자열_1.java";
		 	System.out.println(fileName.substring(6));
		 	//파일명 ==>문자열.1.java
		 	System.out.println(fileName.substring(fileName.lastIndexOf(".")+1));
		 	System.out.println(msg.indexOf("o")); // 위치값
		 	System.out.println(msg.indexOf("a"));
		 	System.out.println(msg.lastIndexOf("a"));
	 	// 4. 출력

	}

}
