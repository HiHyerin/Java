/* 
 		1. 객체(인스턴스) 생성, 저장 메모리 활용
 			1) 생성
 				클래스명 변수명(인스턴스);
 				ex. class Music 
 					=> Music music;(선언, null(주소가 없는 상태)) : 실제 데이터가 저장된 메모리 참조(참조변수)
 																					=> 배열, 클래스
 						music=new Music(); // 생성 => 실제 데이터를 저장하는 메모리 확보
 						------------------ 선언 => 사용(변수 => static)
 						
 						= 인스턴스 : new를 이용하여 생성할 때마다 따로 저장되는 변수(static은 한군데에 저장)
 						= static(공유변수) => 컴파일시 자동으로 메모리 저장 => 클래스명.변수명 / 클래스명.메소드()
 																	=> 같은 클래스 안에서는 클래스명 생략 가능
 			2) 메모리 생성하는 과정
 				TV t : ===t===
 					실제 데이터가 있는 메모리 주소값 => 지금은 null
 					   =======
 					   
 				메모리 주소 설정
 				t=new TV();
 							========== 0x100(주소값)
 								크기
 							==========
 								채널
 							==========
 								색상
 							==========
 			new를 사용하면 => 메모리 저장 장소가 달라진다(바로 회수가 어렵다 => GC)
 			웹 => 메모리에 저장후에 브라우저로 전송
 */

class Sawon{
	int sabun;
	String name;
	String dept;
	String job;
	long pay;
	
}
public class 객체지향프로그램_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사원이 3명
		Sawon s1 = new Sawon();
		s1.sabun=1;
		s1.name="송혜린";
		s1.dept="개발부";
		s1.job="대리";
		s1.pay=310000;
				
		Sawon s2 = new Sawon();
		s2.sabun=2;
		s2.name="김유진";
		s2.dept="개발부";
		s2.job="사원";
		s2.pay=110000;
		
		Sawon s3 = new Sawon();
		s3.sabun=1;
		s3.name="민경린";
		s3.dept="개발부";
		s3.job="사원";
		s3.pay=210000;
	}

}
