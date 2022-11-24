package com.sist.collection;
import java.util.*;
public class MainClass_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"홍길동", "심청이", "박문수", "이순신","강감찬",
				"손흥민","박지성","김민재","홍길동","박문수"};
		Set set = new HashSet();
//		for(String name:names) {
//			set.add(name); // 중복을 제거
//		}
//		System.out.println(set);
		
		List list=Arrays.asList(names); // 배열을 List로 변환할 때
		set.addAll(list); // list에 있는 데이터 전체 복사
		System.out.println(set); // 출력
		
		System.out.println("====삭제====");
		set.remove("박문수");
		System.out.println(set);
		
		System.out.println("====전체삭제====");
		set.clear();
		if(set.isEmpty())
			System.out.println("데이터가 없습니다:"+set.size());
		
	}

}
