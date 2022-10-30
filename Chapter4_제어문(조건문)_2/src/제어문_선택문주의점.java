
public class 제어문_선택문주의점 {

	public static void main(String[] args) {
		int d = 40; //main 전체에서 사용
		if(true) {
			int a = 10;
				if(true) {
					int b = 20;
					if(true) {
						int c = 30;
					} //c
					int c = 100;
				} //b
				int b = 200;
		} // a
		int a = 100;

	}

}
