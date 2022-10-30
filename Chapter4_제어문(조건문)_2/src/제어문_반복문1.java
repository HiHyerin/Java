//p.156
// 2~9까지 정수 입력을 받아서 해당 단을 출력하는 프로그램 (구구단)
import java.util.Scanner;




public class 제어문_반복문1 {

	public static void main(String[] args) {
		int dan=(int)(Math.random()*8)+2;
		System.out.println(dan + "단");
		for(int i=1; i<=9; i++) {
			System.out.printf("%2d *%2d = %d\n",dan, i, dan*i );
		}
		
	

	}

}
