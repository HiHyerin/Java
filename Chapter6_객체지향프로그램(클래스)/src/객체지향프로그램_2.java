// 클래스를 메모리에 저장하는 방법 ==> 저장된 데이터를 읽는 방법

// 학생과 관련된 데이터 => 1명에 대한 정보 => new를 이용하면 여러명의 학생 정보를 저장 할 수 있다.
// 클래스는 사용자가 직접 만들어서 처리하기 때문에 크기를 결정
class Student{
	int hakbun;
	String name;
	String sex;
	int age;
	int kor, eng, math;
}
public class 객체지향프로그램_2 {

	public static void main(String[] args) {
		
		// 1. 저장
		// 클래스도 배열이 있음. ex) Student[] arr = new Student[10]
		// . 연산자 : 메모리 주소 접근 연산자
		Student hong = new Student();
		System.out.println("hong=" + hong);
		hong.hakbun = 1;
		hong.name = "홍길동";
		hong.sex = "남자";
		hong.age = 25;
		hong.kor = 90;
		hong.eng = 80;
		hong.math = 70;
				
		Student lee = new Student();
		System.out.println("lee=" + lee);
		lee.hakbun = 1;
		lee.name = "이순신";
		lee.sex = "남자";
		lee.age = 56;
		lee.kor = 100;
		lee.eng = 80;
		lee.math = 70;
				
		
		Student song = new Student();
		System.out.println("song=" + song);
		song.hakbun = 1;
		song.name = "송혜린";
		song.sex = "여자";
		song.age = 28;
		song.kor = 90;
		song.eng = 89;
		song.math = 95;
		
		System.out.println("이름:" + hong.name);
		System.out.println("이름:" + lee.name);
		System.out.println("이름:" + song.name);
		//-----------------------------------> hong, lee, song이라는 주소값에 저장
		// 객체명.변수명 => 저장/읽기 기능
		// 변수 => 쓰기 , 읽기 기능
	}

}
