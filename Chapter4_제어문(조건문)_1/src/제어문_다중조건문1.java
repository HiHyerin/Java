
public class 제어문_다중조건문1 {
// 1~100까지의 정수 중 3의 배수, 5의배수, 7의배수
// -------------------------------------------> 단일조건문 (왜냐하면 공배수들 때문에)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 난수 발생
		int kor = (int)(Math.random()*51)+50; // 0~100 사이
		int eng = (int)(Math.random()*51)+50;
		int math = (int)(Math.random()*51)+50;
		
		int avg = (kor + eng + math)/3;
		
		char score = 'A';
		if(avg>=90)
			score = 'A';
		else if (avg>=80)
			score = 'B';
		else if(avg>=70)
			score='C';
		else if(avg>=60)
			score='D';
		else
			score = 'F';
		
	// => if 여러개 사용 시 = 여러번 수행(단일조건문 여러개) , 한번만 수행(다중조건문 사용)
		
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + math);
		System.out.println("학점: " + score);
	}

}
