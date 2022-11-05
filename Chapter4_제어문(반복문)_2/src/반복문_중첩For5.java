// ===========자바의 정석 p.163==========
public class 반복문_중첩For5 {
	public static void main(String[] args) {
		System.out.println("구구단 출력");
		int a = 1;
		int b = 2;
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=9;j++) {
				System.out.printf("%2d *%2d = %2d\t",j,i,j*i);
			}
			System.out.println();
			
		}
			
	}

}
