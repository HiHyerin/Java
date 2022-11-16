public class 생성자_1 {

	int a=10; // 멤버변수(클래스가 가지고 있는 변수), static(공유변수)
								//=> Heap
	
	생성자_1(){
		int a=10; // 지역변수 => 지역변수 우선순위(Stack)
		System.out.println(a + this.a);
	}

	public static void main(String[] args) {
		생성자_1 a = new 생성자_1();
		System.out.println("a="+a);
		
		생성자_1 a1 = new 생성자_1();
		System.out.println("a1="+a1);
		

	}

}