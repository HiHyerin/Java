
class Card{
	// 인스턴스 변수
	int number;
	String image;
	static int width, height; // 카드의 크기는 모두 같아야 하므로 static으로 설정(정규화)
	
}

public class 변수종류_1 {

	public static void main(String[] args) {
		Card card1 = new Card();
		card1.number=2;
		card1.image = "♣";
		card1.width=100;
		card1.height=180;
		
		Card card2 = new Card();
		card2.number=5;
		card2.image = "◆";
		card2.width=100;
		card2.height=180;
		
		Card card3 = new Card();
		card3.number=7;
		card3.image = "♥";
		card3.width=100;
		card3.height=180;
		
		Card card4 = new Card();
		card4.number=9;
		card4.image = "♠";
		card4.width=100;
		card4.height=180;
		
		// 출력
		System.out.println(card1.number);
		System.out.println(card1.image);
		System.out.println(card1.width);
		System.out.println(card1.height);
		System.out.println();

		System.out.println(card2.number);
		System.out.println(card2.image);
		System.out.println(card2.width);
		System.out.println(card2.height);
		System.out.println();
		
		System.out.println(card3.number);
		System.out.println(card3.image);
		System.out.println(card3.width);
		System.out.println(card3.height);
		System.out.println();
		
		System.out.println(card4.number);
		System.out.println(card4.image);
		System.out.println(card4.width);
		System.out.println(card4.height);
		
		System.out.println("=================");
		card1.width=300;
		card1.height=350;
		
		Card.width=450;
		Card.height=500;
		
		System.out.println(card2.width);
		System.out.println(card2.height);
		System.out.println("===========");
		System.out.println(card3.width);
		System.out.println(card3.height);
		System.out.println("============");
		System.out.println(card4.width);
		System.out.println(card4.height);
	}

}
