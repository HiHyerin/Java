package com.sist.exception;

public class MainClass_예외처리_1_throws {
	//CheckException => 컴파일러가 예외처리가 되었는지 확인 => 반드시 예외처리해서 사용(try~catch사용)
	public static void aaa() throws Exception{
		
	}
	
	//UnCheckException => 컴파일러 예외처리를 확인하지 않는다.(예외처리 생략 가능)
	public static void bbb() throws NumberFormatException, NullPointerException{
		
	} // 예외처리 생략가능
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*bbb();
		try {
		aaa();
		}catch(Exception ex) {}*/
		aaa();
	}

}
