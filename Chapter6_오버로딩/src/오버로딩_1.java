
public class 오버로딩_1 {

	void display(char c, int i, long l) {
		System.out.println("display(char c,int i, long l) Call..");
	}
	
	int display(int c, int i, double l) {
		System.out.println("int c, int i, double l) Call..");
		return 0;
	}
	
	double display(double c, double i, double l) {
		System.out.println("display(double c, double i, double l) Call..");
		return 0.0;
	}
	
	long display(float c, double i, long l) {
		System.out.println("display(float c, double i, long l) Call..");
		return 0L;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		오버로딩_1 a=new 오버로딩_1()	;
		a.display(10.8, 10, 10);

	}

}
