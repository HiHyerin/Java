// continue => 제외
public class 반복제어문_2 {

	public static void main(String[] args) {
		//1~10 까지 출력 5,9번은 제외하고 출력
		for(int i=1;i<=10;i++) {
			if(i==5 || i==9) {
				continue;
				
			}
			System.out.print(i+" ");
		}
		
		System.out.println();
		int i=1;
		
		while(i<=10) {
			if(i==5 || i==9)
				continue;
			System.out.print(i + " ");
			i++;
		}
	}

}
