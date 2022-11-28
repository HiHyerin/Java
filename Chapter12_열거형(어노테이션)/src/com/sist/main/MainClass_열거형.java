package com.sist.main;
/* 
 감	Persimmon	
거봉	Kyoho Grape	
건포도	Raisin	
골드키위	Gold Kiwi	
곶감	Drid Persimmon	
과라나	Guarana	
구기자	Chinese Matrimony Vine
구아바	Guava
귤	Mandarin	
다래	Siberian Gooseberry
 */

import java.util.*;
// 클래스의 일종이므로 생성자, 멤버변수를 가지고 있다
enum 과일명 {
	사과("apple"),감("persimmon"),귤("Mandarin"), 다래("Siverian Gooseberry"),
	토마도("tomato"), 수박("watermelon"), 딸기("strawberry"), 체리("cherry"),
	배("pear"), 바나나("banana"), 파인애플("pineapple"), 자두("plum"),
	오렌지("orange"), 아보카도("avocado");
	
	private String en;
	과일명(String en){
		this.en=en;
	}
	public String getEn() {
		return en;
	}
	
	
	
}
public class MainClass_열거형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("과일명을 입력하세요 :");
		String f=scan.next();
		for(과일명 n: 과일명.values()) {
			//System.out.println(n);
			if(n.name().equals(f)) {
				System.out.println(n.getEn());
				
			}
		}
	}

}
