
public class 논리연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//	• 난수발생 ==> 1~100 ---- 50<
		//	• 알파벳 ==> K > 
		//---------------------------두가지를 동시에 만족 &&
		
		int a=(int)(Math.random()*100) +1;
		char b= (char)((Math.random()*26) + 65);
		boolean result = a>50 && b<'K';
		
		System.out.println("a= " + a + ", b= " + b );
		System.out.println(result);
		//---------------------------------------조건 검색할 때 많이 쓰임
		
				

	}

}
