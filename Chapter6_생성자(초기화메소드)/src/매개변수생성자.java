import java.util.Scanner;
class Student{
	String name; //null
	int kor, eng, math; // 0,0,0

	void print() {
		// this 사용 가능한 곳 => 생성자,인스턴스 메소드(static메소드는 사용 불가능)
		System.out.println("이름:"+name);
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+math);
		System.out.println("총점:" + (kor+eng+math));
		System.out.printf("평균:%.2f\n", (kor+eng+math)/3.0);
	}
	
	Student(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
}

public class 매개변수생성자 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 입력: ");
		String name=scan.next();
		
		System.out.print("국어 입력: ");
		int kor=scan.nextInt();
		
		System.out.print("영어 입력: ");
		int eng=scan.nextInt();
		
		System.out.print("수학 입력: ");
		int math=scan.nextInt();
		
		// 객체생성(학생 한 명 생성)
		Student hong = new Student(name, kor, eng, math);
		hong.print();
		
		
	}

}
