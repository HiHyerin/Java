package com.sist.main;

import java.util.*;
class Board{
	public void write() { // 사용자가 데이터를 넘길 때 write.do(글쓰기 요청)
		System.out.println("글쓰기 처리");
	}
	public void list() {// list.do(게시물 목록 요청)
		System.out.println("게시물 목록 출력..");
	}
	public void update() { //update.do
		System.out.println("게시물 수정하기");
	}
	public void delete() { // delete.do
		System.out.println("게시물 삭제...");
	}
	public void find() {
			System.out.println("게시물 찾기..");
	}
	
	public void detail() {
		System.out.println("상세보기");
	}
}

public class MainClass_어노테이션_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("기능 요청:");
		String cmd=scan.next();
		
		Board board=new Board();
		if(cmd.equals("write.do"))
			board.write();
		else if(cmd.equals("list.do"))
			board.list();
		else if(cmd.equals("update.do"))
			board.update();
		else if(cmd.equals("delete.do"))
			board.delete();
		else if(cmd.equals("find.do"))
			board.find();
		else if(cmd.equals("detail.do"))
			board.detail();
	}

}
