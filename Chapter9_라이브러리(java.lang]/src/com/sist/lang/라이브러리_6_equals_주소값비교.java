package com.sist.lang;
class Member{
	private String name;
	public Member(String name) { //사용자로부터 입력값을 받겠다~
		this.name=name;
	}
	public String getName() { //읽기
		return name;
	}
	public void setName(String name) {//쓰기
		this.name = name;
	}
	
}
public class 라이브러리_6_equals_주소값비교 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1=new Member("홍길동");
		Member m2=new Member("홍길동");
		
		if(m1.equals(m2)) {
			System.out.println("같은 회원입니다.");
		}else {
			System.out.println("다른 회원입니다.");
		}
		
	}

}
