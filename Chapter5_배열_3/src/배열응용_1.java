import java.util.Arrays;

// 5개 점수 저장 후 총합, 평균 (p.196)
// 응용 => 3명의 학생 국영수 입력 -> 총점/평균/학점 ->등수
// 숫자 야구 게임
public class 배열응용_1 {

	public static void main(String[] args) {
		int [] score = new int[5];
		for(int i=0;i<score.length;i++) { // 필요 값 저장
			score[i]= (int)(Math.random()*71)+30; //30~100점 사이
			
		}
		System.out.println(Arrays.toString(score));
		//총합, 평균
		int total = 0;
		
		for(int i : score) {
			total+=i;
		}
		System.out.println("총합: " + total);
		System.out.printf("평균: %.2f\n", total/(double)score.length);

	}

}
