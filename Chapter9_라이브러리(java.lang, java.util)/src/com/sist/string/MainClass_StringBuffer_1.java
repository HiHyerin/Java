package com.sist.string;
import java.io.*; // => CheckedException(반드시 예외처리)
import java.util.*;

public class MainClass_StringBuffer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//파일 읽으려면 filereader
		FileReader fr=null;
		try {
			long start=System.currentTimeMillis();
			fr=new FileReader("C:\\javaDev\\movie.txt");
			int i=0; // 한글자의 문자번호를 읽어온다 'A'=65...
			String movie="";
			while((i=fr.read())!=-1) { // 파일 마지막까지 읽는다.
				movie+=String.valueOf((char)i);
				
			}
			long end=System.currentTimeMillis();
			
			//읽은 데이터 출력
			System.out.println(movie);
			System.out.println("읽은 시간: " + (end-start)); // 로그파일 읽을 때 얼마나 걸렸는지 확인할 때 많이 사용
		}catch(Exception ex) {}
		finally {
			try {
				fr.close(); // 파일닫기, 서버닫기, 오라클 닫기
			}catch(Exception ex) {}
		}
	}

}
