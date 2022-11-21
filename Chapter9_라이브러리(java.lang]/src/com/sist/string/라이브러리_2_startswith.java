package com.sist.string;
import java.util.Scanner;
import java.io.*;
public class 라이브러리_2_startswith {

	public static String[] musicAllData() { // 배열메소드
		String[] music=new String[100];
		//IO => 모든 클래스가 컴파일예외(checkedException) -> 반드시 예외처리를 하고 사용
		// 직접처리(try~catch)
		//1)
//		try(FileReader fr=new FileReader("");) {//파일을 자동으로 닫는다
//			
//		}catch(Exception ex){
//			
//		}
		
		FileReader fr=null;
		try {
			fr=new FileReader("c:\\javaDev\\genie.txt");
			int i=0;
			String data="";
			while((i=fr.read())!=-1) { // -1 : 파일이 끝날 때까지 읽어오라
			data+=String.valueOf((char)i);
			}
			//System.out.println(data);
			String[] musicData=data.split("\n");
			int k=0;
			for(String m:musicData) {
				String[] tmp=m.split("\\|");
				music[k]=tmp[1]; // 제목 저장
				k++;
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			try{
				if(fr!=null)
					fr.close();
			}catch(Exception ex) {}
		}
		
		return music;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] title=musicAllData();
		//startsWith => 접두어(시작하는 문자열 확인)
		//원형 : public boolean startsWith(String prefix) => LIKE 
		Scanner scan=new Scanner(System.in);
		System.out.print("검색어 입력: ");
		String fd=scan.next();
		
//		for(String s:title) {
//			if(s.startsWith(fd)) {
//				System.out.println(s);
//			}
//		}
		
		// 원형 : public boolean endsWith(String suffix) => 접미어 => %A
//		for(String s:title) {
//			if(s.endsWith(fd)) {// 끝나는 문자열이 같은 경우 출력
//				System.out.println(s);
//				
//			}
//		}

		// contains => 포함
		// 원형 : public boolean contains(String s) => 실제 검색
		
		for(String s:title) {
			if(s.contains(fd)) {
				System.out.println(s);
			}
			
		}
	}

}
