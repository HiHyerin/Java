import java.util.Arrays;

// A~Z사이의 문자를 10개 저장 => 가장 큰값, 가장 작은 값 출력
public class 배열응용_2_문제 {

	public static void main(String[] args) {

		char [] alpha = new char[10];
		for(int i=0;i<alpha.length;i++) {
			alpha[i] = (char)((Math.random()*26)+65);
			for(int j=0;j<i;j++) {
				if(alpha[i]==alpha[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(alpha));
		
		char max = 'A';
		char min = 'Z';
		
		for(char c : alpha) {
			if(max<c)
				max = c;
			else if(min>c)
				min=c;
		}
		System.out.println("가장 큰 문자: " + max);
		System.out.println("가장 작은 문자: " + min);
		
	}

}
