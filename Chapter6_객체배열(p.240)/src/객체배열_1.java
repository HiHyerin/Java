/*
 	주의점
 	한개의 파일(java) => class를 여러개 사용이 가능
 	** 1. 자바는 항상 => 클래스명과 저장명이 동일
 	class A => A.java
 
 	여러개가 있는 경우
 	class A
 	class B
 	---------------->A.java, B.java
 	
 	class A
 	public class B
 	-----------------> B.java(public있는 클래스가 저장명이 되어야함)
 	
 	**2. 하나의 파일 안에서 public class는 한번만 사용이 가능
 	**3. 가급적이면 한 파일에 class 한 개씩 사용을 권장한다.
 	**4. 주의점 : Student ⇒ 같은 폴더 내 다른 파일에서는 Student를 사용할 수 없다.
 */

class Student{
	String name;
	int kor, eng,math;
}
public class 객체배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student hong = new Student(); // hong(주소) => name, kor, eng, math
		Student lee = new Student(); // lee(주소) => name, kor, eng, math
		Student song = new Student(); // song(주소) => name, kor, eng, math
		// => 객체생성시마다 메모리가 따로 만들어지는 변수(인스턴스, 객체)
		// 1. 변수에 값 대입
		hong.name="홍길동";
		hong.kor = 90;
		hong.eng = 80;
		hong.math = 70;
		
		lee.name="이순신";
		lee.kor = 99;
		lee.eng = 60;
		lee.math = 90;
		
		song.name="송혜린";
		song.kor = 91;
		song.eng = 89;
		song.math = 80;
		
		// 2. 출력, 제어(객체배열)
		Student[] std= {hong, lee, song};
		for(int i=0;i<std.length;i++) {
			System.out.println(std[i].name+" "
					+ std[i].kor + " " + std[i].eng + " " + std[i].math
					+ " "+(std[i].kor+std[i].eng+std[i].math)/3.0);
			
		}
		
		

	}

}
