//로또 번호 6개 설정(중복되지 않는 기능 추가)

import java.util.Arrays;

public class 배열_3 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=(int)(Math.random()*45)+1; //1~45사이 값 출력
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--;  // 저장하지 않는다
					break;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));
		
//		for(int i=0;i<lotto.length;i++) {
//			if(lotto[i]!=i) {
//				System.out.println(Arrays.toString(lotto));
//			}
//		}
		

	}

}
