
package 배열문제_221031;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		char[] c= new char[10];
		
		int[] n = {0,1,2,3,4,5};
		
		char[] day = {'일','월','화','수','목','금','토'};
		
		boolean[] bool = {true,false,false,true};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("년도 입력> ");
		int year = scan.nextInt();
		
		System.out.println("월 입력> ");
		int month = scan.nextInt();
		
		System.out.println(year + "년도 " + month + " 월");
		
		System.out.println("\n");
		
		char[] strWeek= {'일','월','화','수','목','금','토'};
		for(char c:strWeek) {
			System.out.print(c+"\t");
		}
		int[] lastday= {31,28,31,30,31,30,31,31,30,31,30,31};
//		int sum=0;
//		for(int i:lastday) {
//			sum+=i;
//		}
//		System.out.println(sum);
		// 1년도 1월 1일 ==> 전년도 까지의 합(날 수)
		int total=(year-1)*365 + (year-1)/4 -(year-1)/100+(year-1)/400;
		// 전달
		if((year%4==0 && year%100!=0) || (year%400==0))
			lastday[1]=29;
		else
			lastday[1]=28;
		for(int i=0;i<month-1;i++)
			total+=lastday[i];
		// +1 ==> 10월 1일의 요일을 확인
		int week=total%7;
		System.out.println();
		for(int i=1;i<=lastday[month-1];i++) {
			if(i==1) {
				for(int j=0;j<week;j++) {
					System.out.println("\t");
				}
			}
			System.out.printf("%2d\t",i);
			week++;
			if(week>6) {
				week=0;
				System.out.println();
			}
		}
	}

}
