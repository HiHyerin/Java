// 생성자를 통해서 인스턴스를 복사
class Member{
	int mno=1;
	String name ="홍길동";
	String address="서울";
	String tel="010-1111-1234";
	// 메모리 할당시 => 초기화
	
	Member(){
		
	}
	
	Member(String name, String address, String tel){
		mno=++mno;
		this.name = name;
		this.address = address;
		this.tel = tel;
	}
	

	Member(int mno, String name, String address, String tel) {
		this(name, address, tel); //Member(String name, String address, String tel) 얘 호출한거
		this.mno = mno;
		this.name = name;
		this.address = address;
		this.tel = tel;
	}
	
	void print() {
		System.out.println("회원번호:"+mno);
		System.out.println("이름:"+name);
		System.out.println("주소:"+address);
		System.out.println("전화번호:"+tel);
	}
}


//================================================================

public class 매개변수생성자_2 {

	public static void main(String[] args) {
		Member m1 = new Member(1,"홍길동","서울","010-1111-1234");
		m1.print();
		System.out.println("============");
		Member m2 = new Member(2,"이순신","경기","010-2222-1234");
		m2.print();
		System.out.println("============");
		Member m3 = new Member(3,"박문수","강원","010-3333-1234");
		m3.print();
		System.out.println("============");
		Member m4 = new Member("강감찬","인천","010-4444-1234");
		m4.print();
		
		

	}

}
