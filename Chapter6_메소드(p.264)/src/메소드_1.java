// p. 252
class Names{
	String name1;
	String name2;
}

public class 메소드_1 {
	// 메소드 선언
	// swap메소드가 두 갠데 사용 가능 = 오버로딩(같은 클래스, 같은 메소드를 이용해 새로운 기능을 첨부)
	// 오버로딩 : 메소드명 동일, 매개변수의 개수와 데이터형이 다르면 다른메소드로 인식
	void swap(int a, int b) {
		int temp=a;
		a=b;
		b=temp;
		System.out.println("swap:a="+a+", b="+b);
	}
	
	void swap(String name1, String name2) {
		String temp=name1;
		name1=name2;
		name2 = temp;
		System.out.println("swap:name1="+name1+",name2="+name2);
	}
	
	void swap(String[] names) {
		String temp=names[0];
		names[0]=names[1];
		names[1]=temp;
		
		System.out.println("swap:names[0]:" + names[0]+", names[1]="+names[1]);
	}
	
	void swap(Names name) {
		String temp=name.name1;
		name.name1=name.name2;
		name.name2=temp;
		System.out.println("name1="+name.name1+", name2="+name.name2);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		메소드_1 m = new 메소드_1();
		int x = 10;
		int y = 20;
		System.out.println("main:x="+x+", y="+y);
		m.swap(x, y);
		System.out.println("main:x="+x+", y="+y); // call by value(값만 전송) => 메소드 안에서만 변경
		// x,y 메모리 => 메소드 호출(매개변수 다른 메모리가 생성) => 복사본(원본은 그대로 복사본 안에서만 변경)
		// 클래스 , 배열 => 원본이 변경 (예외 => String)
		String name1="홍길동";
		String name2="박문수";
		m.swap(name1, name2);
		System.out.println("main:name1="+name1+",name2="+name2);
		
		String[]names= {"이순신", "강감찬"};
		m.swap(names);
		System.out.println("main:names[0]:" + names[0]+", names[1]="+names[1]);
		
		Names n = new Names();
		n.name1="홍길동";
		n.name2="김두한";
		m.swap(n);
		System.out.println("name1="+n.name1+", name2="+n.name2);
		
	}

}
