package com.sist.collection;
import java.util.*;
public class MainClass_ArrayList_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList(); // 저장공간
		list.add(7); // index 0
		list.add(4); // index 1
		list.add(3);//  index 2
		list.add(6);//  index 3
		list.add(2);//  index 4
		list.add(5);//  index 5
		list.add(1);//  index 6
		
		for(Object i:list) {
			System.out.println(i);
		}
		System.out.println("=====정렬=====");
		Collections.sort(list);
		for(Object i:list) { // list의 데이터형이 object이기 때문에 forEach쓸 때 i의 데이터형도 일치시켜야함
			System.out.println(i);
		}
		
		System.out.println("=====Copy=====");
		ArrayList list2=new ArrayList(list.subList(1,5));
		// 배열 copy => arraycopy() , clone()
		// 원하는 부분만 copy => subList() => 페이지 나누기
		// CURD => Create(add) Update(set) Read(get) Delete(remove)
		
		for(Object i:list2) {
			System.out.println(i);
		}

	}

}
