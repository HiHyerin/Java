/*/////////////자바의 정석 p.162/////////////////
 *1####
 *#2###
 *##3##
 *###4#
 *####5 
 *☆★
 *1 1 5
 *2 2 4
 *3 3
 *4 2 4
 *5 1 5
 *
 */
public class 반복문_중첩For3 {

	public static void main(String[] args) {

		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=5;j++) {
				
				if(6-i==j || i==j)
					System.out.print("★");
				else
					System.out.print("☆");
			}
		System.out.println();
		}

	}

}
