package com.sist.collection;
import java.util.*;

/*
 		new Person("hong",30)
 		new Person("hong",30) => 객체의 주소값을 따지기 때문에 두개는 서로 다른 객체
 */

class Person implements Cloneable{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
		
	}
	
	public String toString() {
		
		return name+":"+age;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}

public class MainClass_Set {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Set set=new HashSet();
		set.add("ABC");
		set.add("ABC"); //이건 같은 주소기 때문에 튕겨나감
		Person p1=new Person("hong",30);
		Person p2=new Person("hong",30);
		Person p3=p1;
		Person p4=(Person)p1.clone();
		System.out.println("p1="+p1);
		System.out.println("p2="+p2);
		set.add(p1);
		set.add(p2);
		set.add(p3); // p1과 주소가 같기 때문에 들어가지 않음
		set.add(p4); // clone은 복제는 하지만 주소가 달라지기 때문에 포함
		
		System.out.println(set);
		
		set.add(new Person("hong",30));
		set.add(new Person("hong",30)); // 이건 new를 씀으로써 객체를 새로 생성한 것이기 때문에 주소가 달라서 값만 같을 뿐 객체는 다름
	}

}
