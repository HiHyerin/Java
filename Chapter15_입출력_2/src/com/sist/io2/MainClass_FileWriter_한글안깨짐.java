package com.sist.io2;
import java.io.*;
import java.util.*;
class Student{
	private int hakbun;
	private String name;
	private int eng,math,kor;
	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	
}
public class MainClass_FileWriter_한글안깨짐 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 학생목록
		ArrayList<Student> list=new ArrayList<Student>();
		
		// 파일 읽기
		try {
			String data="1|홍길동|90|80|70\n"
					+ "2|박문수|90|80|70\n"
					+ "3|심청이|90|80|70\n"
					+ "4|황희|90|80|70\n"
					+ "5|공자|90|80|70";
					
			// 저장
			//FileWriter fw= new FileWriter("c:\\java_data\\student.txt"); // => Create
			FileWriter fw= new FileWriter("c:\\java_data\\student.txt",true); // => Append
			fw.write(data); //file 저장
			fw.close(); // file 닫기
			/*
			 	FileWriter => write, close()
			 	FileReader => read, close()
			 	-1 : EOF(end of file)
			 */
			System.out.println("데이터 저장 완료");
			
		}catch(Exception ex) {}
	}

}
