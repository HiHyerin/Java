/*
 	난수 => 6개 추출 => 합
 */
public class 반복문_while2 {
	public static void main(String[] args) {
		int sum = 0;
		
		int i = 1;
		while(i <=6) {
			int a = (int)(Math.random()*100)+1;
			sum += a;
			System.out.println("i= "+i+", a= "+a);
			i++;
			
		}
		System.out.println("sum= " + sum);
		
		
	}

	
}
