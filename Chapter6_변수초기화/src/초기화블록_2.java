class A{
	int a=10;
	static int b=20;
	{
		a=100;
	}
	
	static {
		b=200;
	}
	
	A(){
		a=1000;
		b=2000;
	}
}



//=====================================================
public class 초기화블록_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
	}

}
