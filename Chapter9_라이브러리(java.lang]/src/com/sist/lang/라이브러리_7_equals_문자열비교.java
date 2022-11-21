package com.sist.lang;
class Student{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Student(String name) {// 생성자
		this.name=name;		
	}
	// Object에서 equals는 사용빈도가 거의 없고, String(Object상속)이 더 많이 쓰임 => 로그인할 때 필요
	// Object에서는 주소값 비교(new), String => 실제 저장된 문자열 비교
	//equals를 오버라이딩 시켜서 주소비교가 아닌 객체가 가지고 있는 문자열을 비교
	@Override // 오버라이딩을 왜 한 것일까요.. 상속 부모클래스 기능 변경
	public boolean equals(Object obj) {
		if(obj instanceof Student)
			return name==((Student)obj).name; // 같은이름이면 true
		else
			return false;
	}
	
}
public class 라이브러리_7_equals_문자열비교 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("홍길동");
		Student s2=new Student("홍길동");
		
		if(s1.equals(s2)) {
			System.out.println("같은 학생입니다.");
		}else {
			System.out.println("다른 학생입니다.");
		}
		
	}

}
