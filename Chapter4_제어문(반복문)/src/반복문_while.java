
public class 반복문_while {

	public static void main(String[] args) {
		// A-Z , Z-A
		char c = 'A';
		while(c<='Z') {
			System.out.print(c + " ");
			c++;
		}
		System.out.println();
		c='Z';
		while(c>='A') {
			System.out.print((char)(c+32) + " ");
			c--;
		}
		

	}

}
