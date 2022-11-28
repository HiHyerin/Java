package com.sist.main;
import java.lang.reflect.Method;
import java.util.*;
/*
 *   p.703
 *   문서 => 정리 (소스코드안에서 정리) => 주석 (기능은 없다,검색만 하는 역할)
 *   => 많이 사용하는 곳 : 스프링 , 마이바티스, JPA (웹 관련 라이브러리 => 어노테이션)
 *   => 사용자 정의는 거의 없다
 *   
 *   => @Overide
 *   => @Deprecated -> 경고 -> 새로운 메소드가 있다.
 *   => @SuperessWarnings => 경고를 나타나지 않게 만든다
 *   => @FunctionallInterface => 람다식 설정
 *   => 스프링, Mybatis, JPA도 이미 제작되어있다. => 인덱스
 */

/* 
 	p.711 사용자 정의
 		1. Target : 구분자
 */
class Board2 
{
   @RequestMapping("write.do")
   public void write() // write.do
   {
      System.out.println("글쓰기 처리...");
   }
   @RequestMapping("list.do")
   public void list() // list.do
   {
      System.out.println("게시물 목록 출력...");
   }
   @RequestMapping("update.do")
   public void update() //update.do(do : 실행)
   {
      System.out.println("게시물 수정하기");
   }
   @RequestMapping("delete.do")
   public void delete() // delete.do
   {
      System.out.println("게시물 삭제...");
   }
   @RequestMapping("find.do")
   public void find() //find.do
   {
      System.out.println("게시물 찾기");
   }
   @RequestMapping("detail.do")
   public void detail() // detail.do
   {
      System.out.println("상세보기");
   }
}
public class MainClass_어노테이션_2 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner sc= new Scanner(System.in);
      System.out.print("기능 요청 : ");
      String cmd = sc.next();
      
      try
      {
         Class clsName = Class.forName("com.sist.main.Board2"); // 클래스 정보 읽기
         
         
         Object obj =clsName.getDeclaredConstructor().newInstance();// 메모리 할당
         Method[] methods=clsName.getDeclaredMethods();//클래스 안에 선언된 모든 메소드 읽어오기
         for(Method m:methods) {
        	 RequestMapping rm=m.getAnnotation(RequestMapping.class); // Method 위에 있는 메소드 찾기
        	 if(rm.value().equals(cmd)) {
        		 m.invoke(obj, null); //메소드 호출
        		 // detail() => null 매개변수없는 경우 호출
        		 break;
        	 }
         }
      }catch(Exception ex) {}
   }

}