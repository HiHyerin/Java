import java.util.Scanner;

public class 자바조건문문제 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Q1
		/* System.out.print("정수를 입력하세요 : ");
		int a = scan.nextInt();
		
		if(a>=50)
			System.out.println("50 이상입니다.");
		else 
			System.out.println("50 미만입니다.");
		*/
		
		//Q2
		/* System.out.print("정수를 입력하세요 : ");
		int b = scan.nextInt();
		if(b%3==0)
			System.out.println("3의 배수입니다.");
		else
			System.out.println("3의 배수가 아닙니다.");
		*/
		
		//Q3
		
		/*
		System.out.print("학년을 입력하세요 : ");
		int grade = scan.nextInt();
		System.out.print("점수를 입력하세요(0~100) : ");
		int score = scan.nextInt();
		
		if(score>=0 && score<=100) {
			if(grade==4) {
				if(score>= 70)
					System.out.println("학년: " + grade + "학년, 점수: " + score + "점 = 합격");
				else
					System.out.println("학년: " + grade + "학년, 점수: " + score + "점 = 불합격");
			}
			else if(grade<4) {
				if(score>=60)
					System.out.println("학년: " + grade + "학년, 점수: " + score + "점 = 합격");
				else
					System.out.println("학년: " + grade + "학년, 점수: " + score + "점 = 불합격");
				
			}
		}
		else {
			System.out.println("경고!");
		}
		*/
		
		
//		if(grade == 4) {
//			if(score>=70)
//				System.out.println("합격");
//			else
//				System.out.println("불합격");
//		}else if (grade <4 ) {
//			if(score>=60)
//				System.out.println("합격");
//			else
//				System.out.println("불합격");
//			
//		} else if(score<0 && score>100) {
//			System.out.println("점수 오류!");
		
		
			
			
		
		
		//Q4
		
		System.out.print("정수를 입력하세요 : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		System.out.println("a :" + a + ", b : " + b + ", c : " + c);
		
		int max = a;
		if(max<b)
			max=b;
		if(max<c)
			max=c;		
		System.out.println("최대값은 " + max + " 입니다.");
		
		
		int min = a;
		if(min>b)
			min= b;
		if(min>c)
			min= c;
		System.out.println("최소값은 " + min + " 입니다.");

		int total = a + b + c;
		System.out.println("총 합: " + total);
		double avg = total/3;
		System.out.println("평균: " + avg);
		
		
		
		
		//Q5
		/*
		System.out.print("정수를 입력하세요 : ");
		
		int a = scan.nextInt();
		if(a>0)
			System.out.println("양수입니다.");
		else if(a<0)
			System.out.println("음수입니다.");
		else if(a==0)
			System.out.println("0 입니다.");
		*/
		
		//Q6
		/*
		System.out.print("알파벳을 입력하세요 : ");
		char a = scan.next().charAt(0);
		if(a>='A' && a<='Z')
			System.out.println("대문자입니다.");
		else if(a>='a' && a<='z')
			System.out.println("소문자입니다.");
		*/
		
		//Q7
		/*
		System.out.print("국영수 점수 입력 : ");
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		int total = kor + eng + math;
		double avg = total/3.0;
		char opt;
		char grade;
		
		if(avg>=90) {
			grade = 'A';
			if(avg>=97) {
				opt = '+';
			}else if(avg>=94) {
				opt = '0';
			}else {
				opt = '-';
			}
		}else if(avg>=80){
			grade = 'B';
			if(avg>=87) {
				opt = '+';
			}else if (avg>=84) {
				opt ='0';
			}else {
				opt='-';}
		
		}else if(avg>=70){
			grade = 'C';
			if(avg>=77) {
				opt = '+';
			}else if (avg>=74) {
				opt ='0';
			}else {
				opt='-';}
		
		
		}else if(avg>=60){
			grade = 'D';
			if(avg>=67) {
				opt = '+';
			}else if (avg>=64) {
				opt ='0';
			}else {
				opt='-';}
		}else {
			grade = 'F';
		}
			
					
			
		*/
			

	}

}
