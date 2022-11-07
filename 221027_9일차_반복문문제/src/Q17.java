
public class Q17 {

	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++) {
			
			for(int j=1;j<=4-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
					System.out.print("*");
					
			}
			
		System.out.println();
		}
		
	}

}

/*
 * 
 *    *
 *   **
 *  ***
 * ****
 * i j(공백) k(별)
 * 1 3		1 
 * 2 2		2
 * 3 1		3
 * 4 0		4
 */
