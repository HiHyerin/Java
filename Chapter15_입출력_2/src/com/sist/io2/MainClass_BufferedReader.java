package com.sist.io2;
//FileReader에 대한 보조 스트림 => BufferedReader는 많이 사용되는 클래스 => 한줄씩 읽을 수 있다.
import java.util.*;
import java.io.*;
public class MainClass_BufferedReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader in=
					new BufferedReader(new InputStreamReader(new FileInputStream("c:\\javaDev\\movie.txt")));
			// InputStream(1byte) => Reader(2byte)변경
			while(true) {
			String movie=in.readLine(); // 한 줄씩 읽어오는것 그 전에는 한 글자씩 읽음
			if(movie==null) break;
			System.out.println(movie);
		
			}
			in.close();
			
		}catch(Exception ex) {}
	}

}
