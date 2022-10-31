// 초기화 - 사용자 입력값
// 3명의 학생 => 국, 영, 수 점수, 총점, 평균, 학점
// 변수 18개 / 배열로 하면 6개
import java.util.Scanner;
public class 배열_4 {

	public static void main(String[] args) {
		//저장공간
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math = new int[3];
		int[] total = new int[3];
		double[] avg = new double[3];
		char[] score = new char[3];
		
		// 점수 부여
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.print((i+1)+"번째 국어점수 입력: ");
			kor[i]=scan.nextInt();
			
			System.out.print((i+1)+"번째 영어점수 입력: ");
			eng[i]=scan.nextInt();
			
			System.out.print((i+1)+"번째 수학점수 입력: ");
			math[i]=scan.nextInt();
			
			total[i] = kor[i]+eng[i]+math[i];
			avg[i]= total[i]/3.0;
		}
		
		// 학점
		for(int i=0;i<3;i++) {
			switch((int)avg[i]/10) { //switch는 정수, 문자, 문자열 (avg[i]는 double형이라 오류)
			case 10: case 9:
				score[i] = 'A';
				break;
			case 8:
				score[i] = 'B';
				break;
			case 7:
				score[i] = 'C';
				break;
			case 6:
				score[i] = 'D';
				break;
			default :
				score[i] ='F';
				
				
			}
		}
		//출력 (for each는 배열 1개에 있는 값만 출력이 가능 
		// 그러나 우리는 배열 5개를 동시에 출력하려고 하기 때문에 일반for문(인덱스입력) 사용)
		System.out.println("국어  " + "영어  " + "수학  " + "총점   "+ "평균    "+ " 학점");
		for(int i=0;i<3;i++) {
			
			System.out.printf("%-5d%-5d%-5d%-5d%-8.2f%3c\n", kor[i],eng[i], math[i],total[i],avg[i],score[i]);
			
		}

	}

}
