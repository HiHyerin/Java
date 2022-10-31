/*
 * 3. 배열 alpha를 모두 출력하고자 한다. 빈칸에 적절한 코드를 삽입하시오.

 */
package 배열문제_221031;

import java.util.Arrays;

public class Q3 {

	public static void main(String[] args) {
		char[]alpha= {'a','b','c','d'};
		for(int i=0;i<alpha.length;i++)
			System.out.print(alpha[i] + " ");

		System.out.println();
		for(char c:alpha) {
			System.out.println(c + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(alpha));
	}


}
