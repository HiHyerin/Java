
public class 메소드_1 {
	int aa=10;
	static int bb = 20;
	void aaa() {
		this.bbb();
		ccc();
		eee();
		System.out.println(aa+bb);
	}
	
	static void bbb() {
		// aaa(); => 오류 (static은 static끼리만 호출 가능)
		ccc();
		// eee();
		메소드_1 a = new 메소드_1();
		a.aaa();
		a.eee();
	}
	
	static void ccc() {
		bbb();
		메소드_1 a = new 메소드_1();
		a.aaa();
		System.out.println(a.aa+bb);
	}
	
	void eee() {
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
