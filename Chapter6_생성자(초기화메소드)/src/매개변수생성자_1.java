import java.util.Scanner;

class Sawon{
	int sabun;
	String name; 
	String dept; // 부서명
	String loc; // 근무지
	long pay; //연봉
	
	Sawon(){
		// 임의로 초기화
		sabun=1;
		name="홍길동";
		dept = "개발부";
		loc = "서울";
		pay = 5000;
	}
	
	Sawon(int sabun, String name){
		this(); // 생성자에서만 호출 가능 => 가장 첫줄에 사용한다
		this.sabun=sabun;
		this.name = name;
	}
	
	Sawon(String dept, String loc, long pay){
		this.dept=dept;
		this.loc= loc;
		this.pay = pay;
	}
	
	Sawon(int sabun, String name, String dept, String loc, long pay) {
		this.sabun = sabun;
		this.name = name;
		this.dept = dept;
		this.loc = loc;
		this.pay = pay;
	}
	
	

	void print() {
		System.out.println("사번: " + sabun);
		System.out.println("이름: " + name);
		System.out.println("부서: " + dept);
		System.out.println("근무지: " + loc);
		System.out.println("연봉: " + pay);
	}
}


public class 매개변수생성자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon sa1=new Sawon();
		sa1.print();
		Sawon sa2=new Sawon(2,"박문수");
		sa2.print();
		Sawon sa3=new Sawon("총무부","경기",4200);
		sa3.print();
		Sawon sa4=new Sawon(4,"이순신","기획부","충남",5500);
		sa4.print();
	}

}

