package com.sist.has_a;
class Board{
	public void insert() {
		System.out.println("Board:insert Call...: 게시물 첨부"); 
	}
	
	public void list() {
		System.out.println("Board:list Call..: 게시물 목적 출력");
	}
	public void update() {
		System.out.println("Board:update Call...: 게시물 수정");
	}
}

class ReplyBoard{
//	public void insert() {
//		System.out.println("ReplyBoard:insert Call...: 게시물 첨부"); 
//	}
//	
//	public void list() {
//		System.out.println("ReplyBoard:list Call..: 게시물 목적 출력");
//	}
//	public void update() {
//		System.out.println("ReplyBoard:update Call...: 게시물 수정");
//	}
	
	Board board = new Board(); // 포함클래스
	
		public void update() {
			System.out.println("ReplyBoard:update Call...:게시물 수정");
		}
	 //extends없이 오버라이딩
	public void reply() {
		
		System.out.println("ReplyBoard:reply Call...:댓글올리기");
	}
}




public class MainClass_포함_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReplyBoard rb=new ReplyBoard();
		rb.board.list();
		rb.board.insert();
		rb.board.update();
		
		

	}

}
