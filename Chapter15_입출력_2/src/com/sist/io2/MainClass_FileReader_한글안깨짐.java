package com.sist.io2;
// 한글파일 일 떄 많이 사용 => char(2byte)
import java.io.*;
import java.util.*;

public class MainClass_FileReader_한글안깨짐 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list=new ArrayList<Student>();
		try {
			// 파일 읽기 => 구분
			FileReader fr = new FileReader("c:\\java_data\\student.txt");
			// 소스에서 수정 가능(=예외), 불가능(=에러)
			int i=0; // 글자번호 => 'A' = 65
			String data="";
			while((i=fr.read())!=-1) {
				data+=String.valueOf((char)i); // char을 문자열로 변환
			}
			fr.close();
			//System.out.println(data);
			String[] str=data.split("\n"); // String[] split(String regex) => 정규식 이용
			// 자바 => 정규식 => split(정규식) , replaceAll(정규식)
			/*
			 	정규식에서 사용하는 기호 =
			 		= 기호자체를 출력 : \\기호
			 		= | => 선택, A|B
			 			+ => 한 개 이상의 데이터
			 			* => 0개 이상의 데이터
			 			^ => 시작, 제외 ^[^범위]
			 			$ => 끝
			 			. => 임의의 1글자 A. AB AC AD...
			 			[] => 범위
			 			{} => 글자수
			 			----------------------자바 , 오라클 , 자바스크립트 , 파이썬(형식)
			 			오라클
			 			----
			 				'A' , 'B', 'C','D','E'
			 				WHERE name LIKE '%A%' OR
				 				  name LIKE '%B%' OR
				 				  name LIKE '%C%' OR
				 				  name LIKE '%D%' OR
				 				  name LIKE '%E%';
				 			--------------------------
				 		=	WHERE REGEXP_LIKE(name,'A|B|C|D|E')
				 									---------- = '[A-E]'
			 */
			for(String s:str) {
				String[] std=s.split("\\|");
				//s = 1|홍길동|90|80|70
				Student ss=new Student();
				ss.setHakbun(Integer.parseInt(std[0]));
				ss.setName(std[1]);
				ss.setKor(Integer.parseInt(std[2]));
				ss.setEng(Integer.parseInt(std[3]));
				ss.setMath(Integer.parseInt(std[4])); // 필드, 매개변수가 int이기 때문에 변환시켜줘야함
				list.add(ss);
			}
			//출력
			for(Student ss:list) {
				System.out.println(ss.getHakbun()+" "
				+ ss.getName()+" "
				+ ss.getKor()+" "
				+ ss.getEng()+" "
				+ ss.getMath()+ " "
				+(ss.getKor()+ss.getEng()+ss.getMath())+" "
				+String.format("%.2f", (ss.getKor()+ss.getEng()+ss.getMath())/3.0));
			}
		}catch(Exception ex) {ex.printStackTrace();}
	}

}
