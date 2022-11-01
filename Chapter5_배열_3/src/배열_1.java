/*
 * 배열생성 , 초기화 , for문
 * 데이터값 제어 : 일반 for문(backend) 
 * 데이터 출력 : forEach(frontend)
 * 
 * 1) 데이터 저장
 * 2) 연산자 , 제어문
 * 3) 결과값 출력
 */
public class 배열_1 {

	public static void main(String[] args) {
		// 알파벳 저장 => 출력(26개)
		char [] alpha=new char[26]; // 초기화 '\u0000'
		/*
		  new를 이용하여 메모리 저장공간 확보
		  int = 0
		  long = 0l
		  float = 0.0f
		  double = 0.0
		  char = '\u0000'
		  boolean = false
		 */
		// 	배열에 값을 대입
		char c ='A';
		for(int i=0;i<alpha.length;i++) {
			alpha[i]=c++;
		}
		
		// 제어
		
		
		// 출력
		for(char ch:alpha) {  // 값을 가져오는거지 인덱스를 가져오는 것이 아님
			System.out.print(ch + " "); // 배열(고정), 컬렉션(가변)만 사용이 가능
		}
	}

}
