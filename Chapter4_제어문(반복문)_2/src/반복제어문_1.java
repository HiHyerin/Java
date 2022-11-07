
public class 반복제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~100까지 출력 => 5까지 출력 후 for 중단
		
		for(int i=1; i<=100; i++) {
			System.out.println(i);
			if(i==5) {
				break;
			}			
		}
	}
}
