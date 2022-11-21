package com.sist.string;
import java.io.*;

public class MainClass_StringBuffer_2 {

	public static void main(String[] args) {
		FileReader fr=null;
		try {
			long start=System.currentTimeMillis();
			fr=new FileReader("c:\\javaDev\\movie.txt");
			StringBuffer sb=new StringBuffer();
			int i=0;
			while((i=fr.read())!=-1) {
				sb.append(String.valueOf((char)i));
			}
			long end=System.currentTimeMillis();
			System.out.println(sb.toString());
			System.out.println("읽은 시간: " + (end-start)); // 로그파일 읽을 때 얼마나 걸렸는지 확인할 때 많이 사용
			// 문자열 결합 => append() , String변경 => toString()
			// public StringBuffer append(String s)
			// 오버로딩 => append(boolean b) / append(char[] c) / append(int i) ... => 문자열로 변경
			// public String toString()
			// => 데이터 읽기가 끝나면 String으로 변환해서 제어하는것이 더 편함
		
		}catch (Exception ex) {
			// TODO: handle exception
		}finally {
			try {
				fr.close();
			}catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	}

}
