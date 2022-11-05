
public class 메소드정리_1 {
	
	
	// main() => 프로그램의 시작점
	public static void main(String[] args) {
		// 메소드 호출 : 메소드명(매개변수 값) 
		print();
		System.out.println("\n===========");
		int sun=hap();
		System.out.println("sum=" + sun);
		System.out.println("sum=" + hap());
		
		System.out.println("=========");
		int sum2 = hap2(100);
		System.out.println("sum2 = "+sum2);
		
		System.out.println("==========");
		gugudan(7);
		
	}
	
	
	// 1~10 까지 출력하는 메소드를 만든다. => 1~10까지 출력하는 기능
	static void print() { // 리턴형(x), 매개변수(x)
		// System.out.println("1,2,3,4,5,6,7,8,9,10");
		
		for(int i=1;i<=10;i++) {
			System.out.print(i + " ");
		}
	}
	
	//1~10까지 합을 구하라 → (리턴형(O), 매개변수(X)) = 범위가 지정되면 매개변수는 존재하지 않음
	static int hap() { 
		int sum=0;
		for(int i=0;i<=10;i++) {
			sum+=i;
		}
		return sum; // 리턴형이 있는 경우에는 리턴값을 받아서 변수에 저장
	}
	
	//1~n까지 합을 구하라 → n을 사용자로부터 받아서 합 보내준다 (리턴형(O), 매개변수(O))
	static int hap2(int n) {
		int sum = 0;
		for(int i=0;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}
	
	//사용자로부터 단을 받아서 해당단을 출력하라(리턴형(X), 매개변수(O))
	static void gugudan(int dan) {
		for(int i=1;i<=9;i++) {
			System.out.println(dan + "*" + i +"="+dan*i);
		}
		return; //생략가능(리턴형이 없기 때문에 / 컴파일러가 자동으로 넣어줌)
	}

}
