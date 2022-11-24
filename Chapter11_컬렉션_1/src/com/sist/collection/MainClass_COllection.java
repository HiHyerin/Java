package com.sist.collection;
import java.util.*;
public class MainClass_COllection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Vector 생성
		Vector list=new Vector();
		// List인터페이스 구현, Vector만 가지고 있는 메소드
		/* 
		 	자료구조 : 메모리상에서 데이터 관리하는 것
		 	추가 : add() 
		 	수정 : set()
		 	삭제 : remove()
		 	읽기 : get()
		 	개수 : size()
		 */
		
		// 추가
		list.addElement("홍길동"); // index 0
		list.addElement("심청이"); // index 1
		list.addElement("강감찬"); // index 2
		list.addElement("이순신"); // index 3
		list.addElement("박문수"); // index 4
		
		// 출력
		System.out.println("====일반for문====");
		for(int i=0;i<list.size();i++) {
			String name=(String)list.elementAt(i); // 저장된 데이터 1개 읽기
			System.out.println(name);
		}
		
		// 출력2
		System.out.println("====람다식====");
		list.forEach((name)->System.out.println(name));
		
		// 출력3
		System.out.println("====forEach====");
		for(Object obj:list) {
			System.out.println(obj);
		}
		
		//ArrayList변경
		// 방법1 (생성자)
		ArrayList list2=new ArrayList(list);
		System.out.println("====Vector->ArrayList1====");
		System.out.println(list2);
		
		// 방법2(addAll)
		ArrayList list3 = new ArrayList();
		list3.addAll(list);
		System.out.println("====Vector->ArrayLis2t====");
		System.out.println(list3);
		
		// 데이터 수정
		System.out.println("====Vector에서 데이터 수정====");
		list.setElementAt("을지문덕", 2);
		System.out.println(list);
		
		// 데이터 삭제
		System.out.println("====Vector에서 데이터 삭제====");
		list.removeElementAt(1); // 심청이
		System.out.println(list);
		/* 
		 	홍길동(0)
			심청이(1)
			을지문덕(2)
			이순신(3)
			박문수(4)
			
			(심청이 데이터 삭제)
			홍길동(0)
			을지문덕(1)
			이순신(2)
			박문수(3)
		 */
		// 데이터 전체 삭제
		System.out.println("====Vector에서 데이터 전체 삭제====");
		list.removeAllElements();
		System.out.println(list);
		
	}

}
