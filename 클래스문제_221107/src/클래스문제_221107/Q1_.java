//class
/*
 	1. 데이터형 클래스 (관련된 데이터를 모아서 관리) => 사용자 정의 데이터 타입 => ~VO(읽기/ 쓰기)
 																	Spring
 																	~DTO, ~Bean
 																	MyBatis, JSP
 	2. 액션 클래스 (관련된 기능을 모아서 관리) => ~DAO, ~Manager, ~Service
 		ex) 
 			게시판
 			관련된 데이터 => no, name, subject, content, pwd, regdate, hit
 			관련된 기능 => 목록출력, 상시보기, 글쓰기, 수정, 삭제, 검색
 					 => name, pwd => 은닉화(캡슐화)
 					 => 댓글 : 재사용(상속)
 					 => 자료실 : 글쓰기 기능(업로드), 상세보기 기능(다운로드) => 수정(오버라이딩)
	3. 클래스의 종류(추상클래스, 인터페이스, 내부클래스) => 6장/7장
	
	* 객체지향을 사용하는 이유
		1. 어렵다 => but 사용 편리
		2. 재사용성(기존에 있는 코드를 그대로 사용 => 작성하기 쉽다)
		3. 코드 관리가 용이하다
		4. 신뢰성이 높다(이미 상용화된 데이터를 사용) => 오류가 없는 코딩
 */
package 클래스문제_221107;

class Movie{
	// title, 개봉, 장르, 국가, 등급, 시간, 평점, 누적관객, 박스오피스, 줄거리, 포스터
	String title;
	String date;
	String Genre;
	String nation;
	String grade;
	String time;
	double score;
	int attendence;
	int boxOffice;
	String story;
	String poster;
	
}

class Food{
	// 음식사진, 상가이름, 별점, 주소, 전화번호, 음식종류, 가격대, 주차, 영업시간, 메뉴
	String[] poster;
	String title;
	double score;
	String address;
	String tel;
	String food;
	String parking;
	String time;
	String[] menu;
	
}
class Recipe{
	// 사진, 제목, 작성자, 닉네임, 프로필사진, 기본재료, 양념재료, 조리순서, 
	// 인분, 시간, 난이도
	String photo;
	String title;
	String writer;
	String profile;
	String ingredient;
	String ingredient2;
	String[] 조리순서;
	String 인분;
	String 소요시간;
	String level;
	
}

class Member{
	//id, 중복검사, 암호, 암호확인, 이름, 대화명, 중복검사, 주민번호, 생년월일,
	// 성별, emailm 메일수신, 우편번호, 주소, 전화번호, 핸드폰, 직업, 취미, 자기소개
	String id;
	String idCheck;
	String pwd;
	String pwdCheck;
	String name;
	String chatName;
	String chatNameCheck;
	String registerNum;
	int birth;
	String sex;
	String email;
	String 메일수신;
	String post;
	String address;
	String tel;
	String phone;
	String [] job;
	String [] hobby;
	String introduce;
}

class Goods{
	// 사진, 제목, 설명, 할인, 가격, 첫구매할인가, 별점, 리뷰개수, 배송
	String poster;
	String title;
	String detail;
	int discoundRate;
	int price;
	int firstPrice;
	double score;
	int review;
	String deliever;
}

class News{
	// 신문사, 시간, 네이버뉴스, 제목, 내용, 사진
	String[] 신문사;
	String[] 시간;
	String[] 출처;
	String [] title;
	String[] contents;
	String[] poster;
}

class Shop{
	// 사진, 전화번호, 웹사이트, 홈페이지 언어, 이용시간, 휴무일, 
	// 이것만은 꼭, 주소, 교통정보, 브랜드 설명
	String poster;
	String tel;
	String web;
	String language;
	String time;
	String close;
	String contents;
	String [] address;
	String 브랜드설명;
}

class Board{
	// 새글, 표(번호, 제목, 아이디, 작성일,조회수), 이전, 다음, 수정, 삭제, 목록
	// 이름, 내용, 비밀번호, 글쓰기, 취소, 댓글, 조회수, 작성일, 댓글작성
	
	String newPost;
	String num;
	String title;
	String id;
	String date;
	int 조회수;
	String 이전;
	String 다음;
	String 수정;
	String delete;
	String list;
	String name;
	String contents;
	String pwd;
	String write;
	String cancle;
	String comment;
	String 댓글작성;
	
	
	
}
	

public class Q1_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
