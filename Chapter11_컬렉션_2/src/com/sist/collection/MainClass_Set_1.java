package com.sist.collection;
import java.util.*;

class Student{
	String name;
	int age;
	public Student(String name, int age) {
		this.name=name;
		this.age=age;
	}
	@Override
	public boolean equals(Object obj) { //equals는 주소를 비교하지만 오버라이딩을 통해..? 값 비교..?(잘모르겠다)
		if(obj instanceof Student) {
			Student s=(Student)obj;
			return name.equals(s.name) &&
					age==s.age;
		}
		return false;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+":"+age;
	}
	@Override
	public int hashCode() { // 객체와 객체의 값을 가지고 비교
		// TODO Auto-generated method stub
		return (name+age).hashCode();
	}
	
	
	
	
}





public class MainClass_Set_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set=new HashSet();
		set.add(new Student("홍길동",30));
		set.add(new Student("홍길동",30));
		System.out.println(set); // com.sist.collection.MainClass_Set에서는 주소를 비교, 여기서는 값을 비교했기때문에 추가
	}

}
