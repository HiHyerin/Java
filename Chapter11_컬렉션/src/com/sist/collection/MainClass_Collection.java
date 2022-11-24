package com.sist.collection;
import java.util.*;
public class MainClass_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<string> list = new ArrayList(); // 들어가는 개수를 지정하지 않는다.(가변형)
		       //--------
		       // 제네릭스(저장되는 데이터 형_
		ArrayList list = new ArrayList(); // 들어가는 개수를 지정하지 않는다.(가변형)
		//저장
		list.add("홍길동"); // 데이터 저장, 인덱스0
		list.add("심청이"); // 인덱스1
		list.add("이순신"); // 인덱스2
		list.add("강감찬"); // 인덱스3
		list.add(2,"을지문덕"); // 인덱스 2 vv
		
		
		System.out.println("저장된 인원수:"+list.size());
		// 출력 size() : 저장된 개수 / 배열로 따지면 length
		System.out.println("=====컬렉션에 추가 add()=====");
		for(int i=0;i<list.size();i++) {
			String name=(String)list.get(i); //데이터 읽기 get의 리턴형이 object라서 String을 받으려니 오류가남. 그래서 형변환
		//  String name=list.get(i).toString(); // Object를 String으로 변환
			
			System.out.println(i+"=>"+name);
		}
		
		System.out.println("=====컬렉션 수정 set()=====");
		//2번 수정 => set(2,"수정데이터")
		list.set(2, "박문수"); // 을지문덕 -> 박문수
		for(int i=0;i<list.size();i++) {
			String name=(String)list.get(i); //데이터 읽기 get의 리턴형이 object라서 String을 받으려니 오류가남. 그래서 형변환
		//  String name=list.get(i).toString(); // Object를 String으로 변환
			
			System.out.println(i+"=>"+name);
		}
		System.out.println("=====컬렉션 삭제 remove()=====");
		// remove(int index)
		// 3번 삭제해보기
		list.remove(3);
		System.out.println("저장된 인원수: "+list.size());
		for(int i=0;i<list.size();i++) {
			String name=(String)list.get(i); //데이터 읽기 get의 리턴형이 object라서 String을 받으려니 오류가남. 그래서 형변환
		//  String name=list.get(i).toString(); // Object를 String으로 변환
			
			System.out.println(i+"=>"+name);
		}
		
		System.out.println("=====전체삭제 clear()=====");
		list.clear();
		System.out.println("저장된 인원수:"+list.size());
		if(list.isEmpty()) { //데이터가 없는지 확인
			System.out.println("저장된 데이터가 없습니다.");
		}
	}

}
