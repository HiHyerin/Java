package com.sist.collection2;
import java.util.*;
public class MainClass_Map {

	public static void main(String[] args) {
		
		Map map=new HashMap();
		map.put("id", "admin");
		map.put("password", "1234");
		map.put("name", "홍길동");
		map.put("sex", "남자");
		map.put("age", 25); // key는 중복되면 x
		map.put("password", "4567"); // 중복되면 값을 덮어쓴다.
		
		//값 출력
//		System.out.println("ID:"+map.get("id"));//get(key)
//		System.out.println("password:"+map.get("password"));//get(key)
//		System.out.println("name:"+map.get("name"));//get(key)
//		System.out.println("sex:"+map.get("sex"));//get(key)
//		System.out.println("age:"+map.get("age"));//get(key)
//		System.out.println("password:"+map.get("password"));//get(key)
		
		Set s=map.keySet(); //map에 저장된 Key만 set에 저장
		System.out.println(s);
		for(Object obj:s) {
			String key=(String)obj;
			System.out.println(key+":"+map.get(key));
		}
		
		
	}

}
