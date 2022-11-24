package com.sist.collection;
import java.util.*;
public class MainClass_ArrayList_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1=new ArrayList();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(7);
		
		ArrayList list2=new ArrayList();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.add('A');
		list2.add('B');
		list2.add('C');
		System.out.println("list1="+list1);
		System.out.println("list2="+list2);
		
		// 중복된 데이터만 남기고 나머지는 제거
		list1.retainAll(list2); // list1에서 list2와 같은것 빼고 제거
		System.out.println("list1="+list1);
		System.out.println("list2="+list2);
		
		list1.containsAll(list2); // 중복되는 것 출력
		System.out.println("list1="+list1);
		System.out.println("list2="+list2);
		// add, size, get, remove, set, retainAll, containsAll, subList, addAll
		/* 
		 	p. 584
		 	add() 데이터 추가
		 	size() 저장된 개수
		 	get() 저장된 데이터 읽기
		 	remove() 삭제
		 	set() 수정
		 	containsAll() 두개의 ArrayList에서 중복된 데이터 모으기
		 	retainAll() => 두개의 ArrayList에서 중복된 데이터만 남기기 (나머지는 제거)
		 	addAll() 전체 데이터를 복사할 경우
		 	subList() 부분적으로 데이터를 복사할 때 사용
		 	
		 */
	}

}
