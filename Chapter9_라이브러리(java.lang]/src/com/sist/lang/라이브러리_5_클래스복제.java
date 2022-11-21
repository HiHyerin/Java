package com.sist.lang;
//클래스 복제시에 인터페이스를 구현해야함(implements 사용)
class Sawon implements Cloneable{ // 데이터는 private, 읽기/쓰기는 getter,setter로
	private String name;
	private String dept;
	private String loc;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
		
	}
	
}
public class 라이브러리_5_클래스복제 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Sawon sa=new Sawon();
		sa.setName("홍길동");
		sa.setDept("개발부");
		sa.setLoc("Seoul");
		//Sawon copy=sa;
		Sawon copy=(Sawon)sa.clone();
		Sawon sa1=new Sawon();
		System.out.println("sa: "+sa);
		System.out.println("copy: "+copy);
		System.out.println("sa1: "+ sa1);
		
		System.out.println("sa.name: "+ sa.getName());
		System.out.println("sa.dept: "+ sa.getDept());
		System.out.println("sa.loc: "+ sa.getLoc());
		System.out.println("sa1.name: "+ sa1.getName());
		System.out.println("sa1.dept: "+ sa1.getDept());
		System.out.println("sa1.loc: "+ sa1.getLoc());
		System.out.println("copy.name: "+ copy.getName());
		System.out.println("copy.dept: "+ copy.getDept());
		System.out.println("copy.loc: "+ copy.getLoc());
		
		
		
		
	}

}
