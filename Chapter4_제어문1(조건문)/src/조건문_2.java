
public class 조건문_2 {

	public static void main(String[] args) {
		// 문자 한개를 설정하고 알파벳 => 대문자, 소문자, 알파벳이 아닌지 확인
		
		char c ='c';
		if(c>='A' && c<='Z') {
			System.out.println(c + "는(은) 대문자입니다.");
		} // 대문자라면
		
		if(c>='a' && c<='z') {
			System.out.println(c + "는(은) 소문자입니다.");
		} // 소문자라면
		
		if(!(c>='A' && c<='Z' ||c>='a' && c<='z')) {
			System.out.println(c + "는(은) 알파벳이 아닙니다.");
		} // 알파벳이 아니라면

	}

}
